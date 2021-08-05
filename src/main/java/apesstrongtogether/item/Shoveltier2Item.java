
package apesstrongtogether.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import apesstrongtogether.ApesStrongTogetherModElements;

@ApesStrongTogetherModElements.ModElement.Tag
public class Shoveltier2Item extends ApesStrongTogetherModElements.ModElement {
	@ObjectHolder("apes_strong_together:shoveltier_2")
	public static final Item block = null;
	public Shoveltier2Item(ApesStrongTogetherModElements instance) {
		super(instance, 97);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 3200;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 22;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Ingot1Item.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("shoveltier_2"));
	}
}
