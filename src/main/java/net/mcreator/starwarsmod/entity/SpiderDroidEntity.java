
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
import net.mcreator.starwarsmod.item.SpiderDroidWeaponItem;
import net.mcreator.starwarsmod.StarwarsmodModElements;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@StarwarsmodModElements.ModElement.Tag
public class SpiderDroidEntity extends StarwarsmodModElements.ModElement {
	public static EntityType entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new).size(3f, 3f))
					.build("spider_droid").setRegistryName("spider_droid");
	public SpiderDroidEntity(StarwarsmodModElements instance) {
		super(instance, 331);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@Override
	public void initElements() {
		elements.entities.add(() -> entity);
		elements.items.add(() -> new SpawnEggItem(entity, -10066330, -10092544, new Item.Properties().group(SepratistAIItemGroup.tab))
				.setRegistryName("spider_droid_spawn_egg"));
	}

	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public void registerModels(ModelRegistryEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(entity, renderManager -> {
			return new MobRenderer(renderManager, new ModelSpiderDroid(), 1.5f) {
				@Override
				public ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("starwarsmod:textures/spiderdroid.png");
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
				this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0);
			if (this.getAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
				this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(75);
			if (this.getAttribute(SharedMonsterAttributes.ARMOR) != null)
				this.getAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0);
			if (this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) == null)
				this.getAttributes().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
			this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(10);
		}

		public void attackEntityWithRangedAttack(LivingEntity target, float flval) {
			SpiderDroidWeaponItem.shoot(this, target);
		}
	}

	// Made with Blockbench 3.7.4
	// Exported for Minecraft version 1.14
	// Paste this class into your mod and generate all required imports
	public static class ModelSpiderDroid extends EntityModel {
		private final ModelRenderer spiderdroid;
		private final ModelRenderer body;
		private final ModelRenderer octagon_r2;
		private final ModelRenderer head;
		private final ModelRenderer legs;
		private final ModelRenderer frontleft;
		private final ModelRenderer cube_r11_r1;
		private final ModelRenderer cube_r10_r1;
		private final ModelRenderer cube_r9_r1;
		private final ModelRenderer cube_r8_r1;
		private final ModelRenderer cube_r7_r1;
		private final ModelRenderer cube_r6_r1;
		private final ModelRenderer cube_r5_r1;
		private final ModelRenderer cube_r1_r1;
		private final ModelRenderer frontright;
		private final ModelRenderer cube_r12_r1;
		private final ModelRenderer cube_r11_r2;
		private final ModelRenderer cube_r10_r2;
		private final ModelRenderer cube_r9_r2;
		private final ModelRenderer cube_r8_r2;
		private final ModelRenderer cube_r7_r2;
		private final ModelRenderer cube_r6_r2;
		private final ModelRenderer cube_r2_r1;
		private final ModelRenderer Backright;
		private final ModelRenderer cube_r13_r1;
		private final ModelRenderer cube_r12_r2;
		private final ModelRenderer cube_r11_r3;
		private final ModelRenderer cube_r10_r3;
		private final ModelRenderer cube_r9_r3;
		private final ModelRenderer cube_r8_r3;
		private final ModelRenderer cube_r7_r3;
		private final ModelRenderer cube_r3_r1;
		private final ModelRenderer Backleft;
		private final ModelRenderer cube_r14_r1;
		private final ModelRenderer cube_r13_r2;
		private final ModelRenderer cube_r12_r3;
		private final ModelRenderer cube_r11_r4;
		private final ModelRenderer cube_r10_r4;
		private final ModelRenderer cube_r9_r4;
		private final ModelRenderer cube_r8_r4;
		private final ModelRenderer cube_r4_r1;
		public ModelSpiderDroid() {
			textureWidth = 256;
			textureHeight = 256;
			spiderdroid = new ModelRenderer(this);
			spiderdroid.setRotationPoint(0.0F, 24.0F, 0.0F);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -30.0F, 0.0F);
			spiderdroid.addChild(body);
			addBoxHelper(body, 168, 148, -5.0F, 4.0F, -5.0F, 10, 2, 10, 0.0F, false);
			addBoxHelper(body, 72, 0, -10.0F, -11.0F, -10.0F, 20, 4, 20, 0.0F, false);
			addBoxHelper(body, 0, 96, -8.0F, -7.0F, -8.0F, 16, 2, 16, 0.0F, false);
			addBoxHelper(body, 68, 34, -10.0F, -5.0F, -10.0F, 20, 6, 20, 0.0F, false);
			addBoxHelper(body, 122, 90, -2.5F, -4.5F, -10.4F, 4, 2, 20, 0.0F, false);
			addBoxHelper(body, 120, 120, -2.5F, -4.5F, -9.6F, 4, 2, 20, 0.0F, false);
			addBoxHelper(body, 66, 60, -9.6F, -4.5F, -2.5F, 20, 2, 4, 0.0F, false);
			addBoxHelper(body, 66, 26, -10.4F, -4.5F, -2.5F, 20, 2, 4, 0.0F, false);
			addBoxHelper(body, 66, 66, -11.0F, -1.0F, -11.0F, 22, 2, 22, 0.0F, false);
			addBoxHelper(body, 0, 0, -12.0F, 1.0F, -12.0F, 24, 2, 24, 0.0F, false);
			addBoxHelper(body, 0, 54, -11.0F, 3.0F, -11.0F, 22, 2, 22, 0.0F, false);
			octagon_r2 = new ModelRenderer(this);
			octagon_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.addChild(octagon_r2);
			setRotationAngle(octagon_r2, 0.0F, -0.7854F, 0.0F);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -49.0F, 0.0F);
			spiderdroid.addChild(head);
			addBoxHelper(head, 0, 26, -11.0F, 2.0F, -11.0F, 22, 6, 22, 0.0F, false);
			addBoxHelper(head, 54, 78, -4.0F, -14.0F, -4.0F, 8, 2, 8, 0.0F, false);
			addBoxHelper(head, 16, 16, 1.0F, -15.0F, -3.0F, 2, 2, 2, 0.0F, false);
			addBoxHelper(head, 66, 42, -3.5F, -15.5F, -2.5F, 4, 2, 4, 0.0F, false);
			addBoxHelper(head, 168, 16, -5.0F, -12.0F, -5.0F, 10, 2, 10, 0.0F, false);
			addBoxHelper(head, 0, 164, -9.0F, -13.0F, -7.0F, 4, 2, 14, 0.0F, false);
			addBoxHelper(head, 160, 66, 5.0F, -13.0F, -7.0F, 4, 2, 14, 0.0F, false);
			addBoxHelper(head, 106, 148, -7.0F, -13.0F, 7.0F, 14, 2, 2, 0.0F, false);
			addBoxHelper(head, 132, 16, -7.0F, -13.0F, -9.0F, 14, 2, 2, 0.0F, false);
			addBoxHelper(head, 152, 20, -5.0F, -13.0F, 5.0F, 10, 2, 2, 0.0F, false);
			addBoxHelper(head, 116, 152, -5.0F, -13.0F, -7.0F, 10, 2, 2, 0.0F, false);
			addBoxHelper(head, 30, 158, -13.0F, -11.0F, -7.0F, 4, 2, 14, 0.0F, false);
			addBoxHelper(head, 154, 132, 9.0F, -11.0F, -7.0F, 4, 2, 14, 0.0F, false);
			addBoxHelper(head, 122, 112, -7.0F, -11.0F, 9.0F, 14, 2, 4, 0.0F, false);
			addBoxHelper(head, 68, 108, -7.0F, -11.0F, -13.0F, 14, 2, 4, 0.0F, false);
			addBoxHelper(head, 174, 82, -15.0F, -9.0F, -7.0F, 2, 2, 14, 0.0F, false);
			addBoxHelper(head, 22, 174, 13.0F, -9.0F, -7.0F, 2, 2, 14, 0.0F, false);
			addBoxHelper(head, 198, 54, 11.0F, -9.0F, -11.0F, 2, 2, 4, 0.0F, false);
			addBoxHelper(head, 198, 20, 11.0F, -9.0F, 7.0F, 2, 2, 4, 0.0F, false);
			addBoxHelper(head, 22, 172, -13.0F, -9.0F, 7.0F, 2, 2, 4, 0.0F, false);
			addBoxHelper(head, 52, 166, -13.0F, -9.0F, -11.0F, 2, 2, 4, 0.0F, false);
			addBoxHelper(head, 196, 0, 7.0F, -9.0F, -13.0F, 4, 2, 2, 0.0F, false);
			addBoxHelper(head, 190, 118, 7.0F, -9.0F, 11.0F, 4, 2, 2, 0.0F, false);
			addBoxHelper(head, 82, 184, -11.0F, -9.0F, 11.0F, 4, 2, 2, 0.0F, false);
			addBoxHelper(head, 24, 180, -11.0F, -9.0F, -13.0F, 4, 2, 2, 0.0F, false);
			addBoxHelper(head, 176, 142, 7.0F, -11.0F, -11.0F, 4, 2, 2, 0.0F, false);
			addBoxHelper(head, 172, 8, 7.0F, -11.0F, 9.0F, 4, 2, 2, 0.0F, false);
			addBoxHelper(head, 164, 16, -11.0F, -11.0F, 9.0F, 4, 2, 2, 0.0F, false);
			addBoxHelper(head, 96, 164, -11.0F, -11.0F, -11.0F, 4, 2, 2, 0.0F, false);
			addBoxHelper(head, 30, 164, 7.0F, -11.0F, -9.0F, 4, 2, 2, 0.0F, false);
			addBoxHelper(head, 160, 56, 7.0F, -11.0F, 7.0F, 4, 2, 2, 0.0F, false);
			addBoxHelper(head, 150, 152, -11.0F, -11.0F, 7.0F, 4, 2, 2, 0.0F, false);
			addBoxHelper(head, 54, 88, -11.0F, -11.0F, -9.0F, 4, 2, 2, 0.0F, false);
			addBoxHelper(head, 128, 40, -7.0F, -9.0F, 13.0F, 14, 2, 2, 0.0F, false);
			addBoxHelper(head, 104, 90, -7.0F, -9.0F, -15.0F, 14, 2, 2, 0.0F, false);
			addBoxHelper(head, 172, 108, -17.0F, -7.0F, -7.0F, 2, 4, 14, 0.0F, false);
			addBoxHelper(head, 166, 170, 15.0F, -7.0F, -7.0F, 2, 4, 14, 0.0F, false);
			addBoxHelper(head, 168, 160, -7.0F, -7.0F, 15.0F, 14, 4, 2, 0.0F, false);
			addBoxHelper(head, 168, 28, -7.0F, -7.0F, -17.0F, 14, 4, 2, 0.0F, false);
			addBoxHelper(head, 54, 90, -19.0F, -3.0F, -7.0F, 18, 4, 14, 0.0F, false);
			addBoxHelper(head, 0, 78, -1.0F, -3.0F, -7.0F, 20, 4, 14, 0.0F, false);
			addBoxHelper(head, 132, 0, -7.0F, -3.0F, 7.0F, 14, 4, 12, 0.0F, false);
			addBoxHelper(head, 160, 40, -7.0F, 1.0F, -21.0F, 14, 12, 4, 0.0F, false);
			addBoxHelper(head, 184, 166, -4.0F, 5.0F, -23.0F, 8, 8, 4, 0.0F, false);
			addBoxHelper(head, 0, 142, -2.0F, 7.3F, -40.0F, 4, 4, 18, 0.0F, false);
			addBoxHelper(head, 30, 136, -2.0F, 7.3F, -76.0F, 4, 4, 18, 0.0F, false);
			addBoxHelper(head, 78, 170, -3.0F, 6.5F, -32.0F, 6, 6, 6, 0.0F, false);
			addBoxHelper(head, 94, 94, -1.0F, 8.4F, -61.0F, 2, 2, 24, 0.0F, false);
			addBoxHelper(head, 150, 148, -5.0F, 13.0F, -19.0F, 10, 2, 2, 0.0F, false);
			addBoxHelper(head, 26, 114, -7.0F, 1.0F, 17.0F, 14, 12, 4, 0.0F, false);
			addBoxHelper(head, 60, 144, 17.0F, 1.0F, -7.0F, 4, 12, 14, 0.0F, false);
			addBoxHelper(head, 94, 120, 17.5F, 7.0F, -1.0F, 4, 4, 6, 0.0F, false);
			addBoxHelper(head, 198, 14, 17.5F, 7.0F, -5.0F, 4, 4, 2, 0.0F, false);
			addBoxHelper(head, 196, 178, -21.5F, 7.0F, -5.0F, 4, 4, 2, 0.0F, false);
			addBoxHelper(head, 194, 194, -5.0F, 7.0F, 17.5F, 2, 4, 4, 0.0F, false);
			addBoxHelper(head, 192, 88, 3.0F, 7.0F, 17.5F, 2, 4, 4, 0.0F, false);
			addBoxHelper(head, 122, 102, -3.0F, 2.0F, 17.5F, 6, 4, 4, 0.0F, false);
			addBoxHelper(head, 114, 24, -21.5F, 7.0F, -1.0F, 4, 4, 6, 0.0F, false);
			addBoxHelper(head, 182, 188, 17.0F, 1.0F, -11.0F, 2, 8, 4, 0.0F, false);
			addBoxHelper(head, 174, 84, -19.0F, 1.0F, 7.0F, 2, 8, 4, 0.0F, false);
			addBoxHelper(head, 40, 174, -19.0F, 1.0F, -11.0F, 2, 8, 4, 0.0F, false);
			addBoxHelper(head, 172, 108, 17.0F, 1.0F, 7.0F, 2, 8, 4, 0.0F, false);
			addBoxHelper(head, 168, 170, 15.0F, 1.0F, -15.0F, 2, 8, 4, 0.0F, false);
			addBoxHelper(head, 0, 164, -17.0F, 1.0F, 11.0F, 2, 8, 4, 0.0F, false);
			addBoxHelper(head, 160, 66, -17.0F, 1.0F, -15.0F, 2, 8, 4, 0.0F, false);
			addBoxHelper(head, 116, 156, 15.0F, 1.0F, 11.0F, 2, 8, 4, 0.0F, false);
			addBoxHelper(head, 138, 192, 7.0F, 1.0F, -19.0F, 4, 8, 2, 0.0F, false);
			addBoxHelper(head, 190, 108, -11.0F, 1.0F, 17.0F, 4, 8, 2, 0.0F, false);
			addBoxHelper(head, 190, 98, -11.0F, 1.0F, -19.0F, 4, 8, 2, 0.0F, false);
			addBoxHelper(head, 36, 190, 7.0F, 1.0F, 17.0F, 4, 8, 2, 0.0F, false);
			addBoxHelper(head, 24, 190, 11.0F, 1.0F, -17.0F, 4, 8, 2, 0.0F, false);
			addBoxHelper(head, 144, 170, -15.0F, 1.0F, 15.0F, 4, 8, 2, 0.0F, false);
			addBoxHelper(head, 114, 170, -15.0F, 1.0F, -17.0F, 4, 8, 2, 0.0F, false);
			addBoxHelper(head, 104, 94, 11.0F, 1.0F, 15.0F, 4, 8, 2, 0.0F, false);
			addBoxHelper(head, 128, 142, -21.0F, 1.0F, -7.0F, 4, 12, 14, 0.0F, false);
			addBoxHelper(head, 128, 24, -7.0F, -3.0F, -19.0F, 14, 4, 12, 0.0F, false);
			addBoxHelper(head, 132, 66, 3.0F, -4.0F, -22.0F, 6, 6, 16, 0.0F, false);
			addBoxHelper(head, 148, 152, 0.5F, -1.5F, -20.0F, 2, 2, 16, 0.0F, false);
			addBoxHelper(head, 96, 152, -2.5F, -1.5F, -20.0F, 2, 2, 16, 0.0F, false);
			addBoxHelper(head, 150, 88, 4.0F, -3.0F, -23.0F, 4, 4, 16, 0.0F, false);
			addBoxHelper(head, 148, 112, -8.0F, -3.0F, -23.0F, 4, 4, 16, 0.0F, false);
			addBoxHelper(head, 132, 44, -9.0F, -4.0F, -22.0F, 6, 6, 16, 0.0F, false);
			addBoxHelper(head, 68, 114, 7.0F, -3.0F, -17.0F, 4, 4, 6, 0.0F, false);
			addBoxHelper(head, 98, 108, 7.0F, -3.0F, 11.0F, 4, 4, 6, 0.0F, false);
			addBoxHelper(head, 66, 32, -11.0F, -3.0F, 11.0F, 4, 4, 6, 0.0F, false);
			addBoxHelper(head, 66, 66, -11.0F, -3.0F, -17.0F, 4, 4, 6, 0.0F, false);
			addBoxHelper(head, 196, 126, 11.0F, -3.0F, -15.0F, 4, 4, 2, 0.0F, false);
			addBoxHelper(head, 196, 48, 11.0F, -3.0F, 13.0F, 4, 4, 2, 0.0F, false);
			addBoxHelper(head, 196, 42, -15.0F, -3.0F, 13.0F, 4, 4, 2, 0.0F, false);
			addBoxHelper(head, 138, 184, 7.0F, -3.0F, -11.0F, 10, 4, 4, 0.0F, false);
			addBoxHelper(head, 182, 72, 7.0F, -3.0F, 7.0F, 10, 4, 4, 0.0F, false);
			addBoxHelper(head, 196, 8, -15.0F, -3.0F, -15.0F, 4, 4, 2, 0.0F, false);
			addBoxHelper(head, 172, 0, -17.0F, -3.0F, 7.0F, 10, 4, 4, 0.0F, false);
			addBoxHelper(head, 82, 148, -17.0F, -3.0F, -11.0F, 10, 4, 4, 0.0F, false);
			addBoxHelper(head, 192, 80, 13.0F, -7.0F, -11.0F, 2, 4, 4, 0.0F, false);
			addBoxHelper(head, 192, 34, 13.0F, -7.0F, 7.0F, 2, 4, 4, 0.0F, false);
			addBoxHelper(head, 150, 192, -15.0F, -7.0F, 7.0F, 2, 4, 4, 0.0F, false);
			addBoxHelper(head, 184, 8, -15.0F, -7.0F, -11.0F, 2, 4, 4, 0.0F, false);
			addBoxHelper(head, 82, 114, 11.0F, -7.0F, -13.0F, 2, 4, 2, 0.0F, false);
			addBoxHelper(head, 110, 24, 11.0F, -7.0F, 11.0F, 2, 4, 2, 0.0F, false);
			addBoxHelper(head, 80, 66, -13.0F, -7.0F, 11.0F, 2, 4, 2, 0.0F, false);
			addBoxHelper(head, 80, 32, -13.0F, -7.0F, -13.0F, 2, 4, 2, 0.0F, false);
			addBoxHelper(head, 194, 188, 7.0F, -7.0F, -15.0F, 4, 4, 2, 0.0F, false);
			addBoxHelper(head, 190, 142, 7.0F, -7.0F, 13.0F, 4, 4, 2, 0.0F, false);
			addBoxHelper(head, 184, 178, -11.0F, -7.0F, 13.0F, 4, 4, 2, 0.0F, false);
			addBoxHelper(head, 180, 34, -11.0F, -7.0F, -15.0F, 4, 4, 2, 0.0F, false);
			addBoxHelper(head, 174, 98, 11.0F, -3.0F, -13.0F, 4, 4, 2, 0.0F, false);
			addBoxHelper(head, 0, 154, 11.0F, -3.0F, 11.0F, 4, 4, 2, 0.0F, false);
			addBoxHelper(head, 82, 142, -15.0F, -3.0F, 11.0F, 4, 4, 2, 0.0F, false);
			addBoxHelper(head, 128, 24, -15.0F, -3.0F, -13.0F, 4, 4, 2, 0.0F, false);
			legs = new ModelRenderer(this);
			legs.setRotationPoint(0.0F, -30.0F, 0.0F);
			spiderdroid.addChild(legs);
			frontleft = new ModelRenderer(this);
			frontleft.setRotationPoint(0.0F, 0.0F, 0.0F);
			legs.addChild(frontleft);
			cube_r11_r1 = new ModelRenderer(this);
			cube_r11_r1.setRotationPoint(-2.7678F, 37.8796F, -25.5166F);
			frontleft.addChild(cube_r11_r1);
			setRotationAngle(cube_r11_r1, -0.48F, -0.7854F, 0.0F);
			addBoxHelper(cube_r11_r1, 70, 184, 18.0F, -54.0F, -22.0F, 4, 26, 4, 0.0F, false);
			cube_r10_r1 = new ModelRenderer(this);
			cube_r10_r1.setRotationPoint(2.6678F, 56.0104F, -56.408F);
			frontleft.addChild(cube_r10_r1);
			setRotationAngle(cube_r10_r1, -0.9599F, -0.7854F, 0.0F);
			addBoxHelper(cube_r10_r1, 174, 188, 37.0F, -62.0F, -40.0F, 2, 22, 2, 0.0F, false);
			cube_r9_r1 = new ModelRenderer(this);
			cube_r9_r1.setRotationPoint(-17.9358F, 56.8526F, -35.8044F);
			frontleft.addChild(cube_r9_r1);
			setRotationAngle(cube_r9_r1, -0.6545F, -0.7854F, 0.0F);
			addBoxHelper(cube_r9_r1, 12, 114, 37.0F, -26.0F, -49.0F, 2, 18, 2, 0.0F, false);
			cube_r8_r1 = new ModelRenderer(this);
			cube_r8_r1.setRotationPoint(-9.9412F, 30.0F, -24.0F);
			frontleft.addChild(cube_r8_r1);
			setRotationAngle(cube_r8_r1, 0.0F, -0.7854F, 0.0F);
			addBoxHelper(cube_r8_r1, 96, 156, 22.0F, -25.2F, -27.0F, 4, 4, 4, 0.0F, false);
			addBoxHelper(cube_r8_r1, 148, 132, 22.0F, -30.4F, -23.0F, 4, 4, 4, 0.0F, false);
			addBoxHelper(cube_r8_r1, 86, 184, 22.0F, -31.0F, -37.0F, 4, 8, 8, 0.0F, false);
			cube_r7_r1 = new ModelRenderer(this);
			cube_r7_r1.setRotationPoint(-13.2548F, 30.0F, -32.0F);
			frontleft.addChild(cube_r7_r1);
			setRotationAngle(cube_r7_r1, 0.0F, -0.7854F, 0.0F);
			addBoxHelper(cube_r7_r1, 0, 0, 31.0F, -5.0F, -33.0F, 2, 0, 0, 0.0F, false);
			addBoxHelper(cube_r7_r1, 150, 142, 29.0048F, -9.0F, -35.0F, 6, 2, 2, 0.0F, false);
			addBoxHelper(cube_r7_r1, 26, 150, 29.0F, -28.5F, -31.5F, 6, 2, 2, 0.0F, false);
			cube_r6_r1 = new ModelRenderer(this);
			cube_r6_r1.setRotationPoint(-10.6988F, 36.3044F, -31.7276F);
			frontleft.addChild(cube_r6_r1);
			setRotationAngle(cube_r6_r1, -0.2182F, -0.7854F, 0.0F);
			addBoxHelper(cube_r6_r1, 78, 78, 29.0F, -36.5F, -37.0F, 2, 4, 2, 0.0F, false);
			addBoxHelper(cube_r6_r1, 0, 114, 29.0F, -32.5F, -38.0F, 2, 16, 4, 0.0F, false);
			cube_r5_r1 = new ModelRenderer(this);
			cube_r5_r1.setRotationPoint(-12.4264F, 30.0F, -30.0F);
			frontleft.addChild(cube_r5_r1);
			setRotationAngle(cube_r5_r1, 0.0F, -0.7854F, 0.0F);
			addBoxHelper(cube_r5_r1, 0, 0, 29.6F, -1.9F, -37.0F, 0, 0, 2, 0.0F, false);
			addBoxHelper(cube_r5_r1, 0, 0, 29.6F, -6.0F, -36.0F, 0, 0, 2, 0.0F, false);
			addBoxHelper(cube_r5_r1, 150, 90, 28.0F, -19.5F, -36.0F, 4, 10, 2, 0.0F, false);
			addBoxHelper(cube_r5_r1, 16, 180, 29.0F, -5.5F, -37.0F, 2, 4, 4, 0.0F, false);
			addBoxHelper(cube_r5_r1, 144, 170, 27.0F, -1.5F, -43.0F, 6, 2, 12, 0.0F, false);
			addBoxHelper(cube_r5_r1, 148, 118, 28.0F, -9.5F, -37.0F, 4, 4, 4, 0.0F, false);
			cube_r1_r1 = new ModelRenderer(this);
			cube_r1_r1.setRotationPoint(-5.799F, 30.0F, -14.0F);
			frontleft.addChild(cube_r1_r1);
			setRotationAngle(cube_r1_r1, 0.0F, -0.7854F, 0.0F);
			addBoxHelper(cube_r1_r1, 122, 94, 11.0F, -29.5F, -17.5F, 6, 4, 4, 0.0F, false);
			addBoxHelper(cube_r1_r1, 94, 120, 13.0F, -30.0F, -34.0F, 2, 6, 22, 0.0F, false);
			frontright = new ModelRenderer(this);
			frontright.setRotationPoint(0.0F, 0.0F, 0.0F);
			legs.addChild(frontright);
			cube_r12_r1 = new ModelRenderer(this);
			cube_r12_r1.setRotationPoint(2.7678F, 37.8796F, -25.5166F);
			frontright.addChild(cube_r12_r1);
			setRotationAngle(cube_r12_r1, -0.48F, 0.7854F, 0.0F);
			addBoxHelper(cube_r12_r1, 54, 184, -22.0F, -54.0F, -22.0F, 4, 26, 4, 0.0F, false);
			cube_r11_r2 = new ModelRenderer(this);
			cube_r11_r2.setRotationPoint(-2.6678F, 56.0104F, -56.408F);
			frontright.addChild(cube_r11_r2);
			setRotationAngle(cube_r11_r2, -0.9599F, 0.7854F, 0.0F);
			addBoxHelper(cube_r11_r2, 166, 188, -39.0F, -62.0F, -40.0F, 2, 22, 2, 0.0F, false);
			cube_r10_r2 = new ModelRenderer(this);
			cube_r10_r2.setRotationPoint(17.9358F, 56.8526F, -35.8044F);
			frontright.addChild(cube_r10_r2);
			setRotationAngle(cube_r10_r2, -0.6545F, 0.7854F, 0.0F);
			addBoxHelper(cube_r10_r2, 84, 0, -39.0F, -26.0F, -49.0F, 2, 18, 2, 0.0F, false);
			cube_r9_r2 = new ModelRenderer(this);
			cube_r9_r2.setRotationPoint(9.9412F, 30.0F, -24.0F);
			frontright.addChild(cube_r9_r2);
			setRotationAngle(cube_r9_r2, 0.0F, 0.7854F, 0.0F);
			addBoxHelper(cube_r9_r2, 56, 146, -26.0F, -25.2F, -27.0F, 4, 4, 4, 0.0F, false);
			addBoxHelper(cube_r9_r2, 26, 142, -26.0F, -30.4F, -23.0F, 4, 4, 4, 0.0F, false);
			addBoxHelper(cube_r9_r2, 182, 56, -26.0F, -31.0F, -37.0F, 4, 8, 8, 0.0F, false);
			cube_r8_r2 = new ModelRenderer(this);
			cube_r8_r2.setRotationPoint(13.2548F, 30.0F, -32.0F);
			frontright.addChild(cube_r8_r2);
			setRotationAngle(cube_r8_r2, 0.0F, 0.7854F, 0.0F);
			addBoxHelper(cube_r8_r2, 0, 0, -33.0F, -5.0F, -33.0F, 2, 0, 0, 0.0F, false);
			addBoxHelper(cube_r8_r2, 120, 136, -35.0048F, -9.0F, -35.0F, 6, 2, 2, 0.0F, false);
			addBoxHelper(cube_r8_r2, 94, 130, -35.0F, -28.5F, -31.5F, 6, 2, 2, 0.0F, false);
			cube_r7_r2 = new ModelRenderer(this);
			cube_r7_r2.setRotationPoint(10.6988F, 36.3044F, -31.7276F);
			frontright.addChild(cube_r7_r2);
			setRotationAngle(cube_r7_r2, -0.2182F, 0.7854F, 0.0F);
			addBoxHelper(cube_r7_r2, 54, 78, -31.0F, -36.5F, -37.0F, 2, 4, 2, 0.0F, false);
			addBoxHelper(cube_r7_r2, 72, 0, -31.0F, -32.5F, -38.0F, 2, 16, 4, 0.0F, false);
			cube_r6_r2 = new ModelRenderer(this);
			cube_r6_r2.setRotationPoint(12.4264F, 30.0F, -30.0F);
			frontright.addChild(cube_r6_r2);
			setRotationAngle(cube_r6_r2, 0.0F, 0.7854F, 0.0F);
			addBoxHelper(cube_r6_r2, 0, 0, -29.6F, -1.9F, -37.0F, 0, 0, 2, 0.0F, false);
			addBoxHelper(cube_r6_r2, 0, 0, -29.6F, -6.0F, -36.0F, 0, 0, 2, 0.0F, false);
			addBoxHelper(cube_r6_r2, 0, 142, -32.0F, -19.5F, -36.0F, 4, 10, 2, 0.0F, false);
			addBoxHelper(cube_r6_r2, 176, 56, -31.0F, -5.5F, -37.0F, 2, 4, 4, 0.0F, false);
			addBoxHelper(cube_r6_r2, 90, 170, -33.0F, -1.5F, -43.0F, 6, 2, 12, 0.0F, false);
			addBoxHelper(cube_r6_r2, 56, 138, -32.0F, -9.5F, -37.0F, 4, 4, 4, 0.0F, false);
			cube_r2_r1 = new ModelRenderer(this);
			cube_r2_r1.setRotationPoint(5.799F, 30.0F, -14.0F);
			frontright.addChild(cube_r2_r1);
			setRotationAngle(cube_r2_r1, 0.0F, 0.7854F, 0.0F);
			addBoxHelper(cube_r2_r1, 120, 120, -17.0F, -29.5F, -17.5F, 6, 4, 4, 0.0F, false);
			addBoxHelper(cube_r2_r1, 68, 114, -15.0F, -30.0F, -34.0F, 2, 6, 22, 0.0F, false);
			Backright = new ModelRenderer(this);
			Backright.setRotationPoint(0.0F, 0.0F, 0.0F);
			legs.addChild(Backright);
			cube_r13_r1 = new ModelRenderer(this);
			cube_r13_r1.setRotationPoint(2.7678F, 37.8796F, 25.5166F);
			Backright.addChild(cube_r13_r1);
			setRotationAngle(cube_r13_r1, 0.48F, -0.7854F, 0.0F);
			addBoxHelper(cube_r13_r1, 122, 182, -22.0F, -54.0F, 18.0F, 4, 26, 4, 0.0F, false);
			cube_r12_r2 = new ModelRenderer(this);
			cube_r12_r2.setRotationPoint(-2.6678F, 56.0104F, 56.408F);
			Backright.addChild(cube_r12_r2);
			setRotationAngle(cube_r12_r2, 0.9599F, -0.7854F, 0.0F);
			addBoxHelper(cube_r12_r2, 16, 188, -39.0F, -62.0F, 38.0F, 2, 22, 2, 0.0F, false);
			cube_r11_r3 = new ModelRenderer(this);
			cube_r11_r3.setRotationPoint(17.9358F, 56.8526F, 35.8044F);
			Backright.addChild(cube_r11_r3);
			setRotationAngle(cube_r11_r3, 0.6545F, -0.7854F, 0.0F);
			addBoxHelper(cube_r11_r3, 12, 54, -39.0F, -26.0F, 47.0F, 2, 18, 2, 0.0F, false);
			cube_r10_r3 = new ModelRenderer(this);
			cube_r10_r3.setRotationPoint(9.9412F, 30.0F, 24.0F);
			Backright.addChild(cube_r10_r3);
			setRotationAngle(cube_r10_r3, 0.0F, -0.7854F, 0.0F);
			addBoxHelper(cube_r10_r3, 132, 74, -26.0F, -25.2F, 23.0F, 4, 4, 4, 0.0F, false);
			addBoxHelper(cube_r10_r3, 132, 66, -26.0F, -30.4F, 19.0F, 4, 4, 4, 0.0F, false);
			addBoxHelper(cube_r10_r3, 180, 126, -26.0F, -31.0F, 29.0F, 4, 8, 8, 0.0F, false);
			cube_r9_r3 = new ModelRenderer(this);
			cube_r9_r3.setRotationPoint(13.2548F, 30.0F, 32.0F);
			Backright.addChild(cube_r9_r3);
			setRotationAngle(cube_r9_r3, 0.0F, -0.7854F, 0.0F);
			addBoxHelper(cube_r9_r3, 0, 0, -33.0F, -5.0F, 33.0F, 2, 0, 0, 0.0F, false);
			addBoxHelper(cube_r9_r3, 26, 130, -35.0048F, -9.0F, 33.0F, 6, 2, 2, 0.0F, false);
			addBoxHelper(cube_r9_r3, 68, 124, -35.0F, -28.5F, 29.5F, 6, 2, 2, 0.0F, false);
			cube_r8_r3 = new ModelRenderer(this);
			cube_r8_r3.setRotationPoint(10.6988F, 36.3044F, 31.7276F);
			Backright.addChild(cube_r8_r3);
			setRotationAngle(cube_r8_r3, 0.2182F, -0.7854F, 0.0F);
			addBoxHelper(cube_r8_r3, 16, 0, -31.0F, -36.5F, 35.0F, 2, 4, 2, 0.0F, false);
			addBoxHelper(cube_r8_r3, 0, 54, -31.0F, -32.5F, 34.0F, 2, 16, 4, 0.0F, false);
			cube_r7_r3 = new ModelRenderer(this);
			cube_r7_r3.setRotationPoint(12.4264F, 30.0F, 30.0F);
			Backright.addChild(cube_r7_r3);
			setRotationAngle(cube_r7_r3, 0.0F, -0.7854F, 0.0F);
			addBoxHelper(cube_r7_r3, 0, 0, -29.6F, -1.9F, 35.0F, 0, 0, 2, 0.0F, false);
			addBoxHelper(cube_r7_r3, 0, 0, -29.6F, -6.0F, 34.0F, 0, 0, 2, 0.0F, false);
			addBoxHelper(cube_r7_r3, 132, 0, -32.0F, -19.5F, 34.0F, 4, 10, 2, 0.0F, false);
			addBoxHelper(cube_r7_r3, 52, 174, -31.0F, -5.5F, 33.0F, 2, 4, 4, 0.0F, false);
			addBoxHelper(cube_r7_r3, 54, 170, -33.0F, -1.5F, 31.0F, 6, 2, 12, 0.0F, false);
			addBoxHelper(cube_r7_r3, 128, 44, -32.0F, -9.5F, 33.0F, 4, 4, 4, 0.0F, false);
			cube_r3_r1 = new ModelRenderer(this);
			cube_r3_r1.setRotationPoint(5.799F, 30.0F, 14.0F);
			Backright.addChild(cube_r3_r1);
			setRotationAngle(cube_r3_r1, 0.0F, -0.7854F, 0.0F);
			addBoxHelper(cube_r3_r1, 48, 96, -17.0F, -29.5F, 13.5F, 6, 4, 4, 0.0F, false);
			addBoxHelper(cube_r3_r1, 0, 114, -15.0F, -30.0F, 12.0F, 2, 6, 22, 0.0F, false);
			Backleft = new ModelRenderer(this);
			Backleft.setRotationPoint(0.0F, 0.0F, 0.0F);
			legs.addChild(Backleft);
			cube_r14_r1 = new ModelRenderer(this);
			cube_r14_r1.setRotationPoint(-2.7678F, 37.8796F, 25.5166F);
			Backleft.addChild(cube_r14_r1);
			setRotationAngle(cube_r14_r1, 0.48F, 0.7854F, 0.0F);
			addBoxHelper(cube_r14_r1, 0, 180, 18.0F, -54.0F, 18.0F, 4, 26, 4, 0.0F, false);
			cube_r13_r2 = new ModelRenderer(this);
			cube_r13_r2.setRotationPoint(2.6678F, 56.0104F, 56.408F);
			Backleft.addChild(cube_r13_r2);
			setRotationAngle(cube_r13_r2, 0.9599F, 0.7854F, 0.0F);
			addBoxHelper(cube_r13_r2, 110, 184, 37.0F, -62.0F, 38.0F, 2, 22, 2, 0.0F, false);
			cube_r12_r3 = new ModelRenderer(this);
			cube_r12_r3.setRotationPoint(-17.9358F, 56.8526F, 35.8044F);
			Backleft.addChild(cube_r12_r3);
			setRotationAngle(cube_r12_r3, 0.6545F, 0.7854F, 0.0F);
			addBoxHelper(cube_r12_r3, 12, 26, 37.0F, -26.0F, 47.0F, 2, 18, 2, 0.0F, false);
			cube_r11_r4 = new ModelRenderer(this);
			cube_r11_r4.setRotationPoint(-9.9412F, 30.0F, 24.0F);
			Backleft.addChild(cube_r11_r4);
			setRotationAngle(cube_r11_r4, 0.0F, 0.7854F, 0.0F);
			addBoxHelper(cube_r11_r4, 120, 128, 22.0F, -25.2F, 23.0F, 4, 4, 4, 0.0F, false);
			addBoxHelper(cube_r11_r4, 0, 104, 22.0F, -30.4F, 19.0F, 4, 4, 4, 0.0F, false);
			addBoxHelper(cube_r11_r4, 0, 0, 22.0F, -31.0F, 29.0F, 4, 8, 8, 0.0F, false);
			cube_r10_r4 = new ModelRenderer(this);
			cube_r10_r4.setRotationPoint(-13.2548F, 30.0F, 32.0F);
			Backleft.addChild(cube_r10_r4);
			setRotationAngle(cube_r10_r4, 0.0F, 0.7854F, 0.0F);
			addBoxHelper(cube_r10_r4, 0, 0, 31.0F, -5.0F, 33.0F, 2, 0, 0, 0.0F, false);
			addBoxHelper(cube_r10_r4, 110, 60, 29.0048F, -9.0F, 33.0F, 6, 2, 2, 0.0F, false);
			addBoxHelper(cube_r10_r4, 48, 108, 29.0F, -28.5F, 29.5F, 6, 2, 2, 0.0F, false);
			cube_r9_r4 = new ModelRenderer(this);
			cube_r9_r4.setRotationPoint(-10.6988F, 36.3044F, 31.7276F);
			Backleft.addChild(cube_r9_r4);
			setRotationAngle(cube_r9_r4, 0.2182F, 0.7854F, 0.0F);
			addBoxHelper(cube_r9_r4, 0, 0, 29.0F, -36.5F, 35.0F, 2, 4, 2, 0.0F, false);
			addBoxHelper(cube_r9_r4, 0, 26, 29.0F, -32.5F, 34.0F, 2, 16, 4, 0.0F, false);
			cube_r8_r4 = new ModelRenderer(this);
			cube_r8_r4.setRotationPoint(-12.4264F, 30.0F, 30.0F);
			Backleft.addChild(cube_r8_r4);
			setRotationAngle(cube_r8_r4, 0.0F, 0.7854F, 0.0F);
			addBoxHelper(cube_r8_r4, 0, 0, 29.6F, -1.9F, 35.0F, 0, 0, 2, 0.0F, false);
			addBoxHelper(cube_r8_r4, 0, 0, 29.6F, -6.0F, 34.0F, 0, 0, 2, 0.0F, false);
			addBoxHelper(cube_r8_r4, 0, 78, 28.0F, -19.5F, 34.0F, 4, 10, 2, 0.0F, false);
			addBoxHelper(cube_r8_r4, 22, 164, 29.0F, -5.5F, 33.0F, 2, 4, 4, 0.0F, false);
			addBoxHelper(cube_r8_r4, 120, 168, 27.0F, -1.5F, 31.0F, 6, 2, 12, 0.0F, false);
			addBoxHelper(cube_r8_r4, 0, 96, 28.0F, -9.5F, 33.0F, 4, 4, 4, 0.0F, false);
			cube_r4_r1 = new ModelRenderer(this);
			cube_r4_r1.setRotationPoint(-5.799F, 30.0F, 14.0F);
			Backleft.addChild(cube_r4_r1);
			setRotationAngle(cube_r4_r1, 0.0F, 0.7854F, 0.0F);
			addBoxHelper(cube_r4_r1, 0, 16, 11.0F, -29.5F, 13.5F, 6, 4, 4, 0.0F, false);
			addBoxHelper(cube_r4_r1, 42, 108, 13.0F, -30.0F, 12.0F, 2, 6, 22, 0.0F, false);
		}

		@Override
		public void render(MatrixStack ms, IVertexBuilder vb, int i1, int i2, float f1, float f2, float f3, float f4) {
			spiderdroid.render(ms, vb, i1, i2, f1, f2, f3, f4);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
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
