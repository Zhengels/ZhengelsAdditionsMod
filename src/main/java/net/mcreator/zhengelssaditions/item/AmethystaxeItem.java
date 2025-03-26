
package net.mcreator.zhengelssaditions.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.core.BlockPos;

import net.mcreator.zhengelssaditions.procedures.Amethyst_durabilityProcedure;

public class AmethystaxeItem extends AxeItem {
	public AmethystaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 255;
			}

			public float getSpeed() {
				return 14f;
			}

			public float getAttackDamageBonus() {
				return 7f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 26;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.AMETHYST_SHARD));
			}
		}, 1, -3.2f, new Item.Properties());
	}

	@Override
	public boolean mineBlock(ItemStack itemstack, Level world, BlockState blockstate, BlockPos pos, LivingEntity entity) {
		boolean retval = super.mineBlock(itemstack, world, blockstate, pos, entity);
		Amethyst_durabilityProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), itemstack);
		return retval;
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		Amethyst_durabilityProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), itemstack);
		return retval;
	}
}
