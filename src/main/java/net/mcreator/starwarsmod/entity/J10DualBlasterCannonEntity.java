
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
public class J10DualBlasterCannonEntity extends StarwarsmodModElements.ModElement {
	public static EntityType entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new).immuneToFire()
			.size(2f, 1f)).build("j_10_dual_blaster_cannon").setRegistryName("j_10_dual_blaster_cannon");
	public J10DualBlasterCannonEntity(StarwarsmodModElements instance) {
		super(instance, 414);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@Override
	public void initElements() {
		elements.entities.add(() -> entity);
		elements.items.add(() -> new SpawnEggItem(entity, -11711155, -7105645, new Item.Properties().group(StarWarsWeaponsItemGroup.tab))
				.setRegistryName("j_10_dual_blaster_cannon_spawn_egg"));
	}

	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public void registerModels(ModelRegistryEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(entity, renderManager -> {
			return new MobRenderer(renderManager, new ModelJ_10DualBlasterCannon115(), 0.5f) {
				@Override
				public ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("starwarsmod:textures/j-10dualblastercannon.png");
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
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class ModelJ_10DualBlasterCannon115 extends EntityModel<Entity> {
		private final ModelRenderer J_10DualBlasterCannon;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		private final ModelRenderer cube_r5;
		public ModelJ_10DualBlasterCannon115() {
			textureWidth = 128;
			textureHeight = 128;
			J_10DualBlasterCannon = new ModelRenderer(this);
			J_10DualBlasterCannon.setRotationPoint(0.0F, 24.0F, 0.0F);
			J_10DualBlasterCannon.setTextureOffset(0, 28).addBox(-1.5F, -21.0F, 2.5F, 3.0F, 7.0F, 3.0F, 0.0F, false);
			J_10DualBlasterCannon.setTextureOffset(31, 31).addBox(-1.5F, -21.0F, 5.5F, 3.0F, 1.0F, 4.0F, 0.0F, false);
			J_10DualBlasterCannon.setTextureOffset(60, 0).addBox(-5.0F, -20.75F, -10.0F, 4.0F, 4.0F, 20.0F, 0.0F, false);
			J_10DualBlasterCannon.setTextureOffset(13, 3).addBox(-1.0F, -23.75F, -12.5F, 2.0F, 2.0F, 3.0F, 0.0F, false);
			J_10DualBlasterCannon.setTextureOffset(11, 11).addBox(-1.0F, -23.75F, 3.5F, 2.0F, 3.0F, 5.0F, 0.0F, false);
			J_10DualBlasterCannon.setTextureOffset(60, 30).addBox(-0.5F, -23.25F, -10.5F, 1.0F, 1.0F, 21.0F, 0.0F, false);
			J_10DualBlasterCannon.setTextureOffset(11, 12).addBox(-0.5F, -23.25F, -12.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			J_10DualBlasterCannon.setTextureOffset(54, 58).addBox(1.0F, -20.75F, -10.0F, 4.0F, 4.0F, 20.0F, 0.0F, false);
			J_10DualBlasterCannon.setTextureOffset(31, 0).addBox(5.0F, -19.25F, 6.0F, 4.0F, 1.0F, 3.0F, 0.0F, false);
			J_10DualBlasterCannon.setTextureOffset(0, 6).addBox(2.0F, -19.75F, 5.5F, 4.0F, 2.0F, 4.0F, 0.0F, false);
			J_10DualBlasterCannon.setTextureOffset(0, 0).addBox(-6.0F, -19.75F, 5.5F, 4.0F, 2.0F, 4.0F, 0.0F, false);
			J_10DualBlasterCannon.setTextureOffset(0, 12).addBox(-9.0F, -19.25F, 6.0F, 4.0F, 1.0F, 3.0F, 0.0F, false);
			J_10DualBlasterCannon.setTextureOffset(0, 28).addBox(1.5F, -20.25F, -10.5F, 3.0F, 3.0F, 25.0F, 0.0F, false);
			J_10DualBlasterCannon.setTextureOffset(31, 10).addBox(2.5F, -17.25F, 13.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			J_10DualBlasterCannon.setTextureOffset(0, 6).addBox(2.5F, -17.25F, 10.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			J_10DualBlasterCannon.setTextureOffset(0, 0).addBox(-3.5F, -17.25F, 10.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			J_10DualBlasterCannon.setTextureOffset(31, 16).addBox(2.5F, -14.25F, 10.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			J_10DualBlasterCannon.setTextureOffset(10, 22).addBox(-3.5F, -14.25F, 10.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			J_10DualBlasterCannon.setTextureOffset(31, 4).addBox(-3.5F, -17.25F, 13.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			J_10DualBlasterCannon.setTextureOffset(0, 0).addBox(-4.5F, -20.25F, -10.5F, 3.0F, 3.0F, 25.0F, 0.0F, false);
			J_10DualBlasterCannon.setTextureOffset(31, 3).addBox(-4.0F, -19.75F, -13.5F, 2.0F, 2.0F, 25.0F, 0.0F, false);
			J_10DualBlasterCannon.setTextureOffset(27, 58).addBox(-3.5F, -19.25F, -14.5F, 1.0F, 1.0F, 25.0F, 0.0F, false);
			J_10DualBlasterCannon.setTextureOffset(0, 56).addBox(2.5F, -19.25F, -14.5F, 1.0F, 1.0F, 25.0F, 0.0F, false);
			J_10DualBlasterCannon.setTextureOffset(31, 31).addBox(2.0F, -19.75F, -13.5F, 2.0F, 2.0F, 25.0F, 0.0F, false);
			J_10DualBlasterCannon.setTextureOffset(0, 19).addBox(-3.5F, -16.75F, 3.0F, 7.0F, 1.0F, 2.0F, 0.0F, false);
			J_10DualBlasterCannon.setTextureOffset(15, 19).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);
			J_10DualBlasterCannon.setTextureOffset(0, 22).addBox(-4.5F, -1.0F, 3.5F, 3.0F, 1.0F, 2.0F, 0.0F, false);
			J_10DualBlasterCannon.setTextureOffset(0, 16).addBox(1.5F, -1.0F, 3.5F, 3.0F, 1.0F, 2.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(-2.5F, 0.0F, 9.5F);
			J_10DualBlasterCannon.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0F, 0.0F, 0.1745F);
			cube_r1.setTextureOffset(16, 28).addBox(-0.75F, -16.0F, -5.5F, 1.0F, 16.0F, 1.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.5F, -6.0F, 2.0F);
			J_10DualBlasterCannon.addChild(cube_r2);
			setRotationAngle(cube_r2, 1.309F, 0.0F, 0.0F);
			cube_r2.setTextureOffset(0, 82).addBox(-1.0F, -1.0F, -6.0F, 1.0F, 1.0F, 16.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(-0.5F, -22.0F, 3.0F);
			J_10DualBlasterCannon.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.0F, 0.0F, -0.9163F);
			cube_r3.setTextureOffset(12, 0).addBox(-3.5F, -0.75F, -15.25F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(0.5F, -22.0F, 3.0F);
			J_10DualBlasterCannon.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.0F, 0.0F, 0.9163F);
			cube_r4.setTextureOffset(12, 8).addBox(-1.5F, -0.75F, -15.25F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(2.5F, 0.0F, 9.5F);
			J_10DualBlasterCannon.addChild(cube_r5);
			setRotationAngle(cube_r5, 0.0F, 0.0F, -0.1745F);
			cube_r5.setTextureOffset(12, 28).addBox(-0.25F, -16.0F, -5.5F, 1.0F, 16.0F, 1.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			J_10DualBlasterCannon.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
		}
	}
}
