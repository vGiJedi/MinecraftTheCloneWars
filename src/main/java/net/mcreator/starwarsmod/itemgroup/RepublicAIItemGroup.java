
package net.mcreator.starwarsmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.starwarsmod.item.RepublicIconItem;
import net.mcreator.starwarsmod.StarwarsmodModElements;

@StarwarsmodModElements.ModElement.Tag
public class RepublicAIItemGroup extends StarwarsmodModElements.ModElement {
	public RepublicAIItemGroup(StarwarsmodModElements instance) {
		super(instance, 446);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabrepublic_ai") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(RepublicIconItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
