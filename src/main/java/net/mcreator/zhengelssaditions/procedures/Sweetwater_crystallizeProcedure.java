package net.mcreator.zhengelssaditions.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.zhengelssaditions.init.ZhengelssAditionsModBlocks;

public class Sweetwater_crystallizeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getFluidState(BlockPos.containing(x, y, z)).createLegacyBlock()).getFluidState().isSource()) {
			if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("zhengelss_aditions:fire")))) {
				if (Math.random() < 0.0004) {
					world.setBlock(BlockPos.containing(x, y, z), ZhengelssAditionsModBlocks.CRYSTALLIZEDSUGAR.get().defaultBlockState(), 3);
				}
			} else {
				if (Math.random() < 0.0001) {
					if (world instanceof Level _lvl5 && _lvl5.isDay()) {
						if (world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z))) {
							world.setBlock(BlockPos.containing(x, y, z), ZhengelssAditionsModBlocks.CRYSTALLIZEDSUGAR.get().defaultBlockState(), 3);
						}
					}
				}
			}
		}
	}
}
