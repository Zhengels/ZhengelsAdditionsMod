package net.mcreator.zhengelssaditions.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class BricksvariationsrandomProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.7) {
			if (Math.random() < 0.7) {
				if (Math.random() < 0.9) {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.STONE_BRICKS.defaultBlockState(), 3);
				} else {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.MOSSY_STONE_BRICKS.defaultBlockState(), 3);
				}
			} else {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.CRACKED_STONE_BRICKS.defaultBlockState(), 3);
			}
		} else {
			if (Math.random() < 0.2) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.POLISHED_ANDESITE.defaultBlockState(), 3);
			} else {
				if (Math.random() < 0.9) {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.STONE.defaultBlockState(), 3);
				} else {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.ANDESITE.defaultBlockState(), 3);
				}
			}
		}
	}
}
