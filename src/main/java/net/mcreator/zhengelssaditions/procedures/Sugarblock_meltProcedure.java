package net.mcreator.zhengelssaditions.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.zhengelssaditions.init.ZhengelssAditionsModBlocks;

public class Sugarblock_meltProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getLevelData().isRaining()) {
			if (Math.random() < 0.7) {
				if (world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z))) {
					world.setBlock(BlockPos.containing(x, y, z), ZhengelssAditionsModBlocks.SWEETWATER.get().defaultBlockState(), 3);
				}
			}
		}
		if (Math.random() < 0.1) {
			if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.WATER && (world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.WATER) {
				world.setBlock(BlockPos.containing(x, y, z), ZhengelssAditionsModBlocks.SWEETWATER.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.WATER && (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.WATER) {
				world.setBlock(BlockPos.containing(x, y, z), ZhengelssAditionsModBlocks.SWEETWATER.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.WATER && (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.WATER) {
				world.setBlock(BlockPos.containing(x, y, z), ZhengelssAditionsModBlocks.SWEETWATER.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.WATER && (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.WATER) {
				world.setBlock(BlockPos.containing(x, y, z), ZhengelssAditionsModBlocks.SWEETWATER.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.WATER && (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.WATER) {
				world.setBlock(BlockPos.containing(x, y, z), ZhengelssAditionsModBlocks.SWEETWATER.get().defaultBlockState(), 3);
			}
		}
	}
}
