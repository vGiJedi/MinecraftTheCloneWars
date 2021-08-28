
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
public class AmmoBagItem extends StarwarsmodModElements.ModElement {
	@ObjectHolder("starwarsmod:ammo_bag_helmet")
	public static final Item helmet = null;
	@ObjectHolder("starwarsmod:ammo_bag_chestplate")
	public static final Item body = null;
	@ObjectHolder("starwarsmod:ammo_bag_leggings")
	public static final Item legs = null;
	@ObjectHolder("starwarsmod:ammo_bag_boots")
	public static final Item boots = null;
	public AmmoBagItem(StarwarsmodModElements instance) {
		super(instance, 354);
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
				return "ammo_bag";
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
				armorModel.bipedBody = new ModelAmmoBag().Body;
				armorModel.bipedLeftArm = new ModelAmmoBag().LeftArm;
				armorModel.bipedRightArm = new ModelAmmoBag().RightArm;
				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "starwarsmod:textures/ammobag.png";
			}
		}.setRegistryName("ammo_bag_chestplate"));
	}
	// Made with Blockbench 3.7.4
	// Exported for Minecraft version 1.14
	// Paste this class into your mod and generate all required imports
	public static class ModelAmmoBag extends EntityModel {
		private final ModelRenderer Body;
		private final ModelRenderer cube_r1;
		private final ModelRenderer RightArm;
		private final ModelRenderer LeftArm;
		public ModelAmmoBag() {
			textureWidth = 128;
			textureHeight = 128;
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 0.0F, 0.0F);
			addBoxHelper(Body, 0, 0, 4.0F, 12.0F, -3.0F, 2, 7, 6, 0.0F, false);
			addBoxHelper(Body, 0, 28, -9.0F, -1.0F, -3.0F, 5, 1, 6, 0.0F, false);
			addBoxHelper(Body, 0, 38, -7.0F, 0.0F, -3.0F, 3, 1, 6, 0.0F, false);
			addBoxHelper(Body, 21, 0, 4.5F, 12.5F, -3.5F, 1, 6, 7, 0.0F, false);
			addBoxHelper(Body, 0, 49, 4.25F, 12.5F, -2.0F, 2, 2, 4, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(6.0F, 7.0F, -2.0F);
			Body.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0F, 0.0F, 0.9599F);
			addBoxHelper(cube_r1, 31, 31, -2.0F, 3.5F, -1.0F, 1, 2, 1, 0.0F, false);
			addBoxHelper(cube_r1, 30, 37, -4.0F, 3.5F, -1.0F, 1, 2, 1, 0.0F, false);
			addBoxHelper(cube_r1, 23, 41, -6.0F, 3.5F, -1.0F, 1, 2, 1, 0.0F, false);
			addBoxHelper(cube_r1, 0, 19, -12.0F, 4.0F, -0.5F, 16, 1, 5, 0.0F, false);
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(0.0F, 24.0F, 0.0F);
		}

		@Override
		public void render(MatrixStack ms, IVertexBuilder vb, int i1, int i2, float f1, float f2, float f3, float f4) {
			Body.render(ms, vb, i1, i2, f1, f2, f3, f4);
			RightArm.render(ms, vb, i1, i2, f1, f2, f3, f4);
			LeftArm.render(ms, vb, i1, i2, f1, f2, f3, f4);
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
