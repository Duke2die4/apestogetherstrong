package apesstrongtogether.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.BlockState;

import java.util.Map;

import apesstrongtogether.block.LanternBlock;

import apesstrongtogether.ApesStrongTogetherModElements;

import apesstrongtogether.ApesStrongTogetherMod;

@ApesStrongTogetherModElements.ModElement.Tag
public class LanterndarkUpdateTickProcedure extends ApesStrongTogetherModElements.ModElement {
	public LanterndarkUpdateTickProcedure(ApesStrongTogetherModElements instance) {
		super(instance, 321);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ApesStrongTogetherMod.LOGGER.warn("Failed to load dependency x for procedure LanterndarkUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ApesStrongTogetherMod.LOGGER.warn("Failed to load dependency y for procedure LanterndarkUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ApesStrongTogetherMod.LOGGER.warn("Failed to load dependency z for procedure LanterndarkUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ApesStrongTogetherMod.LOGGER.warn("Failed to load dependency world for procedure LanterndarkUpdateTick!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		{
			BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
			BlockState _bs = LanternBlock.block.getDefaultState();
			world.setBlockState(_bp, _bs, 3);
		}
	}
}
