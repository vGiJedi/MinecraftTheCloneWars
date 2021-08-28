
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
import net.minecraft.world.IWorld;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.network.IPacket;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.merchant.villager.VillagerEntity;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.Entity;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.starwarsmod.procedures.MagnaGuardThisEntityKillsAnotherOneProcedure;
import net.mcreator.starwarsmod.procedures.MagnaGuardOnInitialEntitySpawnProcedure;
import net.mcreator.starwarsmod.itemgroup.SepratistAIItemGroup;
import net.mcreator.starwarsmod.item.MagnaguarweaponItem;
import net.mcreator.starwarsmod.StarwarsmodModElements;

import java.util.Map;
import java.util.HashMap;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@StarwarsmodModElements.ModElement.Tag
public class MagnaGuardEntity extends StarwarsmodModElements.ModElement {
	public static EntityType entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new).size(1f, 3f))
					.build("magna_guard").setRegistryName("magna_guard");
	public MagnaGuardEntity(StarwarsmodModElements instance) {
		super(instance, 440);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@Override
	public void initElements() {
		elements.entities.add(() -> entity);
		elements.items.add(() -> new SpawnEggItem(entity, -10066330, -65332, new Item.Properties().group(SepratistAIItemGroup.tab))
				.setRegistryName("magna_guard_spawn_egg"));
	}

	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public void registerModels(ModelRegistryEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(entity, renderManager -> {
			return new MobRenderer(renderManager, new ModelMagnaGuard(), 0.5f) {
				@Override
				public ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("starwarsmod:textures/magnaguard.png");
				}
			};
		});
	}
	public static class CustomEntity extends CreatureEntity {
		public CustomEntity(FMLPlayMessages.SpawnEntity packet, World world) {
			this(entity, world);
		}

		public CustomEntity(EntityType<CustomEntity> type, World world) {
			super(type, world);
			experienceValue = 0;
			setNoAI(false);
			enablePersistence();
			this.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(MagnaguarweaponItem.block));
		}

		@Override
		public IPacket<?> createSpawnPacket() {
			return NetworkHooks.getEntitySpawningPacket(this);
		}

		@Override
		protected void registerGoals() {
			super.registerGoals();
			this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.5, false));
			this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, VillagerEntity.class, true, false));
			this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, MouseDroidEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, CloneTrooper332ndEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, AnakinSkywalkerEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, ObiWanKenobiEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, CloneTrooperCourscantGuardEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, RexEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, MouseDroidEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, CodyEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, CloneTrooperEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(12, new NearestAttackableTargetGoal(this, CloneTrooperHeavyEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(13, new NearestAttackableTargetGoal(this, CloneTrooperSniperEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(14, new NearestAttackableTargetGoal(this, ViperProbeDroidEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(15, new NearestAttackableTargetGoal(this, CloneCommandoScorchEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(16, new NearestAttackableTargetGoal(this, CloneCommandoSevEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(17, new NearestAttackableTargetGoal(this, CloneCommandoBossEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(18, new NearestAttackableTargetGoal(this, CloneCommandoFixerEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(19, new NearestAttackableTargetGoal(this, CloneTrooper501stEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(20, new NearestAttackableTargetGoal(this, CloneTrooper212thEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(21, new NearestAttackableTargetGoal(this, ArcTrooperEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(22, new NearestAttackableTargetGoal(this, CloneCommandoEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(23, new NearestAttackableTargetGoal(this, CaptainVaughnEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(24, new NearestAttackableTargetGoal(this, CloneJettrooperEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(25, new NearestAttackableTargetGoal(this, FIVESEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(26, new NearestAttackableTargetGoal(this, ClonetrooperwithrocketEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(27, new NearestAttackableTargetGoal(this, PlayerEntity.class, true, false));
			this.targetSelector.addGoal(28, new NearestAttackableTargetGoal(this, SenateCommandoEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(29, new NearestAttackableTargetGoal(this, SenateCommandoCaptainEntity.CustomEntity.class, true, false));
			this.goalSelector.addGoal(30, new LookRandomlyGoal(this));
			this.goalSelector.addGoal(31, new RandomWalkingGoal(this, 0.6));
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
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("starwarsmod:magnaguardhurt"));
		}

		@Override
		public net.minecraft.util.SoundEvent getDeathSound() {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("starwarsmod:magnaguarddeath"));
		}

		@Override
		public ILivingEntityData onInitialSpawn(IWorld world, DifficultyInstance difficulty, SpawnReason reason, ILivingEntityData livingdata,
				CompoundNBT tag) {
			ILivingEntityData retval = super.onInitialSpawn(world, difficulty, reason, livingdata, tag);
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
				MagnaGuardOnInitialEntitySpawnProcedure.executeProcedure($_dependencies);
			}
			return retval;
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
				MagnaGuardThisEntityKillsAnotherOneProcedure.executeProcedure($_dependencies);
			}
		}

		@Override
		protected void registerAttributes() {
			super.registerAttributes();
			if (this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED) != null)
				this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.35);
			if (this.getAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
				this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(120);
			if (this.getAttribute(SharedMonsterAttributes.ARMOR) != null)
				this.getAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0);
			if (this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) == null)
				this.getAttributes().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
			this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(8);
			if (this.getAttribute(SharedMonsterAttributes.ATTACK_KNOCKBACK) == null)
				this.getAttributes().registerAttribute(SharedMonsterAttributes.ATTACK_KNOCKBACK);
			this.getAttribute(SharedMonsterAttributes.ATTACK_KNOCKBACK).setBaseValue(1D);
		}
	}

	// Made with Blockbench 3.7.4
	// Exported for Minecraft version 1.14
	// Paste this class into your mod and generate all required imports
	public static class ModelMagnaGuard extends EntityModel {
		private final ModelRenderer MagnaGuard;
		private final ModelRenderer Body;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		private final ModelRenderer cube_r5;
		private final ModelRenderer cube_r6;
		private final ModelRenderer cube_r7;
		private final ModelRenderer cube_r8;
		private final ModelRenderer Head;
		private final ModelRenderer cube_r9;
		private final ModelRenderer LeftArm;
		private final ModelRenderer cube_r10;
		private final ModelRenderer cube_r11;
		private final ModelRenderer cube_r12;
		private final ModelRenderer cube_r13;
		private final ModelRenderer RightArm;
		private final ModelRenderer cube_r14;
		private final ModelRenderer cube_r15;
		private final ModelRenderer cube_r16;
		private final ModelRenderer cube_r17;
		private final ModelRenderer LeftLeg;
		private final ModelRenderer cube_r18;
		private final ModelRenderer cube_r19;
		private final ModelRenderer RightLeg;
		private final ModelRenderer cube_r20;
		private final ModelRenderer cube_r21;
		public ModelMagnaGuard() {
			textureWidth = 128;
			textureHeight = 128;
			MagnaGuard = new ModelRenderer(this);
			MagnaGuard.setRotationPoint(0.0F, 24.0F, 0.0F);
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, -4.0F, 0.0F);
			MagnaGuard.addChild(Body);
			addBoxHelper(Body, 30, 0, -2.0F, -21.5F, -1.5F, 4, 3, 3, 0.0F, false);
			addBoxHelper(Body, 22, 65, -0.5F, -29.5F, -0.5F, 1, 5, 1, 0.0F, false);
			addBoxHelper(Body, 55, 32, -1.0F, -25.5F, -1.0F, 2, 5, 2, 0.0F, false);
			addBoxHelper(Body, 24, 6, -2.5F, -33.5F, -1.5F, 5, 5, 3, 0.0F, false);
			addBoxHelper(Body, 28, 24, -2.0F, -33.5F, -2.5F, 4, 3, 3, 0.0F, false);
			addBoxHelper(Body, 57, 39, -1.5F, -33.75F, -3.5F, 3, 4, 1, 0.0F, false);
			addBoxHelper(Body, 36, 19, -0.5F, -31.0F, -3.75F, 1, 1, 1, 0.0F, false);
			addBoxHelper(Body, 47, 5, -1.5F, -36.5F, -1.5F, 3, 2, 3, 0.0F, false);
			addBoxHelper(Body, 20, 20, -3.5F, -36.25F, -1.0F, 7, 2, 2, 0.0F, false);
			addBoxHelper(Body, 12, 12, 3.0F, -36.5F, -3.0F, 3, 2, 6, 0.0F, false);
			addBoxHelper(Body, 0, 6, -6.0F, -36.5F, -3.0F, 3, 2, 6, 0.0F, false);
			addBoxHelper(Body, 10, 20, 4.0F, -34.5F, -3.0F, 2, 2, 6, 0.0F, false);
			addBoxHelper(Body, 0, 14, -6.0F, -34.5F, -3.0F, 2, 2, 6, 0.0F, false);
			addBoxHelper(Body, 20, 24, 5.0F, -32.5F, -3.0F, 1, 1, 6, 0.0F, false);
			addBoxHelper(Body, 0, 22, -6.0F, -32.5F, -3.0F, 1, 1, 6, 0.0F, false);
			addBoxHelper(Body, 0, 0, -5.5F, -35.5F, -2.0F, 11, 2, 4, 0.0F, false);
			addBoxHelper(Body, 42, 55, -2.0F, -37.0F, 1.5F, 4, 4, 1, 0.0F, false);
			addBoxHelper(Body, 61, 18, 0.5F, -32.5F, 1.75F, 3, 3, 1, 0.0F, false);
			addBoxHelper(Body, 61, 4, -3.5F, -32.5F, 1.75F, 3, 3, 1, 0.0F, false);
			addBoxHelper(Body, 12, 46, 0.5F, -32.5F, 0.75F, 1, 3, 1, 0.0F, false);
			addBoxHelper(Body, 40, 14, -1.5F, -32.5F, 0.75F, 1, 3, 1, 0.0F, false);
			addBoxHelper(Body, 36, 63, 0.5F, -29.5F, 1.75F, 2, 4, 1, 0.0F, false);
			addBoxHelper(Body, 30, 63, -2.5F, -29.5F, 1.75F, 2, 4, 1, 0.0F, false);
			addBoxHelper(Body, 34, 54, 0.5F, -25.5F, 1.75F, 1, 1, 1, 0.0F, false);
			addBoxHelper(Body, 6, 48, -1.5F, -25.5F, 1.75F, 1, 1, 1, 0.0F, false);
			addBoxHelper(Body, 51, 52, -1.5F, -24.5F, -1.5F, 3, 1, 3, 0.0F, false);
			addBoxHelper(Body, 32, 46, 2.0F, -22.0F, -2.0F, 1, 4, 4, 0.0F, false);
			addBoxHelper(Body, 16, 65, 2.25F, -21.0F, -1.0F, 1, 2, 2, 0.0F, false);
			addBoxHelper(Body, 64, 8, -3.25F, -21.0F, -1.0F, 1, 2, 2, 0.0F, false);
			addBoxHelper(Body, 24, 37, -3.0F, -22.0F, -2.0F, 1, 4, 4, 0.0F, false);
			addBoxHelper(Body, 56, 7, 5.25F, -35.5F, -1.5F, 1, 3, 3, 0.0F, false);
			addBoxHelper(Body, 52, 56, -6.25F, -35.5F, -1.5F, 1, 3, 3, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(3.0F, -32.5F, 3.0F);
			Body.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0F, 0.0F, -0.3927F);
			addBoxHelper(cube_r1, 39, 19, -6.5F, -3.75F, -4.0F, 1, 5, 2, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(-3.0F, -32.5F, 3.0F);
			Body.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.0F, 0.0F, 0.3927F);
			addBoxHelper(cube_r2, 0, 59, 5.5F, -3.75F, -4.0F, 1, 5, 2, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(-4.5F, -33.5F, -1.5F);
			Body.addChild(cube_r3);
			setRotationAngle(cube_r3, -0.48F, 0.0F, 0.0F);
			addBoxHelper(cube_r3, 46, 64, 4.0F, -5.0F, -1.5F, 1, 5, 1, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(-4.0F, -33.5F, 1.5F);
			Body.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.2618F, 0.0F, 0.0F);
			addBoxHelper(cube_r4, 6, 55, 3.0F, -6.0F, -1.0F, 2, 5, 2, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(-4.0F, -32.5F, 0.5F);
			Body.addChild(cube_r5);
			setRotationAngle(cube_r5, -0.1745F, 0.0F, 0.0F);
			addBoxHelper(cube_r5, 6, 67, 3.0F, -1.75F, -4.0F, 2, 2, 1, 0.0F, false);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(-4.0F, -31.5F, 0.5F);
			Body.addChild(cube_r6);
			setRotationAngle(cube_r6, 0.1745F, 0.0F, 0.0F);
			addBoxHelper(cube_r6, 0, 22, 3.0F, -0.25F, -4.0F, 2, 5, 1, 0.0F, false);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(1.0F, -24.5F, -1.0F);
			Body.addChild(cube_r7);
			setRotationAngle(cube_r7, 0.0F, 0.0F, -0.1745F);
			addBoxHelper(cube_r7, 58, 63, -2.5F, -5.5F, 1.25F, 1, 6, 1, 0.0F, false);
			addBoxHelper(cube_r7, 54, 62, -2.5F, -5.5F, -0.25F, 1, 6, 1, 0.0F, false);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(-1.0F, -24.5F, -1.0F);
			Body.addChild(cube_r8);
			setRotationAngle(cube_r8, 0.0F, 0.0F, 0.1745F);
			addBoxHelper(cube_r8, 62, 63, 1.5F, -5.5F, 1.25F, 1, 6, 1, 0.0F, false);
			addBoxHelper(cube_r8, 42, 64, 1.5F, -5.5F, -0.25F, 1, 6, 1, 0.0F, false);
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, -43.0F, 0.0F);
			MagnaGuard.addChild(Head);
			addBoxHelper(Head, 34, 38, -1.5F, -5.0F, -3.5F, 3, 5, 2, 0.0F, false);
			addBoxHelper(Head, 62, 59, -1.0F, -1.5F, -3.0F, 2, 1, 2, 0.0F, false);
			addBoxHelper(Head, 47, 0, -1.0F, -5.25F, -3.75F, 2, 1, 4, 0.0F, false);
			addBoxHelper(Head, 47, 38, -1.5F, -5.0F, -1.5F, 3, 4, 2, 0.0F, false);
			addBoxHelper(Head, 66, 49, -1.0F, -4.75F, -0.25F, 2, 3, 1, 0.0F, false);
			addBoxHelper(Head, 42, 51, -2.0F, -3.75F, -2.5F, 4, 2, 2, 0.0F, false);
			addBoxHelper(Head, 66, 62, -0.5F, -1.75F, -4.0F, 1, 2, 2, 0.0F, false);
			addBoxHelper(Head, 0, 0, -0.5F, -4.5F, -3.6F, 1, 3, 1, 0.0F, false);
			addBoxHelper(Head, 51, 46, -1.0F, -2.25F, -3.55F, 2, 2, 1, 0.0F, false);
			addBoxHelper(Head, 22, 46, 0.45F, -3.5F, -3.75F, 1, 1, 1, 0.0F, false);
			addBoxHelper(Head, 14, 42, -1.45F, -3.5F, -3.75F, 1, 1, 1, 0.0F, false);
			cube_r9 = new ModelRenderer(this);
			cube_r9.setRotationPoint(0.5F, 0.0F, 0.0F);
			Head.addChild(cube_r9);
			setRotationAngle(cube_r9, 0.48F, 0.0F, 0.0F);
			addBoxHelper(cube_r9, 12, 67, -1.0F, -2.0F, -0.5F, 1, 2, 1, 0.0F, false);
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(6.0F, -38.0F, 0.0F);
			MagnaGuard.addChild(LeftArm);
			addBoxHelper(LeftArm, 60, 51, 0.25F, -1.0F, -1.0F, 2, 2, 2, 0.0F, false);
			addBoxHelper(LeftArm, 57, 59, 1.0F, -0.5F, -1.5F, 1, 1, 3, 0.0F, false);
			cube_r10 = new ModelRenderer(this);
			cube_r10.setRotationPoint(-1.5F, 3.5F, 4.5F);
			LeftArm.addChild(cube_r10);
			setRotationAngle(cube_r10, 0.0F, 0.0F, -0.0873F);
			addBoxHelper(cube_r10, 42, 60, 2.5F, 2.5F, -5.5F, 2, 2, 2, 0.0F, false);
			addBoxHelper(cube_r10, 50, 62, 3.0F, -3.5F, -5.0F, 1, 6, 1, 0.0F, false);
			cube_r11 = new ModelRenderer(this);
			cube_r11.setRotationPoint(-1.5F, 3.5F, 4.5F);
			LeftArm.addChild(cube_r11);
			setRotationAngle(cube_r11, -0.3054F, 0.0F, -0.0873F);
			addBoxHelper(cube_r11, 22, 56, 2.5F, 7.0F, -4.0F, 2, 4, 2, 0.0F, false);
			addBoxHelper(cube_r11, 47, 0, 3.75F, 13.0F, -2.5F, 1, 2, 1, 0.0F, false);
			addBoxHelper(cube_r11, 30, 38, 2.25F, 15.0F, -2.5F, 2, 1, 1, 0.0F, false);
			addBoxHelper(cube_r11, 4, 46, 2.25F, 15.0F, -4.75F, 2, 1, 1, 0.0F, false);
			addBoxHelper(cube_r11, 55, 24, 3.75F, 13.0F, -4.75F, 1, 2, 1, 0.0F, false);
			addBoxHelper(cube_r11, 0, 66, 3.5F, 12.0F, -4.0F, 1, 2, 2, 0.0F, false);
			addBoxHelper(cube_r11, 40, 6, 3.0F, 5.5F, -3.5F, 1, 7, 1, 0.0F, false);
			cube_r12 = new ModelRenderer(this);
			cube_r12.setRotationPoint(-0.5F, 2.5F, 4.0F);
			LeftArm.addChild(cube_r12);
			setRotationAngle(cube_r12, 0.0F, 0.0F, -0.1309F);
			addBoxHelper(cube_r12, 0, 14, 3.25F, -4.0F, -5.0F, 1, 4, 2, 0.0F, false);
			addBoxHelper(cube_r12, 47, 30, 3.0F, -4.5F, -5.5F, 1, 5, 3, 0.0F, false);
			cube_r13 = new ModelRenderer(this);
			cube_r13.setRotationPoint(-0.5F, 2.5F, 4.0F);
			LeftArm.addChild(cube_r13);
			setRotationAngle(cube_r13, 0.0F, 0.0F, -0.3491F);
			addBoxHelper(cube_r13, 66, 66, 3.6F, -4.5F, -5.0F, 1, 2, 2, 0.0F, false);
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(-6.0F, -38.0F, 0.0F);
			MagnaGuard.addChild(RightArm);
			addBoxHelper(RightArm, 59, 24, -2.25F, -1.0F, -1.0F, 2, 2, 2, 0.0F, false);
			addBoxHelper(RightArm, 10, 14, -2.0F, -0.5F, -1.5F, 1, 1, 3, 0.0F, false);
			cube_r14 = new ModelRenderer(this);
			cube_r14.setRotationPoint(1.5F, 3.5F, 4.5F);
			RightArm.addChild(cube_r14);
			setRotationAngle(cube_r14, 0.0F, 0.0F, 0.0873F);
			addBoxHelper(cube_r14, 8, 22, -4.5F, 2.5F, -5.5F, 2, 2, 2, 0.0F, false);
			addBoxHelper(cube_r14, 26, 62, -4.0F, -3.5F, -5.0F, 1, 6, 1, 0.0F, false);
			cube_r15 = new ModelRenderer(this);
			cube_r15.setRotationPoint(1.5F, 3.5F, 4.5F);
			RightArm.addChild(cube_r15);
			setRotationAngle(cube_r15, -0.3054F, 0.0F, 0.0873F);
			addBoxHelper(cube_r15, 14, 56, -4.5F, 7.0F, -4.0F, 2, 4, 2, 0.0F, false);
			addBoxHelper(cube_r15, 41, 0, -4.75F, 13.0F, -2.5F, 1, 2, 1, 0.0F, false);
			addBoxHelper(cube_r15, 20, 24, -4.25F, 15.0F, -2.5F, 2, 1, 1, 0.0F, false);
			addBoxHelper(cube_r15, 54, 19, -4.25F, 13.5F, 12.25F, 2, 2, 3, 0.0F, false);
			addBoxHelper(cube_r15, 65, 0, -3.75F, 13.75F, 12.75F, 1, 2, 2, 0.0F, false);
			addBoxHelper(cube_r15, 65, 26, -3.75F, 13.75F, -23.25F, 1, 2, 2, 0.0F, false);
			addBoxHelper(cube_r15, 65, 22, -3.75F, 13.25F, 12.75F, 1, 2, 2, 0.0F, false);
			addBoxHelper(cube_r15, 65, 37, -3.75F, 13.25F, -23.25F, 1, 2, 2, 0.0F, false);
			addBoxHelper(cube_r15, 61, 30, -4.0F, 14.0F, 12.75F, 2, 1, 2, 0.0F, false);
			addBoxHelper(cube_r15, 61, 46, -4.0F, 14.0F, -23.25F, 2, 1, 2, 0.0F, false);
			addBoxHelper(cube_r15, 61, 13, -4.5F, 14.0F, 12.75F, 2, 1, 2, 0.0F, false);
			addBoxHelper(cube_r15, 18, 62, -4.5F, 14.0F, -23.25F, 2, 1, 2, 0.0F, false);
			addBoxHelper(cube_r15, 54, 46, -4.25F, 13.5F, -23.75F, 2, 2, 3, 0.0F, false);
			addBoxHelper(cube_r15, 24, 33, -4.25F, 13.5F, -25.75F, 2, 2, 1, 0.0F, false);
			addBoxHelper(cube_r15, 26, 0, -4.25F, 13.5F, 16.25F, 2, 2, 1, 0.0F, false);
			addBoxHelper(cube_r15, 21, 6, -4.25F, 13.5F, 10.25F, 2, 2, 1, 0.0F, false);
			addBoxHelper(cube_r15, 38, 46, -4.25F, 13.5F, -19.75F, 2, 2, 1, 0.0F, false);
			addBoxHelper(cube_r15, 0, 0, -3.75F, 14.0F, -26.75F, 1, 1, 45, 0.0F, false);
			addBoxHelper(cube_r15, 18, 28, -4.25F, 15.0F, -4.75F, 2, 1, 1, 0.0F, false);
			addBoxHelper(cube_r15, 6, 39, -2.75F, 14.0F, -2.5F, 1, 1, 1, 0.0F, false);
			addBoxHelper(cube_r15, 6, 42, -2.75F, 14.0F, -4.75F, 1, 1, 1, 0.0F, false);
			addBoxHelper(cube_r15, 32, 46, -4.75F, 13.0F, -4.75F, 1, 2, 1, 0.0F, false);
			addBoxHelper(cube_r15, 65, 41, -4.5F, 12.0F, -4.0F, 1, 2, 2, 0.0F, false);
			addBoxHelper(cube_r15, 6, 31, -4.0F, 5.5F, -3.5F, 1, 7, 1, 0.0F, false);
			cube_r16 = new ModelRenderer(this);
			cube_r16.setRotationPoint(0.5F, 2.5F, 4.0F);
			RightArm.addChild(cube_r16);
			setRotationAngle(cube_r16, 0.0F, 0.0F, 0.1309F);
			addBoxHelper(cube_r16, 0, 6, -4.25F, -4.0F, -5.0F, 1, 4, 2, 0.0F, false);
			addBoxHelper(cube_r16, 47, 22, -4.0F, -4.5F, -5.5F, 1, 5, 3, 0.0F, false);
			cube_r17 = new ModelRenderer(this);
			cube_r17.setRotationPoint(0.5F, 2.5F, 4.0F);
			RightArm.addChild(cube_r17);
			setRotationAngle(cube_r17, 0.0F, 0.0F, 0.3491F);
			addBoxHelper(cube_r17, 65, 55, -4.6F, -4.5F, -5.0F, 1, 2, 2, 0.0F, false);
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(3.0F, -24.0F, 0.0F);
			MagnaGuard.addChild(LeftLeg);
			addBoxHelper(LeftLeg, 63, 33, 1.25F, 0.0F, -1.0F, 1, 2, 2, 0.0F, false);
			addBoxHelper(LeftLeg, 30, 30, 1.5F, -0.5F, -2.0F, 2, 4, 4, 0.0F, false);
			addBoxHelper(LeftLeg, 6, 46, 2.0F, -0.75F, -2.5F, 1, 5, 4, 0.0F, false);
			addBoxHelper(LeftLeg, 47, 16, 1.5F, 3.5F, -2.0F, 2, 3, 3, 0.0F, false);
			addBoxHelper(LeftLeg, 0, 46, 2.0F, 3.5F, -1.75F, 1, 11, 2, 0.0F, false);
			addBoxHelper(LeftLeg, 36, 54, 2.0F, 16.5F, -0.75F, 1, 7, 2, 0.0F, false);
			addBoxHelper(LeftLeg, 54, 13, 1.5F, 21.0F, -1.25F, 2, 2, 3, 0.0F, false);
			addBoxHelper(LeftLeg, 42, 46, 1.0F, 22.0F, -0.25F, 3, 2, 3, 0.0F, false);
			addBoxHelper(LeftLeg, 6, 37, 1.0F, 23.0F, -4.25F, 3, 1, 4, 0.0F, false);
			addBoxHelper(LeftLeg, 16, 42, 1.5F, 22.0F, -3.25F, 2, 1, 2, 0.0F, false);
			addBoxHelper(LeftLeg, 57, 56, 1.5F, 6.5F, -2.0F, 2, 1, 2, 0.0F, false);
			cube_r18 = new ModelRenderer(this);
			cube_r18.setRotationPoint(-1.5F, 13.5F, 0.5F);
			LeftLeg.addChild(cube_r18);
			setRotationAngle(cube_r18, 0.2182F, 0.0F, 0.0F);
			addBoxHelper(cube_r18, 12, 62, 3.0F, 0.0F, -0.5F, 2, 4, 1, 0.0F, false);
			addBoxHelper(cube_r18, 55, 0, 2.5F, 1.0F, -2.0F, 3, 2, 2, 0.0F, false);
			addBoxHelper(cube_r18, 24, 46, 3.0F, -4.0F, -2.5F, 2, 8, 2, 0.0F, false);
			cube_r19 = new ModelRenderer(this);
			cube_r19.setRotationPoint(-3.5F, 1.5F, 0.0F);
			LeftLeg.addChild(cube_r19);
			setRotationAngle(cube_r19, 0.0F, 0.0F, 0.6981F);
			addBoxHelper(cube_r19, 24, 31, 0.75F, -4.0F, -0.5F, 4, 1, 1, 0.0F, false);
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(-3.0F, -24.0F, 0.0F);
			MagnaGuard.addChild(RightLeg);
			addBoxHelper(RightLeg, 38, 30, -2.25F, 0.0F, -1.0F, 1, 2, 2, 0.0F, false);
			addBoxHelper(RightLeg, 10, 28, -3.5F, -0.5F, -2.0F, 2, 4, 4, 0.0F, false);
			addBoxHelper(RightLeg, 18, 32, -3.0F, -0.75F, -2.5F, 1, 5, 4, 0.0F, false);
			addBoxHelper(RightLeg, 47, 10, -3.5F, 3.5F, -2.0F, 2, 3, 3, 0.0F, false);
			addBoxHelper(RightLeg, 0, 29, -3.0F, 3.5F, -1.75F, 1, 11, 2, 0.0F, false);
			addBoxHelper(RightLeg, 30, 54, -3.0F, 16.5F, -0.75F, 1, 7, 2, 0.0F, false);
			addBoxHelper(RightLeg, 52, 27, -3.5F, 21.0F, -1.25F, 2, 2, 3, 0.0F, false);
			addBoxHelper(RightLeg, 12, 6, -4.0F, 22.0F, -0.25F, 3, 2, 3, 0.0F, false);
			addBoxHelper(RightLeg, 30, 14, -4.0F, 23.0F, -4.25F, 3, 1, 4, 0.0F, false);
			addBoxHelper(RightLeg, 8, 42, -3.5F, 22.0F, -3.25F, 2, 1, 2, 0.0F, false);
			addBoxHelper(RightLeg, 0, 42, -3.5F, 6.5F, -2.0F, 2, 1, 2, 0.0F, false);
			cube_r20 = new ModelRenderer(this);
			cube_r20.setRotationPoint(1.5F, 13.5F, 0.5F);
			RightLeg.addChild(cube_r20);
			setRotationAngle(cube_r20, 0.2182F, 0.0F, 0.0F);
			addBoxHelper(cube_r20, 6, 62, -5.0F, 0.0F, -0.5F, 2, 4, 1, 0.0F, false);
			addBoxHelper(cube_r20, 24, 14, -5.5F, 1.0F, -2.0F, 3, 2, 2, 0.0F, false);
			addBoxHelper(cube_r20, 16, 46, -5.0F, -4.0F, -2.5F, 2, 8, 2, 0.0F, false);
			cube_r21 = new ModelRenderer(this);
			cube_r21.setRotationPoint(3.5F, 1.5F, 0.0F);
			RightLeg.addChild(cube_r21);
			setRotationAngle(cube_r21, 0.0F, 0.0F, -0.6981F);
			addBoxHelper(cube_r21, 4, 29, -4.75F, -4.0F, -0.5F, 4, 1, 1, 0.0F, false);
		}

		@Override
		public void render(MatrixStack ms, IVertexBuilder vb, int i1, int i2, float f1, float f2, float f3, float f4) {
			MagnaGuard.render(ms, vb, i1, i2, f1, f2, f3, f4);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.RightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.LeftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.LeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.RightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
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
