package net.mcreator.apesstrongtogether.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.apesstrongtogether.ApesStrongTogetherModElements;
import net.mcreator.apesstrongtogether.ApesStrongTogetherMod;

import java.util.Map;

@ApesStrongTogetherModElements.ModElement.Tag
public class ApemeatFoodEatenProcedure extends ApesStrongTogetherModElements.ModElement {
	public ApemeatFoodEatenProcedure(ApesStrongTogetherModElements instance) {
		super(instance, 139);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ApesStrongTogetherMod.LOGGER.warn("Failed to load dependency entity for procedure ApemeatFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((Math.random() < 0.3)) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.POISON, (int) 100, (int) 1));
		}
	}
}
