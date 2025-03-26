package net.mcreator.zhengelssaditions.procedures;

import net.minecraft.world.item.ItemStack;

public class KnucklestickProcedure {
	public static void execute(ItemStack itemstack) {
		if (itemstack.getOrCreateTag().getDouble("rage") > 0) {
			itemstack.getOrCreateTag().putDouble("counter1", (itemstack.getOrCreateTag().getDouble("counter1") + 1));
			if (itemstack.getOrCreateTag().getDouble("counter1") % 40 == 0) {
				itemstack.getOrCreateTag().putDouble("rage", (itemstack.getOrCreateTag().getDouble("rage") - 1));
			}
		}
	}
}
