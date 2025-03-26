
package net.mcreator.zhengelssaditions.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.zhengelssaditions.init.ZhengelssAditionsModFluids;

public class SweetwaterItem extends BucketItem {
	public SweetwaterItem() {
		super(ZhengelssAditionsModFluids.SWEETWATER, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
