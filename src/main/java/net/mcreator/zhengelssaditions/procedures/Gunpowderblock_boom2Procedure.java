package net.mcreator.zhengelssaditions.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.zhengelssaditions.ZhengelssAditionsMod;

public class Gunpowderblock_boom2Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double boom = 0;
		boom = Math.random() * 10;
		sx = -1;
		found = false;
		for (int index0 = 0; index0 < 3; index0++) {
			sy = -1;
			for (int index1 = 0; index1 < 3; index1++) {
				sz = -1;
				for (int index2 = 0; index2 < 3; index2++) {
					if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(new ResourceLocation("zhengelss_aditions:fire")))) {
						found = true;
					}
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
		if (found == true) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			ZhengelssAditionsMod.queueServerWork(1, () -> {
				if (Math.random() < 0.5) {
					if (world instanceof Level _level && !_level.isClientSide())
						_level.explode(null, x, y, z, 4, Level.ExplosionInteraction.TNT);
				} else if (Math.random() < 0.3) {
					if (world instanceof Level _level && !_level.isClientSide())
						_level.explode(null, x, y, z, 6, Level.ExplosionInteraction.TNT);
				} else {
					if (world instanceof Level _level && !_level.isClientSide())
						_level.explode(null, x, y, z, 8, Level.ExplosionInteraction.TNT);
				}
			});
		}
	}
}
