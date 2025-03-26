package net.mcreator.zhengelssaditions.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.zhengelssaditions.init.ZhengelssAditionsModBlocks;

public class GunpowderblockrainProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getLevelData().isRaining()) {
			if (Math.random() < 0.3) {
				if (world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z))) {
					if (world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude()) {
						world.setBlock(BlockPos.containing(x, y, z), ZhengelssAditionsModBlocks.WETGUNPOWDERBLOCK.get().defaultBlockState(), 3);
					}
				}
			}
		}
	}
}
