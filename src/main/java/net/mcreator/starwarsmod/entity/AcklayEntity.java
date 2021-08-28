
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
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.Entity;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.starwarsmod.itemgroup.StarWarsMobsItemGroup;
import net.mcreator.starwarsmod.StarwarsmodModElements;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@StarwarsmodModElements.ModElement.Tag
public class AcklayEntity extends StarwarsmodModElements.ModElement {
	public static EntityType entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new).size(6f, 6f))
					.build("acklay").setRegistryName("acklay");
	public AcklayEntity(StarwarsmodModElements instance) {
		super(instance, 417);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@Override
	public void initElements() {
		elements.entities.add(() -> entity);
		elements.items.add(() -> new SpawnEggItem(entity, -16751104, -52, new Item.Properties().group(StarWarsMobsItemGroup.tab))
				.setRegistryName("acklay_spawn_egg"));
	}

	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public void registerModels(ModelRegistryEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(entity, renderManager -> {
			return new MobRenderer(renderManager, new Modelacklay(), 0.5f) {
				@Override
				public ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("starwarsmod:textures/acklay.png");
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
			this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2, false));
			this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, CreatureEntity.class, false, false));
			this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, MobEntity.class, false, false));
			this.goalSelector.addGoal(4, new RandomWalkingGoal(this, 1));
			this.targetSelector.addGoal(5, new HurtByTargetGoal(this).setCallsForHelp(this.getClass()));
			this.goalSelector.addGoal(6, new LookRandomlyGoal(this));
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
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("starwarsmod:acklayscreech"));
		}

		@Override
		public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
		}

		@Override
		public net.minecraft.util.SoundEvent getDeathSound() {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("starwarsmod:acklayscreech"));
		}

		@Override
		protected void registerAttributes() {
			super.registerAttributes();
			if (this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED) != null)
				this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.35);
			if (this.getAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
				this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(150);
			if (this.getAttribute(SharedMonsterAttributes.ARMOR) != null)
				this.getAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0);
			if (this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) == null)
				this.getAttributes().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
			this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(8);
			if (this.getAttribute(SharedMonsterAttributes.ATTACK_KNOCKBACK) == null)
				this.getAttributes().registerAttribute(SharedMonsterAttributes.ATTACK_KNOCKBACK);
			this.getAttribute(SharedMonsterAttributes.ATTACK_KNOCKBACK).setBaseValue(3D);
		}
	}

	// Made with Blockbench 3.7.4
	// Exported for Minecraft version 1.14
	// Paste this class into your mod and generate all required imports
	public static class Modelacklay extends EntityModel {
		private final ModelRenderer Acklay;
		private final ModelRenderer Body;
		private final ModelRenderer Head;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer LeftLeg1;
		private final ModelRenderer cube_r4;
		private final ModelRenderer cube_r5;
		private final ModelRenderer cube_r6;
		private final ModelRenderer cube_r7;
		private final ModelRenderer cube_r8;
		private final ModelRenderer cube_r9;
		private final ModelRenderer cube_r10;
		private final ModelRenderer cube_r11;
		private final ModelRenderer LeftLeg2;
		private final ModelRenderer cube_r12;
		private final ModelRenderer cube_r13;
		private final ModelRenderer cube_r14;
		private final ModelRenderer cube_r15;
		private final ModelRenderer cube_r16;
		private final ModelRenderer cube_r17;
		private final ModelRenderer cube_r18;
		private final ModelRenderer cube_r19;
		private final ModelRenderer LeftLeg3;
		private final ModelRenderer cube_r20;
		private final ModelRenderer cube_r21;
		private final ModelRenderer cube_r22;
		private final ModelRenderer cube_r23;
		private final ModelRenderer cube_r24;
		private final ModelRenderer cube_r25;
		private final ModelRenderer cube_r26;
		private final ModelRenderer cube_r27;
		private final ModelRenderer RightLeg1;
		private final ModelRenderer cube_r28;
		private final ModelRenderer cube_r29;
		private final ModelRenderer cube_r30;
		private final ModelRenderer cube_r31;
		private final ModelRenderer cube_r32;
		private final ModelRenderer cube_r33;
		private final ModelRenderer cube_r34;
		private final ModelRenderer cube_r35;
		private final ModelRenderer RightLeg2;
		private final ModelRenderer cube_r36;
		private final ModelRenderer cube_r37;
		private final ModelRenderer cube_r38;
		private final ModelRenderer cube_r39;
		private final ModelRenderer cube_r40;
		private final ModelRenderer cube_r41;
		private final ModelRenderer cube_r42;
		private final ModelRenderer cube_r43;
		private final ModelRenderer RightLeg3;
		private final ModelRenderer cube_r44;
		private final ModelRenderer cube_r45;
		private final ModelRenderer cube_r46;
		private final ModelRenderer cube_r47;
		private final ModelRenderer cube_r48;
		private final ModelRenderer cube_r49;
		private final ModelRenderer cube_r50;
		private final ModelRenderer cube_r51;
		public Modelacklay() {
			textureWidth = 512;
			textureHeight = 512;
			Acklay = new ModelRenderer(this);
			Acklay.setRotationPoint(0.0F, 24.0F, 0.0F);
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 0.0F, 0.0F);
			Acklay.addChild(Body);
			addBoxHelper(Body, 0, 88, -6.0F, -68.0F, 50.0F, 12, 10, 8, 0.0F, false);
			addBoxHelper(Body, 0, 0, -20.0F, -82.0F, -32.0F, 40, 10, 64, 0.0F, false);
			addBoxHelper(Body, 0, 212, -21.0F, -84.0F, -32.0F, 42, 2, 56, 0.0F, false);
			addBoxHelper(Body, 212, 87, -11.0F, -86.0F, -32.0F, 22, 2, 44, 0.0F, false);
			addBoxHelper(Body, 258, 298, -23.0F, -83.0F, -30.0F, 46, 2, 2, 0.0F, false);
			addBoxHelper(Body, 162, 298, -23.0F, -83.0F, -26.0F, 46, 2, 2, 0.0F, false);
			addBoxHelper(Body, 258, 294, -23.0F, -83.0F, -22.0F, 46, 2, 2, 0.0F, false);
			addBoxHelper(Body, 162, 294, -23.0F, -83.0F, -18.0F, 46, 2, 2, 0.0F, false);
			addBoxHelper(Body, 286, 207, -23.0F, -83.0F, -14.0F, 46, 2, 2, 0.0F, false);
			addBoxHelper(Body, 286, 203, -23.0F, -83.0F, -10.0F, 46, 2, 2, 0.0F, false);
			addBoxHelper(Body, 0, 282, -23.0F, -83.0F, -6.0F, 46, 2, 2, 0.0F, false);
			addBoxHelper(Body, 244, 272, -23.0F, -83.0F, -2.0F, 46, 2, 2, 0.0F, false);
			addBoxHelper(Body, 90, 270, -23.0F, -83.0F, 2.0F, 46, 2, 2, 0.0F, false);
			addBoxHelper(Body, 244, 268, -23.0F, -83.0F, 6.0F, 46, 2, 2, 0.0F, false);
			addBoxHelper(Body, 260, 169, -23.0F, -83.0F, 10.0F, 46, 2, 2, 0.0F, false);
			addBoxHelper(Body, 236, 68, -23.0F, -83.0F, 14.0F, 46, 2, 2, 0.0F, false);
			addBoxHelper(Body, 236, 64, -23.0F, -83.0F, 18.0F, 46, 2, 2, 0.0F, false);
			addBoxHelper(Body, 0, 208, -23.0F, -79.0F, 22.0F, 46, 2, 2, 0.0F, false);
			addBoxHelper(Body, 128, 111, -23.0F, -79.0F, 26.0F, 46, 2, 2, 0.0F, false);
			addBoxHelper(Body, 0, 74, -16.0F, -72.0F, -32.0F, 32, 16, 64, 0.0F, false);
			addBoxHelper(Body, 286, 187, -18.0F, -71.0F, -26.0F, 36, 8, 8, 0.0F, false);
			addBoxHelper(Body, 250, 278, -18.0F, -69.0F, -4.0F, 36, 8, 8, 0.0F, false);
			addBoxHelper(Body, 162, 278, -18.0F, -67.0F, 16.0F, 36, 8, 8, 0.0F, false);
			addBoxHelper(Body, 132, 212, -12.0F, -56.0F, -32.0F, 24, 2, 64, 0.0F, false);
			addBoxHelper(Body, 118, 118, -5.0F, -72.0F, -36.0F, 10, 20, 74, 0.0F, false);
			addBoxHelper(Body, 86, 278, -14.0F, -78.0F, 32.0F, 28, 22, 10, 0.0F, false);
			addBoxHelper(Body, 0, 28, -10.0F, -74.0F, 42.0F, 20, 18, 8, 0.0F, false);
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, -64.0F, -30.0F);
			Acklay.addChild(Head);
			addBoxHelper(Head, 0, 0, -6.0F, -60.0F, -36.0F, 12, 12, 16, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(-11.0F, -34.0F, -74.0F);
			Head.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.5672F, 0.0F, 0.0F);
			addBoxHelper(cube_r1, 54, 26, 10.0F, 12.0F, 34.5F, 2, 8, 2, 0.0F, false);
			addBoxHelper(cube_r1, 0, 6, 10.0F, 8.0F, 34.0F, 2, 4, 4, 0.0F, false);
			addBoxHelper(cube_r1, 0, 0, 6.0F, 3.0F, 32.0F, 1, 3, 1, 0.0F, false);
			addBoxHelper(cube_r1, 0, 31, 8.5F, 4.0F, 32.0F, 1, 2, 1, 0.0F, false);
			addBoxHelper(cube_r1, 4, 31, 12.5F, 4.0F, 32.0F, 1, 2, 1, 0.0F, false);
			addBoxHelper(cube_r1, 56, 42, 10.5F, 4.0F, 32.0F, 1, 2, 1, 0.0F, false);
			addBoxHelper(cube_r1, 0, 6, 15.0F, 3.0F, 32.0F, 1, 3, 1, 0.0F, false);
			addBoxHelper(cube_r1, 12, 12, 6.0F, 4.0F, 40.0F, 1, 2, 1, 0.0F, false);
			addBoxHelper(cube_r1, 12, 6, 6.0F, 4.0F, 38.0F, 1, 2, 1, 0.0F, false);
			addBoxHelper(cube_r1, 0, 28, 6.0F, 4.0F, 36.0F, 1, 2, 1, 0.0F, false);
			addBoxHelper(cube_r1, 4, 28, 6.0F, 4.0F, 34.0F, 1, 2, 1, 0.0F, false);
			addBoxHelper(cube_r1, 8, 6, 15.0F, 4.0F, 40.0F, 1, 2, 1, 0.0F, false);
			addBoxHelper(cube_r1, 12, 0, 15.0F, 4.0F, 38.0F, 1, 2, 1, 0.0F, false);
			addBoxHelper(cube_r1, 12, 9, 15.0F, 4.0F, 36.0F, 1, 2, 1, 0.0F, false);
			addBoxHelper(cube_r1, 56, 39, 15.0F, 4.0F, 34.0F, 1, 2, 1, 0.0F, false);
			addBoxHelper(cube_r1, 0, 74, 6.0F, 6.0F, 32.0F, 10, 2, 12, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(-7.0F, -50.0F, -52.0F);
			Head.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.2618F, 0.0F, 0.0F);
			addBoxHelper(cube_r2, 56, 36, 11.0F, 0.0F, 8.0F, 1, 2, 1, 0.0F, false);
			addBoxHelper(cube_r2, 0, 54, 4.5F, 0.0F, 8.0F, 1, 2, 1, 0.0F, false);
			addBoxHelper(cube_r2, 56, 16, 8.5F, 0.0F, 8.0F, 1, 2, 1, 0.0F, false);
			addBoxHelper(cube_r2, 56, 19, 6.5F, 0.0F, 8.0F, 1, 2, 1, 0.0F, false);
			addBoxHelper(cube_r2, 48, 28, 11.0F, 0.0F, 10.0F, 1, 2, 1, 0.0F, false);
			addBoxHelper(cube_r2, 48, 31, 2.0F, 0.0F, 10.0F, 1, 2, 1, 0.0F, false);
			addBoxHelper(cube_r2, 56, 22, 2.0F, 0.0F, 8.0F, 1, 2, 1, 0.0F, false);
			addBoxHelper(cube_r2, 0, 0, 5.0F, -4.0F, 7.0F, 4, 2, 4, 0.0F, false);
			addBoxHelper(cube_r2, 0, 54, 1.0F, -4.0F, 10.0F, 12, 2, 4, 0.0F, false);
			addBoxHelper(cube_r2, 212, 133, 5.0F, -7.2F, 7.0F, 4, 2, 40, 0.0F, false);
			addBoxHelper(cube_r2, 0, 154, 2.0F, -6.0F, 8.0F, 10, 6, 48, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(-5.0F, -24.0F, -20.0F);
			Head.addChild(cube_r3);
			setRotationAngle(cube_r3, -1.0908F, 0.0F, 0.0F);
			addBoxHelper(cube_r3, 136, 2, -2.0F, -18.0F, -32.0F, 14, 13, 72, 0.0F, false);
			LeftLeg1 = new ModelRenderer(this);
			LeftLeg1.setRotationPoint(18.0F, -66.0F, -22.0F);
			Acklay.addChild(LeftLeg1);
			setRotationAngle(LeftLeg1, 0.0F, 0.4363F, 0.0F);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(8.0F, 16.0F, 28.0F);
			LeftLeg1.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.0F, 0.0F, 0.8727F);
			addBoxHelper(cube_r4, 244, 256, -24.0F, -6.0F, -31.0F, 46, 6, 6, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(36.0F, 20.0F, 28.0F);
			LeftLeg1.addChild(cube_r5);
			setRotationAngle(cube_r5, 0.0F, 0.0F, -0.7854F);
			addBoxHelper(cube_r5, 244, 228, -20.0F, -8.0F, -32.0F, 42, 8, 8, 0.0F, false);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(56.0F, -26.0F, 30.0F);
			LeftLeg1.addChild(cube_r6);
			setRotationAngle(cube_r6, 0.0F, 0.0F, 2.0944F);
			addBoxHelper(cube_r6, 128, 123, 20.0F, -8.0F, -31.0F, 14, 2, 2, 0.0F, false);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(46.0F, -32.0F, 30.0F);
			LeftLeg1.addChild(cube_r7);
			setRotationAngle(cube_r7, 0.0F, 0.0F, 1.789F);
			addBoxHelper(cube_r7, 28, 130, 20.0F, -8.0F, -31.0F, 14, 2, 2, 0.0F, false);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(46.0F, 26.0F, 28.0F);
			LeftLeg1.addChild(cube_r8);
			setRotationAngle(cube_r8, 0.0F, 0.0F, 1.4399F);
			addBoxHelper(cube_r8, 300, 117, -20.0F, 0.0F, -31.0F, 36, 4, 6, 0.0F, false);
			addBoxHelper(cube_r8, 212, 175, -20.0F, -6.0F, -31.0F, 50, 6, 6, 0.0F, false);
			cube_r9 = new ModelRenderer(this);
			cube_r9.setRotationPoint(46.0F, 18.0F, 30.0F);
			LeftLeg1.addChild(cube_r9);
			setRotationAngle(cube_r9, 0.0F, 0.0F, 1.789F);
			addBoxHelper(cube_r9, 128, 132, 20.0F, -8.0F, -31.0F, 14, 2, 2, 0.0F, false);
			cube_r10 = new ModelRenderer(this);
			cube_r10.setRotationPoint(46.0F, 32.0F, 28.0F);
			LeftLeg1.addChild(cube_r10);
			setRotationAngle(cube_r10, 0.0F, 0.0F, 1.5708F);
			addBoxHelper(cube_r10, 144, 0, 20.0F, -9.0F, -30.0F, 10, 4, 4, 0.0F, false);
			cube_r11 = new ModelRenderer(this);
			cube_r11.setRotationPoint(46.0F, 38.0F, 30.0F);
			LeftLeg1.addChild(cube_r11);
			setRotationAngle(cube_r11, 0.0F, 0.0F, 1.5708F);
			addBoxHelper(cube_r11, 0, 134, 20.0F, -8.0F, -31.0F, 10, 2, 2, 0.0F, false);
			LeftLeg2 = new ModelRenderer(this);
			LeftLeg2.setRotationPoint(16.0F, -66.0F, 0.0F);
			Acklay.addChild(LeftLeg2);
			cube_r12 = new ModelRenderer(this);
			cube_r12.setRotationPoint(8.0F, 16.0F, 28.0F);
			LeftLeg2.addChild(cube_r12);
			setRotationAngle(cube_r12, 0.0F, 0.0F, 0.8727F);
			addBoxHelper(cube_r12, 260, 145, -22.0F, -6.0F, -31.0F, 44, 6, 6, 0.0F, false);
			cube_r13 = new ModelRenderer(this);
			cube_r13.setRotationPoint(36.0F, 20.0F, 28.0F);
			LeftLeg2.addChild(cube_r13);
			setRotationAngle(cube_r13, 0.0F, 0.0F, -0.7854F);
			addBoxHelper(cube_r13, 236, 48, -20.0F, -8.0F, -32.0F, 42, 8, 8, 0.0F, false);
			cube_r14 = new ModelRenderer(this);
			cube_r14.setRotationPoint(56.0F, -26.0F, 30.0F);
			LeftLeg2.addChild(cube_r14);
			setRotationAngle(cube_r14, 0.0F, 0.0F, 2.0944F);
			addBoxHelper(cube_r14, 24, 114, 20.0F, -8.0F, -31.0F, 14, 2, 2, 0.0F, false);
			cube_r15 = new ModelRenderer(this);
			cube_r15.setRotationPoint(46.0F, -32.0F, 30.0F);
			LeftLeg2.addChild(cube_r15);
			setRotationAngle(cube_r15, 0.0F, 0.0F, 1.789F);
			addBoxHelper(cube_r15, 28, 118, 20.0F, -8.0F, -31.0F, 14, 2, 2, 0.0F, false);
			cube_r16 = new ModelRenderer(this);
			cube_r16.setRotationPoint(46.0F, 26.0F, 28.0F);
			LeftLeg2.addChild(cube_r16);
			setRotationAngle(cube_r16, 0.0F, 0.0F, 1.4399F);
			addBoxHelper(cube_r16, 300, 97, -20.0F, 0.0F, -31.0F, 36, 4, 6, 0.0F, false);
			addBoxHelper(cube_r16, 68, 166, -20.0F, -6.0F, -31.0F, 50, 6, 6, 0.0F, false);
			cube_r17 = new ModelRenderer(this);
			cube_r17.setRotationPoint(46.0F, 18.0F, 30.0F);
			LeftLeg2.addChild(cube_r17);
			setRotationAngle(cube_r17, 0.0F, 0.0F, 1.789F);
			addBoxHelper(cube_r17, 0, 122, 20.0F, -8.0F, -31.0F, 14, 2, 2, 0.0F, false);
			cube_r18 = new ModelRenderer(this);
			cube_r18.setRotationPoint(46.0F, 32.0F, 28.0F);
			LeftLeg2.addChild(cube_r18);
			setRotationAngle(cube_r18, 0.0F, 0.0F, 1.5708F);
			addBoxHelper(cube_r18, 28, 122, 20.0F, -9.0F, -30.0F, 10, 4, 4, 0.0F, false);
			cube_r19 = new ModelRenderer(this);
			cube_r19.setRotationPoint(46.0F, 38.0F, 30.0F);
			LeftLeg2.addChild(cube_r19);
			setRotationAngle(cube_r19, 0.0F, 0.0F, 1.5708F);
			addBoxHelper(cube_r19, 40, 12, 20.0F, -8.0F, -31.0F, 10, 2, 2, 0.0F, false);
			LeftLeg3 = new ModelRenderer(this);
			LeftLeg3.setRotationPoint(16.0F, -64.0F, 20.0F);
			Acklay.addChild(LeftLeg3);
			setRotationAngle(LeftLeg3, 0.0F, -0.4363F, 0.0F);
			cube_r20 = new ModelRenderer(this);
			cube_r20.setRotationPoint(8.0F, 16.0F, 28.0F);
			LeftLeg3.addChild(cube_r20);
			setRotationAngle(cube_r20, 0.0F, 0.0F, 0.8727F);
			addBoxHelper(cube_r20, 0, 270, -20.0F, -6.0F, -31.0F, 42, 6, 6, 0.0F, false);
			cube_r21 = new ModelRenderer(this);
			cube_r21.setRotationPoint(36.0F, 20.0F, 28.0F);
			LeftLeg3.addChild(cube_r21);
			setRotationAngle(cube_r21, 0.0F, 0.0F, -0.7854F);
			addBoxHelper(cube_r21, 236, 16, -20.0F, -8.0F, -32.0F, 42, 8, 8, 0.0F, false);
			cube_r22 = new ModelRenderer(this);
			cube_r22.setRotationPoint(56.0F, -26.0F, 30.0F);
			LeftLeg3.addChild(cube_r22);
			setRotationAngle(cube_r22, 0.0F, 0.0F, 2.0944F);
			addBoxHelper(cube_r22, 32, 82, 20.0F, -8.0F, -31.0F, 14, 2, 2, 0.0F, false);
			cube_r23 = new ModelRenderer(this);
			cube_r23.setRotationPoint(46.0F, -32.0F, 30.0F);
			LeftLeg3.addChild(cube_r23);
			setRotationAngle(cube_r23, 0.0F, 0.0F, 1.789F);
			addBoxHelper(cube_r23, 32, 88, 20.0F, -8.0F, -31.0F, 14, 2, 2, 0.0F, false);
			cube_r24 = new ModelRenderer(this);
			cube_r24.setRotationPoint(46.0F, 26.0F, 28.0F);
			LeftLeg3.addChild(cube_r24);
			setRotationAngle(cube_r24, 0.0F, 0.0F, 1.4399F);
			addBoxHelper(cube_r24, 0, 296, -20.0F, 0.0F, -31.0F, 36, 4, 6, 0.0F, false);
			addBoxHelper(cube_r24, 128, 99, -20.0F, -6.0F, -31.0F, 50, 6, 6, 0.0F, false);
			cube_r25 = new ModelRenderer(this);
			cube_r25.setRotationPoint(46.0F, 18.0F, 30.0F);
			LeftLeg3.addChild(cube_r25);
			setRotationAngle(cube_r25, 0.0F, 0.0F, 1.789F);
			addBoxHelper(cube_r25, 32, 92, 20.0F, -8.0F, -31.0F, 14, 2, 2, 0.0F, false);
			cube_r26 = new ModelRenderer(this);
			cube_r26.setRotationPoint(46.0F, 32.0F, 28.0F);
			LeftLeg3.addChild(cube_r26);
			setRotationAngle(cube_r26, 0.0F, 0.0F, 1.5708F);
			addBoxHelper(cube_r26, 36, 102, 20.0F, -9.0F, -30.0F, 10, 4, 4, 0.0F, false);
			cube_r27 = new ModelRenderer(this);
			cube_r27.setRotationPoint(46.0F, 38.0F, 30.0F);
			LeftLeg3.addChild(cube_r27);
			setRotationAngle(cube_r27, 0.0F, 0.0F, 1.5708F);
			addBoxHelper(cube_r27, 40, 4, 20.0F, -8.0F, -31.0F, 10, 2, 2, 0.0F, false);
			RightLeg1 = new ModelRenderer(this);
			RightLeg1.setRotationPoint(-18.0F, -66.0F, -22.0F);
			Acklay.addChild(RightLeg1);
			setRotationAngle(RightLeg1, 0.0F, -0.4363F, 0.0F);
			cube_r28 = new ModelRenderer(this);
			cube_r28.setRotationPoint(-8.0F, 16.0F, 28.0F);
			RightLeg1.addChild(cube_r28);
			setRotationAngle(cube_r28, 0.0F, 0.0F, -0.8727F);
			addBoxHelper(cube_r28, 244, 244, -20.0F, -6.0F, -31.0F, 46, 6, 6, 0.0F, false);
			cube_r29 = new ModelRenderer(this);
			cube_r29.setRotationPoint(-36.0F, 20.0F, 28.0F);
			RightLeg1.addChild(cube_r29);
			setRotationAngle(cube_r29, 0.0F, 0.0F, 0.7854F);
			addBoxHelper(cube_r29, 244, 212, -22.0F, -8.0F, -32.0F, 42, 8, 8, 0.0F, false);
			cube_r30 = new ModelRenderer(this);
			cube_r30.setRotationPoint(-56.0F, -26.0F, 30.0F);
			RightLeg1.addChild(cube_r30);
			setRotationAngle(cube_r30, 0.0F, 0.0F, -2.0944F);
			addBoxHelper(cube_r30, 128, 128, -34.0F, -8.0F, -31.0F, 14, 2, 2, 0.0F, false);
			cube_r31 = new ModelRenderer(this);
			cube_r31.setRotationPoint(-46.0F, -32.0F, 30.0F);
			RightLeg1.addChild(cube_r31);
			setRotationAngle(cube_r31, 0.0F, 0.0F, -1.789F);
			addBoxHelper(cube_r31, 128, 115, -34.0F, -8.0F, -31.0F, 14, 2, 2, 0.0F, false);
			cube_r32 = new ModelRenderer(this);
			cube_r32.setRotationPoint(-46.0F, 26.0F, 28.0F);
			RightLeg1.addChild(cube_r32);
			setRotationAngle(cube_r32, 0.0F, 0.0F, -1.4399F);
			addBoxHelper(cube_r32, 300, 107, -16.0F, 0.0F, -31.0F, 36, 4, 6, 0.0F, false);
			addBoxHelper(cube_r32, 68, 178, -30.0F, -6.0F, -31.0F, 50, 6, 6, 0.0F, false);
			cube_r33 = new ModelRenderer(this);
			cube_r33.setRotationPoint(-46.0F, 18.0F, 30.0F);
			RightLeg1.addChild(cube_r33);
			setRotationAngle(cube_r33, 0.0F, 0.0F, -1.789F);
			addBoxHelper(cube_r33, 128, 119, -34.0F, -8.0F, -31.0F, 14, 2, 2, 0.0F, false);
			cube_r34 = new ModelRenderer(this);
			cube_r34.setRotationPoint(-46.0F, 32.0F, 28.0F);
			RightLeg1.addChild(cube_r34);
			setRotationAngle(cube_r34, 0.0F, 0.0F, -1.5708F);
			addBoxHelper(cube_r34, 0, 126, -30.0F, -9.0F, -30.0F, 10, 4, 4, 0.0F, false);
			cube_r35 = new ModelRenderer(this);
			cube_r35.setRotationPoint(-46.0F, 38.0F, 30.0F);
			RightLeg1.addChild(cube_r35);
			setRotationAngle(cube_r35, 0.0F, 0.0F, -1.5708F);
			addBoxHelper(cube_r35, 40, 96, -30.0F, -8.0F, -31.0F, 10, 2, 2, 0.0F, false);
			RightLeg2 = new ModelRenderer(this);
			RightLeg2.setRotationPoint(-16.0F, -66.0F, 0.0F);
			Acklay.addChild(RightLeg2);
			cube_r36 = new ModelRenderer(this);
			cube_r36.setRotationPoint(-8.0F, 16.0F, 28.0F);
			RightLeg2.addChild(cube_r36);
			setRotationAngle(cube_r36, 0.0F, 0.0F, -0.8727F);
			addBoxHelper(cube_r36, 260, 133, -22.0F, -6.0F, -31.0F, 44, 6, 6, 0.0F, false);
			cube_r37 = new ModelRenderer(this);
			cube_r37.setRotationPoint(-36.0F, 20.0F, 28.0F);
			RightLeg2.addChild(cube_r37);
			setRotationAngle(cube_r37, 0.0F, 0.0F, 0.7854F);
			addBoxHelper(cube_r37, 236, 32, -22.0F, -8.0F, -32.0F, 42, 8, 8, 0.0F, false);
			cube_r38 = new ModelRenderer(this);
			cube_r38.setRotationPoint(-56.0F, -26.0F, 30.0F);
			RightLeg2.addChild(cube_r38);
			setRotationAngle(cube_r38, 0.0F, 0.0F, -2.0944F);
			addBoxHelper(cube_r38, 0, 106, -34.0F, -8.0F, -31.0F, 14, 2, 2, 0.0F, false);
			cube_r39 = new ModelRenderer(this);
			cube_r39.setRotationPoint(-46.0F, -32.0F, 30.0F);
			RightLeg2.addChild(cube_r39);
			setRotationAngle(cube_r39, 0.0F, 0.0F, -1.789F);
			addBoxHelper(cube_r39, 0, 110, -34.0F, -8.0F, -31.0F, 14, 2, 2, 0.0F, false);
			cube_r40 = new ModelRenderer(this);
			cube_r40.setRotationPoint(-46.0F, 26.0F, 28.0F);
			RightLeg2.addChild(cube_r40);
			setRotationAngle(cube_r40, 0.0F, 0.0F, -1.4399F);
			addBoxHelper(cube_r40, 300, 87, -16.0F, 0.0F, -31.0F, 36, 4, 6, 0.0F, false);
			addBoxHelper(cube_r40, 68, 154, -30.0F, -6.0F, -31.0F, 50, 6, 6, 0.0F, false);
			cube_r41 = new ModelRenderer(this);
			cube_r41.setRotationPoint(-46.0F, 18.0F, 30.0F);
			RightLeg2.addChild(cube_r41);
			setRotationAngle(cube_r41, 0.0F, 0.0F, -1.789F);
			addBoxHelper(cube_r41, 32, 110, -34.0F, -8.0F, -31.0F, 14, 2, 2, 0.0F, false);
			cube_r42 = new ModelRenderer(this);
			cube_r42.setRotationPoint(-46.0F, 32.0F, 28.0F);
			RightLeg2.addChild(cube_r42);
			setRotationAngle(cube_r42, 0.0F, 0.0F, -1.5708F);
			addBoxHelper(cube_r42, 0, 114, -30.0F, -9.0F, -30.0F, 10, 4, 4, 0.0F, false);
			cube_r43 = new ModelRenderer(this);
			cube_r43.setRotationPoint(-46.0F, 38.0F, 30.0F);
			RightLeg2.addChild(cube_r43);
			setRotationAngle(cube_r43, 0.0F, 0.0F, -1.5708F);
			addBoxHelper(cube_r43, 40, 8, -30.0F, -8.0F, -31.0F, 10, 2, 2, 0.0F, false);
			RightLeg3 = new ModelRenderer(this);
			RightLeg3.setRotationPoint(-16.0F, -64.0F, 20.0F);
			Acklay.addChild(RightLeg3);
			setRotationAngle(RightLeg3, 0.0F, 0.4363F, 0.0F);
			cube_r44 = new ModelRenderer(this);
			cube_r44.setRotationPoint(-8.0F, 16.0F, 28.0F);
			RightLeg3.addChild(cube_r44);
			setRotationAngle(cube_r44, 0.0F, 0.0F, -0.8727F);
			addBoxHelper(cube_r44, 260, 157, -22.0F, -6.0F, -31.0F, 42, 6, 6, 0.0F, false);
			cube_r45 = new ModelRenderer(this);
			cube_r45.setRotationPoint(-36.0F, 20.0F, 28.0F);
			RightLeg3.addChild(cube_r45);
			setRotationAngle(cube_r45, 0.0F, 0.0F, 0.7854F);
			addBoxHelper(cube_r45, 236, 0, -22.0F, -8.0F, -32.0F, 42, 8, 8, 0.0F, false);
			cube_r46 = new ModelRenderer(this);
			cube_r46.setRotationPoint(-56.0F, -26.0F, 30.0F);
			RightLeg3.addChild(cube_r46);
			setRotationAngle(cube_r46, 0.0F, 0.0F, -2.0944F);
			addBoxHelper(cube_r46, 28, 54, -34.0F, -8.0F, -31.0F, 14, 2, 2, 0.0F, false);
			cube_r47 = new ModelRenderer(this);
			cube_r47.setRotationPoint(-46.0F, -32.0F, 30.0F);
			RightLeg3.addChild(cube_r47);
			setRotationAngle(cube_r47, 0.0F, 0.0F, -1.789F);
			addBoxHelper(cube_r47, 30, 58, -34.0F, -8.0F, -31.0F, 14, 2, 2, 0.0F, false);
			cube_r48 = new ModelRenderer(this);
			cube_r48.setRotationPoint(-46.0F, 26.0F, 28.0F);
			RightLeg3.addChild(cube_r48);
			setRotationAngle(cube_r48, 0.0F, 0.0F, -1.4399F);
			addBoxHelper(cube_r48, 0, 286, -16.0F, 0.0F, -31.0F, 36, 4, 6, 0.0F, false);
			addBoxHelper(cube_r48, 128, 87, -30.0F, -6.0F, -31.0F, 50, 6, 6, 0.0F, false);
			cube_r49 = new ModelRenderer(this);
			cube_r49.setRotationPoint(-46.0F, 18.0F, 30.0F);
			RightLeg3.addChild(cube_r49);
			setRotationAngle(cube_r49, 0.0F, 0.0F, -1.789F);
			addBoxHelper(cube_r49, 0, 60, -34.0F, -8.0F, -31.0F, 14, 2, 2, 0.0F, false);
			cube_r50 = new ModelRenderer(this);
			cube_r50.setRotationPoint(-46.0F, 32.0F, 28.0F);
			RightLeg3.addChild(cube_r50);
			setRotationAngle(cube_r50, 0.0F, 0.0F, -1.5708F);
			addBoxHelper(cube_r50, 32, 74, -30.0F, -9.0F, -30.0F, 10, 4, 4, 0.0F, false);
			cube_r51 = new ModelRenderer(this);
			cube_r51.setRotationPoint(-46.0F, 38.0F, 30.0F);
			RightLeg3.addChild(cube_r51);
			setRotationAngle(cube_r51, 0.0F, 0.0F, -1.5708F);
			addBoxHelper(cube_r51, 40, 0, -30.0F, -8.0F, -31.0F, 10, 2, 2, 0.0F, false);
		}

		@Override
		public void render(MatrixStack ms, IVertexBuilder vb, int i1, int i2, float f1, float f2, float f3, float f4) {
			Acklay.render(ms, vb, i1, i2, f1, f2, f3, f4);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.RightLeg1.rotateAngleZ = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.RightLeg3.rotateAngleZ = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.RightLeg2.rotateAngleY = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.LeftLeg2.rotateAngleY = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.LeftLeg1.rotateAngleZ = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.LeftLeg3.rotateAngleZ = MathHelper.cos(f * 1.0F) * -1.0F * f1;
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
