
package net.mcreator.zhengelssaditions.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;

import net.mcreator.zhengelssaditions.procedures.Gunpowderblock_boom1Procedure;

public class DiamondItem extends Item {
	public DiamondItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		Gunpowderblock_boom1Procedure.execute(world, entity.getX(), entity.getY(), entity.getZ());
		return ar;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		Gunpowderblock_boom1Procedure.execute(world, x, y, z);
		return retval;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		Gunpowderblock_boom1Procedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ());
		return InteractionResult.SUCCESS;
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		Gunpowderblock_boom1Procedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ());
		return retval;
	}

	@Override
	public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
		boolean retval = super.onEntitySwing(itemstack, entity);
		Gunpowderblock_boom1Procedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ());
		return retval;
	}

	@Override
	public void onCraftedBy(ItemStack itemstack, Level world, Player entity) {
		super.onCraftedBy(itemstack, world, entity);
		Gunpowderblock_boom1Procedure.execute(world, entity.getX(), entity.getY(), entity.getZ());
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			Gunpowderblock_boom1Procedure.execute(world, entity.getX(), entity.getY(), entity.getZ());
		Gunpowderblock_boom1Procedure.execute(world, entity.getX(), entity.getY(), entity.getZ());
	}

	@Override
	public boolean onDroppedByPlayer(ItemStack itemstack, Player entity) {
		Gunpowderblock_boom1Procedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ());
		return true;
	}

	@Override
	public void releaseUsing(ItemStack itemstack, Level world, LivingEntity entity, int time) {
		Gunpowderblock_boom1Procedure.execute(world, entity.getX(), entity.getY(), entity.getZ());
	}
}
