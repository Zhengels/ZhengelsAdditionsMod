package net.mcreator.zhengelssaditions.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.RandomSource;
import net.minecraft.core.BlockPos;

public class NetherfarmerdiamondskytheharvestProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		ItemStack tool = ItemStack.EMPTY;
		double enchant_levels = 0;
		double w = 0;
		w = 0;
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.NETHER_WART) {
			{
				BlockPos _pos = BlockPos.containing(x, y, z);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX(), entity.getY() + 1, entity.getZ()), null);
				world.destroyBlock(_pos, false);
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Blocks.NETHER_WART.asItem()
					&& (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getCount() >= 13) {
				w = w + 1;
				world.setBlock(BlockPos.containing(x, y, z), Blocks.NETHER_WART.defaultBlockState(), 3);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z + 2))).getBlock() == Blocks.NETHER_WART) {
			{
				BlockPos _pos = BlockPos.containing(x, y, z + 2);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX(), entity.getY() + 1, entity.getZ()), null);
				world.destroyBlock(_pos, false);
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Blocks.NETHER_WART.asItem()
					&& (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getCount() >= 13) {
				w = w + 1;
				world.setBlock(BlockPos.containing(x, y, z + 2), Blocks.NETHER_WART.defaultBlockState(), 3);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z - 2))).getBlock() == Blocks.NETHER_WART) {
			{
				BlockPos _pos = BlockPos.containing(x, y, z - 2);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX(), entity.getY() + 1, entity.getZ()), null);
				world.destroyBlock(_pos, false);
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Blocks.NETHER_WART.asItem()
					&& (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getCount() >= 13) {
				w = w + 1;
				world.setBlock(BlockPos.containing(x, y, z - 2), Blocks.NETHER_WART.defaultBlockState(), 3);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.NETHER_WART) {
			{
				BlockPos _pos = BlockPos.containing(x, y, z + 1);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX(), entity.getY() + 1, entity.getZ()), null);
				world.destroyBlock(_pos, false);
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Blocks.NETHER_WART.asItem()
					&& (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getCount() >= 13) {
				w = w + 1;
				world.setBlock(BlockPos.containing(x, y, z + 1), Blocks.NETHER_WART.defaultBlockState(), 3);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.NETHER_WART) {
			{
				BlockPos _pos = BlockPos.containing(x, y, z - 1);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX(), entity.getY() + 1, entity.getZ()), null);
				world.destroyBlock(_pos, false);
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Blocks.NETHER_WART.asItem()
					&& (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getCount() >= 13) {
				w = w + 1;
				world.setBlock(BlockPos.containing(x, y, z - 1), Blocks.NETHER_WART.defaultBlockState(), 3);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x + 2, y, z))).getBlock() == Blocks.NETHER_WART) {
			{
				BlockPos _pos = BlockPos.containing(x + 2, y, z);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX(), entity.getY() + 1, entity.getZ()), null);
				world.destroyBlock(_pos, false);
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Blocks.NETHER_WART.asItem()
					&& (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getCount() >= 13) {
				w = w + 1;
				world.setBlock(BlockPos.containing(x + 2, y, z), Blocks.NETHER_WART.defaultBlockState(), 3);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x - 2, y, z))).getBlock() == Blocks.NETHER_WART) {
			{
				BlockPos _pos = BlockPos.containing(x - 2, y, z);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX(), entity.getY() + 1, entity.getZ()), null);
				world.destroyBlock(_pos, false);
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Blocks.NETHER_WART.asItem()
					&& (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getCount() >= 13) {
				w = w + 1;
				world.setBlock(BlockPos.containing(x - 2, y, z), Blocks.NETHER_WART.defaultBlockState(), 3);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.NETHER_WART) {
			{
				BlockPos _pos = BlockPos.containing(x + 1, y, z);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX(), entity.getY() + 1, entity.getZ()), null);
				world.destroyBlock(_pos, false);
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Blocks.NETHER_WART.asItem()
					&& (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getCount() >= 13) {
				w = w + 1;
				world.setBlock(BlockPos.containing(x + 1, y, z), Blocks.NETHER_WART.defaultBlockState(), 3);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.NETHER_WART) {
			{
				BlockPos _pos = BlockPos.containing(x - 1, y, z);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX(), entity.getY() + 1, entity.getZ()), null);
				world.destroyBlock(_pos, false);
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Blocks.NETHER_WART.asItem()
					&& (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getCount() >= 13) {
				w = w + 1;
				world.setBlock(BlockPos.containing(x - 1, y, z), Blocks.NETHER_WART.defaultBlockState(), 3);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x + 1, y, z + 1))).getBlock() == Blocks.NETHER_WART) {
			{
				BlockPos _pos = BlockPos.containing(x + 1, y, z + 1);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX(), entity.getY() + 1, entity.getZ()), null);
				world.destroyBlock(_pos, false);
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Blocks.NETHER_WART.asItem()
					&& (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getCount() >= 13) {
				w = w + 1;
				world.setBlock(BlockPos.containing(x + 1, y, z + 1), Blocks.NETHER_WART.defaultBlockState(), 3);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x - 1, y, z + 1))).getBlock() == Blocks.NETHER_WART) {
			{
				BlockPos _pos = BlockPos.containing(x - 1, y, z + 1);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX(), entity.getY() + 1, entity.getZ()), null);
				world.destroyBlock(_pos, false);
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Blocks.NETHER_WART.asItem()
					&& (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getCount() >= 13) {
				world.setBlock(BlockPos.containing(x - 1, y, z + 1), Blocks.NETHER_WART.defaultBlockState(), 3);
				w = w + 1;
			}
		}
		if ((world.getBlockState(BlockPos.containing(x + 1, y, z - 1))).getBlock() == Blocks.NETHER_WART) {
			{
				BlockPos _pos = BlockPos.containing(x + 1, y, z - 1);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX(), entity.getY() + 1, entity.getZ()), null);
				world.destroyBlock(_pos, false);
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Blocks.NETHER_WART.asItem()
					&& (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getCount() >= 13) {
				world.setBlock(BlockPos.containing(x + 1, y, z - 1), Blocks.NETHER_WART.defaultBlockState(), 3);
				w = w + 1;
			}
		}
		if ((world.getBlockState(BlockPos.containing(x - 1, y, z - 1))).getBlock() == Blocks.NETHER_WART) {
			{
				BlockPos _pos = BlockPos.containing(x - 1, y, z - 1);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX(), entity.getY() + 1, entity.getZ()), null);
				world.destroyBlock(_pos, false);
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Blocks.NETHER_WART.asItem()
					&& (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getCount() >= 13) {
				world.setBlock(BlockPos.containing(x - 1, y, z - 1), Blocks.NETHER_WART.defaultBlockState(), 3);
				w = w + 1;
			}
		}
		enchant_levels = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getCount() - w;
		if (entity instanceof LivingEntity _entity) {
			ItemStack _setstack = new ItemStack(Blocks.DEEPSLATE_BRICK_STAIRS).copy();
			_setstack.setCount(0);
			_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
			if (_entity instanceof Player _player)
				_player.getInventory().setChanged();
		}
		if (entity instanceof LivingEntity _entity) {
			ItemStack _setstack = new ItemStack(Blocks.NETHER_WART).copy();
			_setstack.setCount((int) enchant_levels);
			_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
			if (_entity instanceof Player _player)
				_player.getInventory().setChanged();
		}
		if (w != 0) {
			{
				ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
				if (_ist.hurt(1, RandomSource.create(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
		}
	}
}
