
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

import net.mcreator.starwarsmod.itemgroup.StarWarsArmourItemGroup;
import net.mcreator.starwarsmod.StarwarsmodModElements;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@StarwarsmodModElements.ModElement.Tag
public class VaughnsHelmetItem extends StarwarsmodModElements.ModElement {
	@ObjectHolder("starwarsmod:vaughns_helmet_helmet")
	public static final Item helmet = null;
	@ObjectHolder("starwarsmod:vaughns_helmet_chestplate")
	public static final Item body = null;
	@ObjectHolder("starwarsmod:vaughns_helmet_leggings")
	public static final Item legs = null;
	@ObjectHolder("starwarsmod:vaughns_helmet_boots")
	public static final Item boots = null;
	public VaughnsHelmetItem(StarwarsmodModElements instance) {
		super(instance, 328);
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
				return "vaughns_helmet";
			}

			public float getToughness() {
				return 0f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(StarWarsArmourItemGroup.tab)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public BipedModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlotType slot, BipedModel defaultModel) {
				BipedModel armorModel = new BipedModel(1);
				armorModel.bipedHead = new ModelVaughn_Helmet().Head;
				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "starwarsmod:textures/vaughn_helmet.png";
			}
		}.setRegistryName("vaughns_helmet_helmet"));
	}
	// Made with Blockbench 3.7.4
	// Exported for Minecraft version 1.14
	// Paste this class into your mod and generate all required imports
	public static class ModelVaughn_Helmet extends EntityModel {
		private final ModelRenderer Head;
		public ModelVaughn_Helmet() {
			textureWidth = 128;
			textureHeight = 128;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 0.0F, 0.0F);
			addBoxHelper(Head, 0, 78, -4.5F, -10.5F, 0.5F, 1, 7, 1, 0.0F, false);
			addBoxHelper(Head, 0, 89, 4.25F, -5.5F, -1.0F, 1, 3, 2, 0.0F, true);
			addBoxHelper(Head, 0, 96, 4.0F, -4.5F, -0.5F, 1, 1, 1, 0.0F, true);
			addBoxHelper(Head, 0, 100, 4.25F, -9.5F, -0.5F, 1, 4, 1, 0.0F, true);
			addBoxHelper(Head, 0, 108, -0.5F, -1.0F, -4.2F, 1, 2, 5, 0.0F, false);
			addBoxHelper(Head, 0, 118, -3.5F, -7.5F, -5.0F, 7, 1, 1, 0.0F, false);
			addBoxHelper(Head, 9, 77, -0.5F, -8.5F, -3.5F, 1, 1, 7, 0.0F, false);
			addBoxHelper(Head, 9, 87, 1.5F, -8.25F, -3.0F, 1, 1, 6, 0.0F, false);
			addBoxHelper(Head, 13, 97, -2.5F, -8.25F, -3.0F, 1, 1, 6, 0.0F, true);
			addBoxHelper(Head, 15, 107, 3.5F, -7.75F, -5.5F, 1, 1, 2, 0.0F, false);
			addBoxHelper(Head, 17, 112, -5.0F, -7.0F, -6.0F, 10, 1, 2, 0.0F, false);
			addBoxHelper(Head, 28, 78, -5.0F, -7.0F, -4.0F, 1, 1, 5, 0.0F, false);
			addBoxHelper(Head, 27, 88, 4.0F, -7.0F, -4.0F, 1, 1, 5, 0.0F, true);
			addBoxHelper(Head, 31, 98, -5.0F, -6.0F, -6.0F, 1, 1, 6, 0.0F, false);
			addBoxHelper(Head, 23, 118, 4.0F, -6.0F, -6.0F, 1, 1, 6, 0.0F, true);
			addBoxHelper(Head, 45, 79, -5.0F, -5.0F, -6.0F, 1, 1, 5, 0.0F, false);
			addBoxHelper(Head, 0, 67, 4.0F, -5.0F, -6.0F, 1, 1, 5, 0.0F, true);
			addBoxHelper(Head, 16, 68, -5.0F, -4.0F, -5.0F, 1, 1, 4, 0.0F, false);
			addBoxHelper(Head, 46, 89, 4.0F, -4.0F, -5.0F, 1, 1, 4, 0.0F, true);
			addBoxHelper(Head, 44, 108, -5.0F, -3.0F, -4.0F, 1, 1, 3, 0.0F, false);
			addBoxHelper(Head, 43, 116, 4.0F, -3.0F, -4.0F, 1, 1, 3, 0.0F, true);
		}

		@Override
		public void render(MatrixStack ms, IVertexBuilder vb, int i1, int i2, float f1, float f2, float f3, float f4) {
			Head.render(ms, vb, i1, i2, f1, f2, f3, f4);
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
