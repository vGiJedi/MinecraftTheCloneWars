
package net.mcreator.starwarsmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.starwarsmod.block.WallLightAlternativeBlock;
import net.mcreator.starwarsmod.StarwarsmodModElements;

@StarwarsmodModElements.ModElement.Tag
public class StarWarsLightsItemGroup extends StarwarsmodModElements.ModElement {
	public StarWarsLightsItemGroup(StarwarsmodModElements instance) {
		super(instance, 99);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabstar_wars_lights") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(WallLightAlternativeBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
