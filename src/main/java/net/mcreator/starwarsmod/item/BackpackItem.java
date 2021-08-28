
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
public class BackpackItem extends StarwarsmodModElements.ModElement {
	@ObjectHolder("starwarsmod:backpack_helmet")
	public static final Item helmet = null;
	@ObjectHolder("starwarsmod:backpack_chestplate")
	public static final Item body = null;
	@ObjectHolder("starwarsmod:backpack_leggings")
	public static final Item legs = null;
	@ObjectHolder("starwarsmod:backpack_boots")
	public static final Item boots = null;
	public BackpackItem(StarwarsmodModElements instance) {
		super(instance, 311);
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
				return "backpack";
			}

			public float getToughness() {
				return 0f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(StarWarsArmourItemGroup.tab)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public BipedModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlotType slot, BipedModel defaultModel) {
				BipedModel armorModel = new BipedModel(1);
				armorModel.bipedBody = new ModelBackpack115().Body;
				armorModel.bipedLeftArm = new ModelBackpack115().LeftArm;
				armorModel.bipedRightArm = new ModelBackpack115().RightArm;
				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "starwarsmod:textures/backpack.png";
			}
		}.setRegistryName("backpack_chestplate"));
	}
	// Made with Blockbench 3.7.4
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class ModelBackpack115 extends EntityModel<Entity> {
		private final ModelRenderer Body;
		private final ModelRenderer LeftArm;
		private final ModelRenderer RightArm;
		public ModelBackpack115() {
			textureWidth = 128;
			textureHeight = 128;
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 0.0F, 0.0F);
			Body.setTextureOffset(0, 34).addBox(-3.0F, 1.0F, 2.0F, 6.0F, 8.0F, 4.0F, 0.0F, false);
			Body.setTextureOffset(22, 36).addBox(-2.0F, 0.8F, 2.2F, 4.0F, 2.0F, 4.0F, 0.0F, false);
			Body.setTextureOffset(35, 25).addBox(-2.5F, 9.0F, 2.0F, 5.0F, 1.0F, 3.0F, 0.0F, false);
			Body.setTextureOffset(34, 16).addBox(-2.0F, 8.5F, 4.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(38, 0).addBox(-3.5F, 5.25F, 1.25F, 1.0F, 3.0F, 4.0F, 0.0F, false);
			Body.setTextureOffset(50, 14).addBox(2.5F, 5.25F, 1.25F, 1.0F, 3.0F, 4.0F, 0.0F, false);
			Body.setTextureOffset(53, 26).addBox(2.5F, 1.25F, 1.25F, 1.0F, 3.0F, 4.0F, 0.0F, false);
			Body.setTextureOffset(43, 39).addBox(-3.5F, 1.25F, 1.25F, 1.0F, 3.0F, 4.0F, 0.0F, false);
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(0.0F, 24.0F, 0.0F);
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(0.0F, 24.0F, 0.0F);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Body.render(matrixStack, buffer, packedLight, packedOverlay);
			LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
			RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
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
