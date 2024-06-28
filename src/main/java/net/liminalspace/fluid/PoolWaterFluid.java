
package net.liminalspace.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.liminalspace.init.LiminalSpaceModItems;
import net.liminalspace.init.LiminalSpaceModFluids;
import net.liminalspace.init.LiminalSpaceModFluidTypes;
import net.liminalspace.init.LiminalSpaceModBlocks;

public abstract class PoolWaterFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> LiminalSpaceModFluidTypes.POOL_WATER_TYPE.get(), () -> LiminalSpaceModFluids.POOL_WATER.get(),
			() -> LiminalSpaceModFluids.FLOWING_POOL_WATER.get()).explosionResistance(100000f).bucket(() -> LiminalSpaceModItems.POOL_WATER_BUCKET.get()).block(() -> (LiquidBlock) LiminalSpaceModBlocks.POOL_WATER.get());

	private PoolWaterFluid() {
		super(PROPERTIES);
	}

	public static class Source extends PoolWaterFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends PoolWaterFluid {
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
