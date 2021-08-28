
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
import net.minecraft.world.IWorldReader;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.pathfinding.SwimmerPathNavigator;
import net.minecraft.network.IPacket;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.Item;
import net.minecraft.entity.merchant.villager.VillagerEntity;
import net.minecraft.entity.ai.goal.RangedAttackGoal;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.ai.goal.RandomSwimmingGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.controller.MovementController;
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
import net.mcreator.starwarsmod.item.AquaDroidWeaponItem;
import net.mcreator.starwarsmod.StarwarsmodModElements;

import java.util.Map;
import java.util.HashMap;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@StarwarsmodModElements.ModElement.Tag
public class AquaDroidEntity extends StarwarsmodModElements.ModElement {
	public static EntityType entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new).size(1f, 3f))
					.build("aqua_droid").setRegistryName("aqua_droid");
	public AquaDroidEntity(StarwarsmodModElements instance) {
		super(instance, 435);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@Override
	public void initElements() {
		elements.entities.add(() -> entity);
		elements.items.add(() -> new SpawnEggItem(entity, -10066330, -16764109, new Item.Properties().group(SepratistAIItemGroup.tab))
				.setRegistryName("aqua_droid_spawn_egg"));
	}

	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public void registerModels(ModelRegistryEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(entity, renderManager -> {
			return new MobRenderer(renderManager, new ModelAquaDroid(), 0.5f) {
				@Override
				public ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("starwarsmod:textures/aquadroid.png");
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
			this.moveController = new MovementController(this) {
				@Override
				public void tick() {
					if (this.action == MovementController.Action.MOVE_TO && !CustomEntity.this.getNavigator().noPath()) {
						double dx = this.posX - CustomEntity.this.getPosX();
						double dy = this.posY - CustomEntity.this.getPosY();
						double dz = this.posZ - CustomEntity.this.getPosZ();
						float f = (float) (MathHelper.atan2(dz, dx) * (double) (180 / Math.PI)) - 90;
						CustomEntity.this.rotationYaw = this.limitAngle(CustomEntity.this.rotationYaw, f, 10);
						CustomEntity.this.renderYawOffset = CustomEntity.this.rotationYaw;
						CustomEntity.this.rotationYawHead = CustomEntity.this.rotationYaw;
						float f1 = (float) (this.speed * CustomEntity.this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getValue());
						if (CustomEntity.this.isInWater()) {
							CustomEntity.this.setAIMoveSpeed(f1 * 0.1F);
							float f2 = -(float) (MathHelper.atan2(dy, MathHelper.sqrt(dx * dx + dz * dz)) * (180F / Math.PI));
							f2 = MathHelper.clamp(MathHelper.wrapDegrees(f2), -85, 85);
							CustomEntity.this.rotationPitch = this.limitAngle(CustomEntity.this.rotationPitch, f2, 5);
							float f3 = MathHelper.cos(CustomEntity.this.rotationPitch * (float) (Math.PI / 180.0));
							float f4 = MathHelper.sin(CustomEntity.this.rotationPitch * (float) (Math.PI / 180.0));
							CustomEntity.this.setMoveForward(f3 * f1);
							CustomEntity.this.setMoveVertical((float) (f1 * dy));
						} else {
							CustomEntity.this.setAIMoveSpeed(f1 * 0.05F);
						}
					} else {
						CustomEntity.this.setAIMoveSpeed(0);
						CustomEntity.this.setMoveVertical(0);
						CustomEntity.this.setMoveForward(0);
					}
				}
			};
			this.navigator = new SwimmerPathNavigator(this, this.world);
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
			this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, MouseDroidEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, CodyEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, CloneTrooperEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, CloneTrooperHeavyEntity.CustomEntity.class, true, false));
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
			this.targetSelector.addGoal(26, new NearestAttackableTargetGoal(this, MouseDroidEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(27, new NearestAttackableTargetGoal(this, SenateCommandoEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(28, new NearestAttackableTargetGoal(this, SenateCommandoCaptainEntity.CustomEntity.class, true, false));
			this.goalSelector.addGoal(29, new LookRandomlyGoal(this));
			this.goalSelector.addGoal(30, new RandomWalkingGoal(this, 0.6));
			this.goalSelector.addGoal(31, new RandomSwimmingGoal(this, 1, 40));
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
		public boolean attackEntityFrom(DamageSource source, float amount) {
			if (source == DamageSource.DROWN)
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
			AquaDroidWeaponItem.shoot(this, target);
		}

		@Override
		public boolean canBreatheUnderwater() {
			return true;
		}

		@Override
		public boolean isNotColliding(IWorldReader worldreader) {
			return worldreader.checkNoEntityCollision(this, VoxelShapes.create(this.getBoundingBox()));
		}

		@Override
		public boolean isPushedByWater() {
			return false;
		}
	}

	// Made with Blockbench 3.7.4
	// Exported for Minecraft version 1.14
	// Paste this class into your mod and generate all required imports
	public static class ModelAquaDroid extends EntityModel {
		private final ModelRenderer AquaDroid;
		private final ModelRenderer GunArm;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer RightArm;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		private final ModelRenderer LeftLeg;
		private final ModelRenderer cube_r5;
		private final ModelRenderer cube_r6;
		private final ModelRenderer RightLeg;
		private final ModelRenderer cube_r7;
		private final ModelRenderer cube_r8;
		private final ModelRenderer Head;
		private final ModelRenderer cube_r9;
		private final ModelRenderer cube_r10;
		private final ModelRenderer cube_r11;
		private final ModelRenderer Body;
		private final ModelRenderer cube_r12;
		private final ModelRenderer cube_r13;
		private final ModelRenderer cube_r14;
		private final ModelRenderer cube_r15;
		private final ModelRenderer cube_r16;
		private final ModelRenderer cube_r17;
		private final ModelRenderer cube_r18;
		public ModelAquaDroid() {
			textureWidth = 128;
			textureHeight = 128;
			AquaDroid = new ModelRenderer(this);
			AquaDroid.setRotationPoint(0.0F, 23.5F, 0.0F);
			GunArm = new ModelRenderer(this);
			GunArm.setRotationPoint(-4.0F, -39.5F, 0.0F);
			AquaDroid.addChild(GunArm);
			setRotationAngle(GunArm, 0.0873F, 0.0F, 0.0F);
			addBoxHelper(GunArm, 28, 64, -4.5F, 0.0F, -2.0F, 1, 2, 2, 0.0F, false);
			addBoxHelper(GunArm, 48, 48, -5.5F, -1.0F, -6.0F, 1, 4, 4, 0.0F, false);
			addBoxHelper(GunArm, 28, 58, -5.5F, -0.5F, -2.0F, 1, 3, 3, 0.0F, false);
			addBoxHelper(GunArm, 8, 64, -5.5F, 0.0F, 1.0F, 1, 2, 2, 0.0F, false);
			addBoxHelper(GunArm, 58, 58, -5.75F, -0.5F, -5.5F, 1, 3, 3, 0.0F, false);
			addBoxHelper(GunArm, 14, 64, -5.75F, 0.0F, -2.5F, 1, 2, 2, 0.0F, false);
			addBoxHelper(GunArm, 30, 42, -5.75F, 0.5F, -0.5F, 1, 1, 2, 0.0F, false);
			addBoxHelper(GunArm, 10, 41, -4.5F, 0.5F, -8.0F, 1, 1, 6, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(2.5F, -4.0F, 1.0F);
			GunArm.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0F, -0.3491F, -0.3054F);
			addBoxHelper(cube_r1, 52, 45, -8.0F, 2.5F, 0.0F, 6, 1, 1, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(-0.5F, -2.0F, -3.0F);
			GunArm.addChild(cube_r2);
			setRotationAngle(cube_r2, -0.0873F, 0.0F, 0.0F);
			addBoxHelper(cube_r2, 40, 16, -5.5F, 3.0F, -13.9772F, 2, 2, 1, 0.0F, false);
			addBoxHelper(cube_r2, 0, 0, -5.0F, 1.25F, -19.9772F, 1, 1, 15, 0.0F, false);
			addBoxHelper(cube_r2, 26, 33, -5.0F, 2.25F, -7.9772F, 1, 1, 1, 0.0F, false);
			addBoxHelper(cube_r2, 12, 41, -5.0F, 2.25F, -10.9772F, 1, 1, 1, 0.0F, false);
			addBoxHelper(cube_r2, 0, 26, -5.5F, 2.5F, -11.9772F, 2, 1, 7, 0.0F, false);
			addBoxHelper(cube_r2, 15, 17, -5.0F, 2.9771F, -12.9772F, 1, 1, 9, 0.0F, false);
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(4.0F, -39.5F, 0.0F);
			AquaDroid.addChild(RightArm);
			setRotationAngle(RightArm, 1.8326F, 0.0F, 0.0F);
			addBoxHelper(RightArm, 0, 64, 3.5F, 0.0F, -2.0F, 1, 2, 2, 0.0F, false);
			addBoxHelper(RightArm, 45, 20, 4.5F, -1.0F, -6.0F, 1, 4, 4, 0.0F, false);
			addBoxHelper(RightArm, 10, 58, 4.5F, -0.5F, -2.0F, 1, 3, 3, 0.0F, false);
			addBoxHelper(RightArm, 34, 63, 4.5F, 0.0F, 1.0F, 1, 2, 2, 0.0F, false);
			addBoxHelper(RightArm, 57, 30, 4.75F, -0.5F, -5.5F, 1, 3, 3, 0.0F, false);
			addBoxHelper(RightArm, 44, 36, 4.75F, 0.0F, -2.5F, 1, 2, 2, 0.0F, false);
			addBoxHelper(RightArm, 9, 0, 4.75F, 0.5F, -0.5F, 1, 1, 2, 0.0F, false);
			addBoxHelper(RightArm, 40, 13, 3.5F, 0.5F, -8.0F, 1, 1, 6, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(-2.5F, -4.0F, 1.0F);
			RightArm.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.0F, 0.3491F, 0.3054F);
			addBoxHelper(cube_r3, 11, 31, 2.0F, 2.5F, 0.0F, 6, 1, 1, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(0.5F, -2.0F, -3.0F);
			RightArm.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.6109F, 0.0F, 0.0F);
			addBoxHelper(cube_r4, 63, 47, 3.5F, -9.5F, -7.0F, 2, 1, 2, 0.0F, false);
			addBoxHelper(cube_r4, 38, 57, 3.5F, -7.5F, -5.5F, 2, 7, 1, 0.0F, false);
			addBoxHelper(cube_r4, 24, 57, 4.0F, -8.5F, -6.0F, 1, 9, 1, 0.0F, false);
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(3.0F, -20.25F, 0.0F);
			AquaDroid.addChild(LeftLeg);
			addBoxHelper(LeftLeg, 0, 46, 1.0F, -3.5F, -1.5F, 2, 6, 3, 0.0F, false);
			addBoxHelper(LeftLeg, 18, 55, 1.5F, 2.5F, -1.5F, 1, 7, 2, 0.0F, false);
			addBoxHelper(LeftLeg, 18, 48, 1.5F, 2.5F, 0.5F, 1, 4, 1, 0.0F, false);
			addBoxHelper(LeftLeg, 59, 36, 0.5F, 9.5F, -2.0F, 3, 2, 2, 0.0F, false);
			addBoxHelper(LeftLeg, 20, 64, 1.5F, 14.5F, -0.75F, 1, 4, 1, 0.0F, false);
			addBoxHelper(LeftLeg, 65, 3, 1.0F, 18.5F, -0.75F, 2, 1, 1, 0.0F, false);
			addBoxHelper(LeftLeg, 62, 64, 1.5F, 19.0F, -1.25F, 1, 1, 2, 0.0F, false);
			addBoxHelper(LeftLeg, 35, 13, 0.5F, 19.25F, 0.75F, 3, 1, 2, 0.0F, false);
			addBoxHelper(LeftLeg, 27, 54, 0.5F, 19.25F, -4.25F, 3, 1, 3, 0.0F, false);
			addBoxHelper(LeftLeg, 37, 0, 1.5F, 19.0F, -4.5F, 1, 1, 3, 0.0F, false);
			addBoxHelper(LeftLeg, 56, 64, 1.5F, 19.0F, 1.0F, 1, 1, 2, 0.0F, false);
			addBoxHelper(LeftLeg, 63, 43, 1.0F, 19.25F, 2.75F, 2, 1, 1, 0.0F, false);
			addBoxHelper(LeftLeg, 36, 54, 1.0F, 19.25F, -5.25F, 2, 1, 1, 0.0F, false);
			addBoxHelper(LeftLeg, 26, 16, 1.5F, 9.75F, -2.5F, 1, 3, 1, 0.0F, false);
			addBoxHelper(LeftLeg, 39, 66, 1.0F, 2.5F, -1.0F, 1, 4, 1, 0.0F, false);
			addBoxHelper(LeftLeg, 60, 8, 0.5F, -2.5F, -1.0F, 3, 2, 2, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(-3.0F, -3.25F, 0.0F);
			LeftLeg.addChild(cube_r5);
			setRotationAngle(cube_r5, 0.0F, 0.0F, 0.6109F);
			addBoxHelper(cube_r5, 63, 20, 1.0F, -1.5F, -0.5F, 4, 1, 1, 0.0F, false);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(0.0F, 10.75F, 0.0F);
			LeftLeg.addChild(cube_r6);
			setRotationAngle(cube_r6, 0.0873F, 0.0F, 0.0F);
			addBoxHelper(cube_r6, 65, 32, 1.0F, 2.75F, -0.2F, 2, 1, 1, 0.0F, false);
			addBoxHelper(cube_r6, 44, 57, 1.0F, -0.25F, -1.2F, 2, 5, 1, 0.0F, false);
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(-3.0F, -20.25F, 0.0F);
			AquaDroid.addChild(RightLeg);
			addBoxHelper(RightLeg, 42, 42, -3.0F, -3.5F, -1.5F, 2, 6, 3, 0.0F, false);
			addBoxHelper(RightLeg, 0, 55, -2.5F, 2.5F, -1.5F, 1, 7, 2, 0.0F, false);
			addBoxHelper(RightLeg, 19, 16, -2.5F, 2.5F, 0.5F, 1, 4, 1, 0.0F, false);
			addBoxHelper(RightLeg, 58, 51, -3.5F, 9.5F, -2.0F, 3, 2, 2, 0.0F, false);
			addBoxHelper(RightLeg, 17, 8, -2.5F, 14.5F, -0.75F, 1, 4, 1, 0.0F, false);
			addBoxHelper(RightLeg, 49, 7, -3.0F, 18.5F, -0.75F, 2, 1, 1, 0.0F, false);
			addBoxHelper(RightLeg, 63, 58, -2.5F, 19.0F, -1.25F, 1, 1, 2, 0.0F, false);
			addBoxHelper(RightLeg, 18, 33, -3.5F, 19.25F, 0.75F, 3, 1, 2, 0.0F, false);
			addBoxHelper(RightLeg, 39, 53, -3.5F, 19.25F, -4.25F, 3, 1, 3, 0.0F, false);
			addBoxHelper(RightLeg, 28, 36, -2.5F, 19.0F, -4.5F, 1, 1, 3, 0.0F, false);
			addBoxHelper(RightLeg, 39, 42, -2.5F, 19.0F, 1.0F, 1, 1, 2, 0.0F, false);
			addBoxHelper(RightLeg, 25, 31, -3.0F, 19.25F, 2.75F, 2, 1, 1, 0.0F, false);
			addBoxHelper(RightLeg, 26, 24, -3.0F, 19.25F, -5.25F, 2, 1, 1, 0.0F, false);
			addBoxHelper(RightLeg, 17, 0, -2.5F, 9.75F, -2.5F, 1, 3, 1, 0.0F, false);
			addBoxHelper(RightLeg, 0, 16, -2.0F, 2.5F, -1.0F, 1, 4, 1, 0.0F, false);
			addBoxHelper(RightLeg, 57, 4, -3.5F, -2.5F, -1.0F, 3, 2, 2, 0.0F, false);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(3.0F, -3.25F, 0.0F);
			RightLeg.addChild(cube_r7);
			setRotationAngle(cube_r7, 0.0F, 0.0F, -0.6109F);
			addBoxHelper(cube_r7, 62, 30, -5.0F, -1.5F, -0.5F, 4, 1, 1, 0.0F, false);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(0.0F, 10.75F, 0.0F);
			RightLeg.addChild(cube_r8);
			setRotationAngle(cube_r8, 0.0873F, 0.0F, 0.0F);
			addBoxHelper(cube_r8, 42, 51, -3.0F, 2.75F, -0.2F, 2, 1, 1, 0.0F, false);
			addBoxHelper(cube_r8, 0, 26, -3.0F, -0.25F, -1.2F, 2, 5, 1, 0.0F, false);
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, -41.5F, 0.0F);
			AquaDroid.addChild(Head);
			addBoxHelper(Head, 42, 63, -1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F, false);
			addBoxHelper(Head, 60, 23, -1.5F, -5.0F, -3.0F, 3, 2, 2, 0.0F, false);
			addBoxHelper(Head, 60, 0, -2.0F, -5.25F, -2.75F, 4, 2, 1, 0.0F, false);
			addBoxHelper(Head, 66, 16, 2.0F, -4.75F, -2.25F, 2, 1, 1, 0.0F, false);
			addBoxHelper(Head, 49, 66, -4.0F, -4.75F, -2.25F, 2, 1, 1, 0.0F, false);
			addBoxHelper(Head, 66, 12, 2.0F, -4.75F, 0.75F, 2, 1, 1, 0.0F, false);
			addBoxHelper(Head, 65, 34, -4.0F, -4.75F, 0.75F, 2, 1, 1, 0.0F, false);
			addBoxHelper(Head, 58, 55, -2.0F, -5.25F, 1.25F, 4, 2, 1, 0.0F, false);
			addBoxHelper(Head, 48, 14, -2.0F, -5.75F, -1.75F, 4, 1, 3, 0.0F, false);
			addBoxHelper(Head, 0, 40, -0.5F, -4.75F, -3.25F, 1, 2, 1, 0.0F, false);
			cube_r9 = new ModelRenderer(this);
			cube_r9.setRotationPoint(-4.5F, -4.0F, -1.0F);
			Head.addChild(cube_r9);
			setRotationAngle(cube_r9, 0.3491F, 0.0F, 0.0F);
			addBoxHelper(cube_r9, 30, 46, 4.0F, 0.0F, -1.0F, 1, 5, 1, 0.0F, false);
			cube_r10 = new ModelRenderer(this);
			cube_r10.setRotationPoint(0.0F, -9.0F, -2.0F);
			Head.addChild(cube_r10);
			setRotationAngle(cube_r10, 0.0F, 0.0F, -0.1309F);
			addBoxHelper(cube_r10, 0, 11, -6.45F, 3.25F, 0.25F, 4, 1, 3, 0.0F, false);
			cube_r11 = new ModelRenderer(this);
			cube_r11.setRotationPoint(0.0F, -9.0F, -2.0F);
			Head.addChild(cube_r11);
			setRotationAngle(cube_r11, 0.0F, 0.0F, 0.1309F);
			addBoxHelper(cube_r11, 48, 10, 2.45F, 3.25F, 0.25F, 4, 1, 3, 0.0F, false);
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, -5.5F, 0.0F);
			AquaDroid.addChild(Body);
			addBoxHelper(Body, 54, 47, -1.5F, -20.25F, -1.5F, 3, 1, 3, 0.0F, false);
			addBoxHelper(Body, 22, 46, -1.0F, -27.25F, -1.0F, 2, 9, 2, 0.0F, false);
			addBoxHelper(Body, 56, 23, -0.5F, -27.25F, -1.25F, 1, 9, 1, 0.0F, false);
			addBoxHelper(Body, 54, 56, -0.5F, -27.25F, 0.25F, 1, 9, 1, 0.0F, false);
			addBoxHelper(Body, 50, 56, 0.25F, -27.25F, -0.5F, 1, 9, 1, 0.0F, false);
			addBoxHelper(Body, 6, 55, -1.25F, -27.25F, -0.5F, 1, 9, 1, 0.0F, false);
			addBoxHelper(Body, 0, 40, -2.0F, -18.75F, -2.0F, 4, 2, 4, 0.0F, false);
			addBoxHelper(Body, 18, 41, -2.0F, -20.0F, -2.0F, 4, 1, 4, 0.0F, false);
			addBoxHelper(Body, 50, 4, -0.5F, -17.25F, -2.5F, 1, 1, 5, 0.0F, false);
			addBoxHelper(Body, 32, 36, -2.0F, -24.5F, -2.0F, 4, 2, 4, 0.0F, false);
			addBoxHelper(Body, 17, 8, -2.5F, -28.5F, -2.5F, 5, 2, 5, 0.0F, false);
			addBoxHelper(Body, 0, 0, -1.5F, -32.5F, -1.5F, 3, 8, 3, 0.0F, false);
			addBoxHelper(Body, 34, 42, -0.5F, -32.5F, -1.25F, 1, 9, 3, 0.0F, false);
			addBoxHelper(Body, 48, 28, -1.25F, -32.5F, -0.5F, 3, 9, 1, 0.0F, false);
			addBoxHelper(Body, 10, 48, -1.75F, -32.5F, -0.5F, 3, 9, 1, 0.0F, false);
			addBoxHelper(Body, 11, 10, -0.5F, -26.5F, -1.75F, 1, 3, 1, 0.0F, false);
			addBoxHelper(Body, 0, 16, -3.5F, -36.5F, -2.5F, 7, 5, 5, 0.0F, false);
			addBoxHelper(Body, 14, 36, 2.5F, -38.0F, -2.0F, 5, 1, 4, 0.0F, false);
			addBoxHelper(Body, 59, 16, 5.25F, -38.5F, -1.5F, 2, 1, 3, 0.0F, false);
			addBoxHelper(Body, 59, 12, -7.25F, -38.5F, -1.5F, 2, 1, 3, 0.0F, false);
			addBoxHelper(Body, 31, 24, -7.5F, -38.0F, -2.0F, 5, 1, 4, 0.0F, false);
			addBoxHelper(Body, 17, 0, -4.0F, -36.0F, -2.0F, 8, 4, 4, 0.0F, false);
			addBoxHelper(Body, 11, 27, -4.5F, -35.0F, -1.0F, 9, 2, 2, 0.0F, false);
			cube_r12 = new ModelRenderer(this);
			cube_r12.setRotationPoint(1.5F, -42.0F, 0.0F);
			Body.addChild(cube_r12);
			setRotationAngle(cube_r12, 0.6981F, 0.0F, 0.0F);
			addBoxHelper(cube_r12, 60, 27, -6.5F, 2.0F, -8.0F, 3, 1, 2, 0.0F, false);
			addBoxHelper(cube_r12, 61, 40, 0.5F, 2.0F, -8.0F, 3, 1, 2, 0.0F, false);
			addBoxHelper(cube_r12, 49, 42, -8.5F, 2.0F, -6.0F, 5, 1, 2, 0.0F, false);
			addBoxHelper(cube_r12, 51, 20, 0.5F, 2.0F, -6.0F, 5, 1, 2, 0.0F, false);
			cube_r13 = new ModelRenderer(this);
			cube_r13.setRotationPoint(-4.0F, -41.0F, -1.5F);
			Body.addChild(cube_r13);
			setRotationAngle(cube_r13, 0.48F, 0.0F, 0.0F);
			addBoxHelper(cube_r13, 41, 0, 3.0F, 8.25F, -6.5F, 2, 3, 4, 0.0F, false);
			addBoxHelper(cube_r13, 26, 16, 1.5F, 4.25F, -6.5F, 5, 4, 4, 0.0F, false);
			cube_r14 = new ModelRenderer(this);
			cube_r14.setRotationPoint(2.0F, -41.0F, 1.5F);
			Body.addChild(cube_r14);
			setRotationAngle(cube_r14, -0.48F, 0.0F, 0.0F);
			addBoxHelper(cube_r14, 30, 30, -5.0F, 4.75F, 2.0F, 6, 3, 3, 0.0F, false);
			cube_r15 = new ModelRenderer(this);
			cube_r15.setRotationPoint(-1.0F, -41.0F, 2.5F);
			Body.addChild(cube_r15);
			setRotationAngle(cube_r15, 0.5236F, 0.0F, 0.0F);
			addBoxHelper(cube_r15, 32, 8, -3.0F, 2.5F, -3.0F, 8, 4, 1, 0.0F, false);
			cube_r16 = new ModelRenderer(this);
			cube_r16.setRotationPoint(-1.0F, -41.0F, -1.5F);
			Body.addChild(cube_r16);
			setRotationAngle(cube_r16, -0.7854F, 0.0F, 0.0F);
			addBoxHelper(cube_r16, 0, 34, -3.0F, 2.5F, 2.0F, 8, 5, 1, 0.0F, false);
			cube_r17 = new ModelRenderer(this);
			cube_r17.setRotationPoint(3.0F, -21.0F, -2.0F);
			Body.addChild(cube_r17);
			setRotationAngle(cube_r17, 0.0F, 0.0F, -1.0472F);
			addBoxHelper(cube_r17, 48, 38, -3.5F, -0.25F, 0.5F, 4, 1, 3, 0.0F, false);
			cube_r18 = new ModelRenderer(this);
			cube_r18.setRotationPoint(-3.0F, -21.0F, -2.0F);
			Body.addChild(cube_r18);
			setRotationAngle(cube_r18, 0.0F, 0.0F, 1.0472F);
			addBoxHelper(cube_r18, 49, 0, -0.5F, -0.25F, 0.5F, 4, 1, 3, 0.0F, false);
		}

		@Override
		public void render(MatrixStack ms, IVertexBuilder vb, int i1, int i2, float f1, float f2, float f3, float f4) {
			AquaDroid.render(ms, vb, i1, i2, f1, f2, f3, f4);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.LeftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
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
