package net.mcreator.zhengelssaditions.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.zhengelssaditions.init.ZhengelssAditionsModBlocks;

public class Gunpowderblock_wetProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if (world.getLevelData().isRaining()) {
			if (Math.random() < 0.01) {
				if (world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z))) {
					if (world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude()) {
						world.setBlock(BlockPos.containing(x, y, z), ZhengelssAditionsModBlocks.WETGUNPOWDERBLOCK.get().defaultBlockState(), 3);
					}
				}
			}
		}
		sx = -1;
		found = false;
		for (int index0 = 0; index0 < 3; index0++) {
			sy = -1;
			for (int index1 = 0; index1 < 3; index1++) {
				sz = -1;
				for (int index2 = 0; index2 < 3; index2++) {
					if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(new ResourceLocation("zhengelss_aditions:wet")))) {
						found = true;
					}
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
		if (found == true) {
			if (world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude()) {
				world.setBlock(BlockPos.containing(x, y, z), ZhengelssAditionsModBlocks.WETGUNPOWDERBLOCK.get().defaultBlockState(), 3);
			}
		}
	}
}
