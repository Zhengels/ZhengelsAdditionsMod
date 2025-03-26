
package net.mcreator.zhengelssaditions.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.zhengelssaditions.procedures.ShrapneltntexplodeProcedure;
import net.mcreator.zhengelssaditions.procedures.Shrapneltntexplode3Procedure;
import net.mcreator.zhengelssaditions.procedures.Shrapneltntexplode2Procedure;

public class ShrapneltntBlock extends Block {
	public ShrapneltntBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GRASS).instabreak());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 100;
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 100;
	}

	@Override
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		world.scheduleTick(pos, this, 5);
	}

	@Override
	public void neighborChanged(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean moving) {
		super.neighborChanged(blockstate, world, pos, neighborBlock, fromPos, moving);
		if (world.getBestNeighborSignal(pos) > 0) {
			Shrapneltntexplode2Procedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
		}
	}

	@Override
	public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		super.tick(blockstate, world, pos, random);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		ShrapneltntexplodeProcedure.execute(world, x, y, z);
		world.scheduleTick(pos, this, 5);
	}

	@Override
	public void wasExploded(Level world, BlockPos pos, Explosion e) {
		super.wasExploded(world, pos, e);
		Shrapneltntexplode3Procedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}
}
