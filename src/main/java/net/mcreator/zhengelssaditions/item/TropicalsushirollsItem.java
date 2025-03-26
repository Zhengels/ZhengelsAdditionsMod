
package net.mcreator.zhengelssaditions.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class TropicalsushirollsItem extends Item {
	public TropicalsushirollsItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(4).saturationMod(4f).build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 25;
	}
}
