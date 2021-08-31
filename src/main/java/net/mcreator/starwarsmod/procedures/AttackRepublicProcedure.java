package net.mcreator.starwarsmod.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.starwarsmod.StarwarsmodModVariables;
import net.mcreator.starwarsmod.StarwarsmodModElements;
import net.mcreator.starwarsmod.StarwarsmodMod;

import java.util.Map;

@StarwarsmodModElements.ModElement.Tag
public class AttackRepublicProcedure extends StarwarsmodModElements.ModElement {
	public AttackRepublicProcedure(StarwarsmodModElements instance) {
		super(instance, 469);
	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				StarwarsmodMod.LOGGER.warn("Failed to load dependency entity for procedure AttackRepublic!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity.getCapability(StarwarsmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new StarwarsmodModVariables.PlayerVariables())).Faction) == 1)) {
			return (true);
		}
		return (false);
	}
}
