package net.mcreator.zhengelssaditions.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.zhengelssaditions.init.ZhengelssAditionsModBlocks;

import java.util.Map;

public class FirebombprimeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double boom = 0;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		boom = Math.random() * 10;
		sx = -1;
		for (int index0 = 0; index0 < 3; index0++) {
			sy = -1;
			for (int index1 = 0; index1 < 3; index1++) {
				sz = -1;
				for (int index2 = 0; index2 < 3; index2++) {
					if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == ZhengelssAditionsModBlocks.FIREBLOCK.get()) {
						{
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockState _bs = ZhengelssAditionsModBlocks.EXPLODINGFIREBOMB.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else {
						sx = -1;
						boom = Math.random() * 10;
						for (int index3 = 0; index3 < 3; index3++) {
							sy = -1;
							for (int index4 = 0; index4 < 3; index4++) {
								sz = -1;
								for (int index5 = 0; index5 < 3; index5++) {
									if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(new ResourceLocation("zhengelss_aditions:fire")))) {
										{
											BlockPos _bp = BlockPos.containing(x, y, z);
											BlockState _bs = ZhengelssAditionsModBlocks.PRIMEDFIREBOMB.get().defaultBlockState();
											BlockState _bso = world.getBlockState(_bp);
											for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
												Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
												if (_property != null && _bs.getValue(_property) != null)
													try {
														_bs = _bs.setValue(_property, (Comparable) entry.getValue());
													} catch (Exception e) {
													}
											}
											world.setBlock(_bp, _bs, 3);
										}
									}
									sz = sz + 1;
								}
								sy = sy + 1;
							}
							sx = sx + 1;
						}
					}
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
	}
}
