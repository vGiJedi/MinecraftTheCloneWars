
package net.mcreator.starwarsmod.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.network.NetworkHooks;
import net.minecraftforge.fml.network.FMLPlayMessages;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.network.IPacket;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.merchant.villager.VillagerEntity;
import net.minecraft.entity.ai.goal.RangedAttackGoal;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.LeapAtTargetGoal;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.Entity;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.starwarsmod.procedures.CommandoDroidKillsAnotherOneProcedure;
import net.mcreator.starwarsmod.procedures.CommandoDroidEntityFallsProcedure;
import net.mcreator.starwarsmod.itemgroup.SepratistAIItemGroup;
import net.mcreator.starwarsmod.item.E5CommandoBlasterItem;
import net.mcreator.starwarsmod.StarwarsmodModElements;

import java.util.Map;
import java.util.HashMap;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@StarwarsmodModElements.ModElement.Tag
public class CommandoDroidSoldierEntity extends StarwarsmodModElements.ModElement {
	public static EntityType entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new).size(0.6f, 2f))
					.build("commando_droid_soldier").setRegistryName("commando_droid_soldier");
	public CommandoDroidSoldierEntity(StarwarsmodModElements instance) {
		super(instance, 367);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@Override
	public void initElements() {
		elements.entities.add(() -> entity);
		elements.items.add(() -> new SpawnEggItem(entity, -12692648, -11846891, new Item.Properties().group(SepratistAIItemGroup.tab))
				.setRegistryName("commando_droid_soldier_spawn_egg"));
	}

	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public void registerModels(ModelRegistryEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(entity, renderManager -> {
			return new MobRenderer(renderManager, new ModelCommando_Droid(), 0.5f) {
				@Override
				public ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("starwarsmod:textures/commando_droid.png");
				}
			};
		});
	}
	public static class CustomEntity extends CreatureEntity implements IRangedAttackMob {
		public CustomEntity(FMLPlayMessages.SpawnEntity packet, World world) {
			this(entity, world);
		}

		public CustomEntity(EntityType<CustomEntity> type, World world) {
			super(type, world);
			experienceValue = 0;
			setNoAI(false);
			enablePersistence();
			this.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(E5CommandoBlasterItem.block));
		}

		@Override
		public IPacket<?> createSpawnPacket() {
			return NetworkHooks.getEntitySpawningPacket(this);
		}

		@Override
		protected void registerGoals() {
			super.registerGoals();
			this.targetSelector.addGoal(1, new NearestAttackableTargetGoal(this, VillagerEntity.class, true, false));
			this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, R2D2Entity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, CloneTrooper332ndEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, AnakinSkywalkerEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, ObiWanKenobiEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, CloneTrooperCourscantGuardEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, RexEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, NavalOfficerEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, CodyEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, CloneTrooperEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, MouseDroidEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(12, new NearestAttackableTargetGoal(this, CloneTrooperSniperEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(13, new NearestAttackableTargetGoal(this, ViperProbeDroidEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(14, new NearestAttackableTargetGoal(this, CloneCommandoScorchEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(15, new NearestAttackableTargetGoal(this, CloneCommandoSevEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(16, new NearestAttackableTargetGoal(this, CloneCommandoBossEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(17, new NearestAttackableTargetGoal(this, CloneCommandoFixerEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(18, new NearestAttackableTargetGoal(this, CloneTrooper501stEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(19, new NearestAttackableTargetGoal(this, CloneTrooper212thEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(20, new NearestAttackableTargetGoal(this, ArcTrooperEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(21, new NearestAttackableTargetGoal(this, CloneCommandoEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(22, new NearestAttackableTargetGoal(this, CaptainVaughnEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(23, new NearestAttackableTargetGoal(this, CloneJettrooperEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(24, new NearestAttackableTargetGoal(this, FIVESEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(25, new NearestAttackableTargetGoal(this, ClonetrooperwithrocketEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(26, new NearestAttackableTargetGoal(this, PlayerEntity.class, true, false));
			this.targetSelector.addGoal(27, new NearestAttackableTargetGoal(this, SenateCommandoEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(28, new NearestAttackableTargetGoal(this, SenateCommandoCaptainEntity.CustomEntity.class, true, false));
			this.goalSelector.addGoal(29, new LookRandomlyGoal(this));
			this.goalSelector.addGoal(30, new RandomWalkingGoal(this, 0.8));
			this.goalSelector.addGoal(31, new LeapAtTargetGoal(this, (float) 0.5));
			this.goalSelector.addGoal(1, new RangedAttackGoal(this, 1.25, 20, 10) {
				@Override
				public boolean shouldContinueExecuting() {
					return this.shouldExecute();
				}
			});
		}

		@Override
		public CreatureAttribute getCreatureAttribute() {
			return CreatureAttribute.UNDEFINED;
		}

		@Override
		public boolean canDespawn(double distanceToClosestPlayer) {
			return false;
		}

		@Override
		public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("starwarsmod:commandodroidhurt"));
		}

		@Override
		public net.minecraft.util.SoundEvent getDeathSound() {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
		}

		@Override
		public boolean onLivingFall(float l, float d) {
			double x = this.getPosX();
			double y = this.getPosY();
			double z = this.getPosZ();
			Entity entity = this;
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				CommandoDroidEntityFallsProcedure.executeProcedure($_dependencies);
			}
			return super.onLivingFall(l, d);
		}

		@Override
		public boolean attackEntityFrom(DamageSource source, float amount) {
			if (source == DamageSource.FALL)
				return false;
			return super.attackEntityFrom(source, amount);
		}

		@Override
		public void onKillEntity(LivingEntity entity) {
			super.onKillEntity(entity);
			double x = this.getPosX();
			double y = this.getPosY();
			double z = this.getPosZ();
			Entity sourceentity = this;
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				CommandoDroidKillsAnotherOneProcedure.executeProcedure($_dependencies);
			}
		}

		@Override
		protected void registerAttributes() {
			super.registerAttributes();
			if (this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED) != null)
				this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.35);
			if (this.getAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
				this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(75);
			if (this.getAttribute(SharedMonsterAttributes.ARMOR) != null)
				this.getAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0);
			if (this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) == null)
				this.getAttributes().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
			this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(7);
			if (this.getAttribute(SharedMonsterAttributes.ATTACK_KNOCKBACK) == null)
				this.getAttributes().registerAttribute(SharedMonsterAttributes.ATTACK_KNOCKBACK);
			this.getAttribute(SharedMonsterAttributes.ATTACK_KNOCKBACK).setBaseValue(1D);
		}

		public void attackEntityWithRangedAttack(LivingEntity target, float flval) {
			E5CommandoBlasterItem.shoot(this, target);
		}
	}

	// Made with Blockbench 3.7.4
	// Exported for Minecraft version 1.14
	// Paste this class into your mod and generate all required imports
	public static class ModelCommando_Droid extends EntityModel {
		private final ModelRenderer CommandoDroid;
		private final ModelRenderer LeftLeg;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		private final ModelRenderer cube_r5;
		private final ModelRenderer RightLeg;
		private final ModelRenderer cube_r6;
		private final ModelRenderer cube_r7;
		private final ModelRenderer cube_r8;
		private final ModelRenderer cube_r9;
		private final ModelRenderer cube_r10;
		private final ModelRenderer Chest;
		private final ModelRenderer cube_r14;
		private final ModelRenderer LeftArm;
		private final ModelRenderer cube_r15;
		private final ModelRenderer RightArm;
		private final ModelRenderer cube_r16;
		private final ModelRenderer Head;
		private final ModelRenderer cube_r12_r1;
		private final ModelRenderer cube_r11_r1;
		private final ModelRenderer cube_r13_r1;
		public ModelCommando_Droid() {
			textureWidth = 64;
			textureHeight = 64;
			CommandoDroid = new ModelRenderer(this);
			CommandoDroid.setRotationPoint(0.0F, 24.0F, 0.0F);
			setRotationAngle(CommandoDroid, 0.0436F, 0.0F, 0.0F);
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(3.0F, -18.0F, 3.0F);
			CommandoDroid.addChild(LeftLeg);
			setRotationAngle(LeftLeg, 0.0873F, 0.0F, 0.0F);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, 9.0F, -1.0F);
			LeftLeg.addChild(cube_r1);
			setRotationAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
			addBoxHelper(cube_r1, 4, 38, -1.0F, -10.5F, 0.55F, 1, 4, 1, 0.0F, false);
			addBoxHelper(cube_r1, 0, 25, -1.0F, -10.5F, -0.45F, 1, 8, 1, 0.0F, false);
			addBoxHelper(cube_r1, 12, 20, -1.0F, -10.5F, -1.45F, 1, 11, 1, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.0F, 10.0F, -1.0F);
			LeftLeg.addChild(cube_r2);
			setRotationAngle(cube_r2, -0.0873F, 0.0F, 0.0F);
			addBoxHelper(cube_r2, 37, 35, -1.5F, -1.0F, -1.55F, 2, 1, 1, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(0.0F, 17.0F, -1.0F);
			LeftLeg.addChild(cube_r3);
			setRotationAngle(cube_r3, -0.0873F, 0.0F, 0.0F);
			addBoxHelper(cube_r3, 28, 4, -1.0F, -7.0F, -2.0F, 1, 7, 1, 0.0F, false);
			addBoxHelper(cube_r3, 26, 22, -1.5F, -0.5F, -2.8F, 2, 1, 2, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(0.0F, 17.0F, -2.0F);
			LeftLeg.addChild(cube_r4);
			setRotationAngle(cube_r4, -0.0873F, 0.0F, 0.0F);
			addBoxHelper(cube_r4, 9, 19, -1.0F, -0.25F, -2.8F, 1, 1, 1, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(0.0F, 18.0F, -2.0F);
			LeftLeg.addChild(cube_r5);
			setRotationAngle(cube_r5, -0.0873F, 0.0F, 0.0F);
			addBoxHelper(cube_r5, 14, 15, -2.0F, -1.0F, -3.65F, 3, 1, 4, 0.0F, false);
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(-3.0F, -18.0F, 3.0F);
			CommandoDroid.addChild(RightLeg);
			setRotationAngle(RightLeg, 0.0873F, 0.0F, 0.0F);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(0.0F, 9.0F, -1.0F);
			RightLeg.addChild(cube_r6);
			setRotationAngle(cube_r6, -0.0873F, 0.0F, 0.0F);
			addBoxHelper(cube_r6, 18, 39, 0.0F, -10.5F, 0.55F, 1, 4, 1, 0.0F, false);
			addBoxHelper(cube_r6, 28, 28, 0.0F, -10.5F, -0.45F, 1, 8, 1, 0.0F, false);
			addBoxHelper(cube_r6, 16, 24, 0.0F, -10.5F, -1.45F, 1, 11, 1, 0.0F, false);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(0.0F, 10.0F, -1.0F);
			RightLeg.addChild(cube_r7);
			setRotationAngle(cube_r7, -0.0873F, 0.0F, 0.0F);
			addBoxHelper(cube_r7, 40, 2, -0.5F, -1.0F, -1.55F, 2, 1, 1, 0.0F, false);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(0.0F, 17.0F, -1.0F);
			RightLeg.addChild(cube_r8);
			setRotationAngle(cube_r8, -0.0873F, 0.0F, 0.0F);
			addBoxHelper(cube_r8, 4, 30, 0.0F, -7.0F, -1.9F, 1, 7, 1, 0.0F, false);
			addBoxHelper(cube_r8, 29, 13, -0.5F, -0.5F, -2.8F, 2, 1, 2, 0.0F, false);
			cube_r9 = new ModelRenderer(this);
			cube_r9.setRotationPoint(0.0F, 18.0F, -2.0F);
			RightLeg.addChild(cube_r9);
			setRotationAngle(cube_r9, -0.0873F, 0.0F, 0.0F);
			addBoxHelper(cube_r9, 18, 8, -1.0F, -1.0F, -3.65F, 3, 1, 4, 0.0F, false);
			cube_r10 = new ModelRenderer(this);
			cube_r10.setRotationPoint(0.0F, 17.0F, -2.0F);
			RightLeg.addChild(cube_r10);
			setRotationAngle(cube_r10, -0.0873F, 0.0F, 0.0F);
			addBoxHelper(cube_r10, 29, 42, 0.0F, -0.25F, -2.8F, 1, 1, 1, 0.0F, false);
			Chest = new ModelRenderer(this);
			Chest.setRotationPoint(0.0F, 0.0F, 0.0F);
			CommandoDroid.addChild(Chest);
			addBoxHelper(Chest, 16, 20, -1.5F, -20.25F, 1.55F, 3, 1, 3, 0.0F, false);
			addBoxHelper(Chest, 31, 40, -1.0F, -21.25F, 3.0F, 2, 1, 1, 0.0F, false);
			addBoxHelper(Chest, 41, 30, -0.5F, -21.25F, 2.0F, 1, 1, 1, 0.0F, false);
			addBoxHelper(Chest, 38, 26, -0.5F, -25.25F, 2.5F, 1, 4, 1, 0.0F, false);
			addBoxHelper(Chest, 37, 0, -1.5F, -22.45F, 3.0F, 3, 1, 1, 0.0F, false);
			addBoxHelper(Chest, 39, 22, -1.0F, -22.45F, 2.0F, 2, 1, 1, 0.0F, false);
			addBoxHelper(Chest, 36, 32, -1.5F, -23.65F, 3.0F, 3, 1, 1, 0.0F, false);
			addBoxHelper(Chest, 26, 39, -1.0F, -23.65F, 2.0F, 2, 1, 1, 0.0F, false);
			addBoxHelper(Chest, 25, 20, -2.0F, -24.85F, 3.0F, 4, 1, 1, 0.0F, false);
			addBoxHelper(Chest, 36, 15, -1.5F, -24.85F, 2.0F, 3, 1, 1, 0.0F, false);
			addBoxHelper(Chest, 35, 13, -1.5F, -26.05F, 2.0F, 3, 1, 1, 0.0F, false);
			addBoxHelper(Chest, 25, 25, -2.0F, -26.05F, 3.0F, 4, 1, 1, 0.0F, false);
			addBoxHelper(Chest, 0, 12, -3.0F, -29.995F, 1.5F, 6, 4, 3, 0.0F, false);
			addBoxHelper(Chest, 37, 37, 1.0F, -29.995F, 4.5F, 2, 3, 1, 0.0F, false);
			addBoxHelper(Chest, 31, 36, -3.0F, -29.995F, 4.5F, 2, 3, 1, 0.0F, false);
			addBoxHelper(Chest, 38, 17, -1.0F, -27.995F, 4.5F, 2, 1, 1, 0.0F, false);
			addBoxHelper(Chest, 0, 19, -1.5F, -30.75F, 2.25F, 3, 3, 3, 0.0F, false);
			addBoxHelper(Chest, 0, 6, -1.0F, -31.0F, 3.0F, 2, 2, 2, 0.0F, false);
			addBoxHelper(Chest, 24, 35, 2.5F, -30.75F, 2.5F, 1, 2, 2, 0.0F, false);
			addBoxHelper(Chest, 40, 7, 3.5F, -30.25F, 3.0F, 1, 1, 1, 0.0F, false);
			addBoxHelper(Chest, 22, 35, -4.5F, -30.25F, 3.0F, 1, 1, 1, 0.0F, false);
			addBoxHelper(Chest, 18, 35, -3.5F, -30.75F, 2.5F, 1, 2, 2, 0.0F, false);
			addBoxHelper(Chest, 12, 41, 0.5F, -30.5F, 1.45F, 1, 1, 1, 0.0F, false);
			addBoxHelper(Chest, 12, 8, -2.0F, -30.995F, 1.65F, 4, 1, 1, 0.0F, false);
			addBoxHelper(Chest, 36, 41, 1.25F, -30.6F, 2.0F, 1, 1, 1, 0.0F, false);
			addBoxHelper(Chest, 36, 7, 1.5F, -31.25F, 2.5F, 1, 2, 2, 0.0F, false);
			addBoxHelper(Chest, 41, 25, 1.5F, -30.995F, 4.5F, 1, 1, 1, 0.0F, false);
			addBoxHelper(Chest, 40, 41, -2.5F, -30.995F, 4.5F, 1, 1, 1, 0.0F, false);
			addBoxHelper(Chest, 36, 3, -2.5F, -31.25F, 2.5F, 1, 2, 2, 0.0F, false);
			addBoxHelper(Chest, 26, 41, -2.25F, -30.6F, 2.0F, 1, 1, 1, 0.0F, false);
			addBoxHelper(Chest, 12, 0, -3.5F, -18.75F, 1.85F, 7, 2, 2, 0.0F, false);
			addBoxHelper(Chest, 0, 0, -1.0F, -19.25F, 1.55F, 2, 3, 3, 0.0F, false);
			cube_r14 = new ModelRenderer(this);
			cube_r14.setRotationPoint(2.0F, -22.0F, 1.0F);
			Chest.addChild(cube_r14);
			setRotationAngle(cube_r14, -0.2618F, 0.0F, 0.0F);
			addBoxHelper(cube_r14, 15, 13, -4.5F, -6.0F, 1.5F, 5, 1, 1, 0.0F, false);
			addBoxHelper(cube_r14, 12, 4, -4.5F, -5.0F, -0.5F, 5, 1, 3, 0.0F, false);
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(4.0F, -29.5F, 3.5F);
			CommandoDroid.addChild(LeftArm);
			addBoxHelper(LeftArm, 12, 38, -0.5F, 4.0F, -0.5F, 2, 2, 1, 0.0F, false);
			addBoxHelper(LeftArm, 20, 30, 0.0F, 1.5F, -1.0F, 1, 3, 2, 0.0F, false);
			addBoxHelper(LeftArm, 8, 41, 0.15F, 1.0F, -0.5F, 1, 2, 1, 0.0F, false);
			addBoxHelper(LeftArm, 24, 13, 0.0F, -1.5F, -1.5F, 1, 3, 3, 0.0F, false);
			addBoxHelper(LeftArm, 33, 20, 0.3F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false);
			addBoxHelper(LeftArm, 12, 34, -0.25F, -1.25F, -1.0F, 1, 2, 2, 0.0F, false);
			cube_r15 = new ModelRenderer(this);
			cube_r15.setRotationPoint(2.5F, 9.5F, 0.5F);
			LeftArm.addChild(cube_r15);
			setRotationAngle(cube_r15, -0.1309F, 0.0F, 0.0F);
			addBoxHelper(cube_r15, 34, 26, -2.5F, -4.25F, -1.6F, 1, 5, 1, 0.0F, false);
			addBoxHelper(cube_r15, 32, 16, -2.5F, 0.75F, -2.1F, 1, 2, 2, 0.0F, false);
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(-4.0F, -29.5F, 3.5F);
			CommandoDroid.addChild(RightArm);
			addBoxHelper(RightArm, 8, 30, -1.0F, 1.5F, -1.0F, 1, 3, 2, 0.0F, false);
			addBoxHelper(RightArm, 0, 40, -1.15F, 1.0F, -0.5F, 1, 2, 1, 0.0F, false);
			addBoxHelper(RightArm, 20, 24, -1.0F, -1.5F, -1.5F, 1, 3, 3, 0.0F, false);
			addBoxHelper(RightArm, 32, 5, -1.3F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false);
			addBoxHelper(RightArm, 32, 32, -0.75F, -1.25F, -1.0F, 1, 2, 2, 0.0F, false);
			addBoxHelper(RightArm, 37, 19, -1.5F, 4.0F, -0.5F, 2, 2, 1, 0.0F, false);
			cube_r16 = new ModelRenderer(this);
			cube_r16.setRotationPoint(-2.5F, 9.5F, -1.5F);
			RightArm.addChild(cube_r16);
			setRotationAngle(cube_r16, -0.5236F, 0.0F, 0.0F);
			addBoxHelper(cube_r16, 32, 9, 1.5F, 0.75F, -1.75F, 1, 2, 2, 0.0F, false);
			addBoxHelper(cube_r16, 48, 0, 1.0F, -2.25F, -3.75F, 2, 7, 2, 0.0F, false);
			addBoxHelper(cube_r16, 60, 0, 1.5F, 1.75F, -3.25F, 1, 5, 1, 0.0F, false);
			addBoxHelper(cube_r16, 0, 34, 1.5F, -4.25F, -1.25F, 1, 5, 1, 0.0F, false);
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, -31.0F, 4.0F);
			CommandoDroid.addChild(Head);
			cube_r12_r1 = new ModelRenderer(this);
			cube_r12_r1.setRotationPoint(0.0F, 25.3468F, -19.0981F);
			Head.addChild(cube_r12_r1);
			setRotationAngle(cube_r12_r1, -0.5236F, 0.0F, 0.0F);
			addBoxHelper(cube_r12_r1, 6, 6, -0.5F, -31.75F, 0.3F, 1, 1, 1, 0.0F, false);
			addBoxHelper(cube_r12_r1, 31, 0, -1.0F, -35.0F, 0.25F, 2, 4, 1, 0.0F, false);
			addBoxHelper(cube_r12_r1, 34, 24, -1.5F, -34.8F, 0.5F, 3, 1, 1, 0.0F, false);
			cube_r11_r1 = new ModelRenderer(this);
			cube_r11_r1.setRotationPoint(0.0F, -28.3469F, -12.1697F);
			Head.addChild(cube_r11_r1);
			setRotationAngle(cube_r11_r1, -2.6616F, 0.0F, 0.0F);
			addBoxHelper(cube_r11_r1, 38, 11, -1.0F, -27.9031F, 0.5F, 2, 1, 1, 0.0F, false);
			cube_r13_r1 = new ModelRenderer(this);
			cube_r13_r1.setRotationPoint(0.0F, 31.4966F, 4.2279F);
			Head.addChild(cube_r13_r1);
			setRotationAngle(cube_r13_r1, 0.2618F, 0.0F, 0.0F);
			addBoxHelper(cube_r13_r1, 8, 35, -0.5F, -36.0F, 3.5F, 1, 5, 1, 0.0F, false);
		}

		@Override
		public void render(MatrixStack ms, IVertexBuilder vb, int i1, int i2, float f1, float f2, float f3, float f4) {
			CommandoDroid.render(ms, vb, i1, i2, f1, f2, f3, f4);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.LeftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.RightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.RightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.LeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		}
	}
	@OnlyIn(Dist.CLIENT)
	public static void addBoxHelper(ModelRenderer renderer, int texU, int texV, float x, float y, float z, int dx, int dy, int dz, float delta) {
		addBoxHelper(renderer, texU, texV, x, y, z, dx, dy, dz, delta, renderer.mirror);
	}

	@OnlyIn(Dist.CLIENT)
	public static void addBoxHelper(ModelRenderer renderer, int texU, int texV, float x, float y, float z, int dx, int dy, int dz, float delta,
			boolean mirror) {
		renderer.mirror = mirror;
		renderer.addBox("", x, y, z, dx, dy, dz, delta, texU, texV);
	}
}
