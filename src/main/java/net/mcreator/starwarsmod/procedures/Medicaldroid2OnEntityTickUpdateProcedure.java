package net.mcreator.starwarsmod.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.command.FunctionObject;

import net.mcreator.starwarsmod.StarwarsmodModElements;
import net.mcreator.starwarsmod.StarwarsmodMod;

import java.util.function.Function;
import java.util.Optional;
import java.util.Map;
import java.util.Comparator;

@StarwarsmodModElements.ModElement.Tag
public class Medicaldroid2OnEntityTickUpdateProcedure extends StarwarsmodModElements.ModElement {
	public Medicaldroid2OnEntityTickUpdateProcedure(StarwarsmodModElements instance) {
		super(instance, 307);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				StarwarsmodMod.LOGGER.warn("Failed to load dependency entity for procedure Medicaldroid2OnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				StarwarsmodMod.LOGGER.warn("Failed to load dependency x for procedure Medicaldroid2OnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				StarwarsmodMod.LOGGER.warn("Failed to load dependency y for procedure Medicaldroid2OnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				StarwarsmodMod.LOGGER.warn("Failed to load dependency z for procedure Medicaldroid2OnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				StarwarsmodMod.LOGGER.warn("Failed to load dependency world for procedure Medicaldroid2OnEntityTickUpdate!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((Entity) world
				.getEntitiesWithinAABB(PlayerEntity.class,
						new AxisAlignedBB(x - (5 / 2d), y - (5 / 2d), z - (5 / 2d), x + (5 / 2d), y + (5 / 2d), z + (5 / 2d)), null)
				.stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null)) {
			if (!entity.world.isRemote && entity.world.getServer() != null) {
				Optional<FunctionObject> _fopt = entity.world.getServer().getFunctionManager().get(new ResourceLocation("heal"));
				if (_fopt.isPresent()) {
					FunctionObject _fobj = _fopt.get();
					entity.world.getServer().getFunctionManager().execute(_fobj, entity.getCommandSource());
				}
			}
		}
	}
}
