package net.mcreator.zhengelssaditions.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class Oakvariations_randomProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.6) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.OAK_PLANKS.defaultBlockState(), 3);
		} else {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.STRIPPED_OAK_WOOD.defaultBlockState(), 3);
		}
	}
}
