
package net.mcreator.starwarsmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.starwarsmod.item.MobIconItem;
import net.mcreator.starwarsmod.StarwarsmodModElements;

@StarwarsmodModElements.ModElement.Tag
public class StarWarsMobsItemGroup extends StarwarsmodModElements.ModElement {
	public StarWarsMobsItemGroup(StarwarsmodModElements instance) {
		super(instance, 109);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabstar_wars_mobs") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(MobIconItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
