
package net.mcreator.zhengelssaditions.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.zhengelssaditions.procedures.Lasagna_placeProcedure;
import net.mcreator.zhengelssaditions.procedures.ApplepieeatProcedure;

public class ApplepieBlock extends Block implements SimpleWaterloggedBlock {
	public static final IntegerProperty BLOCKSTATE = IntegerProperty.create("blockstate", 0, 3);
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
	public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

	public ApplepieBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.WOOL).strength(0.5f).lightLevel(s -> (new Object() {
			public int getLightLevel() {
				if (s.getValue(BLOCKSTATE) == 1)
					return 0;
				if (s.getValue(BLOCKSTATE) == 2)
					return 0;
				if (s.getValue(BLOCKSTATE) == 3)
					return 0;
				return 0;
			}
		}.getLightLevel())).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(WATERLOGGED, false));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return state.getFluidState().isEmpty();
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		if (state.getValue(BLOCKSTATE) == 1) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(1, 0, 1, 15, 4, 12), box(0, 4, 0, 16, 5, 12), box(2, 5, 2, 14, 6, 12));
				case NORTH -> Shapes.or(box(1, 0, 4, 15, 4, 15), box(0, 4, 4, 16, 5, 16), box(2, 5, 4, 14, 6, 14));
				case EAST -> Shapes.or(box(1, 0, 1, 12, 4, 15), box(0, 4, 0, 12, 5, 16), box(2, 5, 2, 12, 6, 14));
				case WEST -> Shapes.or(box(4, 0, 1, 15, 4, 15), box(4, 4, 0, 16, 5, 16), box(4, 5, 2, 14, 6, 14));
			};
		}
		if (state.getValue(BLOCKSTATE) == 2) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(1, 0, 1, 15, 4, 8), box(0, 4, 0, 16, 5, 8), box(2, 5, 2, 14, 6, 8));
				case NORTH -> Shapes.or(box(1, 0, 8, 15, 4, 15), box(0, 4, 8, 16, 5, 16), box(2, 5, 8, 14, 6, 14));
				case EAST -> Shapes.or(box(1, 0, 1, 8, 4, 15), box(0, 4, 0, 8, 5, 16), box(2, 5, 2, 8, 6, 14));
				case WEST -> Shapes.or(box(8, 0, 1, 15, 4, 15), box(8, 4, 0, 16, 5, 16), box(8, 5, 2, 14, 6, 14));
			};
		}
		if (state.getValue(BLOCKSTATE) == 3) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(1, 0, 1, 15, 4, 4), box(0, 4, 0, 16, 5, 4), box(2, 5, 2, 14, 6, 4));
				case NORTH -> Shapes.or(box(1, 0, 12, 15, 4, 15), box(0, 4, 12, 16, 5, 16), box(2, 5, 12, 14, 6, 14));
				case EAST -> Shapes.or(box(1, 0, 1, 4, 4, 15), box(0, 4, 0, 4, 5, 16), box(2, 5, 2, 4, 6, 14));
				case WEST -> Shapes.or(box(12, 0, 1, 15, 4, 15), box(12, 4, 0, 16, 5, 16), box(12, 5, 2, 14, 6, 14));
			};
		}
		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(1, 0, 1, 15, 4, 15), box(0, 4, 0, 16, 5, 16), box(2, 5, 2, 14, 6, 14));
			case NORTH -> Shapes.or(box(1, 0, 1, 15, 4, 15), box(0, 4, 0, 16, 5, 16), box(2, 5, 2, 14, 6, 14));
			case EAST -> Shapes.or(box(1, 0, 1, 15, 4, 15), box(0, 4, 0, 16, 5, 16), box(2, 5, 2, 14, 6, 14));
			case WEST -> Shapes.or(box(1, 0, 1, 15, 4, 15), box(0, 4, 0, 16, 5, 16), box(2, 5, 2, 14, 6, 14));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(FACING, WATERLOGGED, BLOCKSTATE);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		boolean flag = context.getLevel().getFluidState(context.getClickedPos()).getType() == Fluids.WATER;
		return super.getStateForPlacement(context).setValue(FACING, context.getHorizontalDirection().getOpposite()).setValue(WATERLOGGED, flag);
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public FluidState getFluidState(BlockState state) {
		return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
	}

	@Override
	public BlockState updateShape(BlockState state, Direction facing, BlockState facingState, LevelAccessor world, BlockPos currentPos, BlockPos facingPos) {
		if (state.getValue(WATERLOGGED)) {
			world.scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickDelay(world));
		}
		return super.updateShape(state, facing, facingState, world, currentPos, facingPos);
	}

	@Override
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		Lasagna_placeProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), blockstate);
	}

	@Override
	public InteractionResult use(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
		super.use(blockstate, world, pos, entity, hand, hit);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		double hitX = hit.getLocation().x;
		double hitY = hit.getLocation().y;
		double hitZ = hit.getLocation().z;
		Direction direction = hit.getDirection();
		ApplepieeatProcedure.execute(world, x, y, z, blockstate, entity);
		return InteractionResult.SUCCESS;
	}
}
