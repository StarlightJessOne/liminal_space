
package net.liminalspace.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

import net.liminalspace.init.LiminalSpaceModFluids;

public class PoolWaterBlock extends LiquidBlock {
	public PoolWaterBlock() {
		super(() -> LiminalSpaceModFluids.POOL_WATER.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100000f).noCollission().noLootTable());
	}
}
