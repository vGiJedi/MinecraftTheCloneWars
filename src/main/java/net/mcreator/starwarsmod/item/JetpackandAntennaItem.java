
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
public class JetpackandAntennaItem extends StarwarsmodModElements.ModElement {
	@ObjectHolder("starwarsmod:jetpackand_antenna_helmet")
	public static final Item helmet = null;
	@ObjectHolder("starwarsmod:jetpackand_antenna_chestplate")
	public static final Item body = null;
	@ObjectHolder("starwarsmod:jetpackand_antenna_leggings")
	public static final Item legs = null;
	@ObjectHolder("starwarsmod:jetpackand_antenna_boots")
	public static final Item boots = null;
	public JetpackandAntennaItem(StarwarsmodModElements instance) {
		super(instance, 351);
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
				return "jetpackand_antenna";
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
				armorModel.bipedBody = new ModelCloneJetpackandAntenna().Body;
				armorModel.bipedLeftArm = new ModelCloneJetpackandAntenna().LeftArm;
				armorModel.bipedRightArm = new ModelCloneJetpackandAntenna().RightArm;
				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "starwarsmod:textures/clonejetpackandantenna.png";
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
		}.setRegistryName("jetpackand_antenna_chestplate"));
	}
	// Made with Blockbench 3.7.4
	// Exported for Minecraft version 1.14
	// Paste this class into your mod and generate all required imports
	public static class ModelCloneJetpackandAntenna extends EntityModel {
		private final ModelRenderer Body;
		private final ModelRenderer LeftArm;
		private final ModelRenderer LeftArm_r1;
		private final ModelRenderer RightArm;
		public ModelCloneJetpackandAntenna() {
			textureWidth = 128;
			textureHeight = 128;
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 0.0F, 0.0F);
			addBoxHelper(Body, 0, 0, -1.5F, 2.0F, 1.0F, 3, 5, 2, 0.0F, false);
			addBoxHelper(Body, 0, 10, -2.0F, 1.0F, 2.5F, 4, 5, 1, 0.0F, false);
			addBoxHelper(Body, 0, 18, -2.0F, 4.0F, 2.75F, 4, 1, 1, 0.0F, false);
			addBoxHelper(Body, 0, 22, -2.0F, 2.0F, 2.75F, 4, 1, 1, 0.0F, false);
			addBoxHelper(Body, 0, 28, -4.0F, 0.75F, 2.0F, 3, 10, 2, 0.0F, false);
			addBoxHelper(Body, 0, 44, -3.0F, 1.75F, 2.2F, 1, 8, 2, 0.0F, false);
			addBoxHelper(Body, 9, 43, 2.0F, 1.75F, 2.2F, 1, 8, 2, 0.0F, true);
			addBoxHelper(Body, 14, 0, -3.5F, 10.75F, 1.75F, 2, 1, 2, 0.0F, false);
			addBoxHelper(Body, 14, 7, -3.25F, 0.5F, 1.75F, 2, 1, 2, 0.0F, false);
			addBoxHelper(Body, 28, 0, 1.25F, 0.5F, 1.75F, 2, 1, 2, 0.0F, true);
			addBoxHelper(Body, 28, 9, 1.5F, 10.75F, 1.75F, 2, 1, 2, 0.0F, true);
			addBoxHelper(Body, 31, 16, 1.0F, 0.75F, 2.0F, 3, 10, 2, 0.0F, true);
			addBoxHelper(Body, 16, 16, -0.5F, 5.0F, 2.2F, 1, 5, 1, 0.0F, false);
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
			LeftArm_r1 = new ModelRenderer(this);
			LeftArm_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			LeftArm.addChild(LeftArm_r1);
			setRotationAngle(LeftArm_r1, -0.7854F, 0.0F, 0.0F);
			addBoxHelper(LeftArm_r1, 37, 36, 0.0F, -1.8F, -2.0F, 2, 2, 2, 0.0F, false);
			addBoxHelper(LeftArm_r1, 27, 35, 0.5F, -7.0F, -1.5F, 1, 7, 1, 0.0F, false);
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
