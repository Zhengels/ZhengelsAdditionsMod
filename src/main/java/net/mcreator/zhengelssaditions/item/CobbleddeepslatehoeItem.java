
package net.mcreator.zhengelssaditions.item;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

public class CobbleddeepslatehoeItem extends HoeItem {
	public CobbleddeepslatehoeItem() {
		super(new Tier() {
			public int getUses() {
				return 160;
			}

			public float getSpeed() {
				return 4.5f;
			}

			public float getAttackDamageBonus() {
				return 1f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 5;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Blocks.COBBLED_DEEPSLATE));
			}
		}, 0, -2f, new Item.Properties());
	}
}
