package apesstrongtogether.procedures;

import java.util.Map;

import apesstrongtogether.ApesStrongTogetherModElements;

@ApesStrongTogetherModElements.ModElement.Tag
public class Desertplant3GenerationConditionProcedure extends ApesStrongTogetherModElements.ModElement {
	public Desertplant3GenerationConditionProcedure(ApesStrongTogetherModElements instance) {
		super(instance, 161);
	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if ((Math.random() > 0.9)) {
			return (true);
		}
		return (false);
	}
}
