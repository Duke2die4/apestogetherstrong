package net.mcreator.apesstrongtogether.procedures;

import net.minecraft.world.IWorld;

import net.mcreator.apesstrongtogether.ApesStrongTogetherModElements;
import net.mcreator.apesstrongtogether.ApesStrongTogetherMod;

import java.util.Map;

import com.google.common.collect.ImmutableMap;

@ApesStrongTogetherModElements.ModElement.Tag
public class SpfactorystartProcedure extends ApesStrongTogetherModElements.ModElement {
	public SpfactorystartProcedure(ApesStrongTogetherModElements instance) {
		super(instance, 196);
	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ApesStrongTogetherMod.LOGGER.warn("Failed to load dependency x for procedure Spfactorystart!");
			return false;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ApesStrongTogetherMod.LOGGER.warn("Failed to load dependency y for procedure Spfactorystart!");
			return false;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ApesStrongTogetherMod.LOGGER.warn("Failed to load dependency z for procedure Spfactorystart!");
			return false;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ApesStrongTogetherMod.LOGGER.warn("Failed to load dependency world for procedure Spfactorystart!");
			return false;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((SpfactoryProcedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world)) == (true))) {
			return (true);
		}
		return (false);
	}
}
