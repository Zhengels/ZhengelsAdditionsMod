package net.mcreator.zhengelssaditions.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.zhengelssaditions.ZhengelssAditionsMod;

public class Gunpowderblock_boom1Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		ZhengelssAditionsMod.queueServerWork(1, () -> {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 6, Level.ExplosionInteraction.TNT);
		});
	}
}
