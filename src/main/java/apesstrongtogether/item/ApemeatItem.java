
package apesstrongtogether.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.entity.LivingEntity;

import java.util.Map;
import java.util.HashMap;

import apesstrongtogether.procedures.ApemeatFoodEatenProcedure;

import apesstrongtogether.ApesStrongTogetherModElements;

@ApesStrongTogetherModElements.ModElement.Tag
public class ApemeatItem extends ApesStrongTogetherModElements.ModElement {
	@ObjectHolder("apes_strong_together:apemeat")
	public static final Item block = null;
	public ApemeatItem(ApesStrongTogetherModElements instance) {
		super(instance, 47);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(2).saturation(1.2f).meat().build()));
			setRegistryName("apemeat");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 20;
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

		@Override
		public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity entity) {
			ItemStack retval = super.onItemUseFinish(itemstack, world, entity);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				ApemeatFoodEatenProcedure.executeProcedure($_dependencies);
			}
			return retval;
		}
	}
}
