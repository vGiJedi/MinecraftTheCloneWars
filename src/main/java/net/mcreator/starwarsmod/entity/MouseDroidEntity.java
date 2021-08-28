
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
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.Item;
import net.minecraft.entity.ai.goal.TemptGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.Entity;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.block.Blocks;

import net.mcreator.starwarsmod.itemgroup.StarWarsMobsItemGroup;
import net.mcreator.starwarsmod.StarwarsmodModElements;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@StarwarsmodModElements.ModElement.Tag
public class MouseDroidEntity extends StarwarsmodModElements.ModElement {
	public static EntityType entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new)
			.size(0.6f, 1.8f)).build("mouse_droid").setRegistryName("mouse_droid");
	public MouseDroidEntity(StarwarsmodModElements instance) {
		super(instance, 108);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@Override
	public void initElements() {
		elements.entities.add(() -> entity);
		elements.items.add(() -> new SpawnEggItem(entity, -10066330, -16777216, new Item.Properties().group(StarWarsMobsItemGroup.tab))
				.setRegistryName("mouse_droid_spawn_egg"));
	}

	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public void registerModels(ModelRegistryEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(entity, renderManager -> {
			return new MobRenderer(renderManager, new ModelMouseDroid(), 0.5f) {
				@Override
				public ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("starwarsmod:textures/mousedroidtexture.png");
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
			experienceValue = 1;
			setNoAI(false);
		}

		@Override
		public IPacket<?> createSpawnPacket() {
			return NetworkHooks.getEntitySpawningPacket(this);
		}

		@Override
		protected void registerGoals() {
			super.registerGoals();
			this.goalSelector.addGoal(1, new RandomWalkingGoal(this, 1));
			this.goalSelector.addGoal(2, new LookRandomlyGoal(this));
			this.goalSelector.addGoal(3, new TemptGoal(this, 3, Ingredient.fromItems(Blocks.REDSTONE_WIRE.asItem()), false));
			this.goalSelector.addGoal(4, new SwimGoal(this));
		}

		@Override
		public CreatureAttribute getCreatureAttribute() {
			return CreatureAttribute.UNDEFINED;
		}

		@Override
		public net.minecraft.util.SoundEvent getAmbientSound() {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("starwarsmod:mousedroididle"));
		}

		@Override
		public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
		}

		@Override
		public net.minecraft.util.SoundEvent getDeathSound() {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("starwarsmod:mousedroiddeath"));
		}

		@Override
		protected void registerAttributes() {
			super.registerAttributes();
			if (this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED) != null)
				this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.6);
			if (this.getAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
				this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(5);
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
	public static class ModelMouseDroid extends EntityModel {
		private final ModelRenderer MainBody;
		private final ModelRenderer Wheels;
		public ModelMouseDroid() {
			textureWidth = 64;
			textureHeight = 64;
			MainBody = new ModelRenderer(this);
			MainBody.setRotationPoint(0.0F, 24.0F, 0.0F);
			addBoxHelper(MainBody, 0, 23, -3.0F, -2.0F, -4.0F, 6, 1, 9, 0.0F, false);
			addBoxHelper(MainBody, 0, 0, -3.5F, -3.0F, -5.0F, 7, 1, 11, 0.0F, false);
			addBoxHelper(MainBody, 0, 12, -3.0F, -4.0F, -4.5F, 6, 1, 10, 0.0F, false);
			addBoxHelper(MainBody, 22, 12, -3.0F, -5.0F, -3.75F, 6, 1, 9, 0.0F, false);
			addBoxHelper(MainBody, 21, 23, -3.0F, -6.0F, -3.0F, 6, 1, 8, 0.0F, false);
			addBoxHelper(MainBody, 25, 0, -3.0F, -7.0F, -2.5F, 6, 1, 7, 0.0F, false);
			Wheels = new ModelRenderer(this);
			Wheels.setRotationPoint(0.0F, 0.0F, 1.0F);
			MainBody.addChild(Wheels);
			addBoxHelper(Wheels, 0, 16, 1.5F, -2.0F, -4.0F, 2, 2, 2, 0.0F, false);
			addBoxHelper(Wheels, 0, 8, 2.75F, -1.5F, -3.5F, 1, 1, 1, 0.0F, false);
			addBoxHelper(Wheels, 0, 33, -3.5F, -5.5F, -2.0F, 7, 1, 1, 0.0F, false);
			addBoxHelper(Wheels, 29, 32, -3.5F, -5.5F, 0.0F, 7, 1, 1, 0.0F, false);
			addBoxHelper(Wheels, 25, 8, -3.5F, -5.5F, 2.0F, 7, 1, 1, 0.0F, false);
			addBoxHelper(Wheels, 7, 7, 2.75F, -1.5F, 1.5F, 1, 1, 1, 0.0F, false);
			addBoxHelper(Wheels, 6, 4, -3.75F, -1.5F, 1.5F, 1, 1, 1, 0.0F, false);
			addBoxHelper(Wheels, 6, 0, -3.75F, -1.5F, -3.5F, 1, 1, 1, 0.0F, false);
			addBoxHelper(Wheels, 0, 12, -3.5F, -2.0F, -4.0F, 2, 2, 2, 0.0F, false);
			addBoxHelper(Wheels, 0, 4, 1.5F, -2.0F, 1.0F, 2, 2, 2, 0.0F, false);
			addBoxHelper(Wheels, 0, 0, -3.5F, -2.0F, 1.0F, 2, 2, 2, 0.0F, false);
			addBoxHelper(Wheels, 27, 34, -2.5F, -7.5F, -2.0F, 5, 1, 1, 0.0F, false);
			addBoxHelper(Wheels, 16, 33, -2.5F, -7.5F, 2.0F, 5, 1, 1, 0.0F, false);
		}

		@Override
		public void render(MatrixStack ms, IVertexBuilder vb, int i1, int i2, float f1, float f2, float f3, float f4) {
			MainBody.render(ms, vb, i1, i2, f1, f2, f3, f4);
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
