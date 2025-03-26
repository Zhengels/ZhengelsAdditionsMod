package net.mcreator.zhengelssaditions.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.zhengelssaditions.init.ZhengelssAditionsModEnchantments;

public class Hammer_buildProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Direction direction, Entity entity, ItemStack itemstack) {
		if (direction == null || entity == null)
			return;
		double a = 0;
		if (!(((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState()).getBlock() == Blocks.AIR)) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.place")), SoundSource.BLOCKS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.place")), SoundSource.BLOCKS, 1, 1, false);
				}
			}
			if (direction == Direction.EAST || direction == Direction.WEST) {
				if ((world.getBlockState(BlockPos.containing(x, y - 1, z - 1))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(x, y - 1, z - 1),
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
				if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(x, y - 1, z),
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
				if ((world.getBlockState(BlockPos.containing(x, y - 1, z + 1))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(x, y - 1, z + 1),
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
				if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.AIR) {
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
				if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.AIR) {
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
				if ((world.getBlockState(BlockPos.containing(x, y + 1, z - 1))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(x, y + 1, z - 1),
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
				if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(x, y + 1, z),
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
				if ((world.getBlockState(BlockPos.containing(x, y + 1, z + 1))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(x, y + 1, z + 1),
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
			}
			if (direction == Direction.NORTH || direction == Direction.SOUTH) {
				if ((world.getBlockState(BlockPos.containing(x - 1, y - 1, z))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(x - 1, y - 1, z),
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
				if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(x, y - 1, z),
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
				if ((world.getBlockState(BlockPos.containing(x + 1, y - 1, z))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(x + 1, y - 1, z),
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
				if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.AIR) {
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
				if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.AIR) {
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
				if ((world.getBlockState(BlockPos.containing(x - 1, y + 1, z))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(x - 1, y + 1, z),
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
				if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(x, y + 1, z),
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
				if ((world.getBlockState(BlockPos.containing(x + 1, y + 1, z))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(x + 1, y + 1, z),
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
			}
			if (direction == Direction.DOWN || direction == Direction.UP) {
				if ((world.getBlockState(BlockPos.containing(x - 1, y, z - 1))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(x - 1, y, z - 1),
							((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState()), 3);
				}
				if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.AIR) {
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
					a = 1;
				}
				if ((world.getBlockState(BlockPos.containing(x + 1, y, z - 1))).getBlock() == Blocks.AIR) {
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
				if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.AIR) {
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
				if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.AIR) {
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
				if ((world.getBlockState(BlockPos.containing(x - 1, y, z + 1))).getBlock() == Blocks.AIR) {
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
				if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.AIR) {
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
				if ((world.getBlockState(BlockPos.containing(x + 1, y, z + 1))).getBlock() == Blocks.AIR) {
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
				if (a == 1) {
					{
						ItemStack _ist = itemstack;
						if (_ist.hurt(1, RandomSource.create(), null)) {
							_ist.shrink(1);
							_ist.setDamageValue(0);
						}
					}
					a = 0;
				}
			}
		}
	}
}
