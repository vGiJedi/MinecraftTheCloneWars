package net.mcreator.starwarsmod.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.entity.Entity;

import net.mcreator.starwarsmod.entity.STAPEntity;
import net.mcreator.starwarsmod.entity.LR1KSonicCannonEntity;
import net.mcreator.starwarsmod.entity.J10DualBlasterCannonEntity;
import net.mcreator.starwarsmod.entity.EWHB12Entity;
import net.mcreator.starwarsmod.entity.ATRTEntity;
import net.mcreator.starwarsmod.StarwarsmodModElements;
import net.mcreator.starwarsmod.StarwarsmodMod;

import java.util.Map;
import java.util.HashMap;

@StarwarsmodModElements.ModElement.Tag
public class ATRTRIDINGProcedure extends StarwarsmodModElements.ModElement {
	public ATRTRIDINGProcedure(StarwarsmodModElements instance) {
		super(instance, 372);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				StarwarsmodMod.LOGGER.warn("Failed to load dependency entity for procedure ATRTRIDING!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity.getRidingEntity()) instanceof ATRTEntity.CustomEntity)) {
			entity.getPersistentData().putBoolean("RidingATRT", (true));
		} else if (((entity.getRidingEntity()) instanceof EWHB12Entity.CustomEntity)) {
			entity.getPersistentData().putBoolean("RidingEWEB", (true));
		} else if (((entity.getRidingEntity()) instanceof LR1KSonicCannonEntity.CustomEntity)) {
			entity.getPersistentData().putBoolean("RidingLR1K", (true));
		} else if (((entity.getRidingEntity()) instanceof J10DualBlasterCannonEntity.CustomEntity)) {
			entity.getPersistentData().putBoolean("RidingJ10", (true));
		} else if (((entity.getRidingEntity()) instanceof STAPEntity.CustomEntity)) {
			entity.getPersistentData().putBoolean("RidingSTAP", (true));
		} else {
			entity.getPersistentData().putBoolean("RidingATRT", (false));
			entity.getPersistentData().putBoolean("RidingEWEB", (false));
			entity.getPersistentData().putBoolean("RidingLR1K", (false));
			entity.getPersistentData().putBoolean("RidingJ10", (false));
			entity.getPersistentData().putBoolean("RidingSTAP", (false));
		}
	}

	@SubscribeEvent
	public void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			Entity entity = event.player;
			World world = entity.world;
			double i = entity.getPosX();
			double j = entity.getPosY();
			double k = entity.getPosZ();
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("x", i);
			dependencies.put("y", j);
			dependencies.put("z", k);
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("event", event);
			this.executeProcedure(dependencies);
		}
	}
}
