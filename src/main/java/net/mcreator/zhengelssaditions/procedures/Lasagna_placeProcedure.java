package net.mcreator.zhengelssaditions.procedures;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

public class Lasagna_placeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip1 ? blockstate.getValue(_getip1) : -1) == 0) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.POOF, (x + 0.5), (y + 0.4), (z + 0.5), 3, 0.3, 0, 0.3, 0);
		}
	}
}
