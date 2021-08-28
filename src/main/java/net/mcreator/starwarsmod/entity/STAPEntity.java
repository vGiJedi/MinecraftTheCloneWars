
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
import net.minecraft.pathfinding.FlyingPathNavigator;
import net.minecraft.network.IPacket;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.ai.controller.FlyingMovementController;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.Entity;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.block.BlockState;

import net.mcreator.starwarsmod.itemgroup.VehiclesItemGroup;
import net.mcreator.starwarsmod.StarwarsmodModElements;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@StarwarsmodModElements.ModElement.Tag
public class STAPEntity extends StarwarsmodModElements.ModElement {
	public static EntityType entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new).size(1f, 2.5f))
					.build("stap").setRegistryName("stap");
	public STAPEntity(StarwarsmodModElements instance) {
		super(instance, 432);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@Override
	public void initElements() {
		elements.entities.add(() -> entity);
		elements.items.add(() -> new SpawnEggItem(entity, -10862554, -8890313, new Item.Properties().group(VehiclesItemGroup.tab))
				.setRegistryName("stap_spawn_egg"));
	}

	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public void registerModels(ModelRegistryEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(entity, renderManager -> {
			return new MobRenderer(renderManager, new ModelSTAP(), 0.5f) {
				@Override
				public ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("starwarsmod:textures/stap.png");
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
			return super.getMountedYOffset() + -0.5;
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
		public boolean processInteract(PlayerEntity sourceentity, Hand hand) {
			ItemStack itemstack = sourceentity.getHeldItem(hand);
			boolean retval = true;
			super.processInteract(sourceentity, hand);
			sourceentity.startRiding(this);
			return retval;
		}

		@Override
		protected void registerAttributes() {
			super.registerAttributes();
			if (this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED) != null)
				this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(1);
			if (this.getAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
				this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(150);
			if (this.getAttribute(SharedMonsterAttributes.ARMOR) != null)
				this.getAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0);
			if (this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) == null)
				this.getAttributes().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
			this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(0);
			if (this.getAttribute(SharedMonsterAttributes.FLYING_SPEED) == null)
				this.getAttributes().registerAttribute(SharedMonsterAttributes.FLYING_SPEED);
			this.getAttribute(SharedMonsterAttributes.FLYING_SPEED).setBaseValue(1);
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
	public static class ModelSTAP extends EntityModel {
		private final ModelRenderer STAP;
		private final ModelRenderer cube_r9_r1;
		private final ModelRenderer cube_r8_r1;
		private final ModelRenderer cube_r7_r1;
		private final ModelRenderer cube_r6_r1;
		private final ModelRenderer cube_r5_r1;
		private final ModelRenderer cube_r4_r1;
		private final ModelRenderer cube_r3_r1;
		private final ModelRenderer cube_r2_r1;
		private final ModelRenderer cube_r1_r1;
		public ModelSTAP() {
			textureWidth = 64;
			textureHeight = 64;
			STAP = new ModelRenderer(this);
			STAP.setRotationPoint(0.0F, 24.0F, -5.0F);
			addBoxHelper(STAP, 0, 0, -2.0F, -31.5F, -11.0F, 4, 3, 10, 0.0F, false);
			addBoxHelper(STAP, 31, 32, 1.0F, -30.5F, -1.0F, 1, 2, 1, 0.0F, false);
			addBoxHelper(STAP, 12, 26, -2.0F, -30.5F, -1.0F, 1, 2, 1, 0.0F, false);
			addBoxHelper(STAP, 18, 3, -0.5F, -31.75F, -10.75F, 1, 3, 10, 0.0F, false);
			addBoxHelper(STAP, 0, 13, -1.5F, -31.0F, -12.0F, 3, 3, 10, 0.0F, false);
			addBoxHelper(STAP, 18, 19, -1.5F, -32.0F, -10.0F, 3, 3, 8, 0.0F, false);
			addBoxHelper(STAP, 35, 40, -5.0F, -31.25F, -8.0F, 3, 3, 5, 0.0F, false);
			addBoxHelper(STAP, 44, 15, 2.0F, -31.25F, -7.0F, 3, 3, 4, 0.0F, false);
			addBoxHelper(STAP, 42, 27, 2.5F, -30.75F, -12.0F, 2, 2, 5, 0.0F, false);
			addBoxHelper(STAP, 39, 5, 3.0F, -30.25F, -19.0F, 1, 1, 7, 0.0F, false);
			addBoxHelper(STAP, 19, 38, -4.0F, -30.25F, -19.0F, 1, 1, 7, 0.0F, false);
			addBoxHelper(STAP, 0, 40, -4.5F, -30.75F, -12.0F, 2, 2, 5, 0.0F, false);
			cube_r9_r1 = new ModelRenderer(this);
			cube_r9_r1.setRotationPoint(0.0F, 1.9276F, 2.5982F);
			STAP.addChild(cube_r9_r1);
			setRotationAngle(cube_r9_r1, -0.2182F, 0.0F, 0.0F);
			addBoxHelper(cube_r9_r1, 18, 46, 3.25F, -13.0F, -10.0F, 2, 1, 5, 0.0F, false);
			addBoxHelper(cube_r9_r1, 9, 45, -5.25F, -13.0F, -10.0F, 2, 1, 5, 0.0F, false);
			cube_r8_r1 = new ModelRenderer(this);
			cube_r8_r1.setRotationPoint(0.0F, 3.0656F, -10.412F);
			STAP.addChild(cube_r8_r1);
			setRotationAngle(cube_r8_r1, -1.1781F, 0.0F, 0.0F);
			addBoxHelper(cube_r8_r1, 0, 47, -0.5F, -14.5F, -29.0F, 1, 1, 5, 0.0F, false);
			addBoxHelper(cube_r8_r1, 9, 51, -0.5F, -14.5F, -24.0F, 1, 3, 3, 0.0F, false);
			cube_r7_r1 = new ModelRenderer(this);
			cube_r7_r1.setRotationPoint(1.6196F, 0.0F, 6.2287F);
			STAP.addChild(cube_r7_r1);
			setRotationAngle(cube_r7_r1, 0.0F, -0.6545F, 0.0F);
			addBoxHelper(cube_r7_r1, 0, 8, -5.0F, -30.5F, -7.0F, 4, 1, 1, 0.0F, false);
			cube_r6_r1 = new ModelRenderer(this);
			cube_r6_r1.setRotationPoint(-5.8649F, 0.0625F, 8.0F);
			STAP.addChild(cube_r6_r1);
			setRotationAngle(cube_r6_r1, 0.0F, -1.5708F, -0.0436F);
			addBoxHelper(cube_r6_r1, 18, 2, -8.0F, -29.5F, -12.0F, 1, 3, 1, 0.0F, false);
			cube_r5_r1 = new ModelRenderer(this);
			cube_r5_r1.setRotationPoint(5.8649F, 0.0625F, 8.0F);
			STAP.addChild(cube_r5_r1);
			setRotationAngle(cube_r5_r1, 0.0F, 1.5708F, 0.0436F);
			addBoxHelper(cube_r5_r1, 24, 2, 7.0F, -29.5F, -12.0F, 1, 3, 1, 0.0F, false);
			cube_r4_r1 = new ModelRenderer(this);
			cube_r4_r1.setRotationPoint(-1.6196F, 0.0F, 6.2287F);
			STAP.addChild(cube_r4_r1);
			setRotationAngle(cube_r4_r1, 0.0F, 0.6545F, 0.0F);
			addBoxHelper(cube_r4_r1, 18, 7, 1.0F, -30.5F, -7.0F, 4, 1, 1, 0.0F, false);
			cube_r3_r1 = new ModelRenderer(this);
			cube_r3_r1.setRotationPoint(0.0F, 6.1603F, -2.0096F);
			STAP.addChild(cube_r3_r1);
			setRotationAngle(cube_r3_r1, -0.5236F, 0.0F, 0.0F);
			addBoxHelper(cube_r3_r1, 45, 52, 0.25F, -23.0F, -20.5F, 1, 2, 3, 0.0F, false);
			addBoxHelper(cube_r3_r1, 20, 37, 0.25F, -27.0F, -18.5F, 1, 4, 1, 0.0F, false);
			addBoxHelper(cube_r3_r1, 32, 19, -1.25F, -27.0F, -18.5F, 1, 4, 1, 0.0F, false);
			addBoxHelper(cube_r3_r1, 30, 4, 0.25F, -27.0F, -20.5F, 1, 4, 1, 0.0F, false);
			addBoxHelper(cube_r3_r1, 16, 30, -1.25F, -27.0F, -20.5F, 1, 4, 1, 0.0F, false);
			addBoxHelper(cube_r3_r1, 51, 22, 0.25F, -30.0F, -20.5F, 1, 3, 3, 0.0F, false);
			addBoxHelper(cube_r3_r1, 29, 51, -1.25F, -30.0F, -20.5F, 1, 3, 3, 0.0F, false);
			addBoxHelper(cube_r3_r1, 17, 52, -1.25F, -23.0F, -20.5F, 1, 2, 3, 0.0F, false);
			cube_r2_r1 = new ModelRenderer(this);
			cube_r2_r1.setRotationPoint(0.0F, -0.8985F, 5.5722F);
			STAP.addChild(cube_r2_r1);
			setRotationAngle(cube_r2_r1, 0.0873F, 0.0F, 0.0F);
			addBoxHelper(cube_r2_r1, 27, 46, 3.5F, -20.25F, -12.5F, 1, 1, 4, 0.0F, false);
			addBoxHelper(cube_r2_r1, 18, 2, -4.5F, -20.25F, -12.5F, 1, 1, 4, 0.0F, false);
			cube_r1_r1 = new ModelRenderer(this);
			cube_r1_r1.setRotationPoint(0.0F, -0.91F, 5.8338F);
			STAP.addChild(cube_r1_r1);
			setRotationAngle(cube_r1_r1, 0.0873F, 0.0F, 0.0F);
			addBoxHelper(cube_r1_r1, 51, 41, -1.0F, -6.0F, -10.0F, 2, 4, 2, 0.0F, false);
			addBoxHelper(cube_r1_r1, 0, 26, -0.5F, -5.0F, -11.0F, 1, 2, 1, 0.0F, false);
			addBoxHelper(cube_r1_r1, 0, 53, -1.0F, -8.0F, -12.0F, 2, 3, 2, 0.0F, false);
			addBoxHelper(cube_r1_r1, 28, 40, -1.5F, -10.0F, -13.0F, 3, 2, 3, 0.0F, false);
			addBoxHelper(cube_r1_r1, 10, 37, 3.0F, -22.0F, -13.5F, 2, 2, 6, 0.0F, false);
			addBoxHelper(cube_r1_r1, 32, 19, -5.0F, -22.0F, -13.5F, 2, 2, 6, 0.0F, false);
			addBoxHelper(cube_r1_r1, 47, 47, 2.75F, -21.5F, -12.5F, 3, 1, 4, 0.0F, false);
			addBoxHelper(cube_r1_r1, 48, 5, 3.5F, -22.75F, -12.5F, 1, 1, 4, 0.0F, false);
			addBoxHelper(cube_r1_r1, 48, 0, -4.5F, -22.75F, -12.5F, 1, 1, 4, 0.0F, false);
			addBoxHelper(cube_r1_r1, 46, 36, -5.75F, -21.5F, -12.5F, 3, 1, 4, 0.0F, false);
			addBoxHelper(cube_r1_r1, 31, 32, -5.5F, -22.5F, -13.0F, 3, 3, 5, 0.0F, false);
			addBoxHelper(cube_r1_r1, 30, 4, 2.5F, -22.5F, -13.0F, 3, 3, 5, 0.0F, false);
			addBoxHelper(cube_r1_r1, 16, 19, -1.0F, -23.0F, -12.5F, 2, 2, 2, 0.0F, false);
			addBoxHelper(cube_r1_r1, 16, 30, -2.5F, -22.0F, -14.0F, 5, 2, 5, 0.0F, false);
			addBoxHelper(cube_r1_r1, 41, 48, -0.5F, -21.5F, -9.75F, 1, 10, 1, 0.0F, false);
			addBoxHelper(cube_r1_r1, 37, 48, -0.5F, -21.5F, -13.5F, 1, 10, 1, 0.0F, false);
			addBoxHelper(cube_r1_r1, 25, 52, -0.5F, -25.5F, -14.5F, 1, 7, 1, 0.0F, false);
			addBoxHelper(cube_r1_r1, 40, 13, -1.0F, -24.0F, -14.25F, 2, 1, 2, 0.0F, false);
			addBoxHelper(cube_r1_r1, 0, 13, -1.0F, -20.0F, -13.75F, 2, 6, 2, 0.0F, false);
			addBoxHelper(cube_r1_r1, 0, 0, -1.5F, -23.0F, -14.25F, 3, 6, 2, 0.0F, false);
			addBoxHelper(cube_r1_r1, 16, 16, -7.0F, -12.0F, -9.0F, 14, 1, 2, 0.0F, false);
			addBoxHelper(cube_r1_r1, 18, 0, -7.0F, -12.0F, -10.0F, 14, 1, 1, 0.0F, false);
			addBoxHelper(cube_r1_r1, 30, 2, -5.0F, -12.0F, -11.0F, 10, 1, 1, 0.0F, false);
			addBoxHelper(cube_r1_r1, 31, 30, -3.0F, -12.0F, -12.0F, 6, 1, 1, 0.0F, false);
			addBoxHelper(cube_r1_r1, 0, 26, -2.0F, -20.0F, -13.0F, 4, 10, 4, 0.0F, false);
			addBoxHelper(cube_r1_r1, 6, 13, -0.5F, -6.25F, -9.5F, 1, 1, 1, 0.0F, false);
		}

		@Override
		public void render(MatrixStack ms, IVertexBuilder vb, int i1, int i2, float f1, float f2, float f3, float f4) {
			STAP.render(ms, vb, i1, i2, f1, f2, f3, f4);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
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
