
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

import net.mcreator.starwarsmod.itemgroup.SepratistAIItemGroup;
import net.mcreator.starwarsmod.item.DestroyerDroidLaserItem;
import net.mcreator.starwarsmod.StarwarsmodModElements;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@StarwarsmodModElements.ModElement.Tag
public class DroidekaEntity extends StarwarsmodModElements.ModElement {
	public static EntityType entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new).size(1f, 2f))
					.build("droideka").setRegistryName("droideka");
	public DroidekaEntity(StarwarsmodModElements instance) {
		super(instance, 363);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@Override
	public void initElements() {
		elements.entities.add(() -> entity);
		elements.items.add(() -> new SpawnEggItem(entity, -10080768, -13553359, new Item.Properties().group(SepratistAIItemGroup.tab))
				.setRegistryName("droideka_spawn_egg"));
	}

	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public void registerModels(ModelRegistryEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(entity, renderManager -> {
			return new MobRenderer(renderManager, new Modeldestroyer_droid(), 1f) {
				@Override
				public ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("starwarsmod:textures/droideka.png");
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
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
		}

		@Override
		public net.minecraft.util.SoundEvent getDeathSound() {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
		}

		@Override
		protected void registerAttributes() {
			super.registerAttributes();
			if (this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED) != null)
				this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.2);
			if (this.getAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
				this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(100);
			if (this.getAttribute(SharedMonsterAttributes.ARMOR) != null)
				this.getAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0);
			if (this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) == null)
				this.getAttributes().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
			this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(3);
		}

		public void attackEntityWithRangedAttack(LivingEntity target, float flval) {
			DestroyerDroidLaserItem.shoot(this, target);
		}
	}

	// Made with Blockbench 3.7.4
	// Exported for Minecraft version 1.14
	// Paste this class into your mod and generate all required imports
	public static class Modeldestroyer_droid extends EntityModel {
		private final ModelRenderer Droideka;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		private final ModelRenderer cube_r5;
		private final ModelRenderer cube_r6;
		private final ModelRenderer cube_r7;
		private final ModelRenderer cube_r8;
		private final ModelRenderer cube_r9;
		private final ModelRenderer cube_r10;
		private final ModelRenderer cube_r11;
		private final ModelRenderer cube_r12;
		private final ModelRenderer MiddleLeg;
		private final ModelRenderer cube_r13;
		private final ModelRenderer LeftLeg;
		private final ModelRenderer cube_r14;
		private final ModelRenderer RightLeg;
		private final ModelRenderer cube_r15;
		public Modeldestroyer_droid() {
			textureWidth = 128;
			textureHeight = 128;
			Droideka = new ModelRenderer(this);
			Droideka.setRotationPoint(0.0F, 24.0F, 0.0F);
			addBoxHelper(Droideka, 0, 28, -4.0F, -9.0F, -4.0F, 8, 2, 8, 0.0F, false);
			addBoxHelper(Droideka, 0, 0, -6.0F, -13.0F, -6.0F, 12, 4, 12, 0.0F, false);
			addBoxHelper(Droideka, 62, 14, -4.0F, -19.0F, 4.0F, 8, 6, 2, 0.0F, false);
			addBoxHelper(Droideka, 64, 4, -2.0F, -16.0F, 0.0F, 4, 4, 4, 0.0F, false);
			addBoxHelper(Droideka, 74, 44, -2.0F, -14.0F, -2.0F, 4, 2, 2, 0.0F, false);
			addBoxHelper(Droideka, 20, 54, -4.0F, -33.0F, 7.0F, 8, 8, 2, 0.0F, false);
			addBoxHelper(Droideka, 36, 0, -2.0F, -31.0F, -1.0F, 4, 4, 8, 0.0F, false);
			addBoxHelper(Droideka, 12, 58, -1.5F, -30.5F, -1.5F, 3, 3, 1, 0.0F, false);
			addBoxHelper(Droideka, 62, 52, -10.0F, -30.0F, 0.0F, 8, 2, 2, 0.0F, false);
			addBoxHelper(Droideka, 62, 22, 2.0F, -30.0F, 0.0F, 8, 2, 2, 0.0F, false);
			addBoxHelper(Droideka, 56, 38, 9.0F, -24.0F, -12.0F, 4, 2, 6, 0.0F, false);
			addBoxHelper(Droideka, 76, 76, 11.75F, -23.5F, -16.0F, 1, 1, 4, 0.0F, false);
			addBoxHelper(Droideka, 30, 21, -12.75F, -23.5F, -16.0F, 1, 1, 4, 0.0F, false);
			addBoxHelper(Droideka, 30, 16, 9.25F, -23.5F, -16.0F, 1, 1, 4, 0.0F, false);
			addBoxHelper(Droideka, 24, 28, -10.25F, -23.5F, -16.0F, 1, 1, 4, 0.0F, false);
			addBoxHelper(Droideka, 56, 56, -13.0F, -24.0F, -12.0F, 4, 2, 6, 0.0F, false);
			addBoxHelper(Droideka, 36, 44, -3.0F, -32.0F, 7.5F, 6, 6, 2, 0.0F, false);
			addBoxHelper(Droideka, 60, 32, -9.0F, -18.0F, 5.0F, 8, 4, 2, 0.0F, false);
			addBoxHelper(Droideka, 18, 74, -10.0F, -18.0F, 1.0F, 2, 4, 4, 0.0F, false);
			addBoxHelper(Droideka, 6, 74, 8.0F, -18.0F, 1.0F, 2, 4, 4, 0.0F, false);
			addBoxHelper(Droideka, 56, 46, 1.0F, -18.0F, 5.0F, 8, 4, 2, 0.0F, false);
			addBoxHelper(Droideka, 0, 54, 4.0F, -15.0F, -4.0F, 2, 2, 8, 0.0F, false);
			addBoxHelper(Droideka, 52, 4, -6.0F, -15.0F, -4.0F, 2, 2, 8, 0.0F, false);
			addBoxHelper(Droideka, 0, 16, -5.0F, -10.0F, -5.0F, 10, 2, 10, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(5.0F, -35.0F, 14.0F);
			Droideka.addChild(cube_r1);
			setRotationAngle(cube_r1, 2.7489F, 0.0F, 0.0F);
			addBoxHelper(cube_r1, 32, 64, -6.0F, -11.0F, 9.5F, 2, 16, 2, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(-5.1F, -23.0F, 0.0F);
			Droideka.addChild(cube_r2);
			setRotationAngle(cube_r2, -0.0436F, 0.0F, 0.0F);
			addBoxHelper(cube_r2, 40, 66, 4.1F, -9.0F, 12.8F, 2, 14, 2, 0.0F, false);
			addBoxHelper(cube_r2, 62, 64, 0.2F, -9.0F, 12.8F, 2, 14, 2, 0.0F, false);
			addBoxHelper(cube_r2, 54, 64, 8.0F, -9.0F, 12.8F, 2, 14, 2, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(8.6F, -21.0F, 0.0F);
			Droideka.addChild(cube_r3);
			setRotationAngle(cube_r3, -0.0436F, 0.0F, 0.0F);
			addBoxHelper(cube_r3, 0, 74, -5.1F, -10.0F, 13.25F, 1, 15, 2, 0.0F, false);
			addBoxHelper(cube_r3, 70, 70, -13.1F, -10.0F, 13.25F, 1, 15, 2, 0.0F, false);
			addBoxHelper(cube_r3, 48, 66, -9.1F, -10.0F, 13.25F, 1, 15, 2, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(7.0F, -29.0F, 0.0F);
			Droideka.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.3927F, 0.0F, 0.0F);
			addBoxHelper(cube_r4, 46, 14, -10.0F, -9.0F, 13.5F, 6, 12, 2, 0.0F, false);
			addBoxHelper(cube_r4, 0, 38, -12.0F, -10.0F, 13.0F, 10, 14, 2, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(5.0F, -31.0F, 8.0F);
			Droideka.addChild(cube_r5);
			setRotationAngle(cube_r5, 1.9635F, 0.0F, 0.0F);
			addBoxHelper(cube_r5, 24, 38, -6.0F, -13.5F, 13.5F, 2, 12, 2, 0.0F, false);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(-6.5F, -26.0F, 0.0F);
			Droideka.addChild(cube_r6);
			setRotationAngle(cube_r6, 1.7017F, 0.0F, 0.0F);
			addBoxHelper(cube_r6, 76, 68, 3.75F, -12.6F, 13.0F, 1, 7, 1, 0.0F, false);
			addBoxHelper(cube_r6, 76, 0, 8.25F, -12.6F, 13.0F, 1, 7, 1, 0.0F, false);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(4.5F, -26.0F, -2.0F);
			Droideka.addChild(cube_r7);
			setRotationAngle(cube_r7, 1.7017F, 0.0F, 0.0F);
			addBoxHelper(cube_r7, 56, 54, -5.0F, -12.9916F, 9.7757F, 1, 7, 1, 0.0F, false);
			addBoxHelper(cube_r7, 52, 4, -5.0F, -6.9916F, 10.7757F, 1, 1, 3, 0.0F, false);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(5.0F, -27.0F, -4.0F);
			Droideka.addChild(cube_r8);
			setRotationAngle(cube_r8, 1.7017F, 0.0F, 0.0F);
			addBoxHelper(cube_r8, 12, 54, -6.0F, -7.0F, 12.5F, 2, 2, 2, 0.0F, false);
			addBoxHelper(cube_r8, 70, 38, -8.0F, -5.0F, 12.5F, 6, 4, 2, 0.0F, false);
			cube_r9 = new ModelRenderer(this);
			cube_r9.setRotationPoint(5.0F, -29.0F, 10.0F);
			Droideka.addChild(cube_r9);
			setRotationAngle(cube_r9, 1.4835F, 0.0F, 0.0F);
			addBoxHelper(cube_r9, 0, 16, -6.0F, -10.0F, 12.4F, 2, 8, 2, 0.0F, false);
			addBoxHelper(cube_r9, 16, 64, -8.0F, -10.0F, 13.5F, 6, 8, 2, 0.0F, false);
			addBoxHelper(cube_r9, 32, 32, -11.0F, -11.0F, 13.0F, 12, 10, 2, 0.0F, false);
			cube_r10 = new ModelRenderer(this);
			cube_r10.setRotationPoint(7.0F, -25.0F, 0.0F);
			Droideka.addChild(cube_r10);
			setRotationAngle(cube_r10, 0.5672F, 0.0F, 0.0F);
			addBoxHelper(cube_r10, 40, 54, -10.0F, -12.0F, 9.5F, 6, 10, 2, 0.0F, false);
			cube_r11 = new ModelRenderer(this);
			cube_r11.setRotationPoint(6.0F, -21.0F, -6.0F);
			Droideka.addChild(cube_r11);
			setRotationAngle(cube_r11, -0.3927F, 0.0F, 0.0F);
			addBoxHelper(cube_r11, 74, 26, -8.0F, -9.5F, 9.6F, 4, 2, 2, 0.0F, false);
			addBoxHelper(cube_r11, 70, 56, -8.0F, -7.0F, 9.6F, 4, 2, 2, 0.0F, false);
			addBoxHelper(cube_r11, 0, 8, -8.0F, -4.5F, 9.6F, 4, 2, 2, 0.0F, false);
			addBoxHelper(cube_r11, 0, 64, -9.0F, -10.0F, 10.0F, 6, 8, 2, 0.0F, false);
			cube_r12 = new ModelRenderer(this);
			cube_r12.setRotationPoint(-16.0F, -19.0F, -4.0F);
			Droideka.addChild(cube_r12);
			setRotationAngle(cube_r12, 0.6109F, 0.0F, 0.0F);
			addBoxHelper(cube_r12, 72, 60, 4.0F, -7.0F, 8.0F, 2, 4, 4, 0.0F, false);
			addBoxHelper(cube_r12, 44, 44, 4.0F, -6.0F, 0.0F, 2, 2, 8, 0.0F, false);
			addBoxHelper(cube_r12, 24, 44, 26.0F, -6.0F, 0.0F, 2, 2, 8, 0.0F, false);
			addBoxHelper(cube_r12, 0, 0, 26.0F, -7.0F, 8.0F, 2, 4, 4, 0.0F, false);
			MiddleLeg = new ModelRenderer(this);
			MiddleLeg.setRotationPoint(1.0F, -11.0F, 6.0F);
			Droideka.addChild(MiddleLeg);
			addBoxHelper(MiddleLeg, 0, 54, -2.0F, 1.0F, 7.0F, 2, 5, 2, 0.0F, false);
			addBoxHelper(MiddleLeg, 30, 18, -2.0F, -1.0F, -3.0F, 2, 2, 11, 0.0F, false);
			addBoxHelper(MiddleLeg, 62, 80, -1.5F, 6.0F, 7.5F, 1, 5, 1, 0.0F, false);
			cube_r13 = new ModelRenderer(this);
			cube_r13.setRotationPoint(0.0F, 3.0F, -1.0F);
			MiddleLeg.addChild(cube_r13);
			setRotationAngle(cube_r13, 0.7854F, 0.0F, 0.0F);
			addBoxHelper(cube_r13, 24, 28, -1.75F, 2.7071F, 6.2071F, 1, 3, 1, 0.0F, false);
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(6.0F, -11.0F, -1.0F);
			Droideka.addChild(LeftLeg);
			addBoxHelper(LeftLeg, 36, 0, 7.0F, 1.0F, 0.0F, 2, 5, 2, 0.0F, false);
			addBoxHelper(LeftLeg, 58, 80, 7.5F, 6.0F, 0.5F, 1, 5, 1, 0.0F, false);
			addBoxHelper(LeftLeg, 52, 28, -3.0F, -1.0F, 0.0F, 11, 2, 2, 0.0F, false);
			cube_r14 = new ModelRenderer(this);
			cube_r14.setRotationPoint(-2.0F, 4.0F, 0.0F);
			LeftLeg.addChild(cube_r14);
			setRotationAngle(cube_r14, 0.0F, 0.0F, -0.7854F);
			addBoxHelper(cube_r14, 8, 0, 7.7071F, 2.7071F, 0.5F, 1, 3, 1, 0.0F, false);
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(-6.0F, -11.0F, -1.0F);
			Droideka.addChild(RightLeg);
			addBoxHelper(RightLeg, 0, 28, -9.0F, 1.0F, 0.0F, 2, 5, 2, 0.0F, false);
			addBoxHelper(RightLeg, 52, 0, -8.0F, -1.0F, 0.0F, 11, 2, 2, 0.0F, false);
			addBoxHelper(RightLeg, 54, 80, -8.5F, 6.0F, 0.5F, 1, 5, 1, 0.0F, false);
			cube_r15 = new ModelRenderer(this);
			cube_r15.setRotationPoint(2.0F, 4.0F, 0.0F);
			RightLeg.addChild(cube_r15);
			setRotationAngle(cube_r15, 0.0F, 0.0F, 0.7854F);
			addBoxHelper(cube_r15, 0, 0, -8.7071F, 2.7071F, 0.5F, 1, 3, 1, 0.0F, false);
		}

		@Override
		public void render(MatrixStack ms, IVertexBuilder vb, int i1, int i2, float f1, float f2, float f3, float f4) {
			Droideka.render(ms, vb, i1, i2, f1, f2, f3, f4);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.LeftLeg.rotateAngleY = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.RightLeg.rotateAngleY = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.MiddleLeg.rotateAngleY = MathHelper.cos(f * 1.0F) * -1.0F * f1;
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
