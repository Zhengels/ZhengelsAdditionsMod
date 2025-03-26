package net.mcreator.zhengelssaditions.procedures;

import net.minecraft.world.item.ItemStack;

public class KnuckleshitProcedure {
	public static void execute(ItemStack itemstack) {
		if (itemstack.getOrCreateTag().getDouble("rage") < 30) {
			itemstack.getOrCreateTag().putDouble("rage", (itemstack.getOrCreateTag().getDouble("rage") + 1));
		}
	}
}
