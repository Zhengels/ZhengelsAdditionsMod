
package net.mcreator.zhengelssaditions.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RunestoneItem extends Item {
	public RunestoneItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
