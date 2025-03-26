
package net.mcreator.zhengelssaditions.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.mcreator.zhengelssaditions.procedures.CopperoxodozeswordProcedure;

public class WeatheredcopperswordItem extends SwordItem {
	public WeatheredcopperswordItem() {
		super(new Tier() {
			public int getUses() {
				return 201;
			}

			public float getSpeed() {
				return 4.6f;
			}

			public float getAttackDamageBonus() {
				return 1.8f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 18;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.COPPER_INGOT));
			}
		}, 3, -2.4f, new Item.Properties());
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		CopperoxodozeswordProcedure.execute(entity, itemstack);
	}
}
