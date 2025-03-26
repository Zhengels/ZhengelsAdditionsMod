
package net.mcreator.zhengelssaditions.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.zhengelssaditions.procedures.XpstorageusemediumProcedure;

public class Xpstorage5Item extends Item {
	public Xpstorage5Item() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		XpstorageusemediumProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), ar.getObject());
		return ar;
	}
}
