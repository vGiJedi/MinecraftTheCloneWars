package net.mcreator.starwarsmod.procedures;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.starwarsmod.item.StapFireItem;
import net.mcreator.starwarsmod.item.LR1KSonicCannonShotItem;
import net.mcreator.starwarsmod.item.J10DualBlasterCannonShotItem;
import net.mcreator.starwarsmod.item.EWEBBlasterItem;
import net.mcreator.starwarsmod.item.ATRTBlasterItem;
import net.mcreator.starwarsmod.StarwarsmodModElements;
import net.mcreator.starwarsmod.StarwarsmodMod;

import java.util.Random;
import java.util.Map;

@StarwarsmodModElements.ModElement.Tag
public class VehicleBlasterATRTOnKeyPressedProcedure extends StarwarsmodModElements.ModElement {
	public VehicleBlasterATRTOnKeyPressedProcedure(StarwarsmodModElements instance) {
		super(instance, 370);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				StarwarsmodMod.LOGGER.warn("Failed to load dependency entity for procedure VehicleBlasterATRTOnKeyPressed!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity.getPersistentData().getBoolean("RidingATRT"))) {
			if ((entity.getRidingEntity()) instanceof LivingEntity) {
				Entity _ent = (entity.getRidingEntity());
				if (!_ent.world.isRemote) {
					ATRTBlasterItem.shoot(_ent.world, (LivingEntity) (entity.getRidingEntity()), new Random(), (float) 1, (float) 6, (int) 2);
				}
			}
		} else if ((entity.getPersistentData().getBoolean("RidingEWEB"))) {
			if ((entity.getRidingEntity()) instanceof LivingEntity) {
				Entity _ent = (entity.getRidingEntity());
				if (!_ent.world.isRemote) {
					EWEBBlasterItem.shoot(_ent.world, (LivingEntity) (entity.getRidingEntity()), new Random(), (float) 1, (float) 5.5, (int) 1);
				}
			}
		} else if ((entity.getPersistentData().getBoolean("RidingJ10"))) {
			if ((entity.getRidingEntity()) instanceof LivingEntity) {
				Entity _ent = (entity.getRidingEntity());
				if (!_ent.world.isRemote) {
					J10DualBlasterCannonShotItem.shoot(_ent.world, (LivingEntity) (entity.getRidingEntity()), new Random(), (float) 1, (float) 5,
							(int) 1);
				}
			}
		} else if ((entity.getPersistentData().getBoolean("RidingLR1K"))) {
			if ((entity.getRidingEntity()) instanceof LivingEntity) {
				Entity _ent = (entity.getRidingEntity());
				if (!_ent.world.isRemote) {
					LR1KSonicCannonShotItem.shoot(_ent.world, (LivingEntity) (entity.getRidingEntity()), new Random(), (float) 1, (float) 7, (int) 3);
				}
			}
		} else if ((entity.getPersistentData().getBoolean("RidingSTAP"))) {
			if ((entity.getRidingEntity()) instanceof LivingEntity) {
				Entity _ent = (entity.getRidingEntity());
				if (!_ent.world.isRemote) {
					StapFireItem.shoot(_ent.world, (LivingEntity) (entity.getRidingEntity()), new Random(), (float) 1, (float) 5, (int) 2);
				}
			}
		}
	}
}
