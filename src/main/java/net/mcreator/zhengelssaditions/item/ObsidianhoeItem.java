
package net.mcreator.zhengelssaditions.item;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

public class ObsidianhoeItem extends HoeItem {
	public ObsidianhoeItem() {
		super(new Tier() {
			public int getUses() {
				return 1031;
			}

			public float getSpeed() {
				return 7f;
			}

			public float getAttackDamageBonus() {
				return 0.2f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 18;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Blocks.OBSIDIAN));
			}
		}, 0, -1f, new Item.Properties());
	}
}
