
package net.mcreator.apesstrongtogether.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.apesstrongtogether.ApesStrongTogetherModElements;

import java.util.List;
import java.util.Collections;

@ApesStrongTogetherModElements.ModElement.Tag
public class Ingotblock1Block extends ApesStrongTogetherModElements.ModElement {
	@ObjectHolder("apes_strong_together:ingotblock_1")
	public static final Block block = null;
	public Ingotblock1Block(ApesStrongTogetherModElements instance) {
		super(instance, 82);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(1f, 20f).setLightLevel(s -> 0));
			setRegistryName("ingotblock_1");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}