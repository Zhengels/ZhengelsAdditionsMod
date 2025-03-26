package net.mcreator.zhengelssaditions.procedures;

import org.checkerframework.checker.units.qual.g;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.zhengelssaditions.init.ZhengelssAditionsModItems;

public class Coppertooloxidize_test_workProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		ItemStack g = ItemStack.EMPTY;
		if (itemstack.getOrCreateTag().getDouble("oxidizing") < 12000) {
			itemstack.getOrCreateTag().putDouble("oxidizing", (itemstack.getOrCreateTag().getDouble("oxidizing") + 1));
		} else {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(ZhengelssAditionsModItems.WAXEDEXPOSEDCOPPERSKYTHE.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(ZhengelssAditionsModItems.COPPERTOOLOXIDIZETEST.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
	}
}
