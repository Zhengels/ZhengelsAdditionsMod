package net.mcreator.zhengelssaditions.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.zhengelssaditions.init.ZhengelssAditionsModItems;

public class CopperoxidizeknucklesProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		ItemStack tool = ItemStack.EMPTY;
		if (entity.isInWaterRainOrBubble()) {
			if (Math.random() < 0.0005) {
				tool = new ItemStack(ZhengelssAditionsModItems.OXIDIZEDCOPPERKNUCKLES.get()).copy();
				tool.setDamageValue(itemstack.getDamageValue());
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(ZhengelssAditionsModItems.WEATHEREDCOPPERKNUCKLES.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				if (entity instanceof Player _player) {
					ItemStack _setstack = tool.copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
		} else if (Math.random() < 0.0001) {
			tool = new ItemStack(ZhengelssAditionsModItems.OXIDIZEDCOPPERKNUCKLES.get()).copy();
			tool.setDamageValue(itemstack.getDamageValue());
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(ZhengelssAditionsModItems.WEATHEREDCOPPERKNUCKLES.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = tool.copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
	}
}
