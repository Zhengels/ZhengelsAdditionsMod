package net.mcreator.zhengelssaditions.procedures;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

public class Heatindicator2Procedure {
	public static double execute(LevelAccessor world, double x, double y, double z) {
		double q = 0;
		double a = 0;
		double enchant_levels = 0;
		ItemStack emeralds = ItemStack.EMPTY;
		ItemStack tool = ItemStack.EMPTY;
		q = 0;
		a = 10000;
		for (int index0 = 0; index0 < 15; index0++) {
			q = q + 1;
			a = a - 600;
			if (new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, BlockPos.containing(x, y, z), "heat") > a) {
				return q;
			}
		}
		return 15;
	}
}
