package net.mcreator.starwarsmod.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.starwarsmod.StarwarsmodModVariables;
import net.mcreator.starwarsmod.StarwarsmodModElements;
import net.mcreator.starwarsmod.StarwarsmodMod;

import java.util.Map;

@StarwarsmodModElements.ModElement.Tag
public class NeutralFactionConditionProcedure extends StarwarsmodModElements.ModElement {
	public NeutralFactionConditionProcedure(StarwarsmodModElements instance) {
		super(instance, 461);
	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				StarwarsmodMod.LOGGER.warn("Failed to load dependency entity for procedure NeutralFactionCondition!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity.getCapability(StarwarsmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new StarwarsmodModVariables.PlayerVariables())).Faction) == 0)) {
			return (true);
		}
		return (false);
	}
}
