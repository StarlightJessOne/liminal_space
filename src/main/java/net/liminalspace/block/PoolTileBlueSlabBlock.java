
package net.liminalspace.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.core.BlockPos;

public class PoolTileBlueSlabBlock extends SlabBlock {
	public PoolTileBlueSlabBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.MUD_BRICKS).strength(1f, 10f).dynamicShape());
	}

	@Override
	public boolean shouldDisplayFluidOverlay(BlockState state, BlockAndTintGetter world, BlockPos pos, FluidState fluidstate) {
		return true;
	}
}
