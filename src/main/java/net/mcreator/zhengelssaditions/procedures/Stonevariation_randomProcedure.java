package net.mcreator.zhengelssaditions.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class Stonevariation_randomProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.8) {
			if (Math.random() < 0.6) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.STONE.defaultBlockState(), 3);
			} else {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.ANDESITE.defaultBlockState(), 3);
			}
		} else {
			if (Math.random() < 0.6) {
				if (Math.random() < 0.5) {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.COBBLESTONE.defaultBlockState(), 3);
				} else {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.STONE_BRICKS.defaultBlockState(), 3);
				}
			} else {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.POLISHED_ANDESITE.defaultBlockState(), 3);
			}
		}
	}
}
