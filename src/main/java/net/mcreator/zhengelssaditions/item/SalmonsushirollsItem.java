
package net.mcreator.zhengelssaditions.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class SalmonsushirollsItem extends Item {
	public SalmonsushirollsItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(7).saturationMod(11.2f).build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 25;
	}
}
