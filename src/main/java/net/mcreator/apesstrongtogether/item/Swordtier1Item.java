
package apesstrongtogether.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import apesstrongtogether.ApesStrongTogetherModElements;

@ApesStrongTogetherModElements.ModElement.Tag
public class Swordtier1Item extends ApesStrongTogetherModElements.ModElement {
	@ObjectHolder("apes_strong_together:swordtier_1")
	public static final Item block = null;
	public Swordtier1Item(ApesStrongTogetherModElements instance) {
		super(instance, 93);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 3200;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 7f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 28;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Ingot1Item.block, (int) (1)));
			}
		}, 3, -2.4f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("swordtier_1"));
	}
}
