
package net.mcreator.starwarsmod.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.BipedModel;

import net.mcreator.starwarsmod.procedures.CloneJetpackWhiteBodyTickEventProcedure;
import net.mcreator.starwarsmod.itemgroup.StarWarsArmourItemGroup;
import net.mcreator.starwarsmod.StarwarsmodModElements;

import java.util.Map;
import java.util.HashMap;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@StarwarsmodModElements.ModElement.Tag
public class CloneJetpackWhiteItem extends StarwarsmodModElements.ModElement {
	@ObjectHolder("starwarsmod:clone_jetpack_white_helmet")
	public static final Item helmet = null;
	@ObjectHolder("starwarsmod:clone_jetpack_white_chestplate")
	public static final Item body = null;
	@ObjectHolder("starwarsmod:clone_jetpack_white_leggings")
	public static final Item legs = null;
	@ObjectHolder("starwarsmod:clone_jetpack_white_boots")
	public static final Item boots = null;
	public CloneJetpackWhiteItem(StarwarsmodModElements instance) {
		super(instance, 327);
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
				return "clone_jetpack_white";
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
				armorModel.bipedBody = new ModelCloneJetpackWhite115().Body;
				armorModel.bipedLeftArm = new ModelCloneJetpackWhite115().Body;
				armorModel.bipedRightArm = new ModelCloneJetpackWhite115().Body;
				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "starwarsmod:textures/clonejetpackwhite.png";
			}

			@Override
			public void onArmorTick(ItemStack itemstack, World world, PlayerEntity entity) {
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					$_dependencies.put("itemstack", itemstack);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					$_dependencies.put("world", world);
					CloneJetpackWhiteBodyTickEventProcedure.executeProcedure($_dependencies);
				}
			}
		}.setRegistryName("clone_jetpack_white_chestplate"));
	}
	// Made with Blockbench 3.7.4
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class ModelCloneJetpackWhite115 extends EntityModel<Entity> {
		private final ModelRenderer Body;
		public ModelCloneJetpackWhite115() {
			textureWidth = 128;
			textureHeight = 128;
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 0.0F, 0.0F);
			Body.setTextureOffset(0, 0).addBox(-1.5F, 2.0F, 1.0F, 3.0F, 5.0F, 2.0F, 0.0F, false);
			Body.setTextureOffset(0, 10).addBox(-2.0F, 1.0F, 2.5F, 4.0F, 5.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(0, 18).addBox(-2.0F, 4.0F, 2.75F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(0, 22).addBox(-2.0F, 2.0F, 2.75F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(0, 28).addBox(-4.0F, 0.75F, 2.0F, 3.0F, 10.0F, 2.0F, 0.0F, false);
			Body.setTextureOffset(0, 44).addBox(-3.0F, 1.75F, 2.2F, 1.0F, 8.0F, 2.0F, 0.0F, false);
			Body.setTextureOffset(9, 43).addBox(2.0F, 1.75F, 2.2F, 1.0F, 8.0F, 2.0F, 0.0F, true);
			Body.setTextureOffset(14, 0).addBox(-3.5F, 10.75F, 1.75F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			Body.setTextureOffset(14, 7).addBox(-3.25F, 0.5F, 1.75F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			Body.setTextureOffset(28, 0).addBox(1.25F, 0.5F, 1.75F, 2.0F, 1.0F, 2.0F, 0.0F, true);
			Body.setTextureOffset(28, 9).addBox(1.5F, 10.75F, 1.75F, 2.0F, 1.0F, 2.0F, 0.0F, true);
			Body.setTextureOffset(31, 16).addBox(1.0F, 0.75F, 2.0F, 3.0F, 10.0F, 2.0F, 0.0F, true);
			Body.setTextureOffset(16, 16).addBox(-0.5F, 5.0F, 2.2F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Body.render(matrixStack, buffer, packedLight, packedOverlay);
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
