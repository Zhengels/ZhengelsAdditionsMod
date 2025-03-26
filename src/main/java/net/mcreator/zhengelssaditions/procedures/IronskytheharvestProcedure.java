package net.mcreator.zhengelssaditions.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.zhengelssaditions.init.ZhengelssAditionsModEnchantments;

public class IronskytheharvestProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		ItemStack tool = ItemStack.EMPTY;
		ItemStack item = ItemStack.EMPTY;
		double enchant_levels = 0;
		double w = 0;
		double a = 0;
		if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("minecraft:crops")))) {
			a = 0;
			if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("minecraft:crops")))) {
				{
					BlockPos _pos = BlockPos.containing(x, y, z);
					Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX(), entity.getY() + 1, entity.getZ()), null);
					world.destroyBlock(_pos, false);
				}
				world.setBlock(BlockPos.containing(x, y, z),
						((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState()), 3);
				if (EnchantmentHelper.getItemEnchantmentLevel(ZhengelssAditionsModEnchantments.AUTOFILL.get(), itemstack) != 0) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				} else {
					(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).shrink(1);
				}
				a = 1;
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("minecraft:crops")))) {
				{
					BlockPos _pos = BlockPos.containing(x, y, z + 1);
					Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX(), entity.getY() + 1, entity.getZ()), null);
					world.destroyBlock(_pos, false);
				}
				world.setBlock(BlockPos.containing(x, y, z + 1),
						((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState()), 3);
				if (EnchantmentHelper.getItemEnchantmentLevel(ZhengelssAditionsModEnchantments.AUTOFILL.get(), itemstack) != 0) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				} else {
					(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).shrink(1);
				}
				a = 1;
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("minecraft:crops")))) {
				{
					BlockPos _pos = BlockPos.containing(x, y, z - 1);
					Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX(), entity.getY() + 1, entity.getZ()), null);
					world.destroyBlock(_pos, false);
				}
				world.setBlock(BlockPos.containing(x, y, z - 1),
						((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState()), 3);
				if (EnchantmentHelper.getItemEnchantmentLevel(ZhengelssAditionsModEnchantments.AUTOFILL.get(), itemstack) != 0) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				} else {
					(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).shrink(1);
				}
				a = 1;
			}
			if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("minecraft:crops")))) {
				{
					BlockPos _pos = BlockPos.containing(x + 1, y, z);
					Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX(), entity.getY() + 1, entity.getZ()), null);
					world.destroyBlock(_pos, false);
				}
				world.setBlock(BlockPos.containing(x + 1, y, z),
						((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState()), 3);
				if (EnchantmentHelper.getItemEnchantmentLevel(ZhengelssAditionsModEnchantments.AUTOFILL.get(), itemstack) != 0) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				} else {
					(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).shrink(1);
				}
				a = 1;
			}
			if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("minecraft:crops")))) {
				{
					BlockPos _pos = BlockPos.containing(x - 1, y, z);
					Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX(), entity.getY() + 1, entity.getZ()), null);
					world.destroyBlock(_pos, false);
				}
				world.setBlock(BlockPos.containing(x - 1, y, z),
						((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState()), 3);
				if (EnchantmentHelper.getItemEnchantmentLevel(ZhengelssAditionsModEnchantments.AUTOFILL.get(), itemstack) != 0) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				} else {
					(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).shrink(1);
				}
				a = 1;
			}
			if ((world.getBlockState(BlockPos.containing(x + 1, y, z + 1))).is(BlockTags.create(new ResourceLocation("minecraft:crops")))) {
				{
					BlockPos _pos = BlockPos.containing(x + 1, y, z + 1);
					Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX(), entity.getY() + 1, entity.getZ()), null);
					world.destroyBlock(_pos, false);
				}
				world.setBlock(BlockPos.containing(x + 1, y, z + 1),
						((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState()), 3);
				if (EnchantmentHelper.getItemEnchantmentLevel(ZhengelssAditionsModEnchantments.AUTOFILL.get(), itemstack) != 0) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				} else {
					(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).shrink(1);
				}
				a = 1;
			}
			if ((world.getBlockState(BlockPos.containing(x - 1, y, z + 1))).is(BlockTags.create(new ResourceLocation("minecraft:crops")))) {
				{
					BlockPos _pos = BlockPos.containing(x - 1, y, z + 1);
					Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX(), entity.getY() + 1, entity.getZ()), null);
					world.destroyBlock(_pos, false);
				}
				world.setBlock(BlockPos.containing(x - 1, y, z + 1),
						((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState()), 3);
				if (EnchantmentHelper.getItemEnchantmentLevel(ZhengelssAditionsModEnchantments.AUTOFILL.get(), itemstack) != 0) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				} else {
					(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).shrink(1);
				}
				a = 1;
			}
			if ((world.getBlockState(BlockPos.containing(x + 1, y, z - 1))).is(BlockTags.create(new ResourceLocation("minecraft:crops")))) {
				{
					BlockPos _pos = BlockPos.containing(x + 1, y, z - 1);
					Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX(), entity.getY() + 1, entity.getZ()), null);
					world.destroyBlock(_pos, false);
				}
				world.setBlock(BlockPos.containing(x + 1, y, z - 1),
						((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState()), 3);
				if (EnchantmentHelper.getItemEnchantmentLevel(ZhengelssAditionsModEnchantments.AUTOFILL.get(), itemstack) != 0) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				} else {
					(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).shrink(1);
				}
				a = 1;
			}
			if ((world.getBlockState(BlockPos.containing(x - 1, y, z - 1))).is(BlockTags.create(new ResourceLocation("minecraft:crops")))) {
				{
					BlockPos _pos = BlockPos.containing(x - 1, y, z - 1);
					Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(entity.getX(), entity.getY() + 1, entity.getZ()), null);
					world.destroyBlock(_pos, false);
				}
				world.setBlock(BlockPos.containing(x - 1, y, z - 1),
						((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState()), 3);
				if (EnchantmentHelper.getItemEnchantmentLevel(ZhengelssAditionsModEnchantments.AUTOFILL.get(), itemstack) != 0) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				} else {
					(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).shrink(1);
				}
				a = 1;
			}
			if (a != 0) {
				{
					ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
					if (_ist.hurt(1, RandomSource.create(), null)) {
						_ist.shrink(1);
						_ist.setDamageValue(0);
					}
				}
			}
		} else if (EnchantmentHelper.getItemEnchantmentLevel(ZhengelssAditionsModEnchantments.NETHERFARMER.get(), (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
			NetherfarmerironskytheharvestProcedure.execute(world, x, y, z, entity);
		}
	}
}
