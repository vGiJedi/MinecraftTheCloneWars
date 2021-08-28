
package net.mcreator.starwarsmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.starwarsmod.itemgroup.StarWarsWeaponsItemGroup;
import net.mcreator.starwarsmod.StarwarsmodModElements;

@StarwarsmodModElements.ModElement.Tag
public class RPS6RocketAmmunitionItem extends StarwarsmodModElements.ModElement {
	@ObjectHolder("starwarsmod:rps_6_rocket_ammunition")
	public static final Item block = null;
	public RPS6RocketAmmunitionItem(StarwarsmodModElements instance) {
		super(instance, 215);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(StarWarsWeaponsItemGroup.tab).maxStackSize(6).rarity(Rarity.COMMON));
			setRegistryName("rps_6_rocket_ammunition");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
