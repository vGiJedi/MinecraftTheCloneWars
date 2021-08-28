package net.mcreator.starwarsmod.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.Explosion;
import net.minecraft.particles.ParticleTypes;

import net.mcreator.starwarsmod.StarwarsmodModElements;
import net.mcreator.starwarsmod.StarwarsmodMod;

import java.util.Map;

@StarwarsmodModElements.ModElement.Tag
public class DC17MGRENADEBulletHitsBlockProcedure extends StarwarsmodModElements.ModElement {
	public DC17MGRENADEBulletHitsBlockProcedure(StarwarsmodModElements instance) {
		super(instance, 281);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				StarwarsmodMod.LOGGER.warn("Failed to load dependency x for procedure DC17MGRENADEBulletHitsBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				StarwarsmodMod.LOGGER.warn("Failed to load dependency y for procedure DC17MGRENADEBulletHitsBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				StarwarsmodMod.LOGGER.warn("Failed to load dependency z for procedure DC17MGRENADEBulletHitsBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				StarwarsmodMod.LOGGER.warn("Failed to load dependency world for procedure DC17MGRENADEBulletHitsBlock!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (world instanceof World && !world.getWorld().isRemote) {
			world.getWorld().createExplosion(null, (int) x, (int) y, (int) z, (float) 1, Explosion.Mode.BREAK);
		}
		world.addParticle(ParticleTypes.EXPLOSION, x, y, z, 10, 10, 10);
	}
}
