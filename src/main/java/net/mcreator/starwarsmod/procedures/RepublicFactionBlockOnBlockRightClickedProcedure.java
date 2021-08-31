package net.mcreator.starwarsmod.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.starwarsmod.StarwarsmodModVariables;
import net.mcreator.starwarsmod.StarwarsmodModElements;
import net.mcreator.starwarsmod.StarwarsmodMod;

import java.util.Map;

@StarwarsmodModElements.ModElement.Tag
public class RepublicFactionBlockOnBlockRightClickedProcedure extends StarwarsmodModElements.ModElement {
	public RepublicFactionBlockOnBlockRightClickedProcedure(StarwarsmodModElements instance) {
		super(instance, 464);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				StarwarsmodMod.LOGGER.warn("Failed to load dependency entity for procedure RepublicFactionBlockOnBlockRightClicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			double _setval = (double) 1;
			entity.getCapability(StarwarsmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Faction = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
