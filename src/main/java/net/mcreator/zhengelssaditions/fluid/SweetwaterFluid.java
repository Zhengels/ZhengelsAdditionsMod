
package net.mcreator.zhengelssaditions.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.zhengelssaditions.init.ZhengelssAditionsModItems;
import net.mcreator.zhengelssaditions.init.ZhengelssAditionsModFluids;
import net.mcreator.zhengelssaditions.init.ZhengelssAditionsModFluidTypes;
import net.mcreator.zhengelssaditions.init.ZhengelssAditionsModBlocks;

public abstract class SweetwaterFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> ZhengelssAditionsModFluidTypes.SWEETWATER_TYPE.get(), () -> ZhengelssAditionsModFluids.SWEETWATER.get(),
			() -> ZhengelssAditionsModFluids.FLOWING_SWEETWATER.get()).explosionResistance(100f).tickRate(4).levelDecreasePerBlock(2).bucket(() -> ZhengelssAditionsModItems.SWEETWATER_BUCKET.get())
			.block(() -> (LiquidBlock) ZhengelssAditionsModBlocks.SWEETWATER.get());

	private SweetwaterFluid() {
		super(PROPERTIES);
	}

	public static class Source extends SweetwaterFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends SweetwaterFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
