
package net.mcreator.zhengelssaditions.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.mcreator.zhengelssaditions.procedures.Amethysttotem_workProcedure;

public class AmethysttotemItem extends Item {
	public AmethysttotemItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		Amethysttotem_workProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
	}
}
