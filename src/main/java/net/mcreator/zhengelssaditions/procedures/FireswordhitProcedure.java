package net.mcreator.zhengelssaditions.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class FireswordhitProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double a = 0;
		double b = 0;
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("zhengelss_aditions:fire_sword_hit")), SoundSource.PLAYERS, 2, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("zhengelss_aditions:fire_sword_hit")), SoundSource.PLAYERS, 2, 1, false);
			}
		}
	}
}
