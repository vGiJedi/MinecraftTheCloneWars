
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
import net.minecraft.entity.merchant.villager.VillagerEntity;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.Entity;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.starwarsmod.itemgroup.SepratistAIItemGroup;
import net.mcreator.starwarsmod.StarwarsmodModElements;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@StarwarsmodModElements.ModElement.Tag
public class GeonosianBezerkerEntity extends StarwarsmodModElements.ModElement {
	public static EntityType entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new).size(0.6f, 2f))
					.build("geonosian_bezerker").setRegistryName("geonosian_bezerker");
	public GeonosianBezerkerEntity(StarwarsmodModElements instance) {
		super(instance, 403);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@Override
	public void initElements() {
		elements.entities.add(() -> entity);
		elements.items.add(() -> new SpawnEggItem(entity, -12834800, -13303808, new Item.Properties().group(SepratistAIItemGroup.tab))
				.setRegistryName("geonosian_bezerker_spawn_egg"));
	}

	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public void registerModels(ModelRegistryEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(entity, renderManager -> {
			return new MobRenderer(renderManager, new ModelgeonosianBezerker(), 0.5f) {
				@Override
				public ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("starwarsmod:textures/geonosianbezerker.png");
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
			this.goalSelector.addGoal(1, new RandomWalkingGoal(this, 0.8));
			this.goalSelector.addGoal(2, new LookRandomlyGoal(this));
			this.goalSelector.addGoal(3, new MeleeAttackGoal(this, 1.4, true));
			this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, VillagerEntity.class, true, false));
			this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, R2D2Entity.CustomEntity.class, true, false));
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
			this.targetSelector.addGoal(27, new NearestAttackableTargetGoal(this, SenateCommandoEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(28, new NearestAttackableTargetGoal(this, SenateCommandoCaptainEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(29, new NearestAttackableTargetGoal(this, CloneTrooper332ndEntity.CustomEntity.class, true, true));
			this.targetSelector.addGoal(30, new NearestAttackableTargetGoal(this, AnakinSkywalkerEntity.CustomEntity.class, true, true));
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
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("starwarsmod:geonosianliving"));
		}

		@Override
		public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("starwarsmod:geonosianhurt"));
		}

		@Override
		public net.minecraft.util.SoundEvent getDeathSound() {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("starwarsmod:geonosiandeath"));
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
				this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.325);
			if (this.getAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
				this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(30);
			if (this.getAttribute(SharedMonsterAttributes.ARMOR) != null)
				this.getAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0);
			if (this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) == null)
				this.getAttributes().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
			this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(5);
		}
	}

	// Made with Blockbench 3.7.4
	// Exported for Minecraft version 1.14
	// Paste this class into your mod and generate all required imports
	public static class ModelgeonosianBezerker extends EntityModel {
		private final ModelRenderer Geonosian;
		private final ModelRenderer LeftArm;
		private final ModelRenderer cube_r3_r1;
		private final ModelRenderer RightArm;
		private final ModelRenderer cube_r23;
		private final ModelRenderer RightLeg;
		private final ModelRenderer cube_r4;
		private final ModelRenderer cube_r5;
		private final ModelRenderer LeftLeg;
		private final ModelRenderer cube_r6;
		private final ModelRenderer cube_r7;
		private final ModelRenderer Head;
		private final ModelRenderer cube_r8;
		private final ModelRenderer Body;
		private final ModelRenderer cube_r9;
		private final ModelRenderer cube_r10;
		private final ModelRenderer cube_r11;
		private final ModelRenderer cube_r12;
		private final ModelRenderer cube_r13;
		private final ModelRenderer cube_r14;
		private final ModelRenderer cube_r15;
		private final ModelRenderer cube_r16;
		private final ModelRenderer cube_r17;
		private final ModelRenderer cube_r18;
		private final ModelRenderer LeftWing1;
		private final ModelRenderer cube_r19;
		private final ModelRenderer RightWing1;
		private final ModelRenderer cube_r20;
		private final ModelRenderer LeftWing2;
		private final ModelRenderer cube_r21;
		private final ModelRenderer RightWing2;
		private final ModelRenderer cube_r22;
		public ModelgeonosianBezerker() {
			textureWidth = 128;
			textureHeight = 128;
			Geonosian = new ModelRenderer(this);
			Geonosian.setRotationPoint(0.0F, 24.0F, 0.0F);
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(5.0F, -32.5F, 2.0F);
			Geonosian.addChild(LeftArm);
			addBoxHelper(LeftArm, 61, 41, 0.0F, 2.0F, -1.0F, 2, 5, 2, 0.0F, false);
			addBoxHelper(LeftArm, 40, 49, 0.0F, -2.0F, -2.0F, 2, 4, 4, 0.0F, false);
			addBoxHelper(LeftArm, 69, 11, 1.25F, -4.0F, -0.5F, 1, 5, 1, 0.0F, false);
			cube_r3_r1 = new ModelRenderer(this);
			cube_r3_r1.setRotationPoint(-5.0F, 24.7634F, -18.6777F);
			LeftArm.addChild(cube_r3_r1);
			setRotationAngle(cube_r3_r1, -0.7854F, 0.0F, 0.0F);
			addBoxHelper(cube_r3_r1, 0, 67, 5.5F, -26.5F, -0.5F, 1, 6, 1, 0.0F, false);
			addBoxHelper(cube_r3_r1, 18, 24, 5.5F, -20.25F, -2.0F, 1, 1, 1, 0.0F, false);
			addBoxHelper(cube_r3_r1, 66, 57, 5.5F, -20.5F, -1.0F, 1, 3, 2, 0.0F, false);
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(-5.0F, -32.5F, 2.0F);
			Geonosian.addChild(RightArm);
			addBoxHelper(RightArm, 61, 41, -2.0F, 2.0F, -1.0F, 2, 5, 2, 0.0F, true);
			addBoxHelper(RightArm, 40, 49, -2.0F, -2.0F, -2.0F, 2, 4, 4, 0.0F, true);
			addBoxHelper(RightArm, 69, 11, -2.25F, -4.0F, -0.5F, 1, 5, 1, 0.0F, true);
			cube_r23 = new ModelRenderer(this);
			cube_r23.setRotationPoint(-2.75F, 8.5F, -1.0F);
			RightArm.addChild(cube_r23);
			setRotationAngle(cube_r23, -0.7854F, 0.0F, 0.0F);
			addBoxHelper(cube_r23, 0, 67, 1.25F, -2.5F, -1.5F, 1, 6, 1, 0.0F, true);
			addBoxHelper(cube_r23, 18, 24, 1.25F, 3.75F, -3.0F, 1, 1, 1, 0.0F, true);
			addBoxHelper(cube_r23, 66, 57, 1.25F, 3.5F, -2.0F, 1, 3, 2, 0.0F, true);
			addBoxHelper(cube_r23, 0, 80, 1.75F, 4.5F, -21.0F, 1, 1, 26, 0.0F, true);
			addBoxHelper(cube_r23, 64, 98, 1.75F, 5.5F, -20.0F, 1, 1, 16, 0.0F, true);
			addBoxHelper(cube_r23, 88, 116, 1.75F, 6.5F, -17.0F, 1, 1, 11, 0.0F, true);
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(-1.0F, -20.5F, 2.0F);
			Geonosian.addChild(RightLeg);
			addBoxHelper(RightLeg, 0, 35, -0.75F, 20.0F, -2.0F, 1, 1, 1, 0.0F, false);
			addBoxHelper(RightLeg, 32, 22, -2.75F, 20.0F, -2.0F, 1, 1, 1, 0.0F, false);
			addBoxHelper(RightLeg, 46, 9, -2.75F, 19.0F, -1.5F, 1, 1, 2, 0.0F, false);
			addBoxHelper(RightLeg, 45, 27, -0.75F, 19.0F, -1.5F, 1, 1, 2, 0.0F, false);
			addBoxHelper(RightLeg, 47, 16, -2.25F, 19.25F, 0.0F, 2, 1, 3, 0.0F, false);
			addBoxHelper(RightLeg, 22, 24, -1.75F, 19.5F, 3.0F, 1, 1, 1, 0.0F, false);
			addBoxHelper(RightLeg, 66, 7, -2.25F, 11.25F, 2.0F, 2, 2, 2, 0.0F, false);
			addBoxHelper(RightLeg, 21, 52, -2.25F, -1.25F, -1.5F, 2, 7, 3, 0.0F, false);
			addBoxHelper(RightLeg, 68, 0, -1.75F, -0.75F, -1.7F, 1, 6, 1, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(-0.5F, 8.5F, 2.0F);
			RightLeg.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.3491F, 0.0F, 0.0F);
			addBoxHelper(cube_r4, 29, 61, -1.25F, -3.75F, -1.5F, 1, 8, 2, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(-0.5F, 16.5F, 3.0F);
			RightLeg.addChild(cube_r5);
			setRotationAngle(cube_r5, -0.1745F, 0.0F, 0.0F);
			addBoxHelper(cube_r5, 24, 62, -1.25F, -4.25F, -1.0F, 1, 8, 1, 0.0F, false);
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(1.0F, -20.5F, 2.0F);
			Geonosian.addChild(LeftLeg);
			addBoxHelper(LeftLeg, 31, 35, -0.25F, 20.0F, -2.0F, 1, 1, 1, 0.0F, false);
			addBoxHelper(LeftLeg, 0, 37, 1.75F, 20.0F, -2.0F, 1, 1, 1, 0.0F, false);
			addBoxHelper(LeftLeg, 52, 9, 1.75F, 19.0F, -1.5F, 1, 1, 2, 0.0F, false);
			addBoxHelper(LeftLeg, 38, 49, -0.25F, 19.0F, -1.5F, 1, 1, 2, 0.0F, false);
			addBoxHelper(LeftLeg, 59, 49, 0.25F, 19.25F, 0.0F, 2, 1, 3, 0.0F, false);
			addBoxHelper(LeftLeg, 31, 37, 0.75F, 19.5F, 3.0F, 1, 1, 1, 0.0F, false);
			addBoxHelper(LeftLeg, 66, 25, 0.25F, 11.25F, 2.0F, 2, 2, 2, 0.0F, false);
			addBoxHelper(LeftLeg, 52, 52, 0.25F, -1.25F, -1.5F, 2, 7, 3, 0.0F, false);
			addBoxHelper(LeftLeg, 68, 17, 0.75F, -0.75F, -1.7F, 1, 6, 1, 0.0F, false);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(0.5F, 8.5F, 2.0F);
			LeftLeg.addChild(cube_r6);
			setRotationAngle(cube_r6, 0.3491F, 0.0F, 0.0F);
			addBoxHelper(cube_r6, 53, 62, 0.25F, -3.75F, -1.5F, 1, 8, 2, 0.0F, false);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(0.5F, 16.5F, 3.0F);
			LeftLeg.addChild(cube_r7);
			setRotationAngle(cube_r7, -0.1745F, 0.0F, 0.0F);
			addBoxHelper(cube_r7, 64, 0, 0.25F, -4.25F, -1.0F, 1, 8, 1, 0.0F, false);
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, -35.0F, 1.5F);
			Geonosian.addChild(Head);
			addBoxHelper(Head, 60, 60, -1.0F, -7.0F, -0.75F, 2, 7, 2, 0.0F, false);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(0.5F, -3.0F, -1.5F);
			Head.addChild(cube_r8);
			setRotationAngle(cube_r8, 0.9599F, 0.0F, 0.0F);
			addBoxHelper(cube_r8, 24, 41, 0.5F, -3.95F, 3.5F, 1, 1, 1, 0.0F, false);
			addBoxHelper(cube_r8, 24, 43, -2.5F, -3.95F, 3.5F, 1, 1, 1, 0.0F, false);
			addBoxHelper(cube_r8, 66, 29, -3.0F, -3.75F, 3.0F, 2, 2, 2, 0.0F, false);
			addBoxHelper(cube_r8, 43, 57, -1.5F, -3.2F, 0.5F, 2, 3, 1, 0.0F, false);
			addBoxHelper(cube_r8, 49, 37, -1.0F, -3.125F, 1.5F, 1, 3, 5, 0.0F, false);
			addBoxHelper(cube_r8, 40, 37, -2.5F, -3.25F, 3.5F, 4, 2, 1, 0.0F, false);
			addBoxHelper(cube_r8, 66, 48, 0.0F, -3.75F, 3.0F, 2, 2, 2, 0.0F, false);
			addBoxHelper(cube_r8, 30, 46, -2.1F, -2.0F, -2.0F, 1, 1, 6, 0.0F, false);
			addBoxHelper(cube_r8, 46, 20, 0.1F, -2.0F, -2.0F, 1, 1, 6, 0.0F, false);
			addBoxHelper(cube_r8, 19, 19, -2.0F, -3.0F, -1.0F, 3, 3, 7, 0.0F, false);
			addBoxHelper(cube_r8, 13, 35, -1.5F, -2.5F, -1.2F, 2, 2, 3, 0.0F, false);
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, -6.0F, 0.0F);
			Geonosian.addChild(Body);
			addBoxHelper(Body, 0, 0, -3.0F, -29.0F, -0.5F, 6, 11, 5, 0.0F, false);
			addBoxHelper(Body, 18, 35, -2.0F, -28.0F, -1.0F, 4, 1, 5, 0.0F, false);
			addBoxHelper(Body, 17, 0, 6.0F, -39.75F, 1.25F, 1, 3, 1, 0.0F, false);
			addBoxHelper(Body, 0, 0, -7.0F, -39.75F, 1.25F, 1, 3, 1, 0.0F, false);
			addBoxHelper(Body, 40, 30, -1.5F, -27.0F, -1.0F, 3, 2, 5, 0.0F, false);
			addBoxHelper(Body, 0, 35, -2.0F, -26.0F, -0.7F, 4, 4, 5, 0.0F, false);
			addBoxHelper(Body, 13, 41, -1.5F, -22.0F, -0.7F, 3, 1, 5, 0.0F, false);
			addBoxHelper(Body, 51, 27, -0.5F, -26.5F, -1.25F, 1, 1, 5, 0.0F, false);
			addBoxHelper(Body, 32, 19, -2.5F, -18.0F, -0.5F, 5, 2, 5, 0.0F, false);
			addBoxHelper(Body, 50, 45, -1.0F, -16.0F, 0.0F, 2, 3, 4, 0.0F, false);
			addBoxHelper(Body, 62, 53, -1.5F, -15.5F, 1.0F, 3, 2, 2, 0.0F, false);
			addBoxHelper(Body, 0, 44, 3.0F, -29.0F, -0.5F, 1, 5, 5, 0.0F, false);
			addBoxHelper(Body, 14, 58, 3.25F, -28.5F, 0.0F, 1, 4, 4, 0.0F, false);
			addBoxHelper(Body, 20, 13, -5.0F, -28.0F, 0.5F, 10, 3, 3, 0.0F, false);
			addBoxHelper(Body, 37, 57, -4.25F, -28.5F, 0.0F, 1, 4, 4, 0.0F, false);
			addBoxHelper(Body, 24, 42, -4.0F, -29.0F, -0.5F, 1, 5, 5, 0.0F, false);
			addBoxHelper(Body, 0, 16, -3.5F, -18.25F, -1.0F, 7, 2, 6, 0.0F, false);
			addBoxHelper(Body, 54, 16, 3.25F, -17.25F, 0.0F, 1, 4, 4, 0.0F, false);
			addBoxHelper(Body, 31, 53, -4.25F, -17.25F, 0.0F, 1, 4, 4, 0.0F, false);
			cube_r9 = new ModelRenderer(this);
			cube_r9.setRotationPoint(0.0F, -13.0F, 5.0F);
			Body.addChild(cube_r9);
			setRotationAngle(cube_r9, 0.0873F, 0.0F, 0.0F);
			addBoxHelper(cube_r9, 0, 16, -1.0F, -4.0F, -1.0F, 2, 5, 1, 0.0F, false);
			cube_r10 = new ModelRenderer(this);
			cube_r10.setRotationPoint(-1.0F, -13.0F, -1.0F);
			Body.addChild(cube_r10);
			setRotationAngle(cube_r10, -0.0873F, 0.0F, 0.0F);
			addBoxHelper(cube_r10, 35, 65, 0.0F, -4.0F, 0.0F, 2, 5, 1, 0.0F, false);
			cube_r11 = new ModelRenderer(this);
			cube_r11.setRotationPoint(-2.0F, -25.0F, 4.0F);
			Body.addChild(cube_r11);
			setRotationAngle(cube_r11, 0.0F, 0.0F, -0.2182F);
			addBoxHelper(cube_r11, 70, 62, -2.0F, 0.0F, -2.5F, 1, 5, 1, 0.0F, false);
			addBoxHelper(cube_r11, 69, 40, -2.0F, 0.0F, -1.0F, 1, 5, 1, 0.0F, false);
			addBoxHelper(cube_r11, 70, 33, -2.0F, 0.0F, -4.0F, 1, 5, 1, 0.0F, false);
			cube_r12 = new ModelRenderer(this);
			cube_r12.setRotationPoint(2.0F, -25.0F, 4.0F);
			Body.addChild(cube_r12);
			setRotationAngle(cube_r12, 0.0F, 0.0F, 0.2182F);
			addBoxHelper(cube_r12, 22, 71, 1.0F, 0.0F, -2.5F, 1, 5, 1, 0.0F, false);
			addBoxHelper(cube_r12, 26, 71, 1.0F, 0.0F, -1.0F, 1, 5, 1, 0.0F, false);
			addBoxHelper(cube_r12, 30, 71, 1.0F, 0.0F, -4.0F, 1, 5, 1, 0.0F, false);
			cube_r13 = new ModelRenderer(this);
			cube_r13.setRotationPoint(2.0F, -26.0F, 2.0F);
			Body.addChild(cube_r13);
			setRotationAngle(cube_r13, 0.0F, 0.0F, -0.48F);
			addBoxHelper(cube_r13, 31, 36, -3.5F, -4.75F, -2.75F, 2, 4, 5, 0.0F, false);
			addBoxHelper(cube_r13, 61, 21, -3.5F, -5.75F, -1.75F, 2, 1, 3, 0.0F, false);
			addBoxHelper(cube_r13, 58, 0, -3.0F, -13.75F, -1.25F, 1, 9, 2, 0.0F, false);
			cube_r14 = new ModelRenderer(this);
			cube_r14.setRotationPoint(-2.0F, -26.0F, 2.0F);
			Body.addChild(cube_r14);
			setRotationAngle(cube_r14, 0.0F, 0.0F, 0.48F);
			addBoxHelper(cube_r14, 47, 60, 2.0F, -13.75F, -1.25F, 1, 9, 2, 0.0F, false);
			addBoxHelper(cube_r14, 0, 63, 1.5F, -5.75F, -1.75F, 2, 1, 3, 0.0F, false);
			addBoxHelper(cube_r14, 40, 40, 1.5F, -4.75F, -2.75F, 2, 4, 5, 0.0F, false);
			cube_r15 = new ModelRenderer(this);
			cube_r15.setRotationPoint(0.5F, -25.0F, 3.0F);
			Body.addChild(cube_r15);
			setRotationAngle(cube_r15, -0.3054F, 0.0F, 0.0F);
			addBoxHelper(cube_r15, 10, 55, -1.0F, -10.0F, 0.0F, 1, 13, 1, 0.0F, false);
			cube_r16 = new ModelRenderer(this);
			cube_r16.setRotationPoint(1.5F, -25.0F, 2.0F);
			Body.addChild(cube_r16);
			setRotationAngle(cube_r16, -0.6981F, 0.0F, 0.0F);
			addBoxHelper(cube_r16, 0, 54, -3.0F, -4.0F, -0.5F, 3, 7, 2, 0.0F, false);
			cube_r17 = new ModelRenderer(this);
			cube_r17.setRotationPoint(4.0F, -33.0F, 7.0F);
			Body.addChild(cube_r17);
			setRotationAngle(cube_r17, 0.0F, 0.0F, -0.2182F);
			addBoxHelper(cube_r17, 4, 67, -2.75F, 4.0F, -2.5F, 1, 3, 2, 0.0F, false);
			cube_r18 = new ModelRenderer(this);
			cube_r18.setRotationPoint(-4.0F, -33.0F, 7.0F);
			Body.addChild(cube_r18);
			setRotationAngle(cube_r18, 0.0F, 0.0F, 0.2182F);
			addBoxHelper(cube_r18, 66, 67, 1.75F, 4.0F, -2.5F, 1, 3, 2, 0.0F, false);
			LeftWing1 = new ModelRenderer(this);
			LeftWing1.setRotationPoint(-3.0F, -27.0F, 6.0F);
			Body.addChild(LeftWing1);
			setRotationAngle(LeftWing1, 0.0F, 0.0873F, -1.789F);
			cube_r19 = new ModelRenderer(this);
			cube_r19.setRotationPoint(-1.0F, -6.0F, 1.0F);
			LeftWing1.addChild(cube_r19);
			setRotationAngle(cube_r19, 0.0F, 0.0F, 0.2182F);
			addBoxHelper(cube_r19, 22, 6, -9.25F, 3.0F, -2.0F, 11, 5, 1, 0.0F, false);
			addBoxHelper(cube_r19, 43, 12, -17.25F, 3.0F, -2.0F, 8, 3, 1, 0.0F, false);
			RightWing1 = new ModelRenderer(this);
			RightWing1.setRotationPoint(3.0F, -27.0F, 6.0F);
			Body.addChild(RightWing1);
			setRotationAngle(RightWing1, 0.0F, -0.0873F, 1.789F);
			cube_r20 = new ModelRenderer(this);
			cube_r20.setRotationPoint(1.0F, -6.0F, 1.0F);
			RightWing1.addChild(cube_r20);
			setRotationAngle(cube_r20, 0.0F, 0.0F, -0.2182F);
			addBoxHelper(cube_r20, 22, 0, -1.75F, 3.0F, -2.0F, 11, 5, 1, 0.0F, false);
			addBoxHelper(cube_r20, 0, 24, 9.25F, 3.0F, -2.0F, 8, 3, 1, 0.0F, false);
			LeftWing2 = new ModelRenderer(this);
			LeftWing2.setRotationPoint(-3.0F, -27.0F, 6.0F);
			Body.addChild(LeftWing2);
			setRotationAngle(LeftWing2, 0.0F, -0.3491F, -1.2217F);
			cube_r21 = new ModelRenderer(this);
			cube_r21.setRotationPoint(-2.0F, -5.0F, 2.0F);
			LeftWing2.addChild(cube_r21);
			setRotationAngle(cube_r21, 0.0F, 0.5236F, -0.2182F);
			addBoxHelper(cube_r21, 22, 29, -8.25F, 3.0F, -2.0F, 10, 5, 1, 0.0F, false);
			addBoxHelper(cube_r21, 56, 37, -14.25F, 3.0F, -2.0F, 6, 3, 1, 0.0F, false);
			RightWing2 = new ModelRenderer(this);
			RightWing2.setRotationPoint(3.0F, -27.0F, 6.0F);
			Body.addChild(RightWing2);
			setRotationAngle(RightWing2, 0.0F, 0.3491F, 1.2217F);
			cube_r22 = new ModelRenderer(this);
			cube_r22.setRotationPoint(2.0F, -5.0F, 2.0F);
			RightWing2.addChild(cube_r22);
			setRotationAngle(cube_r22, 0.0F, -0.5236F, 0.2182F);
			addBoxHelper(cube_r22, 0, 29, -1.75F, 3.0F, -2.0F, 10, 5, 1, 0.0F, false);
			addBoxHelper(cube_r22, 56, 33, 8.25F, 3.0F, -2.0F, 6, 3, 1, 0.0F, false);
		}

		@Override
		public void render(MatrixStack ms, IVertexBuilder vb, int i1, int i2, float f1, float f2, float f3, float f4) {
			Geonosian.render(ms, vb, i1, i2, f1, f2, f3, f4);
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
