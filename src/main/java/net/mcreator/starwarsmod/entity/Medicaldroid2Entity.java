
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

import net.mcreator.starwarsmod.procedures.Medicaldroid2OnEntityTickUpdateProcedure;
import net.mcreator.starwarsmod.itemgroup.StarWarsMobsItemGroup;
import net.mcreator.starwarsmod.StarwarsmodModElements;

import java.util.Map;
import java.util.HashMap;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@StarwarsmodModElements.ModElement.Tag
public class Medicaldroid2Entity extends StarwarsmodModElements.ModElement {
	public static EntityType entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new).size(0.6f, 3f))
					.build("medicaldroid_2").setRegistryName("medicaldroid_2");
	public Medicaldroid2Entity(StarwarsmodModElements instance) {
		super(instance, 284);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@Override
	public void initElements() {
		elements.entities.add(() -> entity);
		elements.items.add(() -> new SpawnEggItem(entity, -6710887, -16724788, new Item.Properties().group(StarWarsMobsItemGroup.tab))
				.setRegistryName("medicaldroid_2_spawn_egg"));
	}

	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public void registerModels(ModelRegistryEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(entity, renderManager -> {
			return new MobRenderer(renderManager, new ModelMedicalDroid(), 0.5f) {
				@Override
				public ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("starwarsmod:textures/medicaldroid.png");
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
			this.goalSelector.addGoal(1, new LookRandomlyGoal(this));
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
		public void baseTick() {
			super.baseTick();
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
				Medicaldroid2OnEntityTickUpdateProcedure.executeProcedure($_dependencies);
			}
		}

		@Override
		protected void registerAttributes() {
			super.registerAttributes();
			if (this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED) != null)
				this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0);
			if (this.getAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
				this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(30);
			if (this.getAttribute(SharedMonsterAttributes.ARMOR) != null)
				this.getAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0);
			if (this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) == null)
				this.getAttributes().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
			this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(0);
		}
	}

	// Made with Blockbench 3.7.4
	// Exported for Minecraft version 1.14
	// Paste this class into your mod and generate all required imports
	public static class ModelMedicalDroid extends EntityModel {
		private final ModelRenderer MedicalDroid;
		private final ModelRenderer RotatingArm;
		public ModelMedicalDroid() {
			textureWidth = 256;
			textureHeight = 256;
			MedicalDroid = new ModelRenderer(this);
			MedicalDroid.setRotationPoint(0.0F, 24.0F, 0.0F);
			addBoxHelper(MedicalDroid, 51, 20, -8.0F, -1.0F, -8.0F, 16, 1, 16, 0.0F, false);
			addBoxHelper(MedicalDroid, 48, 48, -8.0F, -3.5F, -8.0F, 16, 1, 16, 0.0F, false);
			addBoxHelper(MedicalDroid, 93, 70, -7.5F, -4.0F, -7.5F, 15, 1, 15, 0.0F, false);
			addBoxHelper(MedicalDroid, 56, 103, -7.0F, -7.0F, -7.0F, 14, 3, 14, 0.0F, false);
			addBoxHelper(MedicalDroid, 78, 87, -7.5F, -7.5F, -7.5F, 15, 1, 15, 0.0F, false);
			addBoxHelper(MedicalDroid, 0, 57, -6.0F, -27.5F, -6.0F, 12, 20, 12, 0.0F, false);
			addBoxHelper(MedicalDroid, 98, 54, -7.0F, -27.5F, -7.0F, 14, 1, 14, 0.0F, false);
			addBoxHelper(MedicalDroid, 0, 102, -7.0F, -35.5F, -7.0F, 14, 3, 14, 0.0F, false);
			addBoxHelper(MedicalDroid, 36, 63, -2.0F, -35.0F, -7.25F, 4, 2, 1, 0.0F, false);
			addBoxHelper(MedicalDroid, 36, 57, -7.25F, -35.0F, -2.0F, 1, 2, 4, 0.0F, false);
			addBoxHelper(MedicalDroid, 54, 57, -2.0F, -35.0F, 6.25F, 4, 2, 1, 0.0F, false);
			addBoxHelper(MedicalDroid, 82, 87, -6.0F, -35.0F, 6.25F, 1, 2, 1, 0.0F, false);
			addBoxHelper(MedicalDroid, 48, 57, -6.0F, -35.0F, -7.25F, 1, 2, 1, 0.0F, false);
			addBoxHelper(MedicalDroid, 36, 57, -7.25F, -35.0F, 5.0F, 1, 2, 1, 0.0F, false);
			addBoxHelper(MedicalDroid, 14, 11, 6.25F, -35.0F, -6.0F, 1, 2, 1, 0.0F, false);
			addBoxHelper(MedicalDroid, 78, 87, 5.0F, -35.0F, 6.25F, 1, 2, 1, 0.0F, false);
			addBoxHelper(MedicalDroid, 60, 60, 5.0F, -35.0F, -7.25F, 1, 2, 1, 0.0F, false);
			addBoxHelper(MedicalDroid, 42, 57, -7.25F, -35.0F, -6.0F, 1, 2, 1, 0.0F, false);
			addBoxHelper(MedicalDroid, 14, 15, 6.25F, -35.0F, 5.0F, 1, 2, 1, 0.0F, false);
			addBoxHelper(MedicalDroid, 48, 57, 6.25F, -35.0F, -2.0F, 1, 2, 4, 0.0F, false);
			addBoxHelper(MedicalDroid, 99, 107, -6.5F, -37.5F, -6.5F, 13, 3, 13, 0.0F, false);
			addBoxHelper(MedicalDroid, 8, 89, 2.5F, -38.0F, -4.0F, 1, 3, 8, 0.0F, false);
			addBoxHelper(MedicalDroid, 0, 0, -3.5F, -38.0F, -4.0F, 1, 3, 8, 0.0F, false);
			addBoxHelper(MedicalDroid, 0, 57, -2.5F, -38.0F, 3.0F, 5, 3, 1, 0.0F, false);
			addBoxHelper(MedicalDroid, 54, 11, -2.5F, -38.0F, -4.0F, 5, 3, 1, 0.0F, false);
			addBoxHelper(MedicalDroid, 0, 119, -6.5F, -43.5F, -6.5F, 13, 1, 13, 0.0F, false);
			addBoxHelper(MedicalDroid, 99, 0, -6.5F, -52.5F, -6.5F, 13, 1, 13, 0.0F, false);
			addBoxHelper(MedicalDroid, 78, 37, -3.5F, -53.0F, -3.5F, 7, 1, 7, 0.0F, false);
			addBoxHelper(MedicalDroid, 54, 6, -0.5F, -54.0F, -1.5F, 3, 2, 3, 0.0F, false);
			addBoxHelper(MedicalDroid, 0, 11, -2.5F, -53.5F, -1.5F, 1, 2, 1, 0.0F, false);
			addBoxHelper(MedicalDroid, 99, 17, -7.0F, -45.75F, -7.0F, 14, 3, 14, 0.0F, false);
			addBoxHelper(MedicalDroid, 48, 44, -5.0F, -45.0F, -1.0F, 14, 2, 2, 0.0F, false);
			addBoxHelper(MedicalDroid, 70, 120, -1.0F, -45.0F, -9.0F, 2, 2, 14, 0.0F, false);
			addBoxHelper(MedicalDroid, 48, 40, -9.0F, -45.0F, -1.0F, 14, 2, 2, 0.0F, false);
			addBoxHelper(MedicalDroid, 38, 119, -1.0F, -45.0F, -5.0F, 2, 2, 14, 0.0F, false);
			addBoxHelper(MedicalDroid, 96, 37, -7.0F, -51.75F, -7.0F, 14, 3, 14, 0.0F, false);
			addBoxHelper(MedicalDroid, 33, 85, -7.5F, -47.25F, -7.5F, 15, 2, 15, 0.0F, false);
			addBoxHelper(MedicalDroid, 54, 0, -7.5F, -51.25F, -7.5F, 15, 2, 15, 0.0F, false);
			addBoxHelper(MedicalDroid, 0, 20, -8.5F, -50.25F, -8.5F, 17, 3, 17, 0.0F, false);
			addBoxHelper(MedicalDroid, 48, 48, -1.5F, -42.5F, -1.5F, 3, 5, 3, 0.0F, false);
			addBoxHelper(MedicalDroid, 6, 61, 5.0F, -42.5F, 3.5F, 1, 6, 2, 0.0F, false);
			addBoxHelper(MedicalDroid, 10, 0, 5.0F, -42.5F, -5.5F, 1, 6, 2, 0.0F, false);
			addBoxHelper(MedicalDroid, 0, 61, -6.0F, -42.5F, 3.5F, 1, 6, 2, 0.0F, false);
			addBoxHelper(MedicalDroid, 0, 0, -6.0F, -42.5F, -5.5F, 1, 6, 2, 0.0F, false);
			addBoxHelper(MedicalDroid, 56, 69, 4.0F, -42.5F, 4.5F, 1, 6, 1, 0.0F, false);
			addBoxHelper(MedicalDroid, 48, 68, 4.0F, -42.5F, -5.5F, 1, 6, 1, 0.0F, false);
			addBoxHelper(MedicalDroid, 52, 68, -5.0F, -42.5F, 4.5F, 1, 6, 1, 0.0F, false);
			addBoxHelper(MedicalDroid, 60, 48, -5.0F, -42.5F, -5.5F, 1, 6, 1, 0.0F, false);
			addBoxHelper(MedicalDroid, 134, 134, 6.0F, -26.5F, -7.0F, 1, 19, 1, 0.0F, false);
			addBoxHelper(MedicalDroid, 8, 133, 6.0F, -26.5F, 6.0F, 1, 19, 1, 0.0F, false);
			addBoxHelper(MedicalDroid, 4, 133, 6.0F, -26.5F, 3.5F, 1, 19, 1, 0.0F, false);
			addBoxHelper(MedicalDroid, 126, 126, -7.0F, -26.5F, 3.5F, 1, 19, 1, 0.0F, false);
			addBoxHelper(MedicalDroid, 0, 133, 6.0F, -26.5F, -4.5F, 1, 19, 1, 0.0F, false);
			addBoxHelper(MedicalDroid, 130, 130, -7.0F, -26.5F, -4.5F, 1, 19, 1, 0.0F, false);
			addBoxHelper(MedicalDroid, 102, 123, 6.0F, -26.5F, -1.5F, 1, 19, 3, 0.0F, false);
			addBoxHelper(MedicalDroid, 0, 89, -7.0F, -26.5F, -1.5F, 1, 19, 3, 0.0F, false);
			addBoxHelper(MedicalDroid, 32, 133, -7.0F, -26.5F, -7.0F, 1, 19, 1, 0.0F, false);
			addBoxHelper(MedicalDroid, 20, 133, -7.0F, -26.5F, 6.0F, 1, 19, 1, 0.0F, false);
			addBoxHelper(MedicalDroid, 28, 133, -4.5F, -26.5F, -7.0F, 1, 19, 1, 0.0F, false);
			addBoxHelper(MedicalDroid, 16, 133, -4.5F, -26.5F, 6.0F, 1, 19, 1, 0.0F, false);
			addBoxHelper(MedicalDroid, 24, 133, 3.5F, -26.5F, -7.0F, 1, 19, 1, 0.0F, false);
			addBoxHelper(MedicalDroid, 56, 77, 4.75F, -25.5F, -7.5F, 1, 1, 2, 0.0F, false);
			addBoxHelper(MedicalDroid, 72, 17, 4.75F, -25.5F, 5.5F, 1, 1, 2, 0.0F, false);
			addBoxHelper(MedicalDroid, 85, 46, 5.5F, -25.5F, -5.75F, 2, 1, 1, 0.0F, false);
			addBoxHelper(MedicalDroid, 80, 45, -7.5F, -25.5F, 4.75F, 2, 1, 1, 0.0F, false);
			addBoxHelper(MedicalDroid, 131, 86, 4.75F, -24.5F, -8.0F, 1, 15, 1, 0.0F, false);
			addBoxHelper(MedicalDroid, 51, 20, 4.75F, -24.5F, 7.0F, 1, 15, 1, 0.0F, false);
			addBoxHelper(MedicalDroid, 0, 40, 7.0F, -24.5F, -5.75F, 1, 15, 1, 0.0F, false);
			addBoxHelper(MedicalDroid, 0, 20, -8.0F, -24.5F, 4.75F, 1, 15, 1, 0.0F, false);
			addBoxHelper(MedicalDroid, 127, 86, -5.75F, -24.5F, -8.0F, 1, 15, 1, 0.0F, false);
			addBoxHelper(MedicalDroid, 63, 20, -5.75F, -24.5F, 7.0F, 1, 15, 1, 0.0F, false);
			addBoxHelper(MedicalDroid, 12, 40, 7.0F, -24.5F, 4.75F, 1, 15, 1, 0.0F, false);
			addBoxHelper(MedicalDroid, 12, 20, -8.0F, -24.5F, -5.75F, 1, 15, 1, 0.0F, false);
			addBoxHelper(MedicalDroid, 123, 86, -3.0F, -24.5F, -8.0F, 1, 15, 1, 0.0F, false);
			addBoxHelper(MedicalDroid, 59, 20, -3.0F, -24.5F, 7.0F, 1, 15, 1, 0.0F, false);
			addBoxHelper(MedicalDroid, 8, 40, 7.0F, -24.5F, 2.0F, 1, 15, 1, 0.0F, false);
			addBoxHelper(MedicalDroid, 8, 20, -8.0F, -24.5F, -3.0F, 1, 15, 1, 0.0F, false);
			addBoxHelper(MedicalDroid, 8, 100, 2.0F, -24.5F, -8.0F, 1, 15, 1, 0.0F, false);
			addBoxHelper(MedicalDroid, 55, 20, 2.0F, -24.5F, 7.0F, 1, 15, 1, 0.0F, false);
			addBoxHelper(MedicalDroid, 4, 40, 7.0F, -24.5F, -3.0F, 1, 15, 1, 0.0F, false);
			addBoxHelper(MedicalDroid, 4, 20, -8.0F, -24.5F, 2.0F, 1, 15, 1, 0.0F, false);
			addBoxHelper(MedicalDroid, 52, 76, -5.75F, -25.5F, -7.5F, 1, 1, 2, 0.0F, false);
			addBoxHelper(MedicalDroid, 63, 0, -5.75F, -25.5F, 5.5F, 1, 1, 2, 0.0F, false);
			addBoxHelper(MedicalDroid, 84, 17, 5.5F, -25.5F, 4.75F, 2, 1, 1, 0.0F, false);
			addBoxHelper(MedicalDroid, 48, 65, -7.5F, -25.5F, -5.75F, 2, 1, 1, 0.0F, false);
			addBoxHelper(MedicalDroid, 48, 75, -3.0F, -25.5F, -7.5F, 1, 1, 2, 0.0F, false);
			addBoxHelper(MedicalDroid, 63, 6, -3.0F, -25.5F, 5.5F, 1, 1, 2, 0.0F, false);
			addBoxHelper(MedicalDroid, 78, 85, 5.5F, -25.5F, 2.0F, 2, 1, 1, 0.0F, false);
			addBoxHelper(MedicalDroid, 78, 37, -7.5F, -25.5F, -3.0F, 2, 1, 1, 0.0F, false);
			addBoxHelper(MedicalDroid, 74, 37, 2.0F, -25.5F, -7.5F, 1, 1, 2, 0.0F, false);
			addBoxHelper(MedicalDroid, 68, 37, 2.0F, -25.5F, 5.5F, 1, 1, 2, 0.0F, false);
			addBoxHelper(MedicalDroid, 84, 85, 5.5F, -25.5F, -3.0F, 2, 1, 1, 0.0F, false);
			addBoxHelper(MedicalDroid, 78, 40, -7.5F, -25.5F, 2.0F, 2, 1, 1, 0.0F, false);
			addBoxHelper(MedicalDroid, 12, 133, 3.5F, -26.5F, 6.0F, 1, 19, 1, 0.0F, false);
			addBoxHelper(MedicalDroid, 118, 123, -1.5F, -26.5F, -7.0F, 3, 19, 1, 0.0F, false);
			addBoxHelper(MedicalDroid, 110, 123, -1.5F, -26.5F, 6.0F, 3, 19, 1, 0.0F, false);
			addBoxHelper(MedicalDroid, 0, 0, -9.0F, -3.0F, -9.0F, 18, 2, 18, 0.0F, false);
			RotatingArm = new ModelRenderer(this);
			RotatingArm.setRotationPoint(0.0F, -31.0F, 0.0F);
			MedicalDroid.addChild(RotatingArm);
			addBoxHelper(RotatingArm, 48, 65, -7.5F, -1.5F, -7.5F, 15, 5, 15, 0.0F, false);
			addBoxHelper(RotatingArm, 0, 40, -8.0F, 0.5F, -8.0F, 16, 1, 16, 0.0F, false);
			addBoxHelper(RotatingArm, 54, 0, -1.5F, -0.5F, -8.25F, 3, 3, 3, 0.0F, false);
			addBoxHelper(RotatingArm, 0, 11, -1.0F, 0.0F, -12.5F, 2, 2, 5, 0.0F, false);
			addBoxHelper(RotatingArm, 36, 57, -0.5F, 0.5F, -22.5F, 1, 1, 10, 0.0F, false);
			addBoxHelper(RotatingArm, 55, 60, -1.5F, 1.25F, -26.0F, 1, 1, 3, 0.0F, false);
			addBoxHelper(RotatingArm, 9, 11, 0.5F, 1.25F, -26.0F, 1, 1, 3, 0.0F, false);
			addBoxHelper(RotatingArm, 78, 17, -1.0F, 0.0F, -23.5F, 2, 2, 1, 0.0F, false);
			addBoxHelper(RotatingArm, 55, 65, -0.5F, -0.5F, -26.0F, 1, 1, 3, 0.0F, false);
		}

		@Override
		public void render(MatrixStack ms, IVertexBuilder vb, int i1, int i2, float f1, float f2, float f3, float f4) {
			MedicalDroid.render(ms, vb, i1, i2, f1, f2, f3, f4);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.RotatingArm.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.RotatingArm.rotateAngleX = f4 / (180F / (float) Math.PI);
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
