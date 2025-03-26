
package net.mcreator.zhengelssaditions.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.zhengelssaditions.procedures.ChocolateberryeatProcedure;

public class ChocolateberriesItem extends Item {
	public ChocolateberriesItem() {
		super(new Item.Properties().stacksTo(32).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(4).saturationMod(3f).alwaysEat().build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 40;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		ChocolateberryeatProcedure.execute(entity);
		return retval;
	}
}
