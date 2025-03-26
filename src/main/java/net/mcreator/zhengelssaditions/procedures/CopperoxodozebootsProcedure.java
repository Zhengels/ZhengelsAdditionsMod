package net.mcreator.zhengelssaditions.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

import net.mcreator.zhengelssaditions.init.ZhengelssAditionsModItems;

public class CopperoxodozebootsProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		ItemStack tool = ItemStack.EMPTY;
		if (entity.isInWaterRainOrBubble()) {
			if (Math.random() < 0.0005) {
				tool = new ItemStack(ZhengelssAditionsModItems.OXIDIZEDCOPPERARMOUR_BOOTS.get()).copy();
				tool.setDamageValue(itemstack.getDamageValue());
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(0, tool);
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.FEET, tool);
					}
				}
			}
		} else if (Math.random() < 0.0001) {
			tool = new ItemStack(ZhengelssAditionsModItems.OXIDIZEDCOPPERARMOUR_BOOTS.get()).copy();
			tool.setDamageValue(itemstack.getDamageValue());
			{
				Entity _entity = entity;
				if (_entity instanceof Player _player) {
					_player.getInventory().armor.set(0, tool);
					_player.getInventory().setChanged();
				} else if (_entity instanceof LivingEntity _living) {
					_living.setItemSlot(EquipmentSlot.FEET, tool);
				}
			}
		}
	}
}
