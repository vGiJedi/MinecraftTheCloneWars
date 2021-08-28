package net.mcreator.starwarsmod.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.entity.player.PlayerEntity;
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
public class VehicleWeaponHintProcedure extends StarwarsmodModElements.ModElement {
	public VehicleWeaponHintProcedure(StarwarsmodModElements instance) {
		super(instance, 433);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				StarwarsmodMod.LOGGER.warn("Failed to load dependency entity for procedure VehicleWeaponHint!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity instanceof EWHB12Entity.CustomEntity)) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("Press 1 To Fire"), (true));
			}
		} else if ((entity instanceof ATRTEntity.CustomEntity)) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("Press 1 To Fire"), (true));
			}
		} else if ((entity instanceof LR1KSonicCannonEntity.CustomEntity)) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("Press 1 To Fire"), (true));
			}
		} else if ((entity instanceof J10DualBlasterCannonEntity.CustomEntity)) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("Press 1 To Fire"), (true));
			}
		} else if ((entity instanceof STAPEntity.CustomEntity)) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("Press 1 To Fire"), (true));
			}
		}
	}

	@SubscribeEvent
	public void onRightClickEntity(PlayerInteractEvent.EntityInteract event) {
		Entity entity = event.getTarget();
		PlayerEntity sourceentity = event.getPlayer();
		if (event.getHand() != sourceentity.getActiveHand())
			return;
		int i = event.getPos().getX();
		int j = event.getPos().getY();
		int k = event.getPos().getZ();
		World world = event.getWorld();
		Map<String, Object> dependencies = new HashMap<>();
		dependencies.put("x", i);
		dependencies.put("y", j);
		dependencies.put("z", k);
		dependencies.put("world", world);
		dependencies.put("entity", entity);
		dependencies.put("sourceentity", sourceentity);
		dependencies.put("event", event);
		this.executeProcedure(dependencies);
	}
}
