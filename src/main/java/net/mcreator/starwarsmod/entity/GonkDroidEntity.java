
package net.mcreator.starwarsmod.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.wrapper.EntityHandsInvWrapper;
import net.minecraftforge.items.wrapper.EntityArmorInvWrapper;
import net.minecraftforge.items.wrapper.CombinedInvWrapper;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.fml.network.NetworkHooks;
import net.minecraftforge.fml.network.FMLPlayMessages;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Hand;
import net.minecraft.util.Direction;
import net.minecraft.util.DamageSource;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.IPacket;
import net.minecraft.nbt.INBT;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.inventory.container.Container;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.Entity;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.block.BlockState;

import net.mcreator.starwarsmod.procedures.GonkDroidEntityDiesProcedure;
import net.mcreator.starwarsmod.itemgroup.StarWarsMobsItemGroup;
import net.mcreator.starwarsmod.gui.GonkChestGui;
import net.mcreator.starwarsmod.StarwarsmodModElements;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import java.util.Map;
import java.util.HashMap;

import io.netty.buffer.Unpooled;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@StarwarsmodModElements.ModElement.Tag
public class GonkDroidEntity extends StarwarsmodModElements.ModElement {
	public static EntityType entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.CREATURE)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new)
			.size(0.6f, 1.8f)).build("gonk_droid").setRegistryName("gonk_droid");
	public GonkDroidEntity(StarwarsmodModElements instance) {
		super(instance, 111);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@Override
	public void initElements() {
		elements.entities.add(() -> entity);
		elements.items.add(() -> new SpawnEggItem(entity, -6710887, -6737152, new Item.Properties().group(StarWarsMobsItemGroup.tab))
				.setRegistryName("gonk_droid_spawn_egg"));
	}

	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public void registerModels(ModelRegistryEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(entity, renderManager -> {
			return new MobRenderer(renderManager, new ModelGonkDroid(), 0.5f) {
				@Override
				public ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("starwarsmod:textures/gonkdroidtexture.png");
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
			this.goalSelector.addGoal(1, new RandomWalkingGoal(this, 1));
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
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("starwarsmod:gonkgonk"));
		}

		@Override
		public void playStepSound(BlockPos pos, BlockState blockIn) {
			this.playSound((net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("starwarsmod:gonkwalk")), 0.15f,
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
		public void onDeath(DamageSource source) {
			super.onDeath(source);
			double x = this.getPosX();
			double y = this.getPosY();
			double z = this.getPosZ();
			Entity sourceentity = source.getTrueSource();
			Entity entity = this;
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				GonkDroidEntityDiesProcedure.executeProcedure($_dependencies);
			}
		}
		private final ItemStackHandler inventory = new ItemStackHandler(9) {
			@Override
			public int getSlotLimit(int slot) {
				return 64;
			}
		};
		private final CombinedInvWrapper combined = new CombinedInvWrapper(inventory, new EntityHandsInvWrapper(this),
				new EntityArmorInvWrapper(this));
		@Override
		public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> capability, @Nullable Direction side) {
			if (this.isAlive() && capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY && side == null)
				return LazyOptional.of(() -> combined).cast();
			return super.getCapability(capability, side);
		}

		@Override
		protected void dropInventory() {
			super.dropInventory();
			for (int i = 0; i < inventory.getSlots(); ++i) {
				ItemStack itemstack = inventory.getStackInSlot(i);
				if (!itemstack.isEmpty() && !EnchantmentHelper.hasVanishingCurse(itemstack)) {
					this.entityDropItem(itemstack);
				}
			}
		}

		@Override
		public void writeAdditional(CompoundNBT compound) {
			super.writeAdditional(compound);
			compound.put("InventoryCustom", inventory.serializeNBT());
		}

		@Override
		public void readAdditional(CompoundNBT compound) {
			super.readAdditional(compound);
			INBT inventoryCustom = compound.get("InventoryCustom");
			if (inventoryCustom instanceof CompoundNBT)
				inventory.deserializeNBT((CompoundNBT) inventoryCustom);
		}

		@Override
		public boolean processInteract(PlayerEntity sourceentity, Hand hand) {
			ItemStack itemstack = sourceentity.getHeldItem(hand);
			boolean retval = true;
			if (sourceentity instanceof ServerPlayerEntity) {
				NetworkHooks.openGui((ServerPlayerEntity) sourceentity, new INamedContainerProvider() {
					@Override
					public ITextComponent getDisplayName() {
						return new StringTextComponent("Gonk Droid");
					}

					@Override
					public Container createMenu(int id, PlayerInventory inventory, PlayerEntity player) {
						PacketBuffer packetBuffer = new PacketBuffer(Unpooled.buffer());
						packetBuffer.writeBlockPos(new BlockPos(sourceentity));
						packetBuffer.writeByte(0);
						packetBuffer.writeVarInt(CustomEntity.this.getEntityId());
						return new GonkChestGui.GuiContainerMod(id, inventory, packetBuffer);
					}
				}, buf -> {
					buf.writeBlockPos(new BlockPos(sourceentity));
					buf.writeByte(0);
					buf.writeVarInt(this.getEntityId());
				});
			}
			super.processInteract(sourceentity, hand);
			return retval;
		}

		@Override
		protected void registerAttributes() {
			super.registerAttributes();
			if (this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED) != null)
				this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.15);
			if (this.getAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
				this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20);
			if (this.getAttribute(SharedMonsterAttributes.ARMOR) != null)
				this.getAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0);
			if (this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) == null)
				this.getAttributes().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
			this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(0);
		}
	}

	// Made with Blockbench 3.5.4
	// Exported for Minecraft version 1.14
	// Paste this class into your mod and generate all required imports
	public static class ModelGonkDroid extends EntityModel {
		private final ModelRenderer Gonk;
		private final ModelRenderer LeftLeg;
		private final ModelRenderer RightLeg;
		private final ModelRenderer Body;
		public ModelGonkDroid() {
			textureWidth = 128;
			textureHeight = 128;
			Gonk = new ModelRenderer(this);
			Gonk.setRotationPoint(0.0F, 24.0F, 0.0F);
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(0.0F, 0.0F, 0.0F);
			Gonk.addChild(LeftLeg);
			addBoxHelper(LeftLeg, 40, 1, 0.5F, -1.0F, -3.0F, 3, 1, 5, 0.0F, false);
			addBoxHelper(LeftLeg, 0, 37, 1.0F, -4.0F, -1.2F, 2, 3, 2, 0.0F, false);
			addBoxHelper(LeftLeg, 35, 9, 1.0F, -1.2F, -2.0F, 2, 1, 1, 0.0F, false);
			addBoxHelper(LeftLeg, 29, 9, 1.0F, -1.1F, -2.9F, 2, 1, 1, 0.0F, false);
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(0.0F, 0.0F, 0.0F);
			Gonk.addChild(RightLeg);
			addBoxHelper(RightLeg, 29, 0, -3.5F, -1.0F, -3.0F, 3, 1, 5, 0.0F, false);
			addBoxHelper(RightLeg, 45, 34, -3.0F, -4.0F, -1.2F, 2, 3, 2, 0.0F, false);
			addBoxHelper(RightLeg, 6, 28, -3.0F, -1.2F, -2.0F, 2, 1, 1, 0.0F, false);
			addBoxHelper(RightLeg, 0, 28, -3.0F, -1.1F, -2.9F, 2, 1, 1, 0.0F, false);
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 0.0F, 0.0F);
			Gonk.addChild(Body);
			addBoxHelper(Body, 32, 39, -3.5F, -5.0F, -4.0F, 7, 1, 8, 0.0F, false);
			addBoxHelper(Body, 32, 8, -4.0F, -8.5F, -5.0F, 8, 4, 10, 0.0F, false);
			addBoxHelper(Body, 34, 22, -4.0F, -21.5F, -5.0F, 8, 2, 10, 0.0F, false);
			addBoxHelper(Body, 0, 31, -4.5F, -12.5F, -5.5F, 9, 5, 11, 0.0F, false);
			addBoxHelper(Body, 0, 0, -4.5F, -19.5F, -5.5F, 9, 7, 11, 0.0F, false);
			addBoxHelper(Body, 0, 18, -5.0F, -13.0F, -6.0F, 10, 1, 12, 0.0F, false);
			addBoxHelper(Body, 29, 36, -3.5F, -19.0F, -5.8F, 7, 1, 1, 0.0F, false);
			addBoxHelper(Body, 29, 34, -3.5F, -15.0F, -5.8F, 7, 1, 1, 0.0F, false);
			addBoxHelper(Body, 6, 0, -3.5F, -18.0F, -5.8F, 1, 3, 1, 0.0F, false);
			addBoxHelper(Body, 0, 0, 2.5F, -18.0F, -5.8F, 1, 3, 1, 0.0F, false);
			addBoxHelper(Body, 38, 22, 0.0F, -17.7F, -5.7F, 2, 1, 1, 0.0F, false);
			addBoxHelper(Body, 39, 28, -1.0F, -15.7F, -5.7F, 1, 1, 1, 0.0F, false);
			addBoxHelper(Body, 37, 6, -2.0F, -17.0F, -5.7F, 1, 1, 1, 0.0F, false);
			addBoxHelper(Body, 0, 6, -3.0F, -22.0F, -4.4F, 2, 1, 3, 0.0F, false);
			addBoxHelper(Body, 29, 38, -2.0F, -21.6F, -1.4F, 1, 1, 3, 0.0F, false);
			addBoxHelper(Body, 29, 6, -2.0F, -22.0F, 1.6F, 3, 1, 2, 0.0F, false);
			addBoxHelper(Body, 34, 38, -4.0F, -11.6F, -5.7F, 2, 2, 1, 0.0F, false);
			addBoxHelper(Body, 18, 47, 0.0F, -10.6F, -5.6F, 3, 2, 1, 0.0F, false);
			addBoxHelper(Body, 26, 47, 0.0F, -8.6F, -5.1F, 2, 3, 1, 0.0F, false);
			addBoxHelper(Body, 6, 37, -3.5F, -11.0F, -6.2F, 1, 1, 1, 0.0F, false);
			addBoxHelper(Body, 6, 33, -4.6F, -11.5F, 3.0F, 1, 1, 1, 0.0F, false);
			addBoxHelper(Body, 6, 22, -5.0F, -18.5F, 3.0F, 1, 2, 2, 0.0F, false);
			addBoxHelper(Body, 0, 31, -5.0F, -15.5F, 3.0F, 1, 1, 1, 0.0F, false);
			addBoxHelper(Body, 0, 33, -4.6F, -11.5F, 1.5F, 1, 1, 1, 0.0F, false);
			addBoxHelper(Body, 29, 31, -4.6F, -11.5F, 0.0F, 1, 1, 1, 0.0F, false);
			addBoxHelper(Body, 6, 31, -4.6F, -11.5F, -1.5F, 1, 1, 1, 0.0F, false);
			addBoxHelper(Body, 0, 31, -4.6F, -15.5F, -3.5F, 1, 2, 4, 0.0F, false);
			addBoxHelper(Body, 0, 22, -4.6F, -18.5F, -3.5F, 1, 2, 4, 0.0F, false);
			addBoxHelper(Body, 12, 47, 3.6F, -18.5F, -4.5F, 1, 3, 2, 0.0F, false);
			addBoxHelper(Body, 0, 0, 3.6F, -16.5F, -0.5F, 1, 2, 4, 0.0F, false);
			addBoxHelper(Body, 0, 24, 3.6F, -9.5F, -4.5F, 1, 1, 1, 0.0F, false);
			addBoxHelper(Body, 0, 22, 3.6F, -9.5F, -2.5F, 1, 1, 1, 0.0F, false);
			addBoxHelper(Body, 7, 7, 3.6F, -9.5F, -0.5F, 1, 1, 1, 0.0F, false);
			addBoxHelper(Body, 4, 47, -4.6F, -16.5F, -2.5F, 1, 1, 3, 0.0F, false);
			addBoxHelper(Body, 32, 22, -1.0F, -19.0F, 5.5F, 2, 5, 2, 0.0F, false);
			addBoxHelper(Body, 0, 18, -1.5F, -17.0F, 5.0F, 3, 1, 3, 0.0F, false);
			addBoxHelper(Body, 29, 2, -0.5F, -19.2F, 6.0F, 1, 1, 1, 0.0F, false);
			addBoxHelper(Body, 29, 0, -0.5F, -14.7F, 6.0F, 1, 1, 1, 0.0F, false);
			addBoxHelper(Body, 0, 47, 2.8F, -29.0F, 3.0F, 0, 8, 0, 0.0F, false);
		}

		@Override
		public void render(MatrixStack ms, IVertexBuilder vb, int i1, int i2, float f1, float f2, float f3, float f4) {
			Gonk.render(ms, vb, i1, i2, f1, f2, f3, f4);
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
