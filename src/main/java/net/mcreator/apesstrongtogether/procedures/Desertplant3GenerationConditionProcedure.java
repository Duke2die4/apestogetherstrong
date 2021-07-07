package net.mcreator.apesstrongtogether.procedures;

import net.mcreator.apesstrongtogether.ApesStrongTogetherModElements;

import java.util.Map;

@ApesStrongTogetherModElements.ModElement.Tag
public class Desertplant3GenerationConditionProcedure extends ApesStrongTogetherModElements.ModElement {
	public Desertplant3GenerationConditionProcedure(ApesStrongTogetherModElements instance) {
		super(instance, 108);
	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if ((Math.random() > 0.9)) {
			return (true);
		}
		return (false);
	}
}
