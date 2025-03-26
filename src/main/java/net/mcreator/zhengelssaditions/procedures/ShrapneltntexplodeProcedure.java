package net.mcreator.zhengelssaditions.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.zhengelssaditions.init.ZhengelssAditionsModEntities;
import net.mcreator.zhengelssaditions.entity.ShrapnelEntity;

public class ShrapneltntexplodeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double boom = 0;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		sx = -1;
		boom = Math.random() * 10;
		for (int index0 = 0; index0 < 3; index0++) {
			sy = -1;
			for (int index1 = 0; index1 < 3; index1++) {
				sz = -1;
				for (int index2 = 0; index2 < 3; index2++) {
					if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(new ResourceLocation("zhengelss_aditions:fire")))) {
						world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
						for (int index3 = 0; index3 < 500; index3++) {
							if (world instanceof ServerLevel projectileLevel) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, float damage, int knockback) {
										AbstractArrow entityToSpawn = new ShrapnelEntity(ZhengelssAditionsModEntities.SHRAPNEL.get(), level);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setSilent(true);
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, (float) 1.5, 0);
								_entityToSpawn.setPos((x + 0.5), (y + 0.5), (z + 0.5));
								_entityToSpawn.shoot(0, 1, 0, 1, 1000);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
						}
						if (world instanceof Level _level && !_level.isClientSide())
							_level.explode(null, (x + 0.5), (y + 0.5), (z + 0.5), 4, Level.ExplosionInteraction.TNT);
					}
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
	}
}
