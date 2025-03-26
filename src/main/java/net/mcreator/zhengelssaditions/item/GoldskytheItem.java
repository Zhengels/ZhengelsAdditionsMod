
package net.mcreator.zhengelssaditions.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.zhengelssaditions.procedures.IronskytheharvestProcedure;

public class GoldskytheItem extends PickaxeItem {
	public GoldskytheItem() {
		super(new Tier() {
			public int getUses() {
				return 32;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return 3f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 26;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.GOLD_INGOT));
			}
		}, 1, -3f, new Item.Properties());
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		IronskytheharvestProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer(), context.getItemInHand());
		return InteractionResult.SUCCESS;
	}
}
