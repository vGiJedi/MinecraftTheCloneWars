
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
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.Entity;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.starwarsmod.itemgroup.SepratistAIItemGroup;
import net.mcreator.starwarsmod.StarwarsmodModElements;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@StarwarsmodModElements.ModElement.Tag
public class GoldieEntity extends StarwarsmodModElements.ModElement {
	public static EntityType entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.CREATURE)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new)
			.size(0.6f, 1.8f)).build("goldie").setRegistryName("goldie");
	public GoldieEntity(StarwarsmodModElements instance) {
		super(instance, 117);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@Override
	public void initElements() {
		elements.entities.add(() -> entity);
		elements.items.add(() -> new SpawnEggItem(entity, -16777216, -6711040, new Item.Properties().group(SepratistAIItemGroup.tab))
				.setRegistryName("goldie_spawn_egg"));
	}

	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public void registerModels(ModelRegistryEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(entity, renderManager -> {
			return new MobRenderer(renderManager, new ModelGoldie(), 0.5f) {
				@Override
				public ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("starwarsmod:textures/goldiemovingnew.png");
				}
			};
		});
	}
	public static class CustomEntity extends MonsterEntity {
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
			this.targetSelector.addGoal(1, new NearestAttackableTargetGoal(this, R2D2Entity.CustomEntity.class, true, false));
			this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 1.2, true));
			this.targetSelector.addGoal(3, new HurtByTargetGoal(this).setCallsForHelp(this.getClass()));
			this.goalSelector.addGoal(4, new RandomWalkingGoal(this, 1));
			this.goalSelector.addGoal(5, new LookRandomlyGoal(this));
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
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("starwarsmod:astromechliving"));
		}

		@Override
		public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("starwarsmod:astromechhurt"));
		}

		@Override
		public net.minecraft.util.SoundEvent getDeathSound() {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("starwarsmod:astromechdeath"));
		}

		@Override
		protected void registerAttributes() {
			super.registerAttributes();
			if (this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED) != null)
				this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3);
			if (this.getAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
				this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10);
			if (this.getAttribute(SharedMonsterAttributes.ARMOR) != null)
				this.getAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0);
			if (this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) == null)
				this.getAttributes().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
			this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(4);
		}
	}

	// Made with Blockbench 3.5.4
	// Exported for Minecraft version 1.14
	// Paste this class into your mod and generate all required imports
	public static class ModelGoldie extends EntityModel {
		private final ModelRenderer Head;
		private final ModelRenderer Legs;
		private final ModelRenderer Body;
		public ModelGoldie() {
			textureWidth = 128;
			textureHeight = 128;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 23.0F, -4.0F);
			setRotationAngle(Head, -0.3491F, 0.0F, 0.0F);
			addBoxHelper(Head, 20, 20, -2.5F, -19.1F, -5.0F, 5, 3, 10, 0.0F, false);
			addBoxHelper(Head, 0, 48, -0.75F, -18.1F, -5.4F, 1, 1, 1, 0.0F, false);
			addBoxHelper(Head, 18, 38, 1.0F, -18.1F, -5.7F, 1, 1, 2, 0.0F, false);
			addBoxHelper(Head, 30, 0, -2.0F, -21.1F, -4.5F, 4, 3, 9, 0.0F, false);
			addBoxHelper(Head, 36, 33, -1.0F, -20.8F, -4.8F, 2, 3, 1, 0.0F, false);
			addBoxHelper(Head, 47, 7, -0.5F, -20.3F, -5.0F, 1, 1, 1, 0.0F, false);
			addBoxHelper(Head, 50, 5, -3.0F, -21.1F, -3.5F, 1, 3, 7, 0.0F, false);
			addBoxHelper(Head, 43, 48, 2.0F, -21.1F, -3.5F, 1, 3, 7, 0.0F, false);
			addBoxHelper(Head, 61, 37, -4.0F, -21.1F, -2.5F, 1, 3, 5, 0.0F, false);
			addBoxHelper(Head, 61, 28, 3.0F, -21.1F, -2.5F, 1, 3, 5, 0.0F, false);
			addBoxHelper(Head, 44, 36, -3.5F, -21.6F, -2.0F, 7, 2, 4, 0.0F, false);
			addBoxHelper(Head, 61, 22, -1.5F, -22.1F, -2.0F, 3, 2, 4, 0.0F, false);
			addBoxHelper(Head, 40, 25, -1.0F, -22.3F, -1.0F, 2, 2, 2, 0.0F, false);
			addBoxHelper(Head, 18, 33, -2.5F, -22.1F, -1.5F, 1, 2, 3, 0.0F, false);
			addBoxHelper(Head, 22, 23, 1.5F, -22.1F, -1.5F, 1, 2, 3, 0.0F, false);
			addBoxHelper(Head, 0, 4, -1.5F, -21.6F, -4.0F, 3, 2, 2, 0.0F, false);
			addBoxHelper(Head, 0, 0, -1.5F, -21.6F, 2.0F, 3, 2, 2, 0.0F, false);
			addBoxHelper(Head, 0, 44, -0.5F, -22.2F, 2.5F, 1, 3, 1, 0.0F, false);
			addBoxHelper(Head, 8, 47, 1.5F, -21.6F, 2.0F, 1, 2, 1, 0.0F, false);
			addBoxHelper(Head, 44, 36, -2.5F, -21.6F, 2.0F, 1, 2, 1, 0.0F, false);
			addBoxHelper(Head, 8, 44, -2.5F, -21.6F, -3.0F, 1, 2, 1, 0.0F, false);
			addBoxHelper(Head, 42, 15, 1.5F, -21.6F, -3.0F, 1, 2, 1, 0.0F, false);
			addBoxHelper(Head, 42, 25, -3.5F, -19.1F, -4.0F, 1, 3, 8, 0.0F, false);
			addBoxHelper(Head, 40, 12, 2.5F, -19.1F, -4.0F, 1, 3, 8, 0.0F, false);
			addBoxHelper(Head, 14, 54, -4.5F, -19.1F, -3.0F, 1, 3, 6, 0.0F, false);
			addBoxHelper(Head, 53, 53, 3.5F, -19.1F, -3.0F, 1, 3, 6, 0.0F, false);
			Legs = new ModelRenderer(this);
			Legs.setRotationPoint(0.0F, 24.0F, 0.0F);
			addBoxHelper(Legs, 30, 12, 5.0F, -1.0F, -3.0F, 3, 1, 6, 0.0F, false);
			addBoxHelper(Legs, 61, 51, 5.0F, -2.0F, -2.0F, 2, 1, 4, 0.0F, false);
			addBoxHelper(Legs, 38, 58, 5.0F, -11.0F, -1.5F, 2, 9, 3, 0.0F, false);
			addBoxHelper(Legs, 16, 63, 6.2F, -12.0F, -0.5F, 1, 8, 1, 0.0F, false);
			addBoxHelper(Legs, 52, 42, 5.0F, -15.0F, -2.5F, 2, 4, 5, 0.0F, false);
			addBoxHelper(Legs, 10, 23, -8.0F, -1.0F, -3.0F, 3, 1, 6, 0.0F, false);
			addBoxHelper(Legs, 20, 0, -1.5F, -1.0F, -7.0F, 3, 1, 6, 0.0F, false);
			addBoxHelper(Legs, 50, 15, -7.0F, -2.0F, -2.0F, 2, 1, 4, 0.0F, false);
			addBoxHelper(Legs, 12, 63, -7.2F, -12.0F, -0.5F, 1, 8, 1, 0.0F, false);
			addBoxHelper(Legs, 28, 54, -7.0F, -11.0F, -1.5F, 2, 9, 3, 0.0F, false);
			addBoxHelper(Legs, 52, 23, -7.0F, -15.0F, -2.5F, 2, 4, 5, 0.0F, false);
			addBoxHelper(Legs, 0, 23, -0.5F, -5.4F, -5.0F, 1, 5, 2, 0.0F, false);
			addBoxHelper(Legs, 0, 0, 6.5F, -14.0F, -0.5F, 1, 2, 1, 0.0F, false);
			addBoxHelper(Legs, 0, 0, -7.5F, -14.0F, -0.5F, 1, 2, 1, 0.0F, false);
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 23.0F, -4.0F);
			setRotationAngle(Body, -0.3491F, 0.0F, 0.0F);
			addBoxHelper(Body, 30, 12, 4.0F, -14.0F, -1.0F, 1, 2, 2, 0.0F, false);
			addBoxHelper(Body, 10, 23, -5.0F, -14.0F, -1.0F, 1, 2, 2, 0.0F, false);
			addBoxHelper(Body, 0, 44, -4.5F, -16.0F, -3.0F, 1, 13, 6, 0.0F, false);
			addBoxHelper(Body, 36, 36, 3.5F, -16.0F, -3.0F, 1, 13, 6, 0.0F, false);
			addBoxHelper(Body, 18, 33, 2.5F, -16.0F, -4.0F, 1, 13, 8, 0.0F, false);
			addBoxHelper(Body, 0, 23, -3.5F, -16.0F, -4.0F, 1, 13, 8, 0.0F, false);
			addBoxHelper(Body, 0, 0, -2.5F, -16.0F, -5.0F, 5, 13, 10, 0.0F, false);
			addBoxHelper(Body, 40, 23, -2.0F, -15.9F, -5.2F, 4, 1, 1, 0.0F, false);
			addBoxHelper(Body, 20, 0, -1.0F, -11.6F, -5.2F, 2, 4, 1, 0.0F, false);
			addBoxHelper(Body, 36, 40, -0.5F, -11.1F, -5.4F, 1, 1, 1, 0.0F, false);
			addBoxHelper(Body, 22, 38, -0.5F, -9.1F, -5.4F, 1, 1, 1, 0.0F, false);
			addBoxHelper(Body, 36, 37, -0.5F, -5.1F, -5.2F, 1, 1, 1, 0.0F, false);
			addBoxHelper(Body, 8, 63, 2.0F, -15.5F, -4.5F, 1, 12, 1, 0.0F, false);
			addBoxHelper(Body, 4, 63, -3.0F, -15.5F, -4.5F, 1, 12, 1, 0.0F, false);
			addBoxHelper(Body, 0, 63, -3.0F, -15.5F, 3.5F, 1, 12, 1, 0.0F, false);
			addBoxHelper(Body, 60, 62, -4.0F, -15.5F, 2.5F, 1, 12, 1, 0.0F, false);
			addBoxHelper(Body, 56, 62, -4.0F, -15.5F, -3.5F, 1, 12, 1, 0.0F, false);
			addBoxHelper(Body, 52, 62, 3.0F, -15.5F, -3.5F, 1, 12, 1, 0.0F, false);
			addBoxHelper(Body, 48, 58, 3.0F, -15.5F, 2.5F, 1, 12, 1, 0.0F, false);
			addBoxHelper(Body, 14, 44, 2.0F, -15.5F, 3.5F, 1, 12, 1, 0.0F, false);
			addBoxHelper(Body, 64, 64, -2.0F, -3.5F, -4.5F, 4, 1, 2, 0.0F, false);
			addBoxHelper(Body, 61, 56, -2.0F, -3.5F, 2.5F, 4, 1, 2, 0.0F, false);
			addBoxHelper(Body, 58, 15, -2.0F, -3.0F, -3.0F, 1, 1, 6, 0.0F, false);
			addBoxHelper(Body, 28, 33, 1.0F, -3.0F, -3.0F, 1, 1, 6, 0.0F, false);
			addBoxHelper(Body, 30, 7, -1.0F, -3.0F, -3.0F, 2, 1, 1, 0.0F, false);
			addBoxHelper(Body, 10, 27, -1.0F, -3.0F, 2.0F, 2, 1, 1, 0.0F, false);
			addBoxHelper(Body, 59, 6, 2.0F, -3.5F, -2.5F, 2, 1, 5, 0.0F, false);
			addBoxHelper(Body, 59, 0, -4.0F, -3.5F, -2.5F, 2, 1, 5, 0.0F, false);
			addBoxHelper(Body, 28, 37, -3.0F, -3.5F, -3.5F, 1, 1, 1, 0.0F, false);
			addBoxHelper(Body, 32, 4, 2.0F, -3.5F, -3.5F, 1, 1, 1, 0.0F, false);
			addBoxHelper(Body, 30, 16, 2.0F, -3.5F, 2.5F, 1, 1, 1, 0.0F, false);
			addBoxHelper(Body, 4, 23, -3.0F, -3.5F, 2.5F, 1, 1, 1, 0.0F, false);
			addBoxHelper(Body, 47, 0, -2.0F, -16.1F, -2.0F, 4, 1, 4, 0.0F, false);
		}

		@Override
		public void render(MatrixStack ms, IVertexBuilder vb, int i1, int i2, float f1, float f2, float f3, float f4) {
			Head.render(ms, vb, i1, i2, f1, f2, f3, f4);
			Legs.render(ms, vb, i1, i2, f1, f2, f3, f4);
			Body.render(ms, vb, i1, i2, f1, f2, f3, f4);
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
