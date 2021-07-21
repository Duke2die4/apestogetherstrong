package net.mcreator.apesstrongtogether.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.item.ItemStack;
import net.minecraft.item.BlockItem;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import net.mcreator.apesstrongtogether.block.DesertgrassBlock;
import net.mcreator.apesstrongtogether.ApesStrongTogetherModElements;
import net.mcreator.apesstrongtogether.ApesStrongTogetherMod;

import java.util.Map;

@ApesStrongTogetherModElements.ModElement.Tag
public class SpfactoryProcedure extends ApesStrongTogetherModElements.ModElement {
	public SpfactoryProcedure(ApesStrongTogetherModElements instance) {
		super(instance, 195);
	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ApesStrongTogetherMod.LOGGER.warn("Failed to load dependency x for procedure Spfactory!");
			return false;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ApesStrongTogetherMod.LOGGER.warn("Failed to load dependency y for procedure Spfactory!");
			return false;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ApesStrongTogetherMod.LOGGER.warn("Failed to load dependency z for procedure Spfactory!");
			return false;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ApesStrongTogetherMod.LOGGER.warn("Failed to load dependency world for procedure Spfactory!");
			return false;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		ItemStack UnderSoil = ItemStack.EMPTY;
		ItemStack Air = ItemStack.EMPTY;
		ItemStack TopSoil = ItemStack.EMPTY;
		String AirTagName = "";
		String TopSoilTagName = "";
		String UnderSoilTagName = "";
		boolean EnableSoilReplacement = false;
		boolean DontSpawnStructure = false;
		boolean EnableTagSupport = false;
		double PositionX2 = 0;
		double PositionZ = 0;
		double PositionOffsetZ = 0;
		double PositionOffsetX = 0;
		double StructureSizeZ = 0;
		double StructureSizeX = 0;
		double PositionX = 0;
		EnableSoilReplacement = (boolean) (true);
		EnableTagSupport = (boolean) (false);
		TopSoilTagName = (String) "namespace:structure_grass_blocks";
		UnderSoilTagName = (String) "namespace:structure_dirt_blocks";
		AirTagName = (String) "namespace:structure_air_blocks";
		TopSoil = new ItemStack(DesertgrassBlock.block, (int) (1));
		UnderSoil = new ItemStack(Blocks.SMOOTH_SANDSTONE, (int) (1));
		Air = new ItemStack(Blocks.AIR, (int) (1));
		PositionOffsetX = (double) (x + 2);
		PositionOffsetZ = (double) (z + 2);
		StructureSizeX = (double) 17;
		StructureSizeZ = (double) 17;
		PositionX = (double) 0;
		PositionZ = (double) 0;
		PositionX2 = (double) (PositionX);
		DontSpawnStructure = (boolean) (false);
		for (int index0 = 0; index0 < (int) ((StructureSizeZ)); index0++) {
			for (int index1 = 0; index1 < (int) ((StructureSizeX)); index1++) {
				if (((EnableTagSupport) == (true))) {
					if ((((BlockTags.getCollection().getTagByID(new ResourceLocation(((TopSoilTagName)).toLowerCase(java.util.Locale.ENGLISH)))
							.contains((world.getBlockState(
									new BlockPos((int) ((PositionOffsetX) + (PositionX)), (int) y, (int) ((PositionOffsetZ) + (PositionZ)))))
											.getBlock()))
							&& ((BlockTags.getCollection().getTagByID(new ResourceLocation(((AirTagName)).toLowerCase(java.util.Locale.ENGLISH)))
									.contains((world.getBlockState(new BlockPos((int) ((PositionOffsetX) + (PositionX)), (int) (y + 1),
											(int) ((PositionOffsetZ) + (PositionZ))))).getBlock()))
									&& (BlockTags.getCollection()
											.getTagByID(new ResourceLocation(((UnderSoilTagName)).toLowerCase(java.util.Locale.ENGLISH)))
											.contains((world.getBlockState(new BlockPos((int) ((PositionOffsetX) + (PositionX)), (int) (y - 1),
													(int) ((PositionOffsetZ) + (PositionZ))))).getBlock()))))
							|| (((BlockTags.getCollection().getTagByID(new ResourceLocation(((AirTagName)).toLowerCase(java.util.Locale.ENGLISH)))
									.contains((world.getBlockState(
											new BlockPos((int) ((PositionOffsetX) + (PositionX)), (int) y, (int) ((PositionOffsetZ) + (PositionZ)))))
													.getBlock()))
									&& ((BlockTags.getCollection()
											.getTagByID(new ResourceLocation(((AirTagName)).toLowerCase(java.util.Locale.ENGLISH)))
											.contains((world.getBlockState(new BlockPos((int) ((PositionOffsetX) + (PositionX)), (int) (y + 1),
													(int) ((PositionOffsetZ) + (PositionZ))))).getBlock()))
											&& (BlockTags.getCollection()
													.getTagByID(new ResourceLocation(((TopSoilTagName)).toLowerCase(java.util.Locale.ENGLISH)))
													.contains((world.getBlockState(new BlockPos((int) ((PositionOffsetX) + (PositionX)),
															(int) (y - 1), (int) ((PositionOffsetZ) + (PositionZ))))).getBlock()))))
									|| ((BlockTags.getCollection()
											.getTagByID(new ResourceLocation(((UnderSoilTagName)).toLowerCase(java.util.Locale.ENGLISH)))
											.contains((world.getBlockState(new BlockPos((int) ((PositionOffsetX) + (PositionX)), (int) y,
													(int) ((PositionOffsetZ) + (PositionZ))))).getBlock()))
											&& ((BlockTags.getCollection()
													.getTagByID(new ResourceLocation(((TopSoilTagName)).toLowerCase(java.util.Locale.ENGLISH)))
													.contains((world.getBlockState(new BlockPos((int) ((PositionOffsetX) + (PositionX)),
															(int) (y + 1), (int) ((PositionOffsetZ) + (PositionZ))))).getBlock()))
													&& (BlockTags.getCollection()
															.getTagByID(
																	new ResourceLocation(((UnderSoilTagName)).toLowerCase(java.util.Locale.ENGLISH)))
															.contains((world.getBlockState(new BlockPos((int) ((PositionOffsetX) + (PositionX)),
																	(int) (y - 1), (int) ((PositionOffsetZ) + (PositionZ))))).getBlock()))))))) {
						DontSpawnStructure = (boolean) (false);
					} else {
						DontSpawnStructure = (boolean) (true);
						break;
					}
				} else {
					if (((((world
							.getBlockState(new BlockPos((int) ((PositionOffsetX) + (PositionX)), (int) y, (int) ((PositionOffsetZ) + (PositionZ)))))
									.getBlock() == /* @BlockState */(new Object() {
										public BlockState toBlock(ItemStack _stk) {
											if (_stk.getItem() instanceof BlockItem) {
												return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
											}
											return Blocks.AIR.getDefaultState();
										}
									}.toBlock((TopSoil))).getBlock())
							&& (((world.getBlockState(
									new BlockPos((int) ((PositionOffsetX) + (PositionX)), (int) (y + 1), (int) ((PositionOffsetZ) + (PositionZ)))))
											.getBlock() == /* @BlockState */(new Object() {
												public BlockState toBlock(ItemStack _stk) {
													if (_stk.getItem() instanceof BlockItem) {
														return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
													}
													return Blocks.AIR.getDefaultState();
												}
											}.toBlock((Air))).getBlock())
									&& ((world.getBlockState(new BlockPos((int) ((PositionOffsetX) + (PositionX)), (int) (y - 1),
											(int) ((PositionOffsetZ) + (PositionZ))))).getBlock() == /* @BlockState */(new Object() {
												public BlockState toBlock(ItemStack _stk) {
													if (_stk.getItem() instanceof BlockItem) {
														return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
													}
													return Blocks.AIR.getDefaultState();
												}
											}.toBlock((UnderSoil))).getBlock())))
							|| ((((world.getBlockState(
									new BlockPos((int) ((PositionOffsetX) + (PositionX)), (int) y, (int) ((PositionOffsetZ) + (PositionZ)))))
											.getBlock() == /* @BlockState */(new Object() {
												public BlockState toBlock(ItemStack _stk) {
													if (_stk.getItem() instanceof BlockItem) {
														return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
													}
													return Blocks.AIR.getDefaultState();
												}
											}.toBlock((Air))).getBlock())
									&& (((world.getBlockState(new BlockPos((int) ((PositionOffsetX) + (PositionX)), (int) (y + 1),
											(int) ((PositionOffsetZ) + (PositionZ))))).getBlock() == /* @BlockState */(new Object() {
												public BlockState toBlock(ItemStack _stk) {
													if (_stk.getItem() instanceof BlockItem) {
														return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
													}
													return Blocks.AIR.getDefaultState();
												}
											}.toBlock((Air))).getBlock())
											&& ((world.getBlockState(new BlockPos((int) ((PositionOffsetX) + (PositionX)), (int) (y - 1),
													(int) ((PositionOffsetZ) + (PositionZ))))).getBlock() == /* @BlockState */(new Object() {
														public BlockState toBlock(ItemStack _stk) {
															if (_stk.getItem() instanceof BlockItem) {
																return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
															}
															return Blocks.AIR.getDefaultState();
														}
													}.toBlock((TopSoil))).getBlock())))
									|| (((world.getBlockState(
											new BlockPos((int) ((PositionOffsetX) + (PositionX)), (int) y, (int) ((PositionOffsetZ) + (PositionZ)))))
													.getBlock() == /* @BlockState */(new Object() {
														public BlockState toBlock(ItemStack _stk) {
															if (_stk.getItem() instanceof BlockItem) {
																return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
															}
															return Blocks.AIR.getDefaultState();
														}
													}.toBlock((UnderSoil))).getBlock())
											&& (((world.getBlockState(new BlockPos((int) ((PositionOffsetX) + (PositionX)), (int) (y + 1),
													(int) ((PositionOffsetZ) + (PositionZ))))).getBlock() == /* @BlockState */(new Object() {
														public BlockState toBlock(ItemStack _stk) {
															if (_stk.getItem() instanceof BlockItem) {
																return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
															}
															return Blocks.AIR.getDefaultState();
														}
													}.toBlock((TopSoil))).getBlock())
													&& ((world.getBlockState(new BlockPos((int) ((PositionOffsetX) + (PositionX)), (int) (y - 1),
															(int) ((PositionOffsetZ) + (PositionZ))))).getBlock() == /* @BlockState */(new Object() {
																public BlockState toBlock(ItemStack _stk) {
																	if (_stk.getItem() instanceof BlockItem) {
																		return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
																	}
																	return Blocks.AIR.getDefaultState();
																}
															}.toBlock((UnderSoil))).getBlock())))))) {
						DontSpawnStructure = (boolean) (false);
					} else {
						DontSpawnStructure = (boolean) (true);
						break;
					}
				}
				PositionX = (double) ((PositionX) + 1);
			}
			if (((DontSpawnStructure) == (true))) {
				break;
			}
			PositionX = (double) (PositionX2);
			PositionZ = (double) ((PositionZ) + 1);
		}
		if (((DontSpawnStructure) == (false))) {
			if (((EnableSoilReplacement) == (true))) {
				PositionX = (double) 0;
				PositionZ = (double) 0;
				if (((EnableTagSupport) == (true))) {
					for (int index2 = 0; index2 < (int) ((StructureSizeZ)); index2++) {
						for (int index3 = 0; index3 < (int) ((StructureSizeX)); index3++) {
							if ((BlockTags.getCollection().getTagByID(new ResourceLocation(((TopSoilTagName)).toLowerCase(java.util.Locale.ENGLISH)))
									.contains((world.getBlockState(new BlockPos((int) ((PositionOffsetX) + (PositionX)), (int) (y - 1),
											(int) ((PositionOffsetZ) + (PositionZ))))).getBlock()))) {
								{
									BlockPos _bp = new BlockPos((int) ((PositionOffsetX) + (PositionX)), (int) (y - 1),
											(int) ((PositionOffsetZ) + (PositionZ)));
									BlockState _bs = /* @BlockState */(new Object() {
										public BlockState toBlock(ItemStack _stk) {
											if (_stk.getItem() instanceof BlockItem) {
												return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
											}
											return Blocks.AIR.getDefaultState();
										}
									}.toBlock((UnderSoil)));
									world.setBlockState(_bp, _bs, 3);
								}
							}
							PositionX = (double) ((PositionX) + 1);
						}
						PositionX = (double) (PositionX2);
						PositionZ = (double) ((PositionZ) + 1);
					}
				} else {
					for (int index4 = 0; index4 < (int) ((StructureSizeZ)); index4++) {
						for (int index5 = 0; index5 < (int) ((StructureSizeX)); index5++) {
							if (((world.getBlockState(
									new BlockPos((int) ((PositionOffsetX) + (PositionX)), (int) (y - 1), (int) ((PositionOffsetZ) + (PositionZ)))))
											.getBlock() == /* @BlockState */(new Object() {
												public BlockState toBlock(ItemStack _stk) {
													if (_stk.getItem() instanceof BlockItem) {
														return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
													}
													return Blocks.AIR.getDefaultState();
												}
											}.toBlock((TopSoil))).getBlock())) {
								{
									BlockPos _bp = new BlockPos((int) ((PositionOffsetX) + (PositionX)), (int) (y - 1),
											(int) ((PositionOffsetZ) + (PositionZ)));
									BlockState _bs = /* @BlockState */(new Object() {
										public BlockState toBlock(ItemStack _stk) {
											if (_stk.getItem() instanceof BlockItem) {
												return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
											}
											return Blocks.AIR.getDefaultState();
										}
									}.toBlock((UnderSoil)));
									world.setBlockState(_bp, _bs, 3);
								}
							}
							PositionX = (double) ((PositionX) + 1);
						}
						PositionX = (double) (PositionX2);
						PositionZ = (double) ((PositionZ) + 1);
					}
				}
			}
			return (true);
		}
		return (false);
	}
}
