
package net.mcreator.zhengelssaditions.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.zhengelssaditions.procedures.KnuckleshitProcedure;
import net.mcreator.zhengelssaditions.procedures.KnucklesarmtickProcedure;
import net.mcreator.zhengelssaditions.procedures.CopperoxidizeknucklesProcedure;

public class WeatheredcopperknucklesItem extends SwordItem {
	public WeatheredcopperknucklesItem() {
		super(new Tier() {
			public int getUses() {
				return 201;
			}

			public float getSpeed() {
				return 5f;
			}

			public float getAttackDamageBonus() {
				return -2.7f;
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
		}, 3, 6f, new Item.Properties());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		KnuckleshitProcedure.execute(itemstack);
		return retval;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			KnucklesarmtickProcedure.execute(world, entity, itemstack);
		CopperoxidizeknucklesProcedure.execute(entity, itemstack);
	}
}
