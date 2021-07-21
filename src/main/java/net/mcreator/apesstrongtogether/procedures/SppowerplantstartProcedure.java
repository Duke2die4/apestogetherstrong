package net.mcreator.apesstrongtogether.procedures;

import net.minecraft.world.IWorld;

import net.mcreator.apesstrongtogether.ApesStrongTogetherModElements;
import net.mcreator.apesstrongtogether.ApesStrongTogetherMod;

import java.util.Map;

import com.google.common.collect.ImmutableMap;

@ApesStrongTogetherModElements.ModElement.Tag
public class SppowerplantstartProcedure extends ApesStrongTogetherModElements.ModElement {
	public SppowerplantstartProcedure(ApesStrongTogetherModElements instance) {
		super(instance, 194);
	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ApesStrongTogetherMod.LOGGER.warn("Failed to load dependency x for procedure Sppowerplantstart!");
			return false;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ApesStrongTogetherMod.LOGGER.warn("Failed to load dependency y for procedure Sppowerplantstart!");
			return false;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ApesStrongTogetherMod.LOGGER.warn("Failed to load dependency z for procedure Sppowerplantstart!");
			return false;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ApesStrongTogetherMod.LOGGER.warn("Failed to load dependency world for procedure Sppowerplantstart!");
			return false;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((SppowerplantProcedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world)) == (true))) {
			return (true);
		}
		return (false);
	}
}
