
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
import net.minecraft.item.Item;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.merchant.villager.VillagerEntity;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.ai.goal.FollowMobGoal;
import net.minecraft.entity.ai.goal.BreakDoorGoal;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.Entity;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.starwarsmod.procedures.BuzzDroidMobOnInitialEntitySpawnProcedure;
import net.mcreator.starwarsmod.itemgroup.SepratistAIItemGroup;
import net.mcreator.starwarsmod.StarwarsmodModElements;

import java.util.Map;
import java.util.HashMap;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@StarwarsmodModElements.ModElement.Tag
public class BuzzDroidMobEntity extends StarwarsmodModElements.ModElement {
	public static EntityType entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new).size(0.6f, 1f))
					.build("buzz_droid_mob").setRegistryName("buzz_droid_mob");
	public BuzzDroidMobEntity(StarwarsmodModElements instance) {
		super(instance, 345);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@Override
	public void initElements() {
		elements.entities.add(() -> entity);
		elements.items.add(() -> new SpawnEggItem(entity, -13421773, -3355648, new Item.Properties().group(SepratistAIItemGroup.tab))
				.setRegistryName("buzz_droid_mob_spawn_egg"));
	}

	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public void registerModels(ModelRegistryEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(entity, renderManager -> {
			return new MobRenderer(renderManager, new ModelBuzzDroid(), 0.5f) {
				@Override
				public ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("starwarsmod:textures/buzzdroid.png");
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
		}

		@Override
		public IPacket<?> createSpawnPacket() {
			return NetworkHooks.getEntitySpawningPacket(this);
		}

		@Override
		protected void registerGoals() {
			super.registerGoals();
			this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2, true));
			this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, VillagerEntity.class, true, false));
			this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, R2D2Entity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, CloneTrooper332ndEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, AnakinSkywalkerEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, ObiWanKenobiEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, CloneTrooperCourscantGuardEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, RexEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, NavalOfficerEntity.CustomEntity.class, true, false));
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
			this.goalSelector.addGoal(30, new RandomWalkingGoal(this, 1));
			this.goalSelector.addGoal(31, new FollowMobGoal(this, (float) 1, 10, 5));
			this.targetSelector.addGoal(32, new HurtByTargetGoal(this));
			this.goalSelector.addGoal(33, new BreakDoorGoal(this, e -> true));
			this.goalSelector.addGoal(34, new LookRandomlyGoal(this));
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
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("starwarsmod:buzzdroididle"));
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
				BuzzDroidMobOnInitialEntitySpawnProcedure.executeProcedure($_dependencies);
			}
			return retval;
		}

		@Override
		protected void registerAttributes() {
			super.registerAttributes();
			if (this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED) != null)
				this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.35);
			if (this.getAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
				this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(5);
			if (this.getAttribute(SharedMonsterAttributes.ARMOR) != null)
				this.getAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0);
			if (this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) == null)
				this.getAttributes().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
			this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(4);
		}
	}

	// Made with Blockbench 3.7.4
	// Exported for Minecraft version 1.14
	// Paste this class into your mod and generate all required imports
	public static class ModelBuzzDroid extends EntityModel {
		private final ModelRenderer BuzzDroid;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer RightLeg;
		private final ModelRenderer cube_r3;
		private final ModelRenderer Leftleg;
		private final ModelRenderer cube_r4;
		private final ModelRenderer MiddleLeg;
		private final ModelRenderer cube_r5;
		public ModelBuzzDroid() {
			textureWidth = 64;
			textureHeight = 64;
			BuzzDroid = new ModelRenderer(this);
			BuzzDroid.setRotationPoint(0.0F, 24.0F, 0.0F);
			addBoxHelper(BuzzDroid, 25, 25, -0.5F, -4.5F, -5.0F, 1, 2, 5, 0.0F, false);
			addBoxHelper(BuzzDroid, 26, 7, -2.0F, -2.75F, -4.5F, 4, 1, 2, 0.0F, false);
			addBoxHelper(BuzzDroid, 7, 30, -1.0F, -4.0F, -4.96F, 2, 2, 3, 0.0F, false);
			addBoxHelper(BuzzDroid, 0, 6, -0.5F, -8.0F, -3.96F, 1, 1, 2, 0.0F, false);
			addBoxHelper(BuzzDroid, 20, 32, -1.0F, -7.75F, -4.96F, 2, 2, 4, 0.0F, false);
			addBoxHelper(BuzzDroid, 32, 32, -0.5F, -7.6F, -5.0F, 1, 1, 5, 0.0F, false);
			addBoxHelper(BuzzDroid, 16, 23, -1.0F, -6.0F, -5.75F, 2, 2, 5, 0.0F, false);
			addBoxHelper(BuzzDroid, 0, 22, -1.5F, -6.5F, -5.5F, 3, 3, 5, 0.0F, false);
			addBoxHelper(BuzzDroid, 6, 36, 1.5F, -6.5F, -0.5F, 1, 3, 3, 0.0F, false);
			addBoxHelper(BuzzDroid, 37, 20, 0.75F, -5.5F, -0.3F, 1, 1, 3, 0.0F, false);
			addBoxHelper(BuzzDroid, 37, 26, -1.75F, -5.5F, -0.3F, 1, 1, 3, 0.0F, false);
			addBoxHelper(BuzzDroid, 14, 36, -2.5F, -6.5F, -0.5F, 1, 3, 3, 0.0F, false);
			addBoxHelper(BuzzDroid, 38, 38, -0.5F, -6.75F, -0.3F, 1, 1, 3, 0.0F, false);
			addBoxHelper(BuzzDroid, 39, 30, -0.5F, -4.25F, -0.3F, 1, 1, 3, 0.0F, false);
			addBoxHelper(BuzzDroid, 26, 0, -1.5F, -7.0F, -0.5F, 3, 4, 3, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(4.5F, -6.5F, -2.5F);
			BuzzDroid.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0F, 0.0F, -0.6545F);
			addBoxHelper(cube_r1, 0, 20, -4.0F, -1.5F, 0.0F, 10, 1, 1, 0.0F, false);
			addBoxHelper(cube_r1, 13, 13, 6.0F, -2.5F, -1.0F, 1, 3, 3, 0.0F, false);
			addBoxHelper(cube_r1, 14, 42, 5.0F, -3.5F, -2.0F, 1, 5, 1, 0.0F, false);
			addBoxHelper(cube_r1, 34, 38, 4.0F, -4.5F, -3.0F, 1, 7, 1, 0.0F, false);
			addBoxHelper(cube_r1, 0, 36, 2.0F, -4.5F, 4.0F, 2, 7, 1, 0.0F, false);
			addBoxHelper(cube_r1, 13, 1, 2.0F, -5.5F, -4.0F, 2, 1, 9, 0.0F, false);
			addBoxHelper(cube_r1, 13, 13, 2.0F, 2.5F, -4.0F, 2, 1, 9, 0.0F, false);
			addBoxHelper(cube_r1, 35, 10, 2.0F, -4.5F, -4.0F, 2, 7, 1, 0.0F, false);
			addBoxHelper(cube_r1, 19, 30, 1.0F, -5.5F, -4.0F, 1, 2, 1, 0.0F, false);
			addBoxHelper(cube_r1, 26, 13, 1.0F, -5.5F, 4.0F, 1, 2, 1, 0.0F, false);
			addBoxHelper(cube_r1, 19, 33, 1.0F, -5.5F, -3.0F, 1, 1, 1, 0.0F, false);
			addBoxHelper(cube_r1, 0, 33, 1.0F, 2.5F, -3.0F, 1, 1, 1, 0.0F, false);
			addBoxHelper(cube_r1, 30, 19, 1.0F, 2.5F, 3.0F, 1, 1, 1, 0.0F, false);
			addBoxHelper(cube_r1, 26, 16, 1.0F, -5.5F, 3.0F, 1, 1, 1, 0.0F, false);
			addBoxHelper(cube_r1, 0, 30, 1.0F, 1.5F, -4.0F, 1, 2, 1, 0.0F, false);
			addBoxHelper(cube_r1, 26, 19, 1.0F, 1.5F, 4.0F, 1, 2, 1, 0.0F, false);
			addBoxHelper(cube_r1, 30, 38, 4.0F, -4.5F, 3.0F, 1, 7, 1, 0.0F, false);
			addBoxHelper(cube_r1, 10, 42, 5.0F, -3.5F, 2.0F, 1, 5, 1, 0.0F, false);
			addBoxHelper(cube_r1, 36, 4, 5.0F, 0.5F, -1.0F, 1, 1, 3, 0.0F, false);
			addBoxHelper(cube_r1, 30, 19, 4.0F, 1.5F, -2.0F, 1, 1, 5, 0.0F, false);
			addBoxHelper(cube_r1, 12, 30, 4.0F, -4.5F, -2.0F, 1, 1, 5, 0.0F, false);
			addBoxHelper(cube_r1, 32, 25, 5.0F, -3.5F, -1.0F, 1, 1, 3, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(-4.5F, -6.5F, -2.5F);
			BuzzDroid.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.0F, 0.0F, 0.6545F);
			addBoxHelper(cube_r2, 0, 0, -7.0F, -2.5F, -1.0F, 1, 3, 3, 0.0F, false);
			addBoxHelper(cube_r2, 41, 8, -6.0F, -3.5F, -2.0F, 1, 5, 1, 0.0F, false);
			addBoxHelper(cube_r2, 22, 38, -5.0F, -4.5F, -3.0F, 1, 7, 1, 0.0F, false);
			addBoxHelper(cube_r2, 0, 10, -4.0F, -4.5F, 4.0F, 2, 7, 1, 0.0F, false);
			addBoxHelper(cube_r2, 0, 10, -4.0F, -5.5F, -4.0F, 2, 1, 9, 0.0F, false);
			addBoxHelper(cube_r2, 0, 0, -4.0F, 2.5F, -4.0F, 2, 1, 9, 0.0F, false);
			addBoxHelper(cube_r2, 13, 0, -4.0F, -4.5F, -4.0F, 2, 7, 1, 0.0F, false);
			addBoxHelper(cube_r2, 5, 0, -2.0F, -5.5F, -4.0F, 1, 2, 1, 0.0F, false);
			addBoxHelper(cube_r2, 18, 13, -2.0F, -5.5F, 4.0F, 1, 2, 1, 0.0F, false);
			addBoxHelper(cube_r2, 4, 6, -2.0F, -5.5F, -3.0F, 1, 1, 1, 0.0F, false);
			addBoxHelper(cube_r2, 25, 23, -2.0F, 2.5F, -3.0F, 1, 1, 1, 0.0F, false);
			addBoxHelper(cube_r2, 18, 7, -2.0F, 2.5F, 3.0F, 1, 1, 1, 0.0F, false);
			addBoxHelper(cube_r2, 5, 17, -2.0F, -5.5F, 3.0F, 1, 1, 1, 0.0F, false);
			addBoxHelper(cube_r2, 25, 25, -2.0F, 1.5F, -4.0F, 1, 2, 1, 0.0F, false);
			addBoxHelper(cube_r2, 16, 23, -2.0F, 1.5F, 4.0F, 1, 2, 1, 0.0F, false);
			addBoxHelper(cube_r2, 26, 38, -5.0F, -4.5F, 3.0F, 1, 7, 1, 0.0F, false);
			addBoxHelper(cube_r2, 6, 42, -6.0F, -3.5F, 2.0F, 1, 5, 1, 0.0F, false);
			addBoxHelper(cube_r2, 28, 32, -6.0F, 0.5F, -1.0F, 1, 1, 3, 0.0F, false);
			addBoxHelper(cube_r2, 26, 13, -5.0F, 1.5F, -2.0F, 1, 1, 5, 0.0F, false);
			addBoxHelper(cube_r2, 0, 30, -5.0F, -4.5F, -2.0F, 1, 1, 5, 0.0F, false);
			addBoxHelper(cube_r2, 11, 23, -6.0F, -3.5F, -1.0F, 1, 1, 3, 0.0F, false);
			addBoxHelper(cube_r2, 13, 11, -6.0F, -1.5F, 0.0F, 10, 1, 1, 0.0F, false);
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(5.0F, 22.5F, -5.5F);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(-10.0F, 0.0F, 0.0F);
			RightLeg.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.0F, 0.0F, -0.7854F);
			addBoxHelper(cube_r3, 35, 0, -1.0F, 1.25F, 1.54F, 4, 1, 1, 0.0F, false);
			Leftleg = new ModelRenderer(this);
			Leftleg.setRotationPoint(5.0F, 22.5F, -5.5F);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
			Leftleg.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.0F, 0.0F, 0.7854F);
			addBoxHelper(cube_r4, 37, 18, -3.0F, 1.25F, 1.54F, 4, 1, 1, 0.0F, false);
			MiddleLeg = new ModelRenderer(this);
			MiddleLeg.setRotationPoint(0.0F, 24.0F, 0.0F);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(-2.5F, -2.5F, -0.5F);
			MiddleLeg.addChild(cube_r5);
			setRotationAngle(cube_r5, 0.7418F, 0.0F, 0.0F);
			addBoxHelper(cube_r5, 0, 22, 2.0F, -1.75F, -2.54F, 1, 4, 1, 0.0F, false);
		}

		@Override
		public void render(MatrixStack ms, IVertexBuilder vb, int i1, int i2, float f1, float f2, float f3, float f4) {
			BuzzDroid.render(ms, vb, i1, i2, f1, f2, f3, f4);
			RightLeg.render(ms, vb, i1, i2, f1, f2, f3, f4);
			Leftleg.render(ms, vb, i1, i2, f1, f2, f3, f4);
			MiddleLeg.render(ms, vb, i1, i2, f1, f2, f3, f4);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.Leftleg.rotateAngleZ = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.RightLeg.rotateAngleZ = MathHelper.cos(f * 1.0F) * 1.0F * f1;
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
