
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
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.network.IPacket;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.Item;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.merchant.villager.VillagerEntity;
import net.minecraft.entity.ai.goal.RangedAttackGoal;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.ai.goal.OpenDoorGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
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

import net.mcreator.starwarsmod.procedures.BattleDroidKillsAnotherOneProcedure;
import net.mcreator.starwarsmod.itemgroup.SepratistAIItemGroup;
import net.mcreator.starwarsmod.item.BattleDroidWeaponItem;
import net.mcreator.starwarsmod.StarwarsmodModElements;

import java.util.Map;
import java.util.HashMap;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@StarwarsmodModElements.ModElement.Tag
public class BattleDroidEntity extends StarwarsmodModElements.ModElement {
	public static EntityType entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new).size(1f, 2f))
					.build("battle_droid").setRegistryName("battle_droid");
	public BattleDroidEntity(StarwarsmodModElements instance) {
		super(instance, 196);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@Override
	public void initElements() {
		elements.entities.add(() -> entity);
		elements.items.add(() -> new SpawnEggItem(entity, -13159, -10066330, new Item.Properties().group(SepratistAIItemGroup.tab))
				.setRegistryName("battle_droid_spawn_egg"));
	}

	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public void registerModels(ModelRegistryEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(entity, renderManager -> {
			return new MobRenderer(renderManager, new ModelBattleDroidV2(), 0.5f) {
				@Override
				public ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("starwarsmod:textures/battledroidv2.png");
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
			this.targetSelector.addGoal(20, new NearestAttackableTargetGoal(this, MouseDroidEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(21, new NearestAttackableTargetGoal(this, CloneCommandoEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(22, new NearestAttackableTargetGoal(this, CaptainVaughnEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(23, new NearestAttackableTargetGoal(this, CloneJettrooperEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(24, new NearestAttackableTargetGoal(this, FIVESEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(25, new NearestAttackableTargetGoal(this, ClonetrooperwithrocketEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(26, new NearestAttackableTargetGoal(this, PlayerEntity.class, true, false));
			this.targetSelector.addGoal(27, new NearestAttackableTargetGoal(this, SenateCommandoEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(28, new NearestAttackableTargetGoal(this, SenateCommandoCaptainEntity.CustomEntity.class, true, false));
			this.goalSelector.addGoal(29, new LookRandomlyGoal(this));
			this.goalSelector.addGoal(30, new RandomWalkingGoal(this, 0.6));
			this.goalSelector.addGoal(31, new OpenDoorGoal(this, true));
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
		public void playStepSound(BlockPos pos, BlockState blockIn) {
			this.playSound((net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("starwarsmod:battledroidstep")),
					0.15f, 1);
		}

		@Override
		public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("starwarsmod:battledroidhurt"));
		}

		@Override
		public net.minecraft.util.SoundEvent getDeathSound() {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("starwarsmod:battledroiddeath"));
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
				BattleDroidKillsAnotherOneProcedure.executeProcedure($_dependencies);
			}
		}

		@Override
		protected void registerAttributes() {
			super.registerAttributes();
			if (this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED) != null)
				this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3);
			if (this.getAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
				this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(30);
			if (this.getAttribute(SharedMonsterAttributes.ARMOR) != null)
				this.getAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0);
			if (this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) == null)
				this.getAttributes().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
			this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(5);
		}

		public void attackEntityWithRangedAttack(LivingEntity target, float flval) {
			BattleDroidWeaponItem.shoot(this, target);
		}
	}

	// Made with Blockbench 3.7.4
	// Exported for Minecraft version 1.14
	// Paste this class into your mod and generate all required imports
	public static class ModelBattleDroidV2 extends EntityModel {
		private final ModelRenderer BattleDroidV2;
		private final ModelRenderer LeftLeg;
		private final ModelRenderer RightLeg;
		private final ModelRenderer MainBody;
		private final ModelRenderer Head;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer LeftArm;
		private final ModelRenderer RightArm;
		private final ModelRenderer RightArm_r1;
		public ModelBattleDroidV2() {
			textureWidth = 64;
			textureHeight = 64;
			BattleDroidV2 = new ModelRenderer(this);
			BattleDroidV2.setRotationPoint(0.0F, 24.0F, 0.0F);
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(2.0F, -19.0F, 2.0F);
			BattleDroidV2.addChild(LeftLeg);
			addBoxHelper(LeftLeg, 47, 24, 0.5F, 9.0F, -1.0F, 2, 2, 2, 0.0F, false);
			addBoxHelper(LeftLeg, 30, 30, 0.0F, 18.0F, -3.5F, 3, 1, 5, 0.0F, false);
			addBoxHelper(LeftLeg, 43, 33, 0.5F, 17.5F, -1.75F, 2, 1, 3, 0.0F, false);
			addBoxHelper(LeftLeg, 34, 45, 1.0F, 11.0F, -0.8F, 1, 7, 1, 0.0F, false);
			addBoxHelper(LeftLeg, 28, 45, 1.0F, 0.5F, -1.0F, 1, 7, 2, 0.0F, false);
			addBoxHelper(LeftLeg, 53, 50, 1.0F, 7.5F, -0.8F, 1, 2, 1, 0.0F, false);
			addBoxHelper(LeftLeg, 15, 46, 1.75F, -1.5F, -1.5F, 1, 3, 3, 0.0F, false);
			addBoxHelper(LeftLeg, 7, 46, 0.25F, -1.5F, -1.5F, 1, 3, 3, 0.0F, false);
			addBoxHelper(LeftLeg, 53, 47, 1.0F, -1.0F, -1.25F, 1, 2, 1, 0.0F, false);
			addBoxHelper(LeftLeg, 53, 22, 1.0F, -1.02F, -0.5F, 1, 2, 1, 0.0F, false);
			addBoxHelper(LeftLeg, 53, 10, 1.0F, -1.0F, 0.25F, 1, 2, 1, 0.0F, false);
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(-2.0F, -19.0F, 2.0F);
			BattleDroidV2.addChild(RightLeg);
			addBoxHelper(RightLeg, 46, 37, -2.5F, 9.0F, -1.0F, 2, 2, 2, 0.0F, false);
			addBoxHelper(RightLeg, 29, 0, -3.0F, 18.0F, -3.5F, 3, 1, 5, 0.0F, false);
			addBoxHelper(RightLeg, 42, 4, -2.5F, 17.5F, -1.75F, 2, 1, 3, 0.0F, false);
			addBoxHelper(RightLeg, 12, 22, -2.0F, 11.0F, -0.8F, 1, 7, 1, 0.0F, false);
			addBoxHelper(RightLeg, 39, 44, -2.0F, 0.5F, -1.0F, 1, 7, 2, 0.0F, false);
			addBoxHelper(RightLeg, 53, 53, -2.0F, 7.5F, -0.8F, 1, 2, 1, 0.0F, false);
			addBoxHelper(RightLeg, 45, 45, -2.75F, -1.5F, -1.5F, 1, 3, 3, 0.0F, false);
			addBoxHelper(RightLeg, 0, 12, -1.25F, -1.5F, -1.5F, 1, 3, 3, 0.0F, false);
			addBoxHelper(RightLeg, 41, 53, -2.0F, -1.0F, -1.25F, 1, 2, 1, 0.0F, false);
			addBoxHelper(RightLeg, 37, 53, -2.0F, -1.02F, -0.5F, 1, 2, 1, 0.0F, false);
			addBoxHelper(RightLeg, 33, 53, -2.0F, -1.0F, 0.25F, 1, 2, 1, 0.0F, false);
			MainBody = new ModelRenderer(this);
			MainBody.setRotationPoint(0.0F, -22.0F, 2.0F);
			BattleDroidV2.addChild(MainBody);
			addBoxHelper(MainBody, 35, 28, -0.25F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false);
			addBoxHelper(MainBody, 18, 52, 1.75F, -5.5F, -0.5F, 1, 5, 1, 0.0F, false);
			addBoxHelper(MainBody, 29, 6, -2.75F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false);
			addBoxHelper(MainBody, 14, 52, -2.75F, -5.5F, -0.5F, 1, 5, 1, 0.0F, false);
			addBoxHelper(MainBody, 47, 8, -0.5F, -5.5F, -0.5F, 1, 4, 2, 0.0F, false);
			addBoxHelper(MainBody, 0, 42, -2.5F, -5.5F, -2.75F, 1, 2, 4, 0.0F, false);
			addBoxHelper(MainBody, 0, 18, -1.5F, -5.5F, -2.75F, 3, 1, 1, 0.0F, false);
			addBoxHelper(MainBody, 20, 41, 1.5F, -5.5F, -2.75F, 1, 2, 4, 0.0F, false);
			addBoxHelper(MainBody, 12, 31, -3.0F, -10.75F, 0.75F, 6, 8, 1, 0.0F, false);
			addBoxHelper(MainBody, 45, 51, 1.0F, -10.25F, 1.0F, 1, 6, 1, 0.0F, false);
			addBoxHelper(MainBody, 4, 51, -2.0F, -10.25F, 1.0F, 1, 6, 1, 0.0F, false);
			addBoxHelper(MainBody, 17, 19, -3.0F, -11.75F, 2.0F, 6, 9, 3, 0.0F, false);
			addBoxHelper(MainBody, 13, 0, -3.5F, -11.25F, 3.0F, 7, 9, 1, 0.0F, false);
			addBoxHelper(MainBody, 41, 28, -1.5F, -6.25F, -1.75F, 3, 1, 3, 0.0F, false);
			addBoxHelper(MainBody, 8, 52, -1.0F, -8.5F, -3.1F, 2, 3, 1, 0.0F, false);
			addBoxHelper(MainBody, 35, 21, 1.0F, -8.5F, -3.25F, 2, 3, 4, 0.0F, false);
			addBoxHelper(MainBody, 0, 34, -3.0F, -8.5F, -3.25F, 2, 3, 4, 0.0F, false);
			addBoxHelper(MainBody, 53, 30, 1.2F, -8.4F, -3.45F, 1, 1, 1, 0.0F, false);
			addBoxHelper(MainBody, 12, 12, -3.0F, -9.5F, -3.25F, 6, 1, 4, 0.0F, false);
			addBoxHelper(MainBody, 8, 40, 1.0F, -11.5F, -3.25F, 2, 2, 4, 0.0F, false);
			addBoxHelper(MainBody, 38, 38, -3.0F, -11.5F, -3.25F, 2, 2, 4, 0.0F, false);
			addBoxHelper(MainBody, 29, 40, -1.0F, -10.5F, -2.75F, 2, 1, 4, 0.0F, false);
			addBoxHelper(MainBody, 27, 8, -4.0F, -11.0F, -2.25F, 8, 2, 2, 0.0F, false);
			addBoxHelper(MainBody, 12, 17, -5.0F, -10.5F, -1.75F, 10, 1, 1, 0.0F, false);
			addBoxHelper(MainBody, 52, 36, -1.0F, -10.0F, -3.0F, 2, 1, 1, 0.0F, false);
			addBoxHelper(MainBody, 28, 12, -3.5F, -12.25F, 2.5F, 7, 1, 2, 0.0F, false);
			addBoxHelper(MainBody, 0, 22, -1.5F, -12.5F, 2.2F, 3, 9, 3, 0.0F, false);
			addBoxHelper(MainBody, 0, 0, -0.5F, -1.5F, -1.5F, 1, 6, 3, 0.0F, false);
			addBoxHelper(MainBody, 51, 18, -0.25F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false);
			addBoxHelper(MainBody, 51, 6, -0.75F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false);
			addBoxHelper(MainBody, 28, 36, -2.75F, 2.0F, -1.0F, 5, 2, 2, 0.0F, false);
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, -11.0F, -1.25F);
			MainBody.addChild(Head);
			addBoxHelper(Head, 50, 41, -0.5F, -5.0F, -0.5F, 1, 6, 1, 0.0F, false);
			addBoxHelper(Head, 26, 31, -1.0F, -7.0F, -1.0F, 2, 2, 2, 0.0F, false);
			addBoxHelper(Head, 0, 9, -1.5F, -6.5F, -0.5F, 3, 1, 1, 0.0F, false);
			addBoxHelper(Head, 12, 46, -0.5F, -6.5F, -2.5F, 1, 1, 2, 0.0F, false);
			addBoxHelper(Head, 45, 8, -0.5F, -7.25F, -0.5F, 1, 1, 1, 0.0F, false);
			addBoxHelper(Head, 41, 15, -1.5F, -8.2F, -1.5F, 3, 1, 3, 0.0F, false);
			addBoxHelper(Head, 50, 28, -1.0F, -8.0F, 1.25F, 2, 1, 1, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(-1.0F, -4.0F, 3.25F);
			Head.addChild(cube_r1);
			setRotationAngle(cube_r1, -1.2654F, 0.0F, 0.0F);
			addBoxHelper(cube_r1, 40, 0, -0.5F, -0.6F, -4.0F, 3, 1, 3, 0.0F, false);
			addBoxHelper(cube_r1, 43, 44, -0.5F, -0.6F, -1.0F, 1, 1, 1, 0.0F, false);
			addBoxHelper(cube_r1, 0, 44, 1.5F, -0.6F, -1.0F, 1, 1, 1, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.0F, -8.0F, -0.75F);
			Head.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.829F, 0.0F, 0.0F);
			addBoxHelper(cube_r2, 32, 15, -1.0F, -0.5F, -5.5F, 2, 1, 5, 0.0F, false);
			addBoxHelper(cube_r2, 26, 41, -0.5F, -0.25F, -6.0F, 1, 1, 2, 0.0F, false);
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(5.0F, -10.0F, -1.25F);
			MainBody.addChild(LeftArm);
			addBoxHelper(LeftArm, 50, 32, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false);
			addBoxHelper(LeftArm, 50, 14, -0.25F, 6.0F, -1.0F, 1, 2, 2, 0.0F, false);
			addBoxHelper(LeftArm, 0, 48, -0.25F, 0.0F, -0.5F, 1, 6, 1, 0.0F, false);
			addBoxHelper(LeftArm, 49, 51, 0.0F, 8.0F, -0.5F, 1, 5, 1, 0.0F, false);
			addBoxHelper(LeftArm, 41, 32, 0.0F, 12.5F, -1.5F, 1, 2, 1, 0.0F, false);
			addBoxHelper(LeftArm, 0, 41, 0.0F, 12.5F, 0.5F, 1, 2, 1, 0.0F, false);
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(-5.0F, -10.0F, -1.25F);
			MainBody.addChild(RightArm);
			setRotationAngle(RightArm, 0.3054F, 0.0F, 0.0F);
			addBoxHelper(RightArm, 50, 2, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false);
			addBoxHelper(RightArm, 16, 40, -0.75F, 6.0F, -1.0F, 1, 2, 2, 0.0F, false);
			addBoxHelper(RightArm, 23, 47, -0.75F, 0.0F, -0.5F, 1, 6, 1, 0.0F, false);
			RightArm_r1 = new ModelRenderer(this);
			RightArm_r1.setRotationPoint(5.0F, 32.0F, -0.75F);
			RightArm.addChild(RightArm_r1);
			setRotationAngle(RightArm_r1, -0.3054F, 0.0F, 0.0F);
			addBoxHelper(RightArm_r1, 6, 41, -6.0F, -22.5F, -14.75F, 1, 1, 2, 0.0F, false);
			addBoxHelper(RightArm_r1, 35, 21, -6.0F, -28.25F, -17.75F, 1, 2, 1, 0.0F, false);
			addBoxHelper(RightArm_r1, 0, 0, -6.0F, -29.25F, -20.75F, 1, 1, 11, 0.0F, false);
			addBoxHelper(RightArm_r1, 8, 34, -6.0F, -28.25F, -11.75F, 1, 2, 1, 0.0F, false);
			addBoxHelper(RightArm_r1, 0, 34, -6.0F, -28.25F, -14.75F, 1, 2, 1, 0.0F, false);
			addBoxHelper(RightArm_r1, 33, 15, -6.0F, -28.25F, -20.5F, 1, 2, 1, 0.0F, false);
			addBoxHelper(RightArm_r1, 49, 0, -6.5F, -27.0F, -17.75F, 2, 1, 1, 0.0F, false);
			addBoxHelper(RightArm_r1, 5, 0, -6.0F, -27.0F, -22.75F, 1, 1, 2, 0.0F, false);
			addBoxHelper(RightArm_r1, 43, 19, -6.5F, -27.5F, -20.75F, 2, 2, 3, 0.0F, false);
			addBoxHelper(RightArm_r1, 0, 12, -6.5F, -27.5F, -16.75F, 2, 2, 8, 0.0F, false);
			addBoxHelper(RightArm_r1, 40, 36, -6.0F, -26.0F, -15.75F, 1, 1, 1, 0.0F, false);
			addBoxHelper(RightArm_r1, 12, 12, -6.0F, -25.5F, -14.75F, 1, 3, 1, 0.0F, false);
			addBoxHelper(RightArm_r1, 29, 0, -6.0F, -25.5F, -12.75F, 1, 4, 1, 0.0F, false);
			addBoxHelper(RightArm_r1, 37, 40, -6.5F, -23.5F, -12.7F, 1, 1, 1, 0.0F, false);
			addBoxHelper(RightArm_r1, 37, 6, -6.25F, -23.57F, -13.7F, 1, 1, 1, 0.0F, false);
			addBoxHelper(RightArm_r1, 33, 18, -6.25F, -25.0F, -13.7F, 1, 1, 1, 0.0F, false);
			addBoxHelper(RightArm_r1, 7, 8, -6.5F, -25.0F, -12.7F, 1, 1, 1, 0.0F, false);
			addBoxHelper(RightArm_r1, 21, 35, -6.0F, -24.25F, -11.75F, 1, 1, 5, 0.0F, false);
		}

		@Override
		public void render(MatrixStack ms, IVertexBuilder vb, int i1, int i2, float f1, float f2, float f3, float f4) {
			BattleDroidV2.render(ms, vb, i1, i2, f1, f2, f3, f4);
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
