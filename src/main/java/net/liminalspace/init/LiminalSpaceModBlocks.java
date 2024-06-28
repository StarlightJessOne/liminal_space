/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.liminalspace.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.liminalspace.block.StrangeAbysallStonebrickBlock;
import net.liminalspace.block.RawLiminaliteBlockBlock;
import net.liminalspace.block.PorcelainTilesBlock;
import net.liminalspace.block.PorcelainBlock;
import net.liminalspace.block.PoolWaterBlock;
import net.liminalspace.block.PoolTilesCyanBlock;
import net.liminalspace.block.PoolTileStairsBlock;
import net.liminalspace.block.PoolTileSlabBlock;
import net.liminalspace.block.PoolTileCyanSlabBlock;
import net.liminalspace.block.PoolTileBlueSlabBlock;
import net.liminalspace.block.PoolTileBlueBlock;
import net.liminalspace.block.PoolTileBlock;
import net.liminalspace.block.MidweightAlgaePoolTilesBlock;
import net.liminalspace.block.MidweightAlgaeCyanPoolTilesBlock;
import net.liminalspace.block.MidweightAlgaeBluePoolTilesBlock;
import net.liminalspace.block.LiminaliteOreBlock;
import net.liminalspace.block.LiminaliteBlockBlock;
import net.liminalspace.block.LimestoneBlock;
import net.liminalspace.block.LightAlgaePoolTilesBlock;
import net.liminalspace.block.LightAlgaeCyanPoolTilesBlock;
import net.liminalspace.block.LightAlgaeBluePoolTileBlock;
import net.liminalspace.block.KaoliniteBlock;
import net.liminalspace.block.HeavilyCoveredPoolTilesBlock;
import net.liminalspace.block.HeavilyCoveredAlgaeCyanPoolTilesBlock;
import net.liminalspace.block.HeavilyCoveredAlgaeBluePoolTilesBlock;
import net.liminalspace.block.HaliteBlock;
import net.liminalspace.block.FeldsparBlockBlock;
import net.liminalspace.block.ExtremeAlgaeCoveredCyanPoolTilesBlock;
import net.liminalspace.block.ExtremeAlgaeCoveredBluePoolTilesBlock;
import net.liminalspace.block.ExtremeAlagaeCoveredPoolTilesBlock;
import net.liminalspace.block.ChemicalExtractorMachineBlock;
import net.liminalspace.block.ChemicalExtracotrOnBlock;
import net.liminalspace.block.BlockofAlgaeBlock;
import net.liminalspace.block.AnorthositeBlock;
import net.liminalspace.block.AbyssalStonebrickBlock;
import net.liminalspace.block.AbysallStoneBlock;
import net.liminalspace.LiminalSpaceMod;

public class LiminalSpaceModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, LiminalSpaceMod.MODID);
	public static final RegistryObject<Block> KAOLINITE = REGISTRY.register("kaolinite", () -> new KaoliniteBlock());
	public static final RegistryObject<Block> PORCELAIN = REGISTRY.register("porcelain", () -> new PorcelainBlock());
	public static final RegistryObject<Block> PORCELAIN_TILES = REGISTRY.register("porcelain_tiles", () -> new PorcelainTilesBlock());
	public static final RegistryObject<Block> ANORTHOSITE = REGISTRY.register("anorthosite", () -> new AnorthositeBlock());
	public static final RegistryObject<Block> FELDSPAR_BLOCK = REGISTRY.register("feldspar_block", () -> new FeldsparBlockBlock());
	public static final RegistryObject<Block> STRANGE_ABYSALL_STONEBRICK = REGISTRY.register("strange_abysall_stonebrick", () -> new StrangeAbysallStonebrickBlock());
	public static final RegistryObject<Block> LIGHT_ALGAE_POOL_TILES = REGISTRY.register("light_algae_pool_tiles", () -> new LightAlgaePoolTilesBlock());
	public static final RegistryObject<Block> MIDWEIGHT_ALGAE_POOL_TILES = REGISTRY.register("midweight_algae_pool_tiles", () -> new MidweightAlgaePoolTilesBlock());
	public static final RegistryObject<Block> HEAVILY_COVERED_POOL_TILES = REGISTRY.register("heavily_covered_pool_tiles", () -> new HeavilyCoveredPoolTilesBlock());
	public static final RegistryObject<Block> EXTREME_ALAGAE_COVERED_POOL_TILES = REGISTRY.register("extreme_alagae_covered_pool_tiles", () -> new ExtremeAlagaeCoveredPoolTilesBlock());
	public static final RegistryObject<Block> LIGHT_ALGAE_CYAN_POOL_TILES = REGISTRY.register("light_algae_cyan_pool_tiles", () -> new LightAlgaeCyanPoolTilesBlock());
	public static final RegistryObject<Block> MIDWEIGHT_ALGAE_CYAN_POOL_TILES = REGISTRY.register("midweight_algae_cyan_pool_tiles", () -> new MidweightAlgaeCyanPoolTilesBlock());
	public static final RegistryObject<Block> HEAVILY_COVERED_ALGAE_CYAN_POOL_TILES = REGISTRY.register("heavily_covered_algae_cyan_pool_tiles", () -> new HeavilyCoveredAlgaeCyanPoolTilesBlock());
	public static final RegistryObject<Block> EXTREME_ALGAE_COVERED_CYAN_POOL_TILES = REGISTRY.register("extreme_algae_covered_cyan_pool_tiles", () -> new ExtremeAlgaeCoveredCyanPoolTilesBlock());
	public static final RegistryObject<Block> LIGHT_ALGAE_BLUE_POOL_TILE = REGISTRY.register("light_algae_blue_pool_tile", () -> new LightAlgaeBluePoolTileBlock());
	public static final RegistryObject<Block> MIDWEIGHT_ALGAE_BLUE_POOL_TILES = REGISTRY.register("midweight_algae_blue_pool_tiles", () -> new MidweightAlgaeBluePoolTilesBlock());
	public static final RegistryObject<Block> HEAVILY_COVERED_ALGAE_BLUE_POOL_TILES = REGISTRY.register("heavily_covered_algae_blue_pool_tiles", () -> new HeavilyCoveredAlgaeBluePoolTilesBlock());
	public static final RegistryObject<Block> EXTREME_ALGAE_COVERED_BLUE_POOL_TILES = REGISTRY.register("extreme_algae_covered_blue_pool_tiles", () -> new ExtremeAlgaeCoveredBluePoolTilesBlock());
	public static final RegistryObject<Block> BLOCKOF_ALGAE = REGISTRY.register("blockof_algae", () -> new BlockofAlgaeBlock());
	public static final RegistryObject<Block> POOL_WATER = REGISTRY.register("pool_water", () -> new PoolWaterBlock());
	public static final RegistryObject<Block> HALITE = REGISTRY.register("halite", () -> new HaliteBlock());
	public static final RegistryObject<Block> POOL_TILE_SLAB = REGISTRY.register("pool_tile_slab", () -> new PoolTileSlabBlock());
	public static final RegistryObject<Block> POOL_TILE_STAIRS = REGISTRY.register("pool_tile_stairs", () -> new PoolTileStairsBlock());
	public static final RegistryObject<Block> LIMESTONE = REGISTRY.register("limestone", () -> new LimestoneBlock());
	public static final RegistryObject<Block> ABYSSAL_STONEBRICK = REGISTRY.register("abyssal_stonebrick", () -> new AbyssalStonebrickBlock());
	public static final RegistryObject<Block> ABYSALL_STONE = REGISTRY.register("abysall_stone", () -> new AbysallStoneBlock());
	public static final RegistryObject<Block> LIMINALITE_BLOCK = REGISTRY.register("liminalite_block", () -> new LiminaliteBlockBlock());
	public static final RegistryObject<Block> RAW_LIMINALITE_BLOCK = REGISTRY.register("raw_liminalite_block", () -> new RawLiminaliteBlockBlock());
	public static final RegistryObject<Block> LIMINALITE_ORE = REGISTRY.register("liminalite_ore", () -> new LiminaliteOreBlock());
	public static final RegistryObject<Block> POOL_TILES_CYAN = REGISTRY.register("pool_tiles_cyan", () -> new PoolTilesCyanBlock());
	public static final RegistryObject<Block> POOL_TILE = REGISTRY.register("pool_tile", () -> new PoolTileBlock());
	public static final RegistryObject<Block> POOL_TILE_BLUE = REGISTRY.register("pool_tile_blue", () -> new PoolTileBlueBlock());
	public static final RegistryObject<Block> CHEMICAL_EXTRACTOR_MACHINE = REGISTRY.register("chemical_extractor_machine", () -> new ChemicalExtractorMachineBlock());
	public static final RegistryObject<Block> CHEMICAL_EXTRACOTR_ON = REGISTRY.register("chemical_extracotr_on", () -> new ChemicalExtracotrOnBlock());
	public static final RegistryObject<Block> POOL_TILE_CYAN_SLAB = REGISTRY.register("pool_tile_cyan_slab", () -> new PoolTileCyanSlabBlock());
	public static final RegistryObject<Block> POOL_TILE_BLUE_SLAB = REGISTRY.register("pool_tile_blue_slab", () -> new PoolTileBlueSlabBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
