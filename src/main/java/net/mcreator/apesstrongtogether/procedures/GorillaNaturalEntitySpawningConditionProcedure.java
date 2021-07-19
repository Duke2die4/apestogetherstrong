package net.mcreator.apesstrongtogether.procedures;

import net.minecraft.world.World;
import net.minecraft.entity.Entity;

import net.mcreator.apesstrongtogether.ApesStrongTogetherModElements;
import net.mcreator.apesstrongtogether.ApesStrongTogetherMod;

import java.util.Map;

@ApesStrongTogetherModElements.ModElement.Tag
public class GorillaNaturalEntitySpawningConditionProcedure extends ApesStrongTogetherModElements.ModElement {
	public GorillaNaturalEntitySpawningConditionProcedure(ApesStrongTogetherModElements instance) {
		super(instance, 167);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ApesStrongTogetherMod.LOGGER.warn("Failed to load dependency entity for procedure GorillaNaturalEntitySpawningCondition!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((!((entity.world.getDimensionKey()) == (World.OVERWORLD)))) {
			if (!entity.world.isRemote())
				entity.remove();
		}
	}
}
