
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
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.pathfinding.FlyingPathNavigator;
import net.minecraft.network.IPacket;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.Item;
import net.minecraft.entity.ai.goal.RangedAttackGoal;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.controller.FlyingMovementController;
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
import net.minecraft.block.BlockState;

import net.mcreator.starwarsmod.itemgroup.RepublicAIItemGroup;
import net.mcreator.starwarsmod.item.ProbeWeaponRepublicItem;
import net.mcreator.starwarsmod.StarwarsmodModElements;

import java.util.Random;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@StarwarsmodModElements.ModElement.Tag
public class ViperProbeDroidEntity extends StarwarsmodModElements.ModElement {
	public static EntityType entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new)
			.size(0.6f, 1.8f)).build("viper_probe_droid").setRegistryName("viper_probe_droid");
	public ViperProbeDroidEntity(StarwarsmodModElements instance) {
		super(instance, 113);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@Override
	public void initElements() {
		elements.entities.add(() -> entity);
		elements.items.add(() -> new SpawnEggItem(entity, -13421773, -52429, new Item.Properties().group(RepublicAIItemGroup.tab))
				.setRegistryName("viper_probe_droid_spawn_egg"));
	}

	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public void registerModels(ModelRegistryEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(entity, renderManager -> {
			return new MobRenderer(renderManager, new ModelProbeDroid(), 0.5f) {
				@Override
				public ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("starwarsmod:textures/probedroidrepublic.png");
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
			this.moveController = new FlyingMovementController(this, 10, true);
			this.navigator = new FlyingPathNavigator(this, this.world);
		}

		@Override
		public IPacket<?> createSpawnPacket() {
			return NetworkHooks.getEntitySpawningPacket(this);
		}

		@Override
		protected void registerGoals() {
			super.registerGoals();
			this.targetSelector.addGoal(1, new NearestAttackableTargetGoal(this, SuperBattleDroidEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, BattleDroidEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, SpiderDroidEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, SuperBattleDroidJetTrooperEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, BuzzDroidMobEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, DroidekaEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, CommandoDroidEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, CommandoDroidSoldierEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, BattleDroidCommanderEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, GeonosianFlyerEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, GeonosianBezerkerEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(12, new NearestAttackableTargetGoal(this, UndeadGeonosianEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(13, new NearestAttackableTargetGoal(this, LR57CombatDroidEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(14, new NearestAttackableTargetGoal(this, AquaDroidEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(15, new NearestAttackableTargetGoal(this, MagnaGuardEntity.CustomEntity.class, true, false));
			this.goalSelector.addGoal(16, new RandomWalkingGoal(this, 0.8, 20) {
				@Override
				protected Vec3d getPosition() {
					Random random = CustomEntity.this.getRNG();
					double dir_x = CustomEntity.this.getPosX() + ((random.nextFloat() * 2 - 1) * 16);
					double dir_y = CustomEntity.this.getPosY() + ((random.nextFloat() * 2 - 1) * 16);
					double dir_z = CustomEntity.this.getPosZ() + ((random.nextFloat() * 2 - 1) * 16);
					return new Vec3d(dir_x, dir_y, dir_z);
				}
			});
			this.goalSelector.addGoal(17, new LookRandomlyGoal(this));
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
		public net.minecraft.util.SoundEvent getAmbientSound() {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("starwarsmod:probeidle"));
		}

		@Override
		public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
		}

		@Override
		public net.minecraft.util.SoundEvent getDeathSound() {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
		}

		@Override
		public boolean onLivingFall(float l, float d) {
			return false;
		}

		@Override
		public boolean attackEntityFrom(DamageSource source, float amount) {
			if (source == DamageSource.FALL)
				return false;
			return super.attackEntityFrom(source, amount);
		}

		@Override
		protected void registerAttributes() {
			super.registerAttributes();
			if (this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED) != null)
				this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3);
			if (this.getAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
				this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(25);
			if (this.getAttribute(SharedMonsterAttributes.ARMOR) != null)
				this.getAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0);
			if (this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) == null)
				this.getAttributes().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
			this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(3);
			if (this.getAttribute(SharedMonsterAttributes.FLYING_SPEED) == null)
				this.getAttributes().registerAttribute(SharedMonsterAttributes.FLYING_SPEED);
			this.getAttribute(SharedMonsterAttributes.FLYING_SPEED).setBaseValue(0.3);
		}

		public void attackEntityWithRangedAttack(LivingEntity target, float flval) {
			ProbeWeaponRepublicItem.shoot(this, target);
		}

		@Override
		protected void updateFallState(double y, boolean onGroundIn, BlockState state, BlockPos pos) {
		}

		@Override
		public void setNoGravity(boolean ignored) {
			super.setNoGravity(true);
		}

		public void livingTick() {
			super.livingTick();
			this.setNoGravity(true);
		}
	}

	// Made with Blockbench 3.7.4
	// Exported for Minecraft version 1.14
	// Paste this class into your mod and generate all required imports
	public static class ModelProbeDroid extends EntityModel {
		private final ModelRenderer ProbeDroid;
		private final ModelRenderer Head;
		private final ModelRenderer Torso;
		private final ModelRenderer Legs;
		public ModelProbeDroid() {
			textureWidth = 128;
			textureHeight = 128;
			ProbeDroid = new ModelRenderer(this);
			ProbeDroid.setRotationPoint(0.0F, 24.0F, 0.0F);
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, -26.0F, 0.0F);
			ProbeDroid.addChild(Head);
			addBoxHelper(Head, 0, 84, -8.0F, -1.0F, -6.0F, 16, 2, 12, 0.0F, false);
			addBoxHelper(Head, 60, 42, -8.0F, -7.0F, -6.0F, 16, 2, 12, 0.0F, false);
			addBoxHelper(Head, 48, 94, -4.0F, -7.6F, -4.0F, 8, 2, 8, 0.0F, false);
			addBoxHelper(Head, 0, 8, -3.0F, -7.8F, -2.0F, 4, 2, 4, 0.0F, false);
			addBoxHelper(Head, 0, 66, -10.0F, -6.0F, -6.0F, 20, 6, 12, 0.0F, false);
			addBoxHelper(Head, 56, 56, -8.0F, -6.0F, -8.0F, 16, 6, 16, 0.0F, false);
			addBoxHelper(Head, 0, 0, -2.0F, -5.0F, -8.5F, 4, 4, 4, 0.0F, false);
			addBoxHelper(Head, 0, 92, 6.5F, -5.0F, -0.5F, 4, 2, 2, 0.0F, false);
			addBoxHelper(Head, 90, 20, -11.5F, -6.4F, -0.5F, 4, 2, 2, 0.0F, false);
			addBoxHelper(Head, 80, 18, -10.4F, -3.5F, -4.0F, 4, 2, 2, 0.0F, false);
			addBoxHelper(Head, 8, 14, 6.5F, -3.0F, -4.5F, 4, 2, 2, 0.0F, false);
			addBoxHelper(Head, 52, 64, -2.0F, -5.0F, 5.5F, 2, 2, 4, 0.0F, false);
			addBoxHelper(Head, 0, 64, 2.0F, -5.0F, 5.5F, 2, 2, 4, 0.0F, false);
			addBoxHelper(Head, 60, 0, -9.0F, -5.0F, -7.0F, 18, 4, 14, 0.0F, false);
			Torso = new ModelRenderer(this);
			Torso.setRotationPoint(0.0F, 0.0F, 0.0F);
			ProbeDroid.addChild(Torso);
			addBoxHelper(Torso, 62, 32, -5.0F, -15.0F, -1.0F, 2, 2, 2, 0.0F, false);
			addBoxHelper(Torso, 0, 0, -10.0F, -23.0F, -10.0F, 20, 4, 20, 0.0F, false);
			addBoxHelper(Torso, 10, 58, -10.4F, -22.0F, -4.0F, 2, 2, 2, 0.0F, false);
			addBoxHelper(Torso, 8, 54, 8.4F, -22.0F, -4.0F, 2, 2, 2, 0.0F, false);
			addBoxHelper(Torso, 60, 6, 0.4F, -24.0F, -10.5F, 4, 4, 2, 0.0F, false);
			addBoxHelper(Torso, 60, 0, -4.4F, -24.0F, -10.5F, 4, 4, 2, 0.0F, false);
			addBoxHelper(Torso, 54, 56, -4.4F, -24.0F, 8.5F, 4, 4, 2, 0.0F, false);
			addBoxHelper(Torso, 10, 38, -10.4F, -22.0F, 2.0F, 2, 2, 2, 0.0F, false);
			addBoxHelper(Torso, 8, 34, 8.4F, -22.0F, 2.0F, 2, 2, 2, 0.0F, false);
			addBoxHelper(Torso, 12, 8, 2.4F, -22.0F, 8.5F, 2, 2, 2, 0.0F, false);
			addBoxHelper(Torso, 0, 44, -9.0F, -24.5F, -9.0F, 18, 2, 18, 0.0F, false);
			addBoxHelper(Torso, 72, 94, -3.0F, -26.5F, -3.0F, 6, 2, 6, 0.0F, false);
			addBoxHelper(Torso, 0, 24, -9.0F, -19.5F, -9.0F, 18, 2, 18, 0.0F, false);
			addBoxHelper(Torso, 54, 24, -8.0F, -18.0F, -8.0F, 16, 2, 16, 0.0F, false);
			addBoxHelper(Torso, 50, 78, -7.0F, -16.5F, -7.0F, 14, 2, 14, 0.0F, false);
			addBoxHelper(Torso, 92, 78, -4.0F, -14.5F, -4.0F, 8, 2, 8, 0.0F, false);
			addBoxHelper(Torso, 54, 34, -3.5F, -15.0F, 1.0F, 2, 2, 4, 0.0F, false);
			addBoxHelper(Torso, 0, 54, -3.5F, -15.0F, -5.0F, 2, 2, 4, 0.0F, false);
			addBoxHelper(Torso, 0, 34, 1.5F, -15.0F, 1.0F, 2, 2, 4, 0.0F, false);
			addBoxHelper(Torso, 0, 14, 1.5F, -15.0F, -5.0F, 2, 2, 4, 0.0F, false);
			addBoxHelper(Torso, 12, 0, 3.0F, -15.0F, -1.0F, 2, 2, 2, 0.0F, false);
			Legs = new ModelRenderer(this);
			Legs.setRotationPoint(4.0F, -7.0F, 4.0F);
			ProbeDroid.addChild(Legs);
			addBoxHelper(Legs, 16, 98, -2.5F, -6.0F, -9.5F, 2, 6, 2, 0.0F, false);
			addBoxHelper(Legs, 8, 98, -0.5F, -6.0F, -5.0F, 2, 6, 2, 0.0F, false);
			addBoxHelper(Legs, 0, 98, -9.5F, -6.0F, -5.0F, 2, 6, 2, 0.0F, false);
			addBoxHelper(Legs, 96, 96, 0.0F, 0.0F, -5.0F, 2, 6, 2, 0.0F, false);
			addBoxHelper(Legs, 92, 78, -10.0F, 0.0F, -5.0F, 2, 6, 2, 0.0F, false);
			addBoxHelper(Legs, 54, 44, 1.0F, 6.0F, -5.0F, 2, 8, 2, 0.0F, false);
			addBoxHelper(Legs, 54, 24, -11.0F, 6.0F, -5.0F, 2, 8, 2, 0.0F, false);
			addBoxHelper(Legs, 52, 84, -2.5F, -6.0F, -0.5F, 2, 6, 2, 0.0F, false);
			addBoxHelper(Legs, 44, 84, -2.5F, 0.0F, -10.0F, 2, 6, 2, 0.0F, false);
			addBoxHelper(Legs, 0, 84, -2.5F, 0.0F, 0.0F, 2, 6, 2, 0.0F, false);
			addBoxHelper(Legs, 8, 44, -2.5F, 6.0F, -11.0F, 2, 8, 2, 0.0F, false);
			addBoxHelper(Legs, 0, 44, -2.5F, 6.0F, 1.0F, 2, 8, 2, 0.0F, false);
			addBoxHelper(Legs, 0, 70, -7.5F, -6.0F, -9.5F, 2, 6, 2, 0.0F, false);
			addBoxHelper(Legs, 64, 64, -7.5F, -6.0F, -0.5F, 2, 6, 2, 0.0F, false);
			addBoxHelper(Legs, 62, 44, -7.5F, 0.0F, -10.0F, 2, 6, 2, 0.0F, false);
			addBoxHelper(Legs, 62, 24, -7.5F, 0.0F, 0.0F, 2, 6, 2, 0.0F, false);
			addBoxHelper(Legs, 8, 24, -7.5F, 6.0F, -11.0F, 2, 8, 2, 0.0F, false);
			addBoxHelper(Legs, 0, 24, -7.5F, 6.0F, 1.0F, 2, 8, 2, 0.0F, false);
		}

		@Override
		public void render(MatrixStack ms, IVertexBuilder vb, int i1, int i2, float f1, float f2, float f3, float f4) {
			ProbeDroid.render(ms, vb, i1, i2, f1, f2, f3, f4);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
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
