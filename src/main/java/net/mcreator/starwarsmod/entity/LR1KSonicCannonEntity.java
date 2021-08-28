
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
public class LR1KSonicCannonEntity extends StarwarsmodModElements.ModElement {
	public static EntityType entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new).immuneToFire()
			.size(3f, 2f)).build("lr_1_k_sonic_cannon").setRegistryName("lr_1_k_sonic_cannon");
	public LR1KSonicCannonEntity(StarwarsmodModElements instance) {
		super(instance, 412);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@Override
	public void initElements() {
		elements.entities.add(() -> entity);
		elements.items.add(() -> new SpawnEggItem(entity, -11848412, -7248315, new Item.Properties().group(StarWarsWeaponsItemGroup.tab))
				.setRegistryName("lr_1_k_sonic_cannon_spawn_egg"));
	}

	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public void registerModels(ModelRegistryEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(entity, renderManager -> {
			return new MobRenderer(renderManager, new ModelLR1K_Sonic_Cannon115(), 0.5f) {
				@Override
				public ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("starwarsmod:textures/lr1k_sonic_cannon.png");
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
			return super.getMountedYOffset() + 1;
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
	public static class ModelLR1K_Sonic_Cannon115 extends EntityModel<Entity> {
		private final ModelRenderer LR1KSonicCannon;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		private final ModelRenderer cube_r5_r1;
		private final ModelRenderer cube_r5;
		public ModelLR1K_Sonic_Cannon115() {
			textureWidth = 512;
			textureHeight = 512;
			LR1KSonicCannon = new ModelRenderer(this);
			LR1KSonicCannon.setRotationPoint(0.0F, 2.0F, 20.0F);
			LR1KSonicCannon.setTextureOffset(172, 212).addBox(-7.0F, -26.0F, -90.5F, 14.0F, 14.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(172, 192).addBox(-8.0F, -27.0F, -68.0F, 16.0F, 16.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(98, 164).addBox(-10.0F, -29.0F, -66.0F, 20.0F, 20.0F, 4.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(152, 24).addBox(-11.0F, -30.0F, -62.0F, 22.0F, 22.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(136, 136).addBox(-13.0F, -32.0F, -60.0F, 26.0F, 26.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(164, 48).addBox(-13.0F, -34.0F, -62.0F, 26.0F, 2.0F, 4.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(122, 76).addBox(-17.0F, -36.0F, -60.0F, 34.0F, 2.0F, 6.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(102, 68).addBox(-17.0F, -38.0F, -54.0F, 34.0F, 2.0F, 6.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(68, 112).addBox(-14.0F, -32.0F, -48.0F, 28.0F, 22.0F, 6.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(46, 74).addBox(-10.0F, -29.0F, -46.0F, 20.0F, 20.0F, 8.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(0, 110).addBox(-7.0F, -26.0F, -40.0F, 14.0F, 14.0F, 20.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(0, 144).addBox(-5.0F, -12.0F, -38.0F, 10.0F, 10.0F, 16.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(98, 152).addBox(-6.0F, -6.0F, -36.0F, 12.0F, 6.0F, 6.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(212, 92).addBox(-24.0F, -5.0F, -36.0F, 10.0F, 6.0F, 6.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(208, 54).addBox(14.0F, -5.0F, -36.0F, 10.0F, 6.0F, 6.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(182, 120).addBox(-8.0F, -4.0F, -26.0F, 16.0F, 6.0F, 6.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(0, 66).addBox(-25.0F, -4.0F, -35.0F, 50.0F, 4.0F, 4.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(194, 84).addBox(-9.0F, -3.0F, -25.0F, 18.0F, 4.0F, 4.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(80, 36).addBox(-15.0F, -2.0F, -38.0F, 30.0F, 6.0F, 12.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(54, 140).addBox(-23.0F, -6.0F, -40.0F, 8.0F, 24.0F, 14.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(76, 76).addBox(-25.0F, 16.0F, -42.0F, 8.0F, 6.0F, 30.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(0, 74).addBox(17.0F, 16.0F, -42.0F, 8.0F, 6.0F, 30.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(236, 196).addBox(-23.0F, 16.0F, -12.0F, 10.0F, 6.0F, 4.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(236, 186).addBox(13.0F, 16.0F, -12.0F, 10.0F, 6.0F, 4.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(234, 66).addBox(-23.0F, 16.0F, -46.0F, 10.0F, 6.0F, 4.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(192, 234).addBox(13.0F, 16.0F, -46.0F, 10.0F, 6.0F, 4.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(232, 138).addBox(-21.0F, 16.0F, -50.0F, 10.0F, 6.0F, 4.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(232, 128).addBox(11.0F, 16.0F, -50.0F, 10.0F, 6.0F, 4.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(230, 172).addBox(-21.0F, 16.0F, -8.0F, 10.0F, 6.0F, 4.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(228, 210).addBox(11.0F, 16.0F, -8.0F, 10.0F, 6.0F, 4.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(226, 118).addBox(-19.0F, 16.0F, -4.0F, 10.0F, 6.0F, 4.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(90, 188).addBox(-9.0F, 16.0F, -2.0F, 18.0F, 6.0F, 4.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(36, 144).addBox(9.0F, 16.0F, -4.0F, 10.0F, 6.0F, 4.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(138, 98).addBox(15.0F, -6.0F, -40.0F, 8.0F, 24.0F, 14.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(0, 210).addBox(-21.0F, -2.0F, -44.0F, 8.0F, 20.0F, 4.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(208, 132).addBox(13.0F, -2.0F, -44.0F, 8.0F, 20.0F, 4.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(82, 0).addBox(-19.0F, 4.0F, -48.0F, 6.0F, 14.0F, 4.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(0, 0).addBox(13.0F, 4.0F, -48.0F, 6.0F, 14.0F, 4.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(48, 110).addBox(-17.0F, 10.0F, -52.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(0, 110).addBox(13.0F, 10.0F, -52.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(104, 198).addBox(-23.0F, -4.0F, -26.0F, 8.0F, 22.0F, 4.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(0, 74).addBox(15.0F, -4.0F, -26.0F, 8.0F, 22.0F, 4.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(212, 188).addBox(-23.0F, 0.0F, -22.0F, 8.0F, 18.0F, 4.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(204, 212).addBox(15.0F, 0.0F, -22.0F, 8.0F, 18.0F, 4.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(220, 36).addBox(-23.0F, 6.0F, -18.0F, 10.0F, 12.0F, 4.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(218, 16).addBox(13.0F, 6.0F, -18.0F, 10.0F, 12.0F, 4.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(228, 228).addBox(-17.0F, 6.0F, -10.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(168, 228).addBox(9.0F, 6.0F, -10.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(108, 228).addBox(-13.0F, 6.0F, -6.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(182, 104).addBox(-5.0F, 6.0F, -6.0F, 18.0F, 12.0F, 4.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(216, 156).addBox(-21.0F, 6.0F, -14.0F, 10.0F, 12.0F, 4.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(216, 0).addBox(11.0F, 6.0F, -14.0F, 10.0F, 12.0F, 4.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(0, 0).addBox(-15.0F, 2.0F, -26.0F, 30.0F, 2.0F, 22.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(154, 54).addBox(-13.0F, 2.0F, -4.0F, 26.0F, 2.0F, 4.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(122, 94).addBox(-11.0F, 2.0F, 0.0F, 22.0F, 2.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(122, 98).addBox(-6.0F, 0.0F, 2.0F, 12.0F, 4.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(80, 62).addBox(-15.0F, 0.0F, -20.0F, 30.0F, 2.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(200, 20).addBox(-15.0F, 0.0F, -18.0F, 2.0F, 2.0F, 14.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(68, 180).addBox(-11.0F, 0.0F, -18.0F, 2.0F, 2.0F, 18.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(46, 178).addBox(9.0F, 0.0F, -18.0F, 2.0F, 2.0F, 18.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(172, 84).addBox(-7.0F, 0.0F, -18.0F, 2.0F, 2.0F, 18.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(24, 170).addBox(5.0F, 0.0F, -18.0F, 2.0F, 2.0F, 18.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(170, 170).addBox(1.0F, 0.0F, -18.0F, 2.0F, 2.0F, 20.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(0, 170).addBox(-3.0F, 0.0F, -18.0F, 2.0F, 2.0F, 20.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(194, 196).addBox(13.0F, 0.0F, -18.0F, 2.0F, 2.0F, 14.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(80, 42).addBox(11.0F, 0.0F, -4.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(80, 36).addBox(-13.0F, 0.0F, -4.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(82, 18).addBox(5.0F, 0.0F, 0.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(0, 18).addBox(-11.0F, 0.0F, 0.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(84, 140).addBox(-9.0F, -20.0F, -28.0F, 18.0F, 6.0F, 6.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(182, 68).addBox(-10.0F, -19.0F, -27.0F, 20.0F, 4.0F, 4.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(226, 104).addBox(-6.0F, -25.0F, -20.0F, 12.0F, 12.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(128, 240).addBox(-4.0F, -23.0F, -18.0F, 8.0F, 8.0F, 4.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(0, 100).addBox(-6.0F, -21.0F, -17.0F, 12.0F, 2.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(168, 94).addBox(-2.0F, -21.0F, -16.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(122, 84).addBox(-14.0F, -10.0F, -48.0F, 28.0F, 4.0F, 6.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(0, 24).addBox(-17.0F, -36.0F, -54.0F, 34.0F, 36.0F, 6.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(80, 54).addBox(-17.0F, -4.0F, -60.0F, 34.0F, 2.0F, 6.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(192, 132).addBox(-17.0F, -34.0F, -60.0F, 2.0F, 30.0F, 6.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(36, 192).addBox(15.0F, -34.0F, -60.0F, 2.0F, 30.0F, 6.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(156, 186).addBox(17.0F, -36.0F, -54.0F, 2.0F, 34.0F, 6.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(140, 186).addBox(-19.0F, -36.0F, -54.0F, 2.0F, 34.0F, 6.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(140, 62).addBox(-13.0F, -6.0F, -62.0F, 26.0F, 2.0F, 4.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(24, 210).addBox(13.0F, -34.0F, -62.0F, 2.0F, 30.0F, 4.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(84, 200).addBox(-15.0F, -34.0F, -62.0F, 2.0F, 30.0F, 4.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(80, 0).addBox(-6.0F, -25.0F, -92.0F, 12.0F, 12.0F, 24.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(52, 200).addBox(-5.0F, -24.0F, -98.0F, 10.0F, 10.0F, 6.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(140, 226).addBox(-5.0F, -24.0F, -103.0F, 10.0F, 10.0F, 4.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(238, 80).addBox(-4.0F, -23.0F, -103.5F, 8.0F, 8.0F, 4.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(0, 180).addBox(-4.0F, -23.0F, -110.5F, 8.0F, 8.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(0, 170).addBox(-4.0F, -23.0F, -114.0F, 8.0F, 8.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(232, 148).addBox(-3.0F, -17.0F, -120.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(228, 220).addBox(-3.0F, -22.0F, -120.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(68, 178).addBox(-0.5F, -22.5F, -118.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(6, 155).addBox(1.5F, -22.5F, -118.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(36, 154).addBox(-2.5F, -22.5F, -118.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(52, 178).addBox(-0.5F, -16.5F, -118.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(168, 104).addBox(1.5F, -16.5F, -118.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(42, 155).addBox(-2.5F, -16.5F, -118.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(46, 174).addBox(2.5F, -19.5F, -118.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(0, 154).addBox(2.5F, -21.5F, -118.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(126, 140).addBox(2.5F, -17.5F, -118.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(32, 170).addBox(-3.5F, -19.5F, -118.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(64, 110).addBox(-3.5F, -21.5F, -118.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(94, 74).addBox(-3.5F, -17.5F, -118.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(24, 170).addBox(2.0F, -21.0F, -120.0F, 1.0F, 4.0F, 6.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(0, 144).addBox(-3.0F, -21.0F, -120.0F, 1.0F, 4.0F, 6.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(194, 168).addBox(-3.0F, -22.0F, -113.5F, 6.0F, 6.0F, 10.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(0, 234).addBox(-4.0F, -23.0F, -101.0F, 8.0F, 8.0F, 4.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(128, 0).addBox(-11.0F, -30.0F, -84.0F, 22.0F, 22.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(192, 20).addBox(-1.0F, -29.5F, -85.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(68, 192).addBox(-1.0F, -37.0F, -57.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(190, 132).addBox(-1.0F, -3.0F, -57.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(74, 190).addBox(3.0F, -37.0F, -57.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(54, 190).addBox(3.0F, -3.0F, -57.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(46, 190).addBox(7.0F, -37.0F, -57.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(138, 188).addBox(7.0F, -3.0F, -57.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(130, 188).addBox(11.0F, -37.0F, -57.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(68, 188).addBox(16.0F, -32.0F, -57.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(182, 186).addBox(-18.0F, -32.0F, -57.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(174, 186).addBox(16.0F, -28.0F, -57.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(166, 186).addBox(-18.0F, -28.0F, -57.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(150, 186).addBox(16.0F, -24.0F, -57.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(74, 186).addBox(-18.0F, -24.0F, -57.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(184, 20).addBox(16.0F, -20.0F, -57.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(32, 184).addBox(-18.0F, -20.0F, -57.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(24, 184).addBox(16.0F, -16.0F, -57.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(68, 183).addBox(-18.0F, -16.0F, -57.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(52, 183).addBox(16.0F, -12.0F, -57.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(182, 132).addBox(-18.0F, -12.0F, -57.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(90, 182).addBox(16.0F, -8.0F, -57.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(76, 182).addBox(-18.0F, -8.0F, -57.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(46, 181).addBox(11.0F, -3.0F, -57.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(180, 94).addBox(-5.0F, -37.0F, -57.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(32, 180).addBox(-5.0F, -3.0F, -57.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(24, 180).addBox(-9.0F, -37.0F, -57.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(90, 178).addBox(-9.0F, -3.0F, -57.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(74, 178).addBox(-13.0F, -37.0F, -57.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(176, 68).addBox(-13.0F, -3.0F, -57.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(176, 20).addBox(3.0F, -29.5F, -85.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(174, 104).addBox(-5.0F, -29.5F, -85.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(46, 170).addBox(7.0F, -29.5F, -85.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(128, 152).addBox(-9.0F, -29.5F, -85.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(60, 144).addBox(-1.0F, -10.5F, -85.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(8, 144).addBox(8.5F, -19.5F, -85.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(130, 112).addBox(-10.5F, -19.5F, -85.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(56, 126).addBox(3.0F, -10.5F, -85.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(48, 126).addBox(8.5F, -15.5F, -85.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(8, 126).addBox(-10.5F, -15.5F, -85.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(0, 126).addBox(7.0F, -10.5F, -85.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(60, 110).addBox(8.5F, -11.5F, -85.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(12, 110).addBox(-10.5F, -11.5F, -85.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(92, 102).addBox(-5.0F, -10.5F, -85.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(84, 102).addBox(8.5F, -23.5F, -85.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(76, 102).addBox(-10.5F, -23.5F, -85.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(46, 78).addBox(-9.0F, -10.5F, -85.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(46, 74).addBox(8.5F, -27.5F, -85.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(20, 74).addBox(-10.5F, -27.5F, -85.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(146, 164).addBox(-10.0F, -29.0F, -86.0F, 20.0F, 20.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(176, 0).addBox(-9.0F, -28.0F, -88.0F, 18.0F, 18.0F, 2.0F, 0.0F, false);
			LR1KSonicCannon.setTextureOffset(0, 192).addBox(-8.0F, -27.0F, -90.0F, 16.0F, 16.0F, 2.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(-3.0F, -8.0F, -70.0F);
			LR1KSonicCannon.addChild(cube_r1);
			setRotationAngle(cube_r1, 1.3526F, 0.0F, 0.0F);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(-15.0F, -16.0F, -51.0F);
			LR1KSonicCannon.addChild(cube_r2);
			setRotationAngle(cube_r2, -1.5708F, -0.2182F, 0.0F);
			cube_r2.setTextureOffset(64, 216).addBox(0.0F, 4.0F, -5.0F, 2.0F, 28.0F, 4.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(15.0F, -16.0F, -51.0F);
			LR1KSonicCannon.addChild(cube_r3);
			setRotationAngle(cube_r3, -1.5708F, 0.2182F, 0.0F);
			cube_r3.setTextureOffset(52, 216).addBox(-2.0F, 4.0F, -5.0F, 2.0F, 28.0F, 4.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(-3.0F, -30.0F, -70.0F);
			LR1KSonicCannon.addChild(cube_r4);
			setRotationAngle(cube_r4, -1.3526F, 0.0F, 0.0F);
			cube_r4.setTextureOffset(96, 224).addBox(1.0F, -15.2682F, -1.1897F, 4.0F, 28.0F, 2.0F, 0.0F, false);
			cube_r5_r1 = new ModelRenderer(this);
			cube_r5_r1.setRotationPoint(3.0F, 52.0F, 40.0F);
			cube_r4.addChild(cube_r5_r1);
			setRotationAngle(cube_r5_r1, -0.48F, 0.0F, 0.0F);
			cube_r5_r1.setTextureOffset(128, 198).addBox(-2.0F, -45.9054F, -38.7223F, 4.0F, 32.0F, 2.0F, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(-4.0F, -24.0F, -20.0F);
			LR1KSonicCannon.addChild(cube_r5);
			setRotationAngle(cube_r5, 1.309F, 0.0F, 0.0F);
			cube_r5.setTextureOffset(218, 66).addBox(10.0F, 4.6504F, -3.1524F, 2.0F, 2.0F, 12.0F, 0.0F, false);
			cube_r5.setTextureOffset(214, 172).addBox(-4.0F, 4.6504F, -3.1524F, 2.0F, 2.0F, 12.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			LR1KSonicCannon.render(matrixStack, buffer, packedLight, packedOverlay);
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
