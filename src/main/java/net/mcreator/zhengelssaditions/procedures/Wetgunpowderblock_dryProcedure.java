package net.mcreator.zhengelssaditions.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.zhengelssaditions.init.ZhengelssAditionsModBlocks;

public class Wetgunpowderblock_dryProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if (!world.getLevelData().isRaining()) {
			if (world instanceof Level _lvl1 && _lvl1.isDay()) {
				if (Math.random() < 0.4) {
					if (world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z))) {
						if (world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude()) {
							world.setBlock(BlockPos.containing(x, y, z), ZhengelssAditionsModBlocks.GUNPOWDERBLOCK.get().defaultBlockState(), 3);
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.POOF, (x + 0.5), (y + 0.5), (z + 0.5), 20, 0.5, 0.5, 0.5, 0);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lava.extinguish")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lava.extinguish")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
						}
					}
				}
			}
		}
	}
}
