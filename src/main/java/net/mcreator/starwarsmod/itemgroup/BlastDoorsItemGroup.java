
package net.mcreator.starwarsmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.starwarsmod.block.BlastDoorBottomClosedBlock;
import net.mcreator.starwarsmod.StarwarsmodModElements;

@StarwarsmodModElements.ModElement.Tag
public class BlastDoorsItemGroup extends StarwarsmodModElements.ModElement {
	public BlastDoorsItemGroup(StarwarsmodModElements instance) {
		super(instance, 98);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabblast_doors") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(BlastDoorBottomClosedBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
