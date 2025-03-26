package net.mcreator.zhengelssaditions.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.common.ForgeHooks;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.tags.BlockTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.zhengelssaditions.init.ZhengelssAditionsModBlocks;
import net.mcreator.zhengelssaditions.ZhengelssAditionsMod;

public class Firebomb_explodeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double boom = 0;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.FLAME, x, y, z, 100, 0, 0, 0, 0.4);
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.blaze.shoot")), SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.blaze.shoot")), SoundSource.NEUTRAL, 1, 1, false);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("zhengelss_aditions:flamable")))
				|| 0 != ForgeHooks.getBurnTime((new ItemStack((world.getBlockState(BlockPos.containing(x, y, z))).getBlock())), null)) {
			world.setBlock(BlockPos.containing(x, y, z), ZhengelssAditionsModBlocks.FIREBLOCK.get().defaultBlockState(), 3);
			ZhengelssAditionsMod.queueServerWork(20, () -> {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.fire.extinguish")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.fire.extinguish")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			});
		}
		ZhengelssAditionsMod.queueServerWork(3, () -> {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.blaze.shoot")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.blaze.shoot")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("zhengelss_aditions:flamable")))
					|| 0 != ForgeHooks.getBurnTime((new ItemStack((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock())), null)) {
				world.setBlock(BlockPos.containing(x + 1, y, z), ZhengelssAditionsModBlocks.FIREBLOCK.get().defaultBlockState(), 3);
				ZhengelssAditionsMod.queueServerWork(20, () -> {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.fire.extinguish")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.fire.extinguish")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					world.setBlock(BlockPos.containing(x + 1, y, z), Blocks.AIR.defaultBlockState(), 3);
				});
			}
			if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("zhengelss_aditions:flamable")))
					|| 0 != ForgeHooks.getBurnTime((new ItemStack((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock())), null)) {
				world.setBlock(BlockPos.containing(x - 1, y, z), ZhengelssAditionsModBlocks.FIREBLOCK.get().defaultBlockState(), 3);
				ZhengelssAditionsMod.queueServerWork(20, () -> {
					world.setBlock(BlockPos.containing(x - 1, y, z), Blocks.AIR.defaultBlockState(), 3);
				});
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("zhengelss_aditions:flamable")))
					|| 0 != ForgeHooks.getBurnTime((new ItemStack((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock())), null)) {
				world.setBlock(BlockPos.containing(x, y, z - 1), ZhengelssAditionsModBlocks.FIREBLOCK.get().defaultBlockState(), 3);
				ZhengelssAditionsMod.queueServerWork(20, () -> {
					world.setBlock(BlockPos.containing(x, y, z - 1), Blocks.AIR.defaultBlockState(), 3);
				});
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("zhengelss_aditions:flamable")))
					|| 0 != ForgeHooks.getBurnTime((new ItemStack((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock())), null)) {
				world.setBlock(BlockPos.containing(x, y, z + 1), ZhengelssAditionsModBlocks.FIREBLOCK.get().defaultBlockState(), 3);
				ZhengelssAditionsMod.queueServerWork(20, () -> {
					world.setBlock(BlockPos.containing(x, y, z + 1), Blocks.AIR.defaultBlockState(), 3);
				});
			}
			if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("zhengelss_aditions:flamable")))
					|| 0 != ForgeHooks.getBurnTime((new ItemStack((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock())), null)) {
				world.setBlock(BlockPos.containing(x, y + 1, z), ZhengelssAditionsModBlocks.FIREBLOCK.get().defaultBlockState(), 3);
				ZhengelssAditionsMod.queueServerWork(20, () -> {
					world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
				});
			}
			if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("zhengelss_aditions:flamable")))
					|| 0 != ForgeHooks.getBurnTime((new ItemStack((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock())), null)) {
				world.setBlock(BlockPos.containing(x, y - 1, z), ZhengelssAditionsModBlocks.FIREBLOCK.get().defaultBlockState(), 3);
				ZhengelssAditionsMod.queueServerWork(20, () -> {
					world.setBlock(BlockPos.containing(x, y - 1, z), Blocks.AIR.defaultBlockState(), 3);
				});
			}
			ZhengelssAditionsMod.queueServerWork(3, () -> {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.blaze.shoot")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.blaze.shoot")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if ((world.getBlockState(BlockPos.containing(x, y + 1, z + 1))).is(BlockTags.create(new ResourceLocation("zhengelss_aditions:flamable")))
						|| 0 != ForgeHooks.getBurnTime((new ItemStack((world.getBlockState(BlockPos.containing(x, y + 1, z + 1))).getBlock())), null)) {
					world.setBlock(BlockPos.containing(x, y + 1, z + 1), ZhengelssAditionsModBlocks.FIREBLOCK.get().defaultBlockState(), 3);
					ZhengelssAditionsMod.queueServerWork(20, () -> {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.fire.extinguish")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.fire.extinguish")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						world.setBlock(BlockPos.containing(x, y + 1, z + 1), Blocks.AIR.defaultBlockState(), 3);
					});
				}
				if ((world.getBlockState(BlockPos.containing(x, y - 1, z + 1))).is(BlockTags.create(new ResourceLocation("zhengelss_aditions:flamable")))
						|| 0 != ForgeHooks.getBurnTime((new ItemStack((world.getBlockState(BlockPos.containing(x, y - 1, z + 1))).getBlock())), null)) {
					world.setBlock(BlockPos.containing(x, y - 1, z + 1), ZhengelssAditionsModBlocks.FIREBLOCK.get().defaultBlockState(), 3);
					ZhengelssAditionsMod.queueServerWork(20, () -> {
						world.setBlock(BlockPos.containing(x, y - 1, z + 1), Blocks.AIR.defaultBlockState(), 3);
					});
				}
				if ((world.getBlockState(BlockPos.containing(x, y + 1, z - 1))).is(BlockTags.create(new ResourceLocation("zhengelss_aditions:flamable")))
						|| 0 != ForgeHooks.getBurnTime((new ItemStack((world.getBlockState(BlockPos.containing(x, y + 1, z - 1))).getBlock())), null)) {
					world.setBlock(BlockPos.containing(x, y + 1, z - 1), ZhengelssAditionsModBlocks.FIREBLOCK.get().defaultBlockState(), 3);
					ZhengelssAditionsMod.queueServerWork(20, () -> {
						world.setBlock(BlockPos.containing(x, y + 1, z - 1), Blocks.AIR.defaultBlockState(), 3);
					});
				}
				if ((world.getBlockState(BlockPos.containing(x, y - 1, z - 1))).is(BlockTags.create(new ResourceLocation("zhengelss_aditions:flamable")))
						|| 0 != ForgeHooks.getBurnTime((new ItemStack((world.getBlockState(BlockPos.containing(x, y - 1, z - 1))).getBlock())), null)) {
					world.setBlock(BlockPos.containing(x, y - 1, z - 1), ZhengelssAditionsModBlocks.FIREBLOCK.get().defaultBlockState(), 3);
					ZhengelssAditionsMod.queueServerWork(20, () -> {
						world.setBlock(BlockPos.containing(x, y - 1, z - 1), Blocks.AIR.defaultBlockState(), 3);
					});
				}
				if ((world.getBlockState(BlockPos.containing(x - 1, y + 1, z))).is(BlockTags.create(new ResourceLocation("zhengelss_aditions:flamable")))
						|| 0 != ForgeHooks.getBurnTime((new ItemStack((world.getBlockState(BlockPos.containing(x - 1, y + 1, z))).getBlock())), null)) {
					world.setBlock(BlockPos.containing(x - 1, y + 1, z), ZhengelssAditionsModBlocks.FIREBLOCK.get().defaultBlockState(), 3);
					ZhengelssAditionsMod.queueServerWork(20, () -> {
						world.setBlock(BlockPos.containing(x - 1, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
					});
				}
				if ((world.getBlockState(BlockPos.containing(x - 1, y - 1, z))).is(BlockTags.create(new ResourceLocation("zhengelss_aditions:flamable")))
						|| 0 != ForgeHooks.getBurnTime((new ItemStack((world.getBlockState(BlockPos.containing(x - 1, y - 1, z))).getBlock())), null)) {
					world.setBlock(BlockPos.containing(x - 1, y - 1, z), ZhengelssAditionsModBlocks.FIREBLOCK.get().defaultBlockState(), 3);
					ZhengelssAditionsMod.queueServerWork(20, () -> {
						world.setBlock(BlockPos.containing(x - 1, y - 1, z), Blocks.AIR.defaultBlockState(), 3);
					});
				}
				if ((world.getBlockState(BlockPos.containing(x + 1, y + 1, z))).is(BlockTags.create(new ResourceLocation("zhengelss_aditions:flamable")))
						|| 0 != ForgeHooks.getBurnTime((new ItemStack((world.getBlockState(BlockPos.containing(x + 1, y + 1, z))).getBlock())), null)) {
					world.setBlock(BlockPos.containing(x + 1, y + 1, z), ZhengelssAditionsModBlocks.FIREBLOCK.get().defaultBlockState(), 3);
					ZhengelssAditionsMod.queueServerWork(20, () -> {
						world.setBlock(BlockPos.containing(x + 1, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
					});
				}
				if ((world.getBlockState(BlockPos.containing(x + 1, y - 1, z))).is(BlockTags.create(new ResourceLocation("zhengelss_aditions:flamable")))
						|| 0 != ForgeHooks.getBurnTime((new ItemStack((world.getBlockState(BlockPos.containing(x + 1, y - 1, z))).getBlock())), null)) {
					world.setBlock(BlockPos.containing(x + 1, y - 1, z), ZhengelssAditionsModBlocks.FIREBLOCK.get().defaultBlockState(), 3);
					ZhengelssAditionsMod.queueServerWork(20, () -> {
						world.setBlock(BlockPos.containing(x + 1, y - 1, z), Blocks.AIR.defaultBlockState(), 3);
					});
				}
				if ((world.getBlockState(BlockPos.containing(x + 1, y, z + 1))).is(BlockTags.create(new ResourceLocation("zhengelss_aditions:flamable")))
						|| 0 != ForgeHooks.getBurnTime((new ItemStack((world.getBlockState(BlockPos.containing(x + 1, y, z + 1))).getBlock())), null)) {
					world.setBlock(BlockPos.containing(x + 1, y, z + 1), ZhengelssAditionsModBlocks.FIREBLOCK.get().defaultBlockState(), 3);
					ZhengelssAditionsMod.queueServerWork(20, () -> {
						world.setBlock(BlockPos.containing(x + 1, y, z + 1), Blocks.AIR.defaultBlockState(), 3);
					});
				}
				if ((world.getBlockState(BlockPos.containing(x - 1, y, z + 1))).is(BlockTags.create(new ResourceLocation("zhengelss_aditions:flamable")))
						|| 0 != ForgeHooks.getBurnTime((new ItemStack((world.getBlockState(BlockPos.containing(x - 1, y, z + 1))).getBlock())), null)) {
					world.setBlock(BlockPos.containing(x - 1, y, z + 1), ZhengelssAditionsModBlocks.FIREBLOCK.get().defaultBlockState(), 3);
					ZhengelssAditionsMod.queueServerWork(20, () -> {
						world.setBlock(BlockPos.containing(x - 1, y, z + 1), Blocks.AIR.defaultBlockState(), 3);
					});
				}
				if ((world.getBlockState(BlockPos.containing(x + 1, y, z - 1))).is(BlockTags.create(new ResourceLocation("zhengelss_aditions:flamable")))
						|| 0 != ForgeHooks.getBurnTime((new ItemStack((world.getBlockState(BlockPos.containing(x + 1, y, z - 1))).getBlock())), null)) {
					world.setBlock(BlockPos.containing(x + 1, y, z - 1), ZhengelssAditionsModBlocks.FIREBLOCK.get().defaultBlockState(), 3);
					ZhengelssAditionsMod.queueServerWork(20, () -> {
						world.setBlock(BlockPos.containing(x + 1, y, z - 1), Blocks.AIR.defaultBlockState(), 3);
					});
				}
				if ((world.getBlockState(BlockPos.containing(x - 1, y, z - 1))).is(BlockTags.create(new ResourceLocation("zhengelss_aditions:flamable")))
						|| 0 != ForgeHooks.getBurnTime((new ItemStack((world.getBlockState(BlockPos.containing(x - 1, y, z - 1))).getBlock())), null)) {
					world.setBlock(BlockPos.containing(x - 1, y, z - 1), ZhengelssAditionsModBlocks.FIREBLOCK.get().defaultBlockState(), 3);
					ZhengelssAditionsMod.queueServerWork(20, () -> {
						world.setBlock(BlockPos.containing(x - 1, y, z - 1), Blocks.AIR.defaultBlockState(), 3);
					});
				}
				if ((world.getBlockState(BlockPos.containing(x + 2, y, z))).is(BlockTags.create(new ResourceLocation("zhengelss_aditions:flamable")))
						|| 0 != ForgeHooks.getBurnTime((new ItemStack((world.getBlockState(BlockPos.containing(x + 2, y, z))).getBlock())), null)) {
					world.setBlock(BlockPos.containing(x + 2, y, z), ZhengelssAditionsModBlocks.FIREBLOCK.get().defaultBlockState(), 3);
					ZhengelssAditionsMod.queueServerWork(20, () -> {
						world.setBlock(BlockPos.containing(x + 2, y, z), Blocks.AIR.defaultBlockState(), 3);
					});
				}
				if ((world.getBlockState(BlockPos.containing(x - 2, y, z))).is(BlockTags.create(new ResourceLocation("zhengelss_aditions:flamable")))
						|| 0 != ForgeHooks.getBurnTime((new ItemStack((world.getBlockState(BlockPos.containing(x - 2, y, z))).getBlock())), null)) {
					world.setBlock(BlockPos.containing(x - 2, y, z), ZhengelssAditionsModBlocks.FIREBLOCK.get().defaultBlockState(), 3);
					ZhengelssAditionsMod.queueServerWork(20, () -> {
						world.setBlock(BlockPos.containing(x - 2, y, z), Blocks.AIR.defaultBlockState(), 3);
					});
				}
				if ((world.getBlockState(BlockPos.containing(x, y, z - 2))).is(BlockTags.create(new ResourceLocation("zhengelss_aditions:flamable")))
						|| 0 != ForgeHooks.getBurnTime((new ItemStack((world.getBlockState(BlockPos.containing(x, y, z - 2))).getBlock())), null)) {
					world.setBlock(BlockPos.containing(x, y, z - 2), ZhengelssAditionsModBlocks.FIREBLOCK.get().defaultBlockState(), 3);
					ZhengelssAditionsMod.queueServerWork(20, () -> {
						world.setBlock(BlockPos.containing(x, y, z - 2), Blocks.AIR.defaultBlockState(), 3);
					});
				}
				if ((world.getBlockState(BlockPos.containing(x, y, z + 2))).is(BlockTags.create(new ResourceLocation("zhengelss_aditions:flamable")))
						|| 0 != ForgeHooks.getBurnTime((new ItemStack((world.getBlockState(BlockPos.containing(x, y, z + 2))).getBlock())), null)) {
					world.setBlock(BlockPos.containing(x, y, z + 2), ZhengelssAditionsModBlocks.FIREBLOCK.get().defaultBlockState(), 3);
					ZhengelssAditionsMod.queueServerWork(20, () -> {
						world.setBlock(BlockPos.containing(x, y, z + 2), Blocks.AIR.defaultBlockState(), 3);
					});
				}
				if ((world.getBlockState(BlockPos.containing(x, y + 2, z))).is(BlockTags.create(new ResourceLocation("zhengelss_aditions:flamable")))
						|| 0 != ForgeHooks.getBurnTime((new ItemStack((world.getBlockState(BlockPos.containing(x, y + 2, z))).getBlock())), null)) {
					world.setBlock(BlockPos.containing(x, y + 2, z), ZhengelssAditionsModBlocks.FIREBLOCK.get().defaultBlockState(), 3);
					ZhengelssAditionsMod.queueServerWork(20, () -> {
						world.setBlock(BlockPos.containing(x, y + 2, z), Blocks.AIR.defaultBlockState(), 3);
					});
				}
				if ((world.getBlockState(BlockPos.containing(x, y - 2, z))).is(BlockTags.create(new ResourceLocation("zhengelss_aditions:flamable")))
						|| 0 != ForgeHooks.getBurnTime((new ItemStack((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock())), null)) {
					world.setBlock(BlockPos.containing(x, y - 2, z), ZhengelssAditionsModBlocks.FIREBLOCK.get().defaultBlockState(), 3);
					ZhengelssAditionsMod.queueServerWork(20, () -> {
						world.setBlock(BlockPos.containing(x, y - 2, z), Blocks.AIR.defaultBlockState(), 3);
					});
				}
			});
		});
	}
}
