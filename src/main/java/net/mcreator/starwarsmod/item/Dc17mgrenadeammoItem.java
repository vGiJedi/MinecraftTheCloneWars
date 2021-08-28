
package net.mcreator.starwarsmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.starwarsmod.itemgroup.StarWarsWeaponsItemGroup;
import net.mcreator.starwarsmod.StarwarsmodModElements;

@StarwarsmodModElements.ModElement.Tag
public class Dc17mgrenadeammoItem extends StarwarsmodModElements.ModElement {
	@ObjectHolder("starwarsmod:dc_17mgrenadeammo")
	public static final Item block = null;
	public Dc17mgrenadeammoItem(StarwarsmodModElements instance) {
		super(instance, 279);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(StarWarsWeaponsItemGroup.tab).maxStackSize(3).rarity(Rarity.COMMON));
			setRegistryName("dc_17mgrenadeammo");
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
