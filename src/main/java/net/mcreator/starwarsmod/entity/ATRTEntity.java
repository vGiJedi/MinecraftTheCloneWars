
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
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Hand;
import net.minecraft.util.DamageSource;
import net.minecraft.network.IPacket;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.ai.goal.RangedAttackGoal;
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

import net.mcreator.starwarsmod.procedures.ATRTRightClickedOnEntityProcedure;
import net.mcreator.starwarsmod.itemgroup.VehiclesItemGroup;
import net.mcreator.starwarsmod.item.DC15Item;
import net.mcreator.starwarsmod.StarwarsmodModElements;

import java.util.Map;
import java.util.HashMap;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@StarwarsmodModElements.ModElement.Tag
public class ATRTEntity extends StarwarsmodModElements.ModElement {
	public static EntityType entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new).size(2.4f, 4f))
					.build("atrt").setRegistryName("atrt");
	public ATRTEntity(StarwarsmodModElements instance) {
		super(instance, 368);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@Override
	public void initElements() {
		elements.entities.add(() -> entity);
		elements.items.add(() -> new SpawnEggItem(entity, -10066330, -10092544, new Item.Properties().group(VehiclesItemGroup.tab))
				.setRegistryName("atrt_spawn_egg"));
	}

	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public void registerModels(ModelRegistryEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(entity, renderManager -> {
			return new MobRenderer(renderManager, new Modelatrt115(), 0.5f) {
				@Override
				public ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("starwarsmod:textures/atrt.png");
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
		public double getMountedYOffset() {
			return super.getMountedYOffset() + 0.7;
		}

		@Override
		public void playStepSound(BlockPos pos, BlockState blockIn) {
			this.playSound((net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("starwarsmod:atrtstep")), 0.15f,
					1);
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
		public boolean attackEntityFrom(DamageSource source, float amount) {
			if (source == DamageSource.FALL)
				return false;
			return super.attackEntityFrom(source, amount);
		}

		@Override
		public boolean processInteract(PlayerEntity sourceentity, Hand hand) {
			ItemStack itemstack = sourceentity.getHeldItem(hand);
			boolean retval = true;
			super.processInteract(sourceentity, hand);
			sourceentity.startRiding(this);
			double x = this.getPosX();
			double y = this.getPosY();
			double z = this.getPosZ();
			Entity entity = this;
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				ATRTRightClickedOnEntityProcedure.executeProcedure($_dependencies);
			}
			return retval;
		}

		@Override
		protected void registerAttributes() {
			super.registerAttributes();
			if (this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED) != null)
				this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.125);
			if (this.getAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
				this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(300);
			if (this.getAttribute(SharedMonsterAttributes.ARMOR) != null)
				this.getAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0);
			if (this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) == null)
				this.getAttributes().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
			this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(3);
		}

		public void attackEntityWithRangedAttack(LivingEntity target, float flval) {
			DC15Item.shoot(this, target);
		}

		@Override
		public void travel(Vec3d dir) {
			Entity entity = this.getPassengers().isEmpty() ? null : (Entity) this.getPassengers().get(0);
			if (this.isBeingRidden()) {
				this.rotationYaw = entity.rotationYaw;
				this.prevRotationYaw = this.rotationYaw;
				this.rotationPitch = entity.rotationPitch * 0.5F;
				this.setRotation(this.rotationYaw, this.rotationPitch);
				this.jumpMovementFactor = this.getAIMoveSpeed() * 0.15F;
				this.renderYawOffset = entity.rotationYaw;
				this.rotationYawHead = entity.rotationYaw;
				this.stepHeight = 1.0F;
				if (entity instanceof LivingEntity) {
					this.setAIMoveSpeed((float) this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getValue());
					float forward = ((LivingEntity) entity).moveForward;
					float strafe = ((LivingEntity) entity).moveStrafing;
					super.travel(new Vec3d(strafe, 0, forward));
				}
				this.prevLimbSwingAmount = this.limbSwingAmount;
				double d1 = this.getPosX() - this.prevPosX;
				double d0 = this.getPosZ() - this.prevPosZ;
				float f1 = MathHelper.sqrt(d1 * d1 + d0 * d0) * 4.0F;
				if (f1 > 1.0F)
					f1 = 1.0F;
				this.limbSwingAmount += (f1 - this.limbSwingAmount) * 0.4F;
				this.limbSwing += this.limbSwingAmount;
				return;
			}
			this.stepHeight = 0.5F;
			this.jumpMovementFactor = 0.02F;
			super.travel(dir);
		}
	}

	// Made with Blockbench 3.7.4
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class Modelatrt115 extends EntityModel<Entity> {
		private final ModelRenderer AT_RT;
		private final ModelRenderer RightLeg;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		private final ModelRenderer LeftLeg;
		private final ModelRenderer cube_r5;
		private final ModelRenderer cube_r6;
		private final ModelRenderer cube_r7;
		private final ModelRenderer cube_r8;
		private final ModelRenderer MainChasis;
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
		private final ModelRenderer cube_r19;
		private final ModelRenderer cube_r20;
		public Modelatrt115() {
			textureWidth = 256;
			textureHeight = 256;
			AT_RT = new ModelRenderer(this);
			AT_RT.setRotationPoint(0.0F, 24.0F, 0.0F);
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(-15.0F, -49.5F, -4.5F);
			AT_RT.addChild(RightLeg);
			RightLeg.setTextureOffset(120, 106).addBox(-3.0F, 1.0F, 17.0F, 5.0F, 4.0F, 4.0F, 0.0F, false);
			RightLeg.setTextureOffset(107, 76).addBox(-2.0F, -3.5F, -3.5F, 3.0F, 7.0F, 7.0F, 0.0F, false);
			RightLeg.setTextureOffset(107, 17).addBox(-2.0F, -0.5F, 15.5F, 3.0F, 7.0F, 7.0F, 0.0F, false);
			RightLeg.setTextureOffset(16, 120).addBox(-2.0F, 23.5F, 24.5F, 3.0F, 6.0F, 6.0F, 0.0F, false);
			RightLeg.setTextureOffset(125, 27).addBox(-2.0F, 46.5F, 16.5F, 3.0F, 3.0F, 4.0F, 0.0F, false);
			RightLeg.setTextureOffset(73, 41).addBox(-2.0F, 47.5F, 12.5F, 3.0F, 2.0F, 4.0F, 0.0F, false);
			RightLeg.setTextureOffset(125, 0).addBox(-3.0F, 48.5F, 12.5F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			RightLeg.setTextureOffset(124, 39).addBox(1.0F, 48.5F, 12.5F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			RightLeg.setTextureOffset(115, 119).addBox(-4.0F, 48.5F, 12.5F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			RightLeg.setTextureOffset(112, 49).addBox(2.0F, 48.5F, 12.5F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			RightLeg.setTextureOffset(44, 13).addBox(-5.0F, 48.5F, 12.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			RightLeg.setTextureOffset(30, 35).addBox(3.0F, 48.5F, 12.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			RightLeg.setTextureOffset(50, 48).addBox(-4.5F, 48.5F, 11.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(50, 46).addBox(1.5F, 48.5F, 11.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(74, 87).addBox(-5.0F, 48.5F, 10.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(26, 75).addBox(1.0F, 48.5F, 10.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(74, 83).addBox(-4.0F, 48.5F, 8.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			RightLeg.setTextureOffset(44, 82).addBox(1.0F, 48.5F, 8.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			RightLeg.setTextureOffset(75, 55).addBox(-2.0F, 46.5F, 12.5F, 3.0F, 1.0F, 2.0F, 0.0F, false);
			RightLeg.setTextureOffset(6, 42).addBox(-1.0F, 48.5F, 7.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			RightLeg.setTextureOffset(38, 75).addBox(-2.5F, 47.0F, 17.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(56, 73).addBox(-2.5F, 46.75F, 13.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(120, 10).addBox(-1.25F, -2.5F, -2.5F, 3.0F, 5.0F, 5.0F, 0.0F, false);
			RightLeg.setTextureOffset(56, 78).addBox(-2.75F, -2.5F, -2.5F, 3.0F, 5.0F, 5.0F, 0.0F, false);
			RightLeg.setTextureOffset(110, 10).addBox(-0.5F, 0.5F, 10.0F, 2.0F, 3.0F, 3.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(-2.0F, 49.5F, 2.5F);
			RightLeg.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.5672F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(15, 82).addBox(0.5F, 3.2127F, 6.6566F, 2.0F, 1.0F, 4.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(-1.0F, 47.5F, 16.5F);
			RightLeg.addChild(cube_r2);
			setRotationAngle(cube_r2, 1.1781F, 0.0F, 0.0F);
			cube_r2.setTextureOffset(83, 119).addBox(-0.25F, 1.5F, 12.0F, 2.0F, 2.0F, 8.0F, 0.0F, false);
			cube_r2.setTextureOffset(118, 118).addBox(-0.75F, 1.5761F, 11.6173F, 2.0F, 2.0F, 8.0F, 0.0F, false);
			cube_r2.setTextureOffset(75, 33).addBox(-0.5F, 1.0761F, 0.6173F, 2.0F, 3.0F, 14.0F, 0.0F, false);
			cube_r2.setTextureOffset(69, 99).addBox(-0.5F, 0.5761F, 14.6173F, 2.0F, 4.0F, 9.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(-1.0F, 2.5F, 16.5F);
			RightLeg.addChild(cube_r3);
			setRotationAngle(cube_r3, -1.1781F, 0.0F, 0.0F);
			cube_r3.setTextureOffset(60, 0).addBox(0.0F, -2.0F, 6.0F, 2.0F, 1.0F, 16.0F, 0.0F, false);
			cube_r3.setTextureOffset(59, 59).addBox(-1.0F, -2.0F, 6.0F, 2.0F, 1.0F, 16.0F, 0.0F, false);
			cube_r3.setTextureOffset(20, 26).addBox(-0.5F, -3.5F, 9.0F, 2.0F, 4.0F, 16.0F, 0.0F, false);
			cube_r3.setTextureOffset(56, 94).addBox(-0.5F, -4.0F, 0.0F, 2.0F, 5.0F, 9.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(-1.0F, 2.5F, 2.5F);
			RightLeg.addChild(cube_r4);
			setRotationAngle(cube_r4, -0.1309F, 0.0F, 0.0F);
			cube_r4.setTextureOffset(97, 97).addBox(0.0F, -2.0F, 2.0F, 2.0F, 1.0F, 10.0F, 0.0F, false);
			cube_r4.setTextureOffset(96, 6).addBox(-1.0F, -2.0F, 2.0F, 2.0F, 1.0F, 10.0F, 0.0F, false);
			cube_r4.setTextureOffset(0, 42).addBox(-0.5F, -4.0F, 0.0F, 2.0F, 5.0F, 15.0F, 0.0F, false);
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(15.0F, -49.5F, -4.5F);
			AT_RT.addChild(LeftLeg);
			LeftLeg.setTextureOffset(95, 119).addBox(-2.0F, 1.0F, 17.0F, 5.0F, 4.0F, 4.0F, 0.0F, false);
			LeftLeg.setTextureOffset(84, 105).addBox(-1.0F, -3.5F, -3.5F, 3.0F, 7.0F, 7.0F, 0.0F, false);
			LeftLeg.setTextureOffset(39, 105).addBox(-1.0F, -0.5F, 15.5F, 3.0F, 7.0F, 7.0F, 0.0F, false);
			LeftLeg.setTextureOffset(38, 119).addBox(-1.0F, 23.5F, 24.5F, 3.0F, 6.0F, 6.0F, 0.0F, false);
			LeftLeg.setTextureOffset(63, 112).addBox(-1.0F, 46.5F, 16.5F, 3.0F, 3.0F, 4.0F, 0.0F, false);
			LeftLeg.setTextureOffset(0, 72).addBox(-1.0F, 47.5F, 12.5F, 3.0F, 2.0F, 4.0F, 0.0F, false);
			LeftLeg.setTextureOffset(99, 17).addBox(2.0F, 48.5F, 12.5F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			LeftLeg.setTextureOffset(73, 33).addBox(-2.0F, 48.5F, 12.5F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			LeftLeg.setTextureOffset(17, 110).addBox(3.0F, 48.5F, 12.5F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			LeftLeg.setTextureOffset(41, 100).addBox(-3.0F, 48.5F, 12.5F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			LeftLeg.setTextureOffset(10, 35).addBox(4.0F, 48.5F, 12.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			LeftLeg.setTextureOffset(12, 3).addBox(-4.0F, 48.5F, 12.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			LeftLeg.setTextureOffset(50, 50).addBox(2.5F, 48.5F, 11.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			LeftLeg.setTextureOffset(38, 50).addBox(-3.5F, 48.5F, 11.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			LeftLeg.setTextureOffset(73, 23).addBox(2.0F, 48.5F, 10.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			LeftLeg.setTextureOffset(66, 73).addBox(-4.0F, 48.5F, 10.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			LeftLeg.setTextureOffset(23, 82).addBox(2.0F, 48.5F, 8.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			LeftLeg.setTextureOffset(81, 36).addBox(-3.0F, 48.5F, 8.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			LeftLeg.setTextureOffset(18, 75).addBox(-1.0F, 46.5F, 12.5F, 3.0F, 1.0F, 2.0F, 0.0F, false);
			LeftLeg.setTextureOffset(32, 22).addBox(0.0F, 48.5F, 7.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			LeftLeg.setTextureOffset(44, 63).addBox(-1.5F, 47.0F, 17.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			LeftLeg.setTextureOffset(40, 40).addBox(-1.5F, 46.75F, 13.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			LeftLeg.setTextureOffset(38, 65).addBox(-1.75F, -2.5F, -2.5F, 3.0F, 5.0F, 5.0F, 0.0F, false);
			LeftLeg.setTextureOffset(18, 65).addBox(-0.25F, -2.5F, -2.5F, 3.0F, 5.0F, 5.0F, 0.0F, false);
			LeftLeg.setTextureOffset(0, 84).addBox(-1.5F, 0.5F, 9.0F, 2.0F, 3.0F, 3.0F, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(2.0F, 49.5F, 2.5F);
			LeftLeg.addChild(cube_r5);
			setRotationAngle(cube_r5, 0.5672F, 0.0F, 0.0F);
			cube_r5.setTextureOffset(0, 79).addBox(-2.5F, 3.2127F, 6.6566F, 2.0F, 1.0F, 4.0F, 0.0F, false);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(1.0F, 47.5F, 16.5F);
			LeftLeg.addChild(cube_r6);
			setRotationAngle(cube_r6, 1.1781F, 0.0F, 0.0F);
			cube_r6.setTextureOffset(112, 39).addBox(-1.75F, 1.5F, 12.0F, 2.0F, 2.0F, 8.0F, 0.0F, false);
			cube_r6.setTextureOffset(71, 112).addBox(-1.25F, 1.5761F, 11.6173F, 2.0F, 2.0F, 8.0F, 0.0F, false);
			cube_r6.setTextureOffset(20, 65).addBox(-1.5F, 1.0761F, 0.6173F, 2.0F, 3.0F, 14.0F, 0.0F, false);
			cube_r6.setTextureOffset(0, 97).addBox(-1.5F, 0.5761F, 14.6173F, 2.0F, 4.0F, 9.0F, 0.0F, false);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(1.0F, 2.5F, 16.5F);
			LeftLeg.addChild(cube_r7);
			setRotationAngle(cube_r7, -1.1781F, 0.0F, 0.0F);
			cube_r7.setTextureOffset(53, 24).addBox(-2.0F, -2.0F, 6.0F, 2.0F, 1.0F, 16.0F, 0.0F, false);
			cube_r7.setTextureOffset(18, 46).addBox(-1.0F, -2.0F, 6.0F, 2.0F, 1.0F, 16.0F, 0.0F, false);
			cube_r7.setTextureOffset(0, 22).addBox(-1.5F, -3.5F, 9.0F, 2.0F, 4.0F, 16.0F, 0.0F, false);
			cube_r7.setTextureOffset(60, 41).addBox(-1.5F, -4.0F, 0.0F, 2.0F, 5.0F, 9.0F, 0.0F, false);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(1.0F, 2.5F, 2.5F);
			LeftLeg.addChild(cube_r8);
			setRotationAngle(cube_r8, -0.1309F, 0.0F, 0.0F);
			cube_r8.setTextureOffset(74, 76).addBox(-2.0F, -2.0F, 2.0F, 2.0F, 1.0F, 10.0F, 0.0F, false);
			cube_r8.setTextureOffset(45, 0).addBox(-1.0F, -2.0F, 2.0F, 2.0F, 1.0F, 10.0F, 0.0F, false);
			cube_r8.setTextureOffset(41, 41).addBox(-1.5F, -4.0F, 0.0F, 2.0F, 5.0F, 15.0F, 0.0F, false);
			MainChasis = new ModelRenderer(this);
			MainChasis.setRotationPoint(0.0F, 0.0F, 0.0F);
			AT_RT.addChild(MainChasis);
			MainChasis.setTextureOffset(13, 97).addBox(11.25F, -51.5F, -6.5F, 3.0F, 4.0F, 4.0F, 0.0F, false);
			MainChasis.setTextureOffset(19, 46).addBox(-14.25F, -51.5F, -6.5F, 3.0F, 4.0F, 4.0F, 0.0F, false);
			MainChasis.setTextureOffset(0, 62).addBox(9.25F, -52.0F, -7.0F, 3.0F, 5.0F, 5.0F, 0.0F, false);
			MainChasis.setTextureOffset(59, 0).addBox(-12.25F, -52.0F, -7.0F, 3.0F, 5.0F, 5.0F, 0.0F, false);
			MainChasis.setTextureOffset(56, 61).addBox(7.25F, -52.5F, -7.5F, 3.0F, 6.0F, 6.0F, 0.0F, false);
			MainChasis.setTextureOffset(0, 0).addBox(-10.25F, -52.5F, -7.5F, 3.0F, 6.0F, 6.0F, 0.0F, false);
			MainChasis.setTextureOffset(93, 33).addBox(4.25F, -53.0F, -8.0F, 4.0F, 7.0F, 7.0F, 0.0F, false);
			MainChasis.setTextureOffset(88, 69).addBox(-8.25F, -53.0F, -8.0F, 4.0F, 7.0F, 7.0F, 0.0F, false);
			MainChasis.setTextureOffset(73, 17).addBox(-4.5F, -53.5F, -8.5F, 9.0F, 8.0F, 8.0F, 0.0F, false);
			MainChasis.setTextureOffset(22, 100).addBox(-3.5F, -62.0F, -0.5F, 7.0F, 5.0F, 5.0F, 0.0F, false);
			MainChasis.setTextureOffset(0, 0).addBox(-3.0F, -65.0F, -2.5F, 6.0F, 3.0F, 19.0F, 0.0F, false);
			MainChasis.setTextureOffset(103, 69).addBox(-4.0F, -65.25F, 10.5F, 8.0F, 3.0F, 4.0F, 0.0F, false);
			MainChasis.setTextureOffset(79, 50).addBox(-3.0F, -64.0F, -14.5F, 6.0F, 8.0F, 8.0F, 0.0F, false);
			MainChasis.setTextureOffset(18, 63).addBox(-6.0F, -58.0F, -12.5F, 12.0F, 1.0F, 1.0F, 0.0F, false);
			MainChasis.setTextureOffset(69, 94).addBox(4.0F, -57.5F, -11.5F, 3.0F, 1.0F, 4.0F, 0.0F, false);
			MainChasis.setTextureOffset(80, 0).addBox(7.0F, -59.5F, -11.5F, 1.0F, 5.0F, 3.0F, 0.0F, false);
			MainChasis.setTextureOffset(60, 41).addBox(-8.0F, -59.5F, -11.5F, 1.0F, 5.0F, 3.0F, 0.0F, false);
			MainChasis.setTextureOffset(60, 17).addBox(-7.0F, -57.5F, -11.5F, 3.0F, 1.0F, 4.0F, 0.0F, false);
			MainChasis.setTextureOffset(0, 110).addBox(-3.0F, -70.0F, -14.5F, 6.0F, 6.0F, 5.0F, 0.0F, false);
			MainChasis.setTextureOffset(95, 0).addBox(-3.5F, -66.0F, -13.5F, 7.0F, 3.0F, 3.0F, 0.0F, false);
			MainChasis.setTextureOffset(28, 82).addBox(-3.0F, -70.0F, -18.5F, 6.0F, 14.0F, 4.0F, 0.0F, false);
			MainChasis.setTextureOffset(45, 0).addBox(-1.0F, -65.0F, -21.5F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			MainChasis.setTextureOffset(31, 6).addBox(-1.5F, -55.0F, -22.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			MainChasis.setTextureOffset(31, 0).addBox(-1.0F, -54.5F, -24.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);
			MainChasis.setTextureOffset(122, 96).addBox(-1.0F, -54.5F, -40.0F, 2.0F, 2.0F, 6.0F, 0.0F, false);
			MainChasis.setTextureOffset(0, 0).addBox(-0.5F, -57.0F, -21.5F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			MainChasis.setTextureOffset(111, 96).addBox(-0.5F, -54.0F, -19.5F, 1.0F, 1.0F, 9.0F, 0.0F, false);
			MainChasis.setTextureOffset(12, 0).addBox(-0.5F, -53.0F, -15.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			MainChasis.setTextureOffset(10, 12).addBox(-1.0F, -53.5F, -11.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			MainChasis.setTextureOffset(0, 62).addBox(-0.5F, -52.0F, -26.5F, 1.0F, 1.0F, 16.0F, 0.0F, false);
			MainChasis.setTextureOffset(38, 61).addBox(-0.5F, -54.0F, -38.5F, 1.0F, 1.0F, 16.0F, 0.0F, false);
			MainChasis.setTextureOffset(19, 54).addBox(-3.0F, -68.0F, -19.5F, 6.0F, 2.0F, 1.0F, 0.0F, false);
			MainChasis.setTextureOffset(31, 0).addBox(3.0F, -64.0F, -2.5F, 1.0F, 1.0F, 12.0F, 0.0F, false);
			MainChasis.setTextureOffset(31, 0).addBox(-4.0F, -64.0F, -2.5F, 1.0F, 1.0F, 12.0F, 0.0F, true);
			MainChasis.setTextureOffset(31, 13).addBox(-2.5F, -70.25F, 16.55F, 5.0F, 1.0F, 3.0F, 0.0F, false);
			MainChasis.setTextureOffset(81, 33).addBox(-1.0F, -70.5F, 17.05F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			MainChasis.setTextureOffset(52, 78).addBox(-0.5F, -103.0F, 17.55F, 1.0F, 33.0F, 1.0F, 0.0F, false);
			MainChasis.setTextureOffset(15, 87).addBox(1.7F, -70.0F, 16.55F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			MainChasis.setTextureOffset(70, 18).addBox(-2.7F, -70.0F, 16.55F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			MainChasis.setTextureOffset(108, 31).addBox(-2.5F, -66.0F, 4.5F, 5.0F, 1.0F, 7.0F, 0.0F, false);
			MainChasis.setTextureOffset(60, 11).addBox(-2.5F, -68.0F, 11.5F, 5.0F, 3.0F, 2.0F, 0.0F, false);
			MainChasis.setTextureOffset(107, 90).addBox(-4.5F, -61.0F, 0.5F, 9.0F, 3.0F, 3.0F, 0.0F, false);
			MainChasis.setTextureOffset(121, 49).addBox(-1.5F, -61.0F, 2.5F, 3.0F, 3.0F, 5.0F, 0.0F, false);
			MainChasis.setTextureOffset(0, 12).addBox(-1.5F, -61.0F, 9.5F, 3.0F, 3.0F, 4.0F, 0.0F, false);
			MainChasis.setTextureOffset(31, 17).addBox(-2.5F, -60.75F, 6.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			MainChasis.setTextureOffset(0, 79).addBox(2.5F, -60.75F, 5.0F, 1.0F, 5.0F, 13.0F, 0.0F, false);
			MainChasis.setTextureOffset(59, 76).addBox(-3.5F, -60.75F, 5.0F, 1.0F, 5.0F, 13.0F, 0.0F, false);
			MainChasis.setTextureOffset(0, 14).addBox(2.5F, -56.75F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			MainChasis.setTextureOffset(0, 12).addBox(-3.5F, -56.75F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			MainChasis.setTextureOffset(51, 111).addBox(-1.0F, -60.5F, 6.5F, 2.0F, 2.0F, 8.0F, 0.0F, false);
			cube_r9 = new ModelRenderer(this);
			cube_r9.setRotationPoint(1.75F, -60.0F, 28.0F);
			MainChasis.addChild(cube_r9);
			setRotationAngle(cube_r9, -0.6545F, 0.0F, 0.0F);
			cube_r9.setTextureOffset(110, 0).addBox(-3.75F, 2.6F, -16.5F, 4.0F, 3.0F, 7.0F, 0.0F, false);
			cube_r10 = new ModelRenderer(this);
			cube_r10.setRotationPoint(1.75F, -65.0F, -5.0F);
			MainChasis.addChild(cube_r10);
			setRotationAngle(cube_r10, 0.3491F, 0.0F, 0.0F);
			cube_r10.setTextureOffset(111, 57).addBox(-3.75F, 3.0F, 9.5F, 4.0F, 2.0F, 7.0F, 0.0F, false);
			cube_r11 = new ModelRenderer(this);
			cube_r11.setRotationPoint(-2.75F, -53.0F, 2.0F);
			MainChasis.addChild(cube_r11);
			setRotationAngle(cube_r11, 0.9599F, 0.0F, 0.0F);
			cube_r11.setTextureOffset(120, 69).addBox(0.0F, 2.0F, 15.5F, 1.0F, 2.0F, 7.0F, 0.0F, false);
			cube_r11.setTextureOffset(79, 66).addBox(4.5F, 2.0F, 15.5F, 1.0F, 2.0F, 7.0F, 0.0F, false);
			cube_r12 = new ModelRenderer(this);
			cube_r12.setRotationPoint(1.25F, -80.0F, -27.0F);
			MainChasis.addChild(cube_r12);
			setRotationAngle(cube_r12, -0.1745F, 0.0F, 0.0F);
			cube_r12.setTextureOffset(74, 76).addBox(-2.75F, 1.0F, 16.25F, 3.0F, 5.0F, 2.0F, 0.0F, false);
			cube_r13 = new ModelRenderer(this);
			cube_r13.setRotationPoint(3.25F, -83.0F, -30.0F);
			MainChasis.addChild(cube_r13);
			setRotationAngle(cube_r13, -0.1745F, 0.0F, 0.0F);
			cube_r14 = new ModelRenderer(this);
			cube_r14.setRotationPoint(-3.25F, -54.0F, -36.0F);
			MainChasis.addChild(cube_r14);
			setRotationAngle(cube_r14, 0.1745F, 0.0F, 0.0F);
			cube_r14.setTextureOffset(72, 122).addBox(-0.25F, -9.0F, 16.25F, 1.0F, 10.0F, 4.0F, 0.0F, false);
			cube_r14.setTextureOffset(0, 42).addBox(5.75F, -9.0F, 16.25F, 1.0F, 10.0F, 4.0F, 0.0F, false);
			cube_r15 = new ModelRenderer(this);
			cube_r15.setRotationPoint(3.75F, -78.0F, -33.0F);
			MainChasis.addChild(cube_r15);
			setRotationAngle(cube_r15, -0.5672F, 0.0F, 0.0F);
			cube_r15.setTextureOffset(87, 87).addBox(-7.75F, -9.0F, 16.25F, 8.0F, 14.0F, 2.0F, 0.0F, false);
			cube_r16 = new ModelRenderer(this);
			cube_r16.setRotationPoint(12.25F, -62.0F, -31.0F);
			MainChasis.addChild(cube_r16);
			setRotationAngle(cube_r16, 0.0F, -0.6109F, 0.0F);
			cube_r16.setTextureOffset(108, 31).addBox(3.75F, -3.0F, 16.5F, 2.0F, 6.0F, 1.0F, 0.0F, false);
			cube_r16.setTextureOffset(0, 97).addBox(3.75F, -9.0F, 16.5F, 3.0F, 6.0F, 1.0F, 0.0F, false);
			cube_r16.setTextureOffset(20, 22).addBox(-1.25F, -9.0F, 16.5F, 5.0F, 14.0F, 1.0F, 0.0F, false);
			cube_r17 = new ModelRenderer(this);
			cube_r17.setRotationPoint(-12.25F, -62.0F, -31.0F);
			MainChasis.addChild(cube_r17);
			setRotationAngle(cube_r17, 0.0F, 0.6109F, 0.0F);
			cube_r17.setTextureOffset(93, 33).addBox(-5.75F, -3.0F, 16.5F, 2.0F, 6.0F, 1.0F, 0.0F, false);
			cube_r17.setTextureOffset(56, 94).addBox(-6.75F, -9.0F, 16.5F, 3.0F, 6.0F, 1.0F, 0.0F, false);
			cube_r17.setTextureOffset(0, 22).addBox(-3.75F, -9.0F, 16.5F, 5.0F, 14.0F, 1.0F, 0.0F, false);
			cube_r18 = new ModelRenderer(this);
			cube_r18.setRotationPoint(0.75F, -51.0F, -19.0F);
			MainChasis.addChild(cube_r18);
			setRotationAngle(cube_r18, 0.7854F, 0.0F, 0.0F);
			cube_r18.setTextureOffset(22, 110).addBox(-1.75F, -0.5F, 13.25F, 2.0F, 1.0F, 9.0F, 0.0F, false);
			cube_r18.setTextureOffset(99, 47).addBox(-1.75F, -1.75F, 13.25F, 2.0F, 1.0F, 9.0F, 0.0F, false);
			cube_r18.setTextureOffset(98, 57).addBox(-1.75F, -5.0F, 13.25F, 2.0F, 3.0F, 9.0F, 0.0F, false);
			cube_r18.setTextureOffset(80, 0).addBox(-2.25F, -6.0F, 13.0F, 3.0F, 7.0F, 9.0F, 0.0F, false);
			cube_r18.setTextureOffset(41, 13).addBox(-3.25F, -13.0F, 12.5F, 5.0F, 18.0F, 9.0F, 0.0F, false);
			cube_r18.setTextureOffset(88, 66).addBox(-3.75F, -4.0F, 18.5F, 1.0F, 5.0F, 2.0F, 0.0F, false);
			cube_r18.setTextureOffset(79, 66).addBox(1.25F, -4.0F, 18.5F, 1.0F, 5.0F, 2.0F, 0.0F, false);
			cube_r19 = new ModelRenderer(this);
			cube_r19.setRotationPoint(2.75F, -70.0F, -25.0F);
			MainChasis.addChild(cube_r19);
			setRotationAngle(cube_r19, 0.1745F, 0.0F, 0.0F);
			cube_r19.setTextureOffset(38, 48).addBox(0.25F, 0.0F, 21.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r19.setTextureOffset(38, 46).addBox(-7.75F, 0.0F, 21.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r19.setTextureOffset(106, 121).addBox(0.75F, 0.0F, 14.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
			cube_r19.setTextureOffset(56, 121).addBox(-7.25F, 0.0F, 14.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
			cube_r19.setTextureOffset(43, 17).addBox(-0.25F, 0.0F, 13.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r19.setTextureOffset(0, 4).addBox(-7.25F, 0.0F, 13.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r20 = new ModelRenderer(this);
			cube_r20.setRotationPoint(1.75F, -53.0F, -5.0F);
			MainChasis.addChild(cube_r20);
			setRotationAngle(cube_r20, 0.9599F, 0.0F, 0.0F);
			cube_r20.setTextureOffset(0, 121).addBox(-3.75F, 0.0F, 4.5F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			cube_r20.setTextureOffset(38, 46).addBox(-3.25F, 0.5F, -1.5F, 3.0F, 3.0F, 6.0F, 0.0F, false);
			cube_r20.setTextureOffset(104, 108).addBox(-4.25F, -0.5F, -2.5F, 5.0F, 5.0F, 6.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			AT_RT.render(matrixStack, buffer, packedLight, packedOverlay);
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
}
