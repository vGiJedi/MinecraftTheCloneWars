
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
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Hand;
import net.minecraft.util.DamageSource;
import net.minecraft.network.IPacket;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.projectile.PotionEntity;
import net.minecraft.entity.player.PlayerEntity;
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

import net.mcreator.starwarsmod.itemgroup.StarWarsWeaponsItemGroup;
import net.mcreator.starwarsmod.StarwarsmodModElements;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@StarwarsmodModElements.ModElement.Tag
public class EWHB12Entity extends StarwarsmodModElements.ModElement {
	public static EntityType entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new).immuneToFire()
			.size(2f, 1f)).build("ewhb_12").setRegistryName("ewhb_12");
	public EWHB12Entity(StarwarsmodModElements instance) {
		super(instance, 325);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@Override
	public void initElements() {
		elements.entities.add(() -> entity);
		elements.items.add(() -> new SpawnEggItem(entity, -16777216, -10066330, new Item.Properties().group(StarWarsWeaponsItemGroup.tab))
				.setRegistryName("ewhb_12_spawn_egg"));
	}

	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public void registerModels(ModelRegistryEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(entity, renderManager -> {
			return new MobRenderer(renderManager, new ModelEWHB_12(), 0.5f) {
				@Override
				public ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("starwarsmod:textures/ewhb-12.png");
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
			setNoAI(true);
			enablePersistence();
		}

		@Override
		public IPacket<?> createSpawnPacket() {
			return NetworkHooks.getEntitySpawningPacket(this);
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
			return super.getMountedYOffset() + 0.5;
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
			if (source.getImmediateSource() instanceof PotionEntity)
				return false;
			if (source == DamageSource.CACTUS)
				return false;
			if (source == DamageSource.DROWN)
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
				this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0);
			if (this.getAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
				this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(200);
			if (this.getAttribute(SharedMonsterAttributes.ARMOR) != null)
				this.getAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0);
			if (this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) == null)
				this.getAttributes().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
			this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(0);
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
	// Exported for Minecraft version 1.14
	// Paste this class into your mod and generate all required imports
	public static class ModelEWHB_12 extends EntityModel {
		private final ModelRenderer EWB_10;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		public ModelEWHB_12() {
			textureWidth = 128;
			textureHeight = 128;
			EWB_10 = new ModelRenderer(this);
			EWB_10.setRotationPoint(0.0F, 24.0F, 0.0F);
			addBoxHelper(EWB_10, 0, 68, -5.5F, -13.0F, 3.5F, 1, 2, 1, 0.0F, false);
			addBoxHelper(EWB_10, 11, 66, -5.0F, -14.5F, -5.0F, 10, 3, 10, 0.0F, false);
			addBoxHelper(EWB_10, 59, 68, -2.0F, -13.0F, -2.0F, 4, 4, 4, 0.0F, false);
			addBoxHelper(EWB_10, 80, 68, -0.5F, -9.0F, -0.5F, 1, 9, 1, 0.0F, false);
			addBoxHelper(EWB_10, 50, 65, 28.5F, -7.0F, -0.5F, 1, 6, 1, 0.0F, false);
			addBoxHelper(EWB_10, 45, 60, 28.5F, -8.0F, 4.5F, 1, 1, 1, 0.0F, false);
			addBoxHelper(EWB_10, 9, 68, 22.5F, -7.75F, 6.5F, 1, 1, 1, 0.0F, false);
			addBoxHelper(EWB_10, 88, 70, 28.5F, -8.0F, -0.5F, 1, 1, 1, 0.0F, false);
			addBoxHelper(EWB_10, 87, 65, 28.0F, -7.0F, 4.0F, 2, 1, 2, 0.0F, false);
			addBoxHelper(EWB_10, 98, 67, 22.0F, -7.5F, 6.0F, 2, 2, 2, 0.0F, false);
			addBoxHelper(EWB_10, 89, 76, 20.0F, -6.0F, 1.0F, 12, 2, 8, 0.0F, false);
			addBoxHelper(EWB_10, 89, 52, 20.0F, -2.0F, 1.0F, 12, 2, 8, 0.0F, false);
			addBoxHelper(EWB_10, 58, 49, 21.0F, -4.0F, 2.0F, 10, 2, 6, 0.0F, false);
			addBoxHelper(EWB_10, 40, 48, 28.5F, -9.0F, -0.5F, 1, 1, 6, 0.0F, false);
			addBoxHelper(EWB_10, 0, 42, 0.5F, -1.0F, -0.5F, 29, 1, 1, 0.0F, false);
			addBoxHelper(EWB_10, 0, 48, -4.5F, -14.75F, -4.5F, 9, 1, 9, 0.0F, false);
			addBoxHelper(EWB_10, 105, 29, -4.0F, -23.25F, -4.0F, 1, 10, 8, 0.0F, false);
			addBoxHelper(EWB_10, 79, 28, -6.0F, -24.75F, -4.5F, 2, 5, 9, 0.0F, false);
			addBoxHelper(EWB_10, 51, 22, 4.0F, -24.75F, -4.5F, 2, 5, 9, 0.0F, true);
			addBoxHelper(EWB_10, 111, 16, -6.0F, -26.75F, -4.5F, 2, 2, 7, 0.0F, false);
			addBoxHelper(EWB_10, 87, 17, 4.0F, -26.75F, -4.5F, 2, 2, 7, 0.0F, true);
			addBoxHelper(EWB_10, 67, 7, 3.0F, -23.25F, -4.0F, 1, 10, 8, 0.0F, true);
			addBoxHelper(EWB_10, 80, 8, -3.0F, -22.75F, -2.0F, 6, 2, 2, 0.0F, true);
			addBoxHelper(EWB_10, 81, 89, -2.0F, -23.75F, -10.5F, 4, 4, 20, 0.0F, true);
			addBoxHelper(EWB_10, 116, 0, -0.5F, -24.75F, 2.5F, 1, 4, 1, 0.0F, true);
			addBoxHelper(EWB_10, 50, 82, -0.5F, -24.75F, -2.5F, 1, 4, 1, 0.0F, true);
			addBoxHelper(EWB_10, 54, 93, -0.5F, -25.75F, -4.5F, 1, 1, 10, 0.0F, true);
			addBoxHelper(EWB_10, 0, 107, -4.0F, -25.75F, 8.5F, 8, 7, 6, 0.0F, true);
			addBoxHelper(EWB_10, 33, 113, -4.0F, -25.75F, 14.5F, 2, 7, 1, 0.0F, true);
			addBoxHelper(EWB_10, 42, 109, -4.5F, -22.5F, 14.5F, 1, 1, 4, 0.0F, true);
			addBoxHelper(EWB_10, 54, 107, 3.5F, -22.5F, 14.5F, 1, 1, 4, 0.0F, false);
			addBoxHelper(EWB_10, 67, 107, -4.5F, -19.5F, 14.5F, 1, 1, 4, 0.0F, true);
			addBoxHelper(EWB_10, 42, 117, 3.5F, -19.5F, 14.5F, 1, 1, 4, 0.0F, false);
			addBoxHelper(EWB_10, 55, 118, -4.5F, -21.5F, 17.5F, 1, 2, 1, 0.0F, true);
			addBoxHelper(EWB_10, 63, 115, 3.5F, -21.5F, 17.5F, 1, 2, 1, 0.0F, false);
			addBoxHelper(EWB_10, 70, 117, 2.0F, -25.75F, 14.5F, 2, 7, 1, 0.0F, false);
			addBoxHelper(EWB_10, 79, 117, -3.0F, -26.0F, 14.5F, 6, 2, 2, 0.0F, false);
			addBoxHelper(EWB_10, 98, 117, -2.5F, -24.25F, -15.25F, 5, 5, 1, 0.0F, true);
			addBoxHelper(EWB_10, 112, 117, -2.0F, -23.755F, -14.75F, 4, 4, 1, 0.0F, true);
			addBoxHelper(EWB_10, 0, 81, -1.0F, -22.75F, -23.5F, 2, 2, 21, 0.0F, true);
			addBoxHelper(EWB_10, 34, 87, -0.5F, -22.25F, -24.5F, 1, 1, 3, 0.0F, true);
			addBoxHelper(EWB_10, 60, 82, -1.5F, -23.25F, -21.5F, 3, 3, 1, 0.0F, true);
			addBoxHelper(EWB_10, 72, 90, 5.5F, -13.0F, -4.5F, 1, 2, 1, 0.0F, true);
			addBoxHelper(EWB_10, 84, 91, 5.5F, -13.0F, 3.5F, 1, 2, 1, 0.0F, true);
			addBoxHelper(EWB_10, 116, 96, -6.5F, -13.0F, -4.5F, 1, 2, 1, 0.0F, false);
			addBoxHelper(EWB_10, 105, 0, -6.5F, -13.0F, 3.5F, 1, 2, 1, 0.0F, false);
			addBoxHelper(EWB_10, 89, 98, 6.5F, -14.5F, -5.0F, 1, 5, 2, 0.0F, true);
			addBoxHelper(EWB_10, 50, 90, -7.5F, -14.5F, -5.0F, 1, 5, 2, 0.0F, false);
			addBoxHelper(EWB_10, 60, 0, 6.5F, -14.5F, 3.0F, 1, 5, 2, 0.0F, true);
			addBoxHelper(EWB_10, 0, 91, -7.5F, -14.5F, 3.0F, 1, 5, 2, 0.0F, false);
			addBoxHelper(EWB_10, 31, 95, -18.5F, -0.75F, 3.0F, 4, 1, 2, 0.0F, false);
			addBoxHelper(EWB_10, 31, 95, 14.5F, -0.75F, 3.0F, 4, 1, 2, 0.0F, true);
			addBoxHelper(EWB_10, 31, 95, -18.5F, -0.75F, -5.0F, 4, 1, 2, 0.0F, false);
			addBoxHelper(EWB_10, 31, 95, 14.5F, -0.75F, -5.0F, 4, 1, 2, 0.0F, true);
			addBoxHelper(EWB_10, 96, 47, 4.5F, -13.0F, -4.5F, 1, 2, 1, 0.0F, true);
			addBoxHelper(EWB_10, 36, 34, 4.5F, -13.0F, 3.5F, 1, 2, 1, 0.0F, true);
			addBoxHelper(EWB_10, 83, 125, -4.5F, -12.0F, -4.5F, 9, 1, 1, 0.0F, true);
			addBoxHelper(EWB_10, 105, 125, -4.5F, -12.0F, 3.5F, 9, 1, 1, 0.0F, true);
			addBoxHelper(EWB_10, 0, 81, -5.5F, -13.0F, -4.5F, 1, 2, 1, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(-9.0F, -6.5F, 6.0F);
			EWB_10.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0F, 0.0F, -0.829F);
			addBoxHelper(cube_r1, 60, 126, -9.551F, -1.9525F, -2.5F, 14, 1, 1, 0.0F, false);
			addBoxHelper(cube_r1, 42, 14, -9.551F, -1.9525F, -10.5F, 14, 1, 1, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(9.0F, -6.5F, 6.0F);
			EWB_10.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.0F, 0.0F, 0.829F);
			addBoxHelper(cube_r2, 35, 126, -4.449F, -1.9525F, -2.5F, 14, 1, 1, 0.0F, true);
			addBoxHelper(cube_r2, 0, 61, -4.449F, -1.9525F, -10.5F, 14, 1, 1, 0.0F, true);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(-9.0F, -9.5F, 6.0F);
			EWB_10.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.0F, 0.0F, -0.9163F);
			addBoxHelper(cube_r3, 0, 126, -12.3266F, -1.685F, -2.5F, 17, 1, 1, 0.0F, false);
			addBoxHelper(cube_r3, 0, 31, -12.3266F, -1.685F, -10.5F, 17, 1, 1, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(9.0F, -9.5F, 6.0F);
			EWB_10.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.0F, 0.0F, 0.9163F);
			addBoxHelper(cube_r4, 0, 1, -4.6734F, -1.685F, -2.5F, 17, 1, 1, 0.0F, true);
			addBoxHelper(cube_r4, 0, 36, -4.6734F, -1.685F, -10.5F, 17, 1, 1, 0.0F, true);
		}

		@Override
		public void render(MatrixStack ms, IVertexBuilder vb, int i1, int i2, float f1, float f2, float f3, float f4) {
			EWB_10.render(ms, vb, i1, i2, f1, f2, f3, f4);
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
