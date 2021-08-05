
package apesstrongtogether.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import apesstrongtogether.ApesStrongTogetherModElements;

@ApesStrongTogetherModElements.ModElement.Tag
public class Hoetier1Item extends ApesStrongTogetherModElements.ModElement {
	@ObjectHolder("apes_strong_together:hoetier_1")
	public static final Item block = null;
	public Hoetier1Item(ApesStrongTogetherModElements instance) {
		super(instance, 92);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
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
		}, 0, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("hoetier_1"));
	}
}
