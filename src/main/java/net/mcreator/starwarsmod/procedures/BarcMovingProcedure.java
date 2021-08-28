package net.mcreator.starwarsmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;

import net.mcreator.starwarsmod.StarwarsmodModElements;
import net.mcreator.starwarsmod.StarwarsmodMod;

import java.util.Map;

@StarwarsmodModElements.ModElement.Tag
public class BarcMovingProcedure extends StarwarsmodModElements.ModElement {
	public BarcMovingProcedure(StarwarsmodModElements instance) {
		super(instance, 211);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				StarwarsmodMod.LOGGER.warn("Failed to load dependency entity for procedure BarcMoving!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				StarwarsmodMod.LOGGER.warn("Failed to load dependency x for procedure BarcMoving!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				StarwarsmodMod.LOGGER.warn("Failed to load dependency y for procedure BarcMoving!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				StarwarsmodMod.LOGGER.warn("Failed to load dependency z for procedure BarcMoving!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				StarwarsmodMod.LOGGER.warn("Failed to load dependency world for procedure BarcMoving!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((entity.isBeingRidden())) {
			if (((entity.getPersistentData().getDouble("tickCounter")) < 73)) {
				entity.getPersistentData().putDouble("tickCounter", ((entity.getPersistentData().getDouble("tickCounter")) + 1));
			} else {
				entity.getPersistentData().putDouble("tickCounter", 0);
			}
		} else if (((entity.getPersistentData().getDouble("tickCounter")) == 35)) {
			if (!world.getWorld().isRemote) {
				world.playSound(null, new BlockPos((int) x, (int) y, (int) z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("starwarsmod:barcidle")),
						SoundCategory.NEUTRAL, (float) 0.3, (float) 1);
			} else {
				world.getWorld().playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("starwarsmod:barcidle")),
						SoundCategory.NEUTRAL, (float) 0.3, (float) 1, false);
			}
		} else {
			entity.getPersistentData().putDouble("tickCounter", 0);
		}
	}
}
