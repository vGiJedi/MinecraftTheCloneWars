
package net.mcreator.starwarsmod.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
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
public class MaulsHornsItem extends StarwarsmodModElements.ModElement {
	@ObjectHolder("starwarsmod:mauls_horns_helmet")
	public static final Item helmet = null;
	@ObjectHolder("starwarsmod:mauls_horns_chestplate")
	public static final Item body = null;
	@ObjectHolder("starwarsmod:mauls_horns_leggings")
	public static final Item legs = null;
	@ObjectHolder("starwarsmod:mauls_horns_boots")
	public static final Item boots = null;
	public MaulsHornsItem(StarwarsmodModElements instance) {
		super(instance, 344);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 1;
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
				return "mauls_horns";
			}

			public float getToughness() {
				return 0f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public BipedModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlotType slot, BipedModel defaultModel) {
				BipedModel armorModel = new BipedModel(1);
				armorModel.bipedHead = new Modelmaulshorns().Head;
				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "starwarsmod:textures/maulshorns.png";
			}
		}.setRegistryName("mauls_horns_helmet"));
	}
	// Made with Blockbench 3.7.4
	// Exported for Minecraft version 1.14
	// Paste this class into your mod and generate all required imports
	public static class Modelmaulshorns extends EntityModel {
		private final ModelRenderer Head;
		public Modelmaulshorns() {
			textureWidth = 128;
			textureHeight = 128;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 0.0F, 0.0F);
			addBoxHelper(Head, 0, 120, 3.5F, -6.5F, -2.0F, 2, 1, 1, 0.0F, true);
			addBoxHelper(Head, 11, 112, 4.5F, -7.5F, -2.0F, 1, 1, 1, 0.0F, true);
			addBoxHelper(Head, 30, 101, -5.5F, -6.5F, -2.0F, 2, 1, 1, 0.0F, false);
			addBoxHelper(Head, 20, 112, -5.5F, -7.5F, -2.0F, 1, 1, 1, 0.0F, false);
			addBoxHelper(Head, 30, 108, -0.5F, -9.0F, -3.0F, 1, 1, 1, 0.0F, false);
			addBoxHelper(Head, 0, 105, 2.0F, -9.0F, -2.25F, 1, 1, 1, 0.0F, false);
			addBoxHelper(Head, 0, 100, -3.0F, -9.0F, -2.25F, 1, 1, 1, 0.0F, false);
			addBoxHelper(Head, 1, 125, 3.5F, -6.75F, 2.0F, 2, 1, 1, 0.0F, true);
			addBoxHelper(Head, 20, 117, 4.5F, -8.75F, 2.0F, 1, 2, 1, 0.0F, true);
			addBoxHelper(Head, 31, 115, -5.5F, -8.75F, 2.0F, 1, 2, 1, 0.0F, false);
			addBoxHelper(Head, 9, 117, -5.5F, -6.75F, 2.0F, 2, 1, 1, 0.0F, false);
			addBoxHelper(Head, 19, 100, -0.5F, -9.0F, 2.5F, 1, 1, 1, 0.0F, false);
			addBoxHelper(Head, 12, 106, -0.5F, -6.0F, 3.5F, 1, 1, 2, 0.0F, false);
			addBoxHelper(Head, 11, 100, -0.5F, -8.0F, 4.5F, 1, 2, 1, 0.0F, false);
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
