
package net.mcreator.starwarsmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.starwarsmod.item.VehicleIconItem;
import net.mcreator.starwarsmod.StarwarsmodModElements;

@StarwarsmodModElements.ModElement.Tag
public class VehiclesItemGroup extends StarwarsmodModElements.ModElement {
	public VehiclesItemGroup(StarwarsmodModElements instance) {
		super(instance, 212);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabvehicles") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(VehicleIconItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
