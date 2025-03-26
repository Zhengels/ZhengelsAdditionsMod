
package net.mcreator.zhengelssaditions.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.zhengelssaditions.procedures.IronskytheharvestProcedure;

public class WaxedexposedcopperskytheItem extends SwordItem {
	public WaxedexposedcopperskytheItem() {
		super(new Tier() {
			public int getUses() {
				return 201;
			}

			public float getSpeed() {
				return 4.8f;
			}

			public float getAttackDamageBonus() {
				return 2.3f;
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
		}, 3, -3f, new Item.Properties());
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		IronskytheharvestProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer(), context.getItemInHand());
		return InteractionResult.SUCCESS;
	}
}
