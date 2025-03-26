
package net.mcreator.zhengelssaditions.item;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class CobbleddeepslateshovelItem extends ShovelItem {
	public CobbleddeepslateshovelItem() {
		super(new Tier() {
			public int getUses() {
				return 160;
			}

			public float getSpeed() {
				return 4.5f;
			}

			public float getAttackDamageBonus() {
				return 2f;
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
		}, 1, -2.6f, new Item.Properties());
	}
}
