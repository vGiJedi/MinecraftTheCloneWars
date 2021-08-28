
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
import net.minecraft.entity.ai.goal.FollowMobGoal;
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

import net.mcreator.starwarsmod.itemgroup.SepratistAIItemGroup;
import net.mcreator.starwarsmod.item.Lr57fireItem;
import net.mcreator.starwarsmod.StarwarsmodModElements;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@StarwarsmodModElements.ModElement.Tag
public class LR57CombatDroidEntity extends StarwarsmodModElements.ModElement {
	public static EntityType entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new).size(2f, 6f))
					.build("lr_57_combat_droid").setRegistryName("lr_57_combat_droid");
	public LR57CombatDroidEntity(StarwarsmodModElements instance) {
		super(instance, 425);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@Override
	public void initElements() {
		elements.entities.add(() -> entity);
		elements.items.add(() -> new SpawnEggItem(entity, -8822435, -11325932, new Item.Properties().group(SepratistAIItemGroup.tab))
				.setRegistryName("lr_57_combat_droid_spawn_egg"));
	}

	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public void registerModels(ModelRegistryEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(entity, renderManager -> {
			return new MobRenderer(renderManager, new ModelLR_57CombatDroid(), 1f) {
				@Override
				public ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("starwarsmod:textures/lr_57combatdroid.png");
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
			this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, R2D2Entity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, CloneTrooper332ndEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, AnakinSkywalkerEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, ObiWanKenobiEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, CloneTrooperCourscantGuardEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, RexEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, NavalOfficerEntity.CustomEntity.class, true, false));
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
			this.targetSelector.addGoal(26, new NearestAttackableTargetGoal(this, PlayerEntity.class, true, false));
			this.targetSelector.addGoal(27, new NearestAttackableTargetGoal(this, SenateCommandoEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(28, new NearestAttackableTargetGoal(this, SenateCommandoCaptainEntity.CustomEntity.class, true, false));
			this.goalSelector.addGoal(29, new LookRandomlyGoal(this));
			this.goalSelector.addGoal(30, new RandomWalkingGoal(this, 0.4));
			this.goalSelector.addGoal(31, new FollowMobGoal(this, (float) 1, 10, 5));
			this.goalSelector.addGoal(32, new BreakDoorGoal(this, e -> true));
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
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
		}

		@Override
		public net.minecraft.util.SoundEvent getDeathSound() {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
		}

		@Override
		protected void registerAttributes() {
			super.registerAttributes();
			if (this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED) != null)
				this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.15);
			if (this.getAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
				this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(90);
			if (this.getAttribute(SharedMonsterAttributes.ARMOR) != null)
				this.getAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0);
			if (this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) == null)
				this.getAttributes().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
			this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(7);
		}

		public void attackEntityWithRangedAttack(LivingEntity target, float flval) {
			Lr57fireItem.shoot(this, target);
		}
	}

	// Made with Blockbench 3.7.4
	// Exported for Minecraft version 1.14
	// Paste this class into your mod and generate all required imports
	public static class ModelLR_57CombatDroid extends EntityModel {
		private final ModelRenderer LR_57;
		private final ModelRenderer Head;
		private final ModelRenderer cube_r1;
		private final ModelRenderer Body;
		private final ModelRenderer LeftLeg;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer RightLeg;
		private final ModelRenderer cube_r4;
		private final ModelRenderer cube_r5;
		public ModelLR_57CombatDroid() {
			textureWidth = 256;
			textureHeight = 256;
			LR_57 = new ModelRenderer(this);
			LR_57.setRotationPoint(0.0F, 24.0F, 0.0F);
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, -34.0F, 0.0F);
			LR_57.addChild(Head);
			addBoxHelper(Head, 64, 118, -6.0F, -26.0F, -10.0F, 12, 14, 20, 0.0F, false);
			addBoxHelper(Head, 0, 128, -13.0F, -50.0F, -14.0F, 26, 26, 4, 0.0F, false);
			addBoxHelper(Head, 0, 38, -12.0F, -45.0F, -10.0F, 24, 20, 26, 0.0F, false);
			addBoxHelper(Head, 176, 0, -11.0F, -48.0F, -15.0F, 22, 22, 4, 0.0F, false);
			addBoxHelper(Head, 168, 122, -11.0F, -48.0F, 23.0F, 22, 22, 4, 0.0F, false);
			addBoxHelper(Head, 178, 164, -10.0F, -47.0F, -16.0F, 20, 20, 4, 0.0F, false);
			addBoxHelper(Head, 24, 190, 0.0F, -44.0F, -17.0F, 6, 6, 4, 0.0F, false);
			addBoxHelper(Head, 106, 220, -5.0F, -35.0F, -17.0F, 4, 4, 4, 0.0F, false);
			addBoxHelper(Head, 176, 94, -10.0F, -47.0F, 24.0F, 20, 20, 4, 0.0F, false);
			addBoxHelper(Head, 158, 34, -13.0F, -40.0F, -6.0F, 26, 16, 4, 0.0F, false);
			addBoxHelper(Head, 56, 156, -13.0F, -40.0F, 2.0F, 26, 16, 4, 0.0F, false);
			addBoxHelper(Head, 0, 86, -13.0F, -50.0F, 10.0F, 26, 26, 16, 0.0F, false);
			addBoxHelper(Head, 74, 38, -16.0F, -47.0F, 12.0F, 32, 10, 10, 0.0F, false);
			addBoxHelper(Head, 84, 102, -17.0F, -46.0F, 13.0F, 34, 8, 8, 0.0F, false);
			addBoxHelper(Head, 162, 210, -23.0F, -26.0F, 0.0F, 4, 6, 10, 0.0F, false);
			addBoxHelper(Head, 102, 182, 19.0F, -26.0F, 0.0F, 4, 6, 10, 0.0F, false);
			addBoxHelper(Head, 90, 220, -23.0F, -25.0F, -4.0F, 4, 4, 4, 0.0F, false);
			addBoxHelper(Head, 218, 46, 19.0F, -25.0F, -4.0F, 4, 4, 4, 0.0F, false);
			addBoxHelper(Head, 144, 6, -23.0F, -29.5F, -24.5F, 4, 4, 24, 0.0F, false);
			addBoxHelper(Head, 136, 136, 19.0F, -29.5F, -24.5F, 4, 4, 24, 0.0F, false);
			addBoxHelper(Head, 128, 66, -23.0F, -20.5F, -24.5F, 4, 4, 24, 0.0F, false);
			addBoxHelper(Head, 104, 128, 19.0F, -20.5F, -24.5F, 4, 4, 24, 0.0F, false);
			addBoxHelper(Head, 150, 166, -22.0F, -19.5F, -32.5F, 2, 2, 24, 0.0F, false);
			addBoxHelper(Head, 122, 164, 20.0F, -19.5F, -32.5F, 2, 2, 24, 0.0F, false);
			addBoxHelper(Head, 24, 164, -22.0F, -28.5F, -32.5F, 2, 2, 24, 0.0F, false);
			addBoxHelper(Head, 160, 54, 20.0F, -28.5F, -32.5F, 2, 2, 24, 0.0F, false);
			addBoxHelper(Head, 160, 94, -22.0F, -28.0F, -3.55F, 2, 10, 2, 0.0F, false);
			addBoxHelper(Head, 148, 34, 20.0F, -28.0F, -3.55F, 2, 10, 2, 0.0F, false);
			addBoxHelper(Head, 150, 164, -24.0F, -27.0F, 1.0F, 6, 8, 6, 0.0F, false);
			addBoxHelper(Head, 136, 136, 18.0F, -27.0F, 1.0F, 6, 8, 6, 0.0F, false);
			addBoxHelper(Head, 30, 208, -26.0F, -26.0F, 12.0F, 10, 6, 6, 0.0F, false);
			addBoxHelper(Head, 136, 122, 16.0F, -26.0F, 12.0F, 10, 6, 6, 0.0F, false);
			addBoxHelper(Head, 74, 220, -22.0F, -25.0F, 10.0F, 2, 4, 6, 0.0F, false);
			addBoxHelper(Head, 218, 112, 20.0F, -25.0F, 10.0F, 2, 4, 6, 0.0F, false);
			addBoxHelper(Head, 54, 212, -25.5F, -27.0F, 11.0F, 2, 8, 8, 0.0F, false);
			addBoxHelper(Head, 124, 156, 23.5F, -27.0F, 11.0F, 2, 8, 8, 0.0F, false);
			addBoxHelper(Head, 148, 0, -18.5F, -27.0F, 11.0F, 2, 8, 8, 0.0F, false);
			addBoxHelper(Head, 76, 0, 16.5F, -27.0F, 11.0F, 2, 8, 8, 0.0F, false);
			addBoxHelper(Head, 100, 58, -19.0F, -44.0F, 15.0F, 38, 4, 4, 0.0F, false);
			addBoxHelper(Head, 76, 0, -13.0F, -50.0F, -10.0F, 26, 10, 20, 0.0F, false);
			addBoxHelper(Head, 0, 0, -10.0F, -51.0F, -12.0F, 20, 2, 36, 0.0F, false);
			addBoxHelper(Head, 68, 68, -7.0F, -52.0F, -10.0F, 14, 2, 32, 0.0F, false);
			addBoxHelper(Head, 108, 126, -4.0F, -20.5F, -10.5F, 8, 8, 2, 0.0F, false);
			addBoxHelper(Head, 36, 158, -2.0F, -22.5F, -11.0F, 4, 6, 2, 0.0F, false);
			addBoxHelper(Head, 130, 208, -7.0F, -25.5F, -9.0F, 14, 14, 2, 0.0F, false);
			addBoxHelper(Head, 188, 204, -7.0F, -25.5F, -5.0F, 14, 14, 2, 0.0F, false);
			addBoxHelper(Head, 98, 204, -7.0F, -25.5F, -1.0F, 14, 14, 2, 0.0F, false);
			addBoxHelper(Head, 66, 204, -7.0F, -25.5F, 3.0F, 14, 14, 2, 0.0F, false);
			addBoxHelper(Head, 156, 192, -7.0F, -25.5F, 7.0F, 14, 14, 2, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(33.0F, -34.0F, 32.0F);
			Head.addChild(cube_r1);
			setRotationAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
			addBoxHelper(cube_r1, 0, 158, -13.0F, 8.0F, -18.0F, 2, 4, 4, 0.0F, false);
			addBoxHelper(cube_r1, 24, 26, -55.0F, 8.0F, -18.0F, 2, 4, 4, 0.0F, false);
			addBoxHelper(cube_r1, 128, 66, -14.0F, -10.0F, -19.0F, 4, 18, 6, 0.0F, false);
			addBoxHelper(cube_r1, 32, 220, -13.0F, -8.0F, -18.0F, 4, 6, 4, 0.0F, false);
			addBoxHelper(cube_r1, 92, 30, -13.0F, 4.0F, -18.0F, 4, 2, 4, 0.0F, false);
			addBoxHelper(cube_r1, 76, 30, -57.0F, 4.0F, -18.0F, 4, 2, 4, 0.0F, false);
			addBoxHelper(cube_r1, 216, 144, -57.0F, -8.0F, -18.0F, 4, 6, 4, 0.0F, false);
			addBoxHelper(cube_r1, 0, 38, -56.0F, -10.0F, -19.0F, 4, 18, 6, 0.0F, false);
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 0.0F, 0.0F);
			LR_57.addChild(Body);
			addBoxHelper(Body, 0, 26, -4.0F, -36.0F, -4.0F, 8, 2, 8, 0.0F, false);
			addBoxHelper(Body, 0, 84, -2.0F, -46.0F, -2.0F, 4, 10, 4, 0.0F, false);
			addBoxHelper(Body, 206, 154, -3.0F, -39.0F, -3.0F, 6, 2, 6, 0.0F, false);
			addBoxHelper(Body, 200, 26, -3.0F, -41.5F, -3.0F, 6, 2, 6, 0.0F, false);
			addBoxHelper(Body, 188, 70, -3.0F, -44.0F, -3.0F, 6, 2, 6, 0.0F, false);
			addBoxHelper(Body, 0, 158, -6.0F, -34.0F, -6.0F, 12, 18, 12, 0.0F, false);
			addBoxHelper(Body, 0, 188, -3.0F, -32.0F, -6.5F, 6, 14, 12, 0.0F, false);
			addBoxHelper(Body, 0, 0, -3.0F, -32.0F, -5.5F, 6, 14, 12, 0.0F, false);
			addBoxHelper(Body, 188, 54, -7.0F, -28.0F, -4.0F, 14, 8, 8, 0.0F, false);
			addBoxHelper(Body, 168, 148, -8.0F, -27.0F, -3.0F, 16, 6, 6, 0.0F, false);
			addBoxHelper(Body, 184, 80, -5.0F, -17.0F, -5.0F, 10, 2, 10, 0.0F, false);
			addBoxHelper(Body, 150, 178, -3.0F, -16.0F, -3.0F, 6, 2, 6, 0.0F, false);
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(8.0F, -24.0F, 0.0F);
			LR_57.addChild(LeftLeg);
			addBoxHelper(LeftLeg, 52, 176, 0.0F, -2.0F, -2.0F, 8, 4, 4, 0.0F, false);
			addBoxHelper(LeftLeg, 218, 34, 11.0F, 10.5F, -6.0F, 4, 8, 4, 0.0F, false);
			addBoxHelper(LeftLeg, 190, 190, 10.0F, 22.0F, -12.0F, 6, 2, 12, 0.0F, false);
			addBoxHelper(LeftLeg, 160, 66, 11.0F, 21.5F, -9.0F, 4, 2, 8, 0.0F, false);
			addBoxHelper(LeftLeg, 24, 0, 12.0F, 18.5F, -6.0F, 2, 4, 4, 0.0F, false);
			addBoxHelper(LeftLeg, 214, 188, 10.0F, 6.5F, -6.0F, 6, 4, 4, 0.0F, false);
			addBoxHelper(LeftLeg, 76, 16, 9.0F, 7.5F, -5.0F, 8, 2, 2, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(6.0F, -2.0F, 13.0F);
			LeftLeg.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.48F, 0.0F, 0.0F);
			addBoxHelper(cube_r2, 214, 214, 9.0F, -7.5F, 0.0F, 2, 6, 6, 0.0F, false);
			addBoxHelper(cube_r2, 16, 214, 3.0F, -7.5F, 0.0F, 2, 6, 6, 0.0F, false);
			addBoxHelper(cube_r2, 108, 118, 1.0F, -6.5F, 1.0F, 12, 4, 4, 0.0F, false);
			addBoxHelper(cube_r2, 80, 182, -1.0F, -6.5F, -13.0F, 2, 4, 18, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(6.0F, -2.0F, 14.0F);
			LeftLeg.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.7418F, 0.0F, 0.0F);
			addBoxHelper(cube_r3, 36, 190, 4.0F, -7.5F, -12.0F, 6, 6, 10, 0.0F, false);
			addBoxHelper(cube_r3, 94, 156, 5.0F, -6.5F, -20.0F, 4, 4, 22, 0.0F, false);
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(-8.0F, -24.0F, 0.0F);
			LR_57.addChild(RightLeg);
			addBoxHelper(RightLeg, 160, 80, -8.0F, -2.0F, -2.0F, 8, 4, 4, 0.0F, false);
			addBoxHelper(RightLeg, 214, 78, -15.0F, 10.5F, -6.0F, 4, 8, 4, 0.0F, false);
			addBoxHelper(RightLeg, 120, 190, -16.0F, 22.0F, -12.0F, 6, 2, 12, 0.0F, false);
			addBoxHelper(RightLeg, 60, 128, -15.0F, 21.5F, -9.0F, 4, 2, 8, 0.0F, false);
			addBoxHelper(RightLeg, 0, 0, -14.0F, 18.5F, -6.0F, 2, 4, 4, 0.0F, false);
			addBoxHelper(RightLeg, 212, 70, -16.0F, 6.5F, -6.0F, 6, 4, 4, 0.0F, false);
			addBoxHelper(RightLeg, 74, 58, -17.0F, 7.5F, -5.0F, 8, 2, 2, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(0.0F, -2.0F, 13.0F);
			RightLeg.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.48F, 0.0F, 0.0F);
			addBoxHelper(cube_r4, 0, 214, -11.0F, -7.5F, 0.0F, 2, 6, 6, 0.0F, false);
			addBoxHelper(cube_r4, 112, 30, -19.0F, -6.5F, 1.0F, 12, 4, 4, 0.0F, false);
			addBoxHelper(cube_r4, 58, 176, -7.0F, -6.5F, -13.0F, 2, 4, 18, 0.0F, false);
			addBoxHelper(cube_r4, 80, 176, -17.0F, -7.5F, 0.0F, 2, 6, 6, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(-6.0F, -2.0F, 14.0F);
			RightLeg.addChild(cube_r5);
			setRotationAngle(cube_r5, 0.7418F, 0.0F, 0.0F);
			addBoxHelper(cube_r5, 68, 84, -10.0F, -7.5F, -12.0F, 6, 6, 10, 0.0F, false);
			addBoxHelper(cube_r5, 146, 96, -9.0F, -6.5F, -20.0F, 4, 4, 22, 0.0F, false);
		}

		@Override
		public void render(MatrixStack ms, IVertexBuilder vb, int i1, int i2, float f1, float f2, float f3, float f4) {
			LR_57.render(ms, vb, i1, i2, f1, f2, f3, f4);
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
