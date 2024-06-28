
package net.liminalspace.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class PorcelainTilesBlock extends SlabBlock {
	public PorcelainTilesBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.MUD_BRICKS).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false).dynamicShape());
	}
}
