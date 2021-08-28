
package net.mcreator.starwarsmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.block.Blocks;

import net.mcreator.starwarsmod.StarwarsmodModElements;

@StarwarsmodModElements.ModElement.Tag
public class StarWarsWindowsItemGroup extends StarwarsmodModElements.ModElement {
	public StarWarsWindowsItemGroup(StarwarsmodModElements instance) {
		super(instance, 102);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabstar_wars_windows") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Blocks.GLASS);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
