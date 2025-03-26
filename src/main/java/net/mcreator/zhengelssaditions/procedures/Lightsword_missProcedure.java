package net.mcreator.zhengelssaditions.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class Lightsword_missProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world.getBlockState(BlockPos.containing(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z)).getDestroySpeed(world,
				BlockPos.containing(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z)) == 0
				|| (world.getBlockState(BlockPos.containing(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z))).getBlock() == Blocks.AIR
				|| (world.getBlockState(BlockPos.containing(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z))).getBlock() == Blocks.CAVE_AIR
				|| (world.getBlockState(BlockPos.containing(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z))).getBlock() == Blocks.VOID_AIR) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("zhengelss_aditions:lightsword_miss")), SoundSource.PLAYERS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("zhengelss_aditions:lightsword_miss")), SoundSource.PLAYERS, 1, 1, false);
				}
			}
		}
	}
}
