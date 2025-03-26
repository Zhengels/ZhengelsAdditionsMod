package net.mcreator.zhengelssaditions.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class Sandstonevariations_randomProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.5) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.SMOOTH_SANDSTONE.defaultBlockState(), 3);
		} else {
			if (Math.random() < 0.8) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.SANDSTONE.defaultBlockState(), 3);
			} else {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.CUT_SANDSTONE.defaultBlockState(), 3);
			}
		}
	}
}
