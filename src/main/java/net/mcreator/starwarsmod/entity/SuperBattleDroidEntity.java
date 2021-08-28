
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
import net.minecraft.item.Item;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.merchant.villager.VillagerEntity;
import net.minecraft.entity.ai.goal.RangedAttackGoal;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.BreakDoorGoal;
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

import net.mcreator.starwarsmod.procedures.SuperBattleDroidKillsAnotherOneProcedure;
import net.mcreator.starwarsmod.itemgroup.SepratistAIItemGroup;
import net.mcreator.starwarsmod.item.SuperBattleDroidWeaponItem;
import net.mcreator.starwarsmod.StarwarsmodModElements;

import java.util.Map;
import java.util.HashMap;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@StarwarsmodModElements.ModElement.Tag
public class SuperBattleDroidEntity extends StarwarsmodModElements.ModElement {
	public static EntityType entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new).size(1f, 3f))
					.build("super_battle_droid").setRegistryName("super_battle_droid");
	public SuperBattleDroidEntity(StarwarsmodModElements instance) {
		super(instance, 192);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@Override
	public void initElements() {
		elements.entities.add(() -> entity);
		elements.items.add(() -> new SpawnEggItem(entity, -10066330, -16777216, new Item.Properties().group(SepratistAIItemGroup.tab))
				.setRegistryName("super_battle_droid_spawn_egg"));
	}

	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public void registerModels(ModelRegistryEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(entity, renderManager -> {
			return new MobRenderer(renderManager, new ModelSBD(), 0.5f) {
				@Override
				public ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("starwarsmod:textures/superbattledroid.png");
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
		}

		@Override
		public IPacket<?> createSpawnPacket() {
			return NetworkHooks.getEntitySpawningPacket(this);
		}

		@Override
		protected void registerGoals() {
			super.registerGoals();
			this.targetSelector.addGoal(1, new NearestAttackableTargetGoal(this, VillagerEntity.class, true, false));
			this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, CloneTrooper332ndEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, AnakinSkywalkerEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, ObiWanKenobiEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, CloneTrooperCourscantGuardEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, RexEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, NavalOfficerEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, CodyEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, CloneTrooperEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, CloneTrooperHeavyEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, CloneTrooperSniperEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(12, new NearestAttackableTargetGoal(this, ViperProbeDroidEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(13, new NearestAttackableTargetGoal(this, CloneCommandoScorchEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(14, new NearestAttackableTargetGoal(this, CloneCommandoSevEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(15, new NearestAttackableTargetGoal(this, CloneCommandoBossEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(16, new NearestAttackableTargetGoal(this, CloneCommandoFixerEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(17, new NearestAttackableTargetGoal(this, CloneTrooper501stEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(18, new NearestAttackableTargetGoal(this, CloneTrooper212thEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(19, new NearestAttackableTargetGoal(this, ArcTrooperEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(20, new NearestAttackableTargetGoal(this, CloneCommandoEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(21, new NearestAttackableTargetGoal(this, CaptainVaughnEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(22, new NearestAttackableTargetGoal(this, CloneJettrooperEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(23, new NearestAttackableTargetGoal(this, FIVESEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(24, new NearestAttackableTargetGoal(this, ClonetrooperwithrocketEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(25, new NearestAttackableTargetGoal(this, PlayerEntity.class, true, false));
			this.targetSelector.addGoal(26, new NearestAttackableTargetGoal(this, SenateCommandoEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(27, new NearestAttackableTargetGoal(this, SenateCommandoCaptainEntity.CustomEntity.class, true, false));
			this.goalSelector.addGoal(28, new LookRandomlyGoal(this));
			this.goalSelector.addGoal(29, new RandomWalkingGoal(this, 0.6));
			this.goalSelector.addGoal(30, new BreakDoorGoal(this, e -> true));
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
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("starwarsmod:superbattledroidhurt"));
		}

		@Override
		public net.minecraft.util.SoundEvent getDeathSound() {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("starwarsmod:superbattledroiddeath"));
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
				SuperBattleDroidKillsAnotherOneProcedure.executeProcedure($_dependencies);
			}
		}

		@Override
		protected void registerAttributes() {
			super.registerAttributes();
			if (this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED) != null)
				this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.2);
			if (this.getAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
				this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(60);
			if (this.getAttribute(SharedMonsterAttributes.ARMOR) != null)
				this.getAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0);
			if (this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) == null)
				this.getAttributes().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
			this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(6);
		}

		public void attackEntityWithRangedAttack(LivingEntity target, float flval) {
			SuperBattleDroidWeaponItem.shoot(this, target);
		}
	}

	// Made with Blockbench 3.7.4
	// Exported for Minecraft version 1.14
	// Paste this class into your mod and generate all required imports
	public static class ModelSBD extends EntityModel {
		private final ModelRenderer SuperBattleDroid;
		private final ModelRenderer Torso;
		private final ModelRenderer RightLeg;
		private final ModelRenderer LeftLeg;
		private final ModelRenderer RightArmWeapon;
		private final ModelRenderer LeftArm;
		public ModelSBD() {
			textureWidth = 128;
			textureHeight = 128;
			SuperBattleDroid = new ModelRenderer(this);
			SuperBattleDroid.setRotationPoint(0.0F, 24.0F, 0.0F);
			Torso = new ModelRenderer(this);
			Torso.setRotationPoint(6.0F, -20.0F, -1.0F);
			SuperBattleDroid.addChild(Torso);
			addBoxHelper(Torso, 60, 19, -3.0F, -3.5F, -1.0F, 3, 3, 3, 0.0F, false);
			addBoxHelper(Torso, 0, 59, -12.0F, -3.5F, -1.0F, 3, 3, 3, 0.0F, false);
			addBoxHelper(Torso, 7, 68, -8.5F, -3.5F, -1.0F, 1, 3, 3, 0.0F, false);
			addBoxHelper(Torso, 30, 20, -4.5F, -3.5F, -1.0F, 1, 3, 3, 0.0F, false);
			addBoxHelper(Torso, 45, 73, -9.0F, -3.0F, -0.5F, 1, 2, 2, 0.0F, false);
			addBoxHelper(Torso, 0, 19, -8.0F, -3.0F, -0.5F, 4, 2, 2, 0.0F, false);
			addBoxHelper(Torso, 6, 51, -7.0F, -4.0F, -1.5F, 2, 4, 4, 0.0F, false);
			addBoxHelper(Torso, 12, 12, -6.5F, -0.5F, -1.0F, 1, 1, 3, 0.0F, false);
			addBoxHelper(Torso, 41, 54, -6.5F, -3.0F, -2.0F, 1, 2, 5, 0.0F, false);
			addBoxHelper(Torso, 65, 55, -6.5F, -5.0F, -1.5F, 1, 2, 4, 0.0F, false);
			addBoxHelper(Torso, 50, 0, -8.5F, -5.5F, 0.5F, 5, 1, 3, 0.0F, false);
			addBoxHelper(Torso, 40, 61, -7.0F, -5.5F, 3.0F, 2, 1, 1, 0.0F, false);
			addBoxHelper(Torso, 30, 5, -8.5F, -5.5F, -1.5F, 5, 1, 2, 0.0F, false);
			addBoxHelper(Torso, 49, 30, -7.5F, -5.2F, -2.5F, 3, 1, 1, 0.0F, false);
			addBoxHelper(Torso, 68, 0, -7.0F, -7.2F, -2.0F, 2, 2, 2, 0.0F, false);
			addBoxHelper(Torso, 22, 56, -7.0F, -7.2F, 2.5F, 2, 2, 1, 0.0F, false);
			addBoxHelper(Torso, 72, 4, -7.5F, -7.2F, 2.0F, 1, 2, 1, 0.0F, false);
			addBoxHelper(Torso, 0, 65, -5.5F, -7.2F, 2.0F, 1, 2, 1, 0.0F, false);
			addBoxHelper(Torso, 65, 25, -7.5F, -7.2F, -1.0F, 1, 2, 1, 0.0F, false);
			addBoxHelper(Torso, 61, 62, -5.5F, -7.2F, -1.0F, 1, 2, 1, 0.0F, false);
			addBoxHelper(Torso, 20, 70, -8.0F, -7.2F, 1.5F, 1, 2, 1, 0.0F, false);
			addBoxHelper(Torso, 64, 39, -5.0F, -7.2F, 1.5F, 1, 2, 1, 0.0F, false);
			addBoxHelper(Torso, 36, 69, -8.0F, -7.2F, -0.5F, 1, 2, 1, 0.0F, false);
			addBoxHelper(Torso, 63, 55, -5.0F, -7.2F, -0.5F, 1, 2, 1, 0.0F, false);
			addBoxHelper(Torso, 71, 53, -8.25F, -7.2F, 0.0F, 1, 2, 2, 0.0F, false);
			addBoxHelper(Torso, 71, 23, -4.75F, -7.2F, 0.0F, 1, 2, 2, 0.0F, false);
			addBoxHelper(Torso, 28, 49, -4.25F, -11.1F, 0.0F, 1, 4, 2, 0.0F, false);
			addBoxHelper(Torso, 0, 23, -8.75F, -11.1F, 0.0F, 1, 4, 2, 0.0F, false);
			addBoxHelper(Torso, 20, 64, -7.0F, -9.2F, -2.25F, 2, 2, 2, 0.0F, false);
			addBoxHelper(Torso, 34, 75, -5.0F, -11.2F, 2.5F, 1, 4, 1, 0.0F, false);
			addBoxHelper(Torso, 40, 8, -5.0F, -11.2F, -1.5F, 1, 4, 1, 0.0F, false);
			addBoxHelper(Torso, 30, 75, -8.0F, -11.2F, 2.5F, 1, 4, 1, 0.0F, false);
			addBoxHelper(Torso, 51, 74, -8.0F, -11.2F, -1.5F, 1, 4, 1, 0.0F, false);
			addBoxHelper(Torso, 0, 75, -8.5F, -11.2F, 1.5F, 1, 4, 1, 0.0F, false);
			addBoxHelper(Torso, 64, 74, -8.5F, -11.2F, -0.5F, 1, 4, 1, 0.0F, false);
			addBoxHelper(Torso, 74, 42, -4.5F, -11.2F, 1.5F, 1, 4, 1, 0.0F, false);
			addBoxHelper(Torso, 55, 74, -4.5F, -11.2F, -0.5F, 1, 4, 1, 0.0F, false);
			addBoxHelper(Torso, 34, 27, -7.0F, -11.2F, 3.0F, 2, 4, 1, 0.0F, false);
			addBoxHelper(Torso, 46, 50, -7.0F, -11.2F, -2.5F, 2, 2, 2, 0.0F, false);
			addBoxHelper(Torso, 74, 29, -6.5F, -5.0F, -2.25F, 1, 2, 1, 0.0F, false);
			addBoxHelper(Torso, 72, 70, -6.5F, -5.0F, 2.5F, 1, 2, 1, 0.0F, false);
			addBoxHelper(Torso, 0, 23, -7.5F, -11.0F, -3.0F, 3, 1, 7, 0.0F, false);
			addBoxHelper(Torso, 72, 17, -4.0F, -3.0F, -0.5F, 1, 2, 2, 0.0F, false);
			addBoxHelper(Torso, 17, 1, -7.5F, -12.0F, -3.0F, 3, 1, 7, 0.0F, false);
			addBoxHelper(Torso, 0, 31, -8.5F, -16.5F, 2.5F, 5, 9, 2, 0.0F, false);
			addBoxHelper(Torso, 42, 5, -6.5F, -11.5F, 4.0F, 1, 1, 1, 0.0F, false);
			addBoxHelper(Torso, 53, 67, -7.5F, -18.5F, 4.0F, 3, 6, 1, 0.0F, false);
			addBoxHelper(Torso, 53, 56, -8.0F, -20.5F, 3.5F, 4, 4, 2, 0.0F, false);
			addBoxHelper(Torso, 57, 53, -7.0F, -12.5F, 4.0F, 2, 1, 1, 0.0F, false);
			addBoxHelper(Torso, 14, 39, -9.5F, -12.5F, 0.0F, 7, 4, 2, 0.0F, false);
			addBoxHelper(Torso, 30, 0, -10.0F, -15.5F, 0.0F, 8, 3, 2, 0.0F, false);
			addBoxHelper(Torso, 0, 0, -10.5F, -18.5F, -0.5F, 9, 5, 3, 0.0F, false);
			addBoxHelper(Torso, 62, 66, -1.5F, -18.5F, -0.5F, 1, 4, 3, 0.0F, false);
			addBoxHelper(Torso, 0, 8, -11.5F, -18.5F, -0.5F, 1, 4, 3, 0.0F, false);
			addBoxHelper(Torso, 24, 16, -10.0F, -19.5F, -0.5F, 8, 1, 3, 0.0F, false);
			addBoxHelper(Torso, 24, 9, -9.0F, -20.5F, -1.0F, 6, 3, 4, 0.0F, false);
			addBoxHelper(Torso, 12, 9, -9.0F, -19.5F, 3.0F, 6, 2, 1, 0.0F, false);
			addBoxHelper(Torso, 42, 33, -8.5F, -21.0F, -0.5F, 5, 3, 3, 0.0F, false);
			addBoxHelper(Torso, 36, 27, -8.0F, -21.5F, -0.5F, 4, 1, 5, 0.0F, false);
			addBoxHelper(Torso, 57, 45, -7.0F, -20.5F, -2.5F, 2, 5, 3, 0.0F, false);
			addBoxHelper(Torso, 66, 7, -8.0F, -21.0F, -1.5F, 4, 3, 1, 0.0F, false);
			addBoxHelper(Torso, 26, 56, -7.0F, -19.5F, -3.5F, 2, 5, 3, 0.0F, false);
			addBoxHelper(Torso, 36, 40, -6.5F, -20.25F, -3.25F, 1, 3, 1, 0.0F, false);
			addBoxHelper(Torso, 34, 50, -7.5F, -19.5F, -2.5F, 3, 6, 3, 0.0F, false);
			addBoxHelper(Torso, 0, 71, -12.5F, -17.5F, 0.0F, 1, 2, 2, 0.0F, false);
			addBoxHelper(Torso, 69, 61, -10.0F, -17.5F, 2.0F, 1, 2, 2, 0.0F, false);
			addBoxHelper(Torso, 47, 69, -3.0F, -17.5F, 2.0F, 1, 2, 2, 0.0F, false);
			addBoxHelper(Torso, 70, 66, -0.5F, -17.5F, 0.0F, 1, 2, 2, 0.0F, false);
			addBoxHelper(Torso, 13, 23, -9.5F, -18.0F, 1.25F, 7, 4, 3, 0.0F, false);
			addBoxHelper(Torso, 49, 25, -9.0F, -12.0F, -2.0F, 6, 3, 2, 0.0F, false);
			addBoxHelper(Torso, 18, 30, -9.5F, -19.0F, -2.0F, 7, 7, 2, 0.0F, false);
			addBoxHelper(Torso, 54, 12, -8.5F, -20.0F, -2.0F, 5, 1, 2, 0.0F, false);
			addBoxHelper(Torso, 55, 30, -8.5F, -13.0F, -2.7F, 5, 3, 2, 0.0F, false);
			addBoxHelper(Torso, 58, 35, -8.5F, -15.0F, -3.0F, 5, 2, 2, 0.0F, false);
			addBoxHelper(Torso, 14, 37, -3.75F, -16.75F, -2.3F, 1, 1, 1, 0.0F, false);
			addBoxHelper(Torso, 10, 45, -9.0F, -12.0F, 2.0F, 6, 4, 2, 0.0F, false);
			addBoxHelper(Torso, 45, 18, -9.5F, -14.0F, 2.0F, 7, 2, 2, 0.0F, false);
			addBoxHelper(Torso, 50, 39, -8.5F, -20.5F, 3.0F, 5, 4, 2, 0.0F, false);
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(-5.0F, -22.0F, -0.5F);
			SuperBattleDroid.addChild(RightLeg);
			addBoxHelper(RightLeg, 30, 33, -1.0F, 21.0F, -4.5F, 3, 1, 6, 0.0F, false);
			addBoxHelper(RightLeg, 45, 22, -0.5F, 20.5F, -3.5F, 2, 1, 2, 0.0F, false);
			addBoxHelper(RightLeg, 0, 42, -0.5F, 11.0F, -1.5F, 2, 10, 3, 0.0F, false);
			addBoxHelper(RightLeg, 68, 75, 0.0F, 14.0F, -2.0F, 1, 4, 1, 0.0F, false);
			addBoxHelper(RightLeg, 42, 40, 0.0F, 10.0F, -2.0F, 1, 3, 1, 0.0F, false);
			addBoxHelper(RightLeg, 73, 59, -1.2F, 9.5F, -3.0F, 1, 2, 2, 0.0F, false);
			addBoxHelper(RightLeg, 39, 69, -1.0F, 9.0F, -3.5F, 1, 3, 3, 0.0F, false);
			addBoxHelper(RightLeg, 31, 69, 1.0F, 9.0F, -3.5F, 1, 3, 3, 0.0F, false);
			addBoxHelper(RightLeg, 4, 74, 1.2F, 9.5F, -3.0F, 1, 2, 2, 0.0F, false);
			addBoxHelper(RightLeg, 33, 61, -0.5F, 6.0F, -2.5F, 2, 5, 3, 0.0F, false);
			addBoxHelper(RightLeg, 14, 56, -0.5F, 2.0F, -2.5F, 2, 4, 4, 0.0F, false);
			addBoxHelper(RightLeg, 70, 37, -0.25F, 2.0F, -1.5F, 2, 3, 2, 0.0F, false);
			addBoxHelper(RightLeg, 41, 41, -0.5F, -2.0F, -2.5F, 2, 4, 5, 0.0F, false);
			addBoxHelper(RightLeg, 14, 31, 0.0F, 6.0F, 0.0F, 1, 5, 1, 0.0F, false);
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(4.5F, -22.0F, -1.0F);
			SuperBattleDroid.addChild(LeftLeg);
			addBoxHelper(LeftLeg, 33, 20, -1.5F, 21.0F, -4.0F, 3, 1, 6, 0.0F, false);
			addBoxHelper(LeftLeg, 64, 45, -1.0F, 20.5F, -3.0F, 2, 1, 2, 0.0F, false);
			addBoxHelper(LeftLeg, 44, 5, -1.0F, 11.0F, -1.0F, 2, 10, 3, 0.0F, false);
			addBoxHelper(LeftLeg, 38, 75, -0.5F, 14.0F, -1.5F, 1, 4, 1, 0.0F, false);
			addBoxHelper(LeftLeg, 53, 62, -0.5F, 10.0F, -1.5F, 1, 3, 1, 0.0F, false);
			addBoxHelper(LeftLeg, 60, 73, -0.5F, 6.0F, 0.5F, 1, 5, 1, 0.0F, false);
			addBoxHelper(LeftLeg, 69, 45, 0.5F, 9.0F, -3.0F, 1, 3, 3, 0.0F, false);
			addBoxHelper(LeftLeg, 15, 70, -1.5F, 9.0F, -3.0F, 1, 3, 3, 0.0F, false);
			addBoxHelper(LeftLeg, 10, 74, 0.7F, 9.5F, -2.5F, 1, 2, 2, 0.0F, false);
			addBoxHelper(LeftLeg, 73, 73, -1.7F, 9.5F, -2.5F, 1, 2, 2, 0.0F, false);
			addBoxHelper(LeftLeg, 43, 61, -1.0F, 6.0F, -2.0F, 2, 5, 3, 0.0F, false);
			addBoxHelper(LeftLeg, 54, 4, -1.0F, 2.0F, -2.0F, 2, 4, 4, 0.0F, false);
			addBoxHelper(LeftLeg, 23, 71, -1.25F, 2.0F, -1.0F, 2, 3, 2, 0.0F, false);
			addBoxHelper(LeftLeg, 27, 40, -1.0F, -2.0F, -2.0F, 2, 4, 5, 0.0F, false);
			RightArmWeapon = new ModelRenderer(this);
			RightArmWeapon.setRotationPoint(6.5F, -35.5F, -5.0F);
			SuperBattleDroid.addChild(RightArmWeapon);
			addBoxHelper(RightArmWeapon, 12, 12, -15.0F, -2.5F, -1.0F, 2, 3, 8, 0.0F, false);
			addBoxHelper(RightArmWeapon, 24, 65, -13.5F, -2.0F, -5.0F, 1, 2, 4, 0.0F, false);
			addBoxHelper(RightArmWeapon, 53, 62, -15.0F, -1.5F, -9.0F, 2, 1, 4, 0.0F, false);
			addBoxHelper(RightArmWeapon, 62, 0, -14.5F, -2.5F, -5.0F, 1, 3, 4, 0.0F, false);
			addBoxHelper(RightArmWeapon, 64, 39, -14.5F, -2.0F, -8.0F, 1, 2, 3, 0.0F, false);
			addBoxHelper(RightArmWeapon, 53, 22, -14.5F, -1.6F, -11.0F, 1, 1, 2, 0.0F, false);
			addBoxHelper(RightArmWeapon, 65, 25, -14.5F, -2.6F, 0.0F, 1, 1, 4, 0.0F, false);
			addBoxHelper(RightArmWeapon, 49, 49, -14.5F, -0.4F, 0.0F, 1, 1, 6, 0.0F, false);
			addBoxHelper(RightArmWeapon, 14, 51, -15.0F, -1.5F, -12.0F, 2, 1, 3, 0.0F, false);
			addBoxHelper(RightArmWeapon, 48, 56, -15.0F, -0.5F, -12.0F, 2, 1, 1, 0.0F, false);
			addBoxHelper(RightArmWeapon, 0, 65, -15.5F, -2.0F, -5.0F, 1, 2, 4, 0.0F, false);
			addBoxHelper(RightArmWeapon, 70, 11, -15.5F, -2.0F, 0.0F, 1, 2, 3, 0.0F, false);
			addBoxHelper(RightArmWeapon, 0, 55, -15.3F, -2.0F, 4.0F, 1, 2, 2, 0.0F, false);
			addBoxHelper(RightArmWeapon, 55, 45, -14.5F, -2.0F, 6.5F, 1, 2, 1, 0.0F, false);
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(5.5F, -31.5F, 1.0F);
			SuperBattleDroid.addChild(LeftArm);
			setRotationAngle(LeftArm, 1.5708F, 0.0F, 0.0F);
			addBoxHelper(LeftArm, 0, 8, 1.0F, -2.5F, -1.0F, 2, 3, 8, 0.0F, false);
			addBoxHelper(LeftArm, 64, 13, 0.5F, -2.0F, -5.0F, 1, 2, 4, 0.0F, false);
			addBoxHelper(LeftArm, 61, 61, 1.0F, -1.5F, -9.0F, 2, 1, 4, 0.0F, false);
			addBoxHelper(LeftArm, 8, 61, 1.5F, -2.5F, -5.0F, 1, 3, 4, 0.0F, false);
			addBoxHelper(LeftArm, 14, 64, 1.5F, -2.0F, -8.0F, 1, 2, 3, 0.0F, false);
			addBoxHelper(LeftArm, 7, 42, 2.1F, -1.5F, -11.0F, 1, 1, 2, 0.0F, false);
			addBoxHelper(LeftArm, 36, 40, 1.5F, -2.6F, 0.0F, 1, 1, 4, 0.0F, false);
			addBoxHelper(LeftArm, 20, 49, 1.5F, -0.4F, 0.0F, 1, 1, 6, 0.0F, false);
			addBoxHelper(LeftArm, 67, 70, 2.0F, -2.0F, -12.0F, 1, 2, 3, 0.0F, false);
			addBoxHelper(LeftArm, 21, 51, 1.0F, -2.0F, -12.0F, 1, 2, 1, 0.0F, false);
			addBoxHelper(LeftArm, 63, 49, 2.5F, -2.0F, -5.0F, 1, 2, 4, 0.0F, false);
			addBoxHelper(LeftArm, 69, 30, 2.5F, -2.0F, 0.0F, 1, 2, 3, 0.0F, false);
			addBoxHelper(LeftArm, 51, 4, 2.3F, -2.0F, 4.0F, 1, 2, 2, 0.0F, false);
			addBoxHelper(LeftArm, 35, 20, 1.5F, -2.0F, 6.5F, 1, 2, 1, 0.0F, false);
		}

		@Override
		public void render(MatrixStack ms, IVertexBuilder vb, int i1, int i2, float f1, float f2, float f3, float f4) {
			SuperBattleDroid.render(ms, vb, i1, i2, f1, f2, f3, f4);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.LeftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
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
