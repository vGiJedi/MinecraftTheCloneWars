
package net.mcreator.starwarsmod.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.BipedModel;

import net.mcreator.starwarsmod.StarwarsmodModElements;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@StarwarsmodModElements.ModElement.Tag
public class FivesPauldronItem extends StarwarsmodModElements.ModElement {
	@ObjectHolder("starwarsmod:fives_pauldron_helmet")
	public static final Item helmet = null;
	@ObjectHolder("starwarsmod:fives_pauldron_chestplate")
	public static final Item body = null;
	@ObjectHolder("starwarsmod:fives_pauldron_leggings")
	public static final Item legs = null;
	@ObjectHolder("starwarsmod:fives_pauldron_boots")
	public static final Item boots = null;
	public FivesPauldronItem(StarwarsmodModElements instance) {
		super(instance, 387);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 25;
			}

			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{2, 5, 6, 2}[slot.getIndex()];
			}

			public int getEnchantability() {
				return 9;
			}

			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}

			@OnlyIn(Dist.CLIENT)
			public String getName() {
				return "fives_pauldron";
			}

			public float getToughness() {
				return 0f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(null)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public BipedModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlotType slot, BipedModel defaultModel) {
				BipedModel armorModel = new BipedModel(1);
				armorModel.bipedBody = new Modelfivesbackpackandpauldron().Body;
				armorModel.bipedLeftArm = new Modelfivesbackpackandpauldron().LeftArm;
				armorModel.bipedRightArm = new Modelfivesbackpackandpauldron().RightArm;
				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "starwarsmod:textures/fivesbackpackandpauldron.png";
			}
		}.setRegistryName("fives_pauldron_chestplate"));
	}
	// Made with Blockbench 3.7.4
	// Exported for Minecraft version 1.14
	// Paste this class into your mod and generate all required imports
	public static class Modelfivesbackpackandpauldron extends EntityModel {
		private final ModelRenderer Body;
		private final ModelRenderer LeftArm;
		private final ModelRenderer RightArm;
		public Modelfivesbackpackandpauldron() {
			textureWidth = 128;
			textureHeight = 128;
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 0.0F, 0.0F);
			addBoxHelper(Body, 16, 1, -3.5F, 2.25F, 1.5F, 7, 9, 1, 0.0F, false);
			addBoxHelper(Body, 35, 45, -4.0F, 8.5F, 2.5F, 2, 3, 2, 0.0F, false);
			addBoxHelper(Body, 2, 14, -4.0F, 0.5F, 2.5F, 2, 6, 2, 0.0F, false);
			addBoxHelper(Body, 35, 29, -3.5F, 5.6F, 3.0F, 1, 6, 1, 0.0F, false);
			addBoxHelper(Body, 6, 3, -3.5F, 0.35F, 3.0F, 1, 3, 1, 0.0F, false);
			addBoxHelper(Body, 16, 31, -2.0F, 1.0F, 2.25F, 5, 10, 2, 0.0F, false);
			addBoxHelper(Body, 3, 40, 1.5F, 9.5F, 2.75F, 2, 1, 1, 0.0F, false);
			addBoxHelper(Body, 3, 35, 1.25F, 4.5F, 2.75F, 2, 1, 1, 0.0F, false);
			addBoxHelper(Body, 3, 32, 1.25F, 3.0F, 2.75F, 2, 1, 1, 0.0F, false);
			addBoxHelper(Body, 36, 16, -1.5F, 1.5F, 3.5F, 4, 9, 1, 0.0F, false);
			addBoxHelper(Body, 16, 46, -1.25F, 6.25F, 3.7F, 1, 4, 1, 0.0F, false);
			addBoxHelper(Body, 34, 7, -1.25F, 1.65F, 3.7F, 1, 2, 1, 0.0F, false);
			addBoxHelper(Body, 3, 25, 0.25F, 2.65F, 3.7F, 2, 2, 1, 0.0F, false);
			addBoxHelper(Body, 3, 48, 0.0F, 9.25F, 3.7F, 2, 1, 1, 0.0F, false);
			addBoxHelper(Body, 1, 44, 0.0F, 8.0F, 3.7F, 2, 1, 1, 0.0F, false);
			addBoxHelper(Body, 24, 46, 0.0F, 6.75F, 3.7F, 1, 1, 1, 0.0F, false);
			addBoxHelper(Body, 0, 58, -3.5F, 0.25F, -2.5F, 7, 2, 5, 0.0F, false);
			addBoxHelper(Body, 0, 52, -3.5F, 2.25F, -2.1F, 7, 3, 1, 0.0F, false);
			addBoxHelper(Body, 21, 53, -2.0F, 5.25F, -2.1F, 4, 1, 1, 0.0F, false);
			addBoxHelper(Body, 35, 53, -1.5F, 6.25F, -2.1F, 3, 2, 1, 0.0F, false);
			addBoxHelper(Body, 48, 49, -3.45F, 0.75F, -3.5F, 2, 4, 2, 0.0F, false);
			addBoxHelper(Body, 0, 68, 3.5F, 0.75F, -3.0F, 5, 1, 6, 0.0F, false);
			addBoxHelper(Body, 27, 58, -8.5F, 0.75F, -3.0F, 5, 1, 6, 0.0F, false);
			addBoxHelper(Body, 25, 67, 3.5F, -0.25F, -3.0F, 6, 1, 6, 0.0F, false);
			addBoxHelper(Body, 42, 0, -9.5F, -0.25F, -3.0F, 6, 1, 6, 0.0F, false);
			addBoxHelper(Body, 47, 10, 4.5F, -1.0F, -2.0F, 6, 1, 4, 0.0F, false);
			addBoxHelper(Body, 42, 34, -10.5F, -1.0F, -2.0F, 6, 1, 4, 0.0F, false);
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
			addBoxHelper(LeftArm, 15, 14, -0.5F, 4.5F, -2.5F, 3, 5, 5, 0.0F, false);
			addBoxHelper(LeftArm, 58, 24, 0.5F, 5.0F, -3.6F, 1, 4, 1, 0.0F, false);
			addBoxHelper(LeftArm, 49, 19, 0.5F, 6.5F, -2.6F, 1, 1, 1, 0.0F, false);
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(0.0F, 24.0F, 0.0F);
		}

		@Override
		public void render(MatrixStack ms, IVertexBuilder vb, int i1, int i2, float f1, float f2, float f3, float f4) {
			Body.render(ms, vb, i1, i2, f1, f2, f3, f4);
			LeftArm.render(ms, vb, i1, i2, f1, f2, f3, f4);
			RightArm.render(ms, vb, i1, i2, f1, f2, f3, f4);
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
