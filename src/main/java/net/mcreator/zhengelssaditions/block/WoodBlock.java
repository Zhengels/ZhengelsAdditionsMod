
package net.mcreator.zhengelssaditions.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class WoodBlock extends Block {
	public WoodBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(0.05f, 0.5f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
