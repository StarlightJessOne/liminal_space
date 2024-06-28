/*
 *    MCreator note: This file will be REGENERATED on each build.
*/
package net.liminalspace.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.liminalspace.item.RefinedLiminaliteItem;
import net.liminalspace.item.RawLiminaliteItem;
import net.liminalspace.item.PowderedChlorineItem;
import net.liminalspace.item.PoolWaterItem;
import net.liminalspace.item.MustardGasGrenadeItem;
import net.liminalspace.item.KaoliniteHardenedBrickItem;
import net.liminalspace.item.KaoliniteClayItem;
import net.liminalspace.item.FeldsparItem;
import net.liminalspace.item.ChlorineTabletItem;
import net.liminalspace.item.BleachItem;
import net.liminalspace.item.AmmoniaCanisterItem;
import net.liminalspace.item.AlgaeBallItem;
import net.liminalspace.item.ABYSALLBRICKItem;
import net.liminalspace.LiminalSpaceMod;

public class LiminalSpaceModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, LiminalSpaceMod.MODID);
	public static final RegistryObject<Item> KAOLINITE = block(LiminalSpaceModBlocks.KAOLINITE, LiminalSpaceModTabs.TAB_LIMINAL_SPACES);
	public static final RegistryObject<Item> KAOLINITE_CLAY = REGISTRY.register("kaolinite_clay", () -> new KaoliniteClayItem());
	public static final RegistryObject<Item> PORCELAIN = block(LiminalSpaceModBlocks.PORCELAIN, LiminalSpaceModTabs.TAB_LIMINAL_SPACES);
	public static final RegistryObject<Item> PORCELAIN_TILES = block(LiminalSpaceModBlocks.PORCELAIN_TILES, LiminalSpaceModTabs.TAB_LIMINAL_SPACES);
	public static final RegistryObject<Item> ABYSALLBRICK = REGISTRY.register("abysallbrick", () -> new ABYSALLBRICKItem());
	public static final RegistryObject<Item> KAOLINITE_HARDENED_BRICK = REGISTRY.register("kaolinite_hardened_brick", () -> new KaoliniteHardenedBrickItem());
	public static final RegistryObject<Item> ANORTHOSITE = block(LiminalSpaceModBlocks.ANORTHOSITE, LiminalSpaceModTabs.TAB_LIMINAL_SPACES);
	public static final RegistryObject<Item> FELDSPAR = REGISTRY.register("feldspar", () -> new FeldsparItem());
	public static final RegistryObject<Item> FELDSPAR_BLOCK = block(LiminalSpaceModBlocks.FELDSPAR_BLOCK, LiminalSpaceModTabs.TAB_LIMINAL_SPACES);
	public static final RegistryObject<Item> STRANGE_ABYSALL_STONEBRICK = block(LiminalSpaceModBlocks.STRANGE_ABYSALL_STONEBRICK, LiminalSpaceModTabs.TAB_LIMINAL_SPACES);
	public static final RegistryObject<Item> LIGHT_ALGAE_POOL_TILES = block(LiminalSpaceModBlocks.LIGHT_ALGAE_POOL_TILES, LiminalSpaceModTabs.TAB_LIMINAL_SPACES);
	public static final RegistryObject<Item> MIDWEIGHT_ALGAE_POOL_TILES = block(LiminalSpaceModBlocks.MIDWEIGHT_ALGAE_POOL_TILES, LiminalSpaceModTabs.TAB_LIMINAL_SPACES);
	public static final RegistryObject<Item> HEAVILY_COVERED_POOL_TILES = block(LiminalSpaceModBlocks.HEAVILY_COVERED_POOL_TILES, LiminalSpaceModTabs.TAB_LIMINAL_SPACES);
	public static final RegistryObject<Item> EXTREME_ALAGAE_COVERED_POOL_TILES = block(LiminalSpaceModBlocks.EXTREME_ALAGAE_COVERED_POOL_TILES, LiminalSpaceModTabs.TAB_LIMINAL_SPACES);
	public static final RegistryObject<Item> LIGHT_ALGAE_CYAN_POOL_TILES = block(LiminalSpaceModBlocks.LIGHT_ALGAE_CYAN_POOL_TILES, LiminalSpaceModTabs.TAB_LIMINAL_SPACES);
	public static final RegistryObject<Item> MIDWEIGHT_ALGAE_CYAN_POOL_TILES = block(LiminalSpaceModBlocks.MIDWEIGHT_ALGAE_CYAN_POOL_TILES, LiminalSpaceModTabs.TAB_LIMINAL_SPACES);
	public static final RegistryObject<Item> HEAVILY_COVERED_ALGAE_CYAN_POOL_TILES = block(LiminalSpaceModBlocks.HEAVILY_COVERED_ALGAE_CYAN_POOL_TILES, LiminalSpaceModTabs.TAB_LIMINAL_SPACES);
	public static final RegistryObject<Item> EXTREME_ALGAE_COVERED_CYAN_POOL_TILES = block(LiminalSpaceModBlocks.EXTREME_ALGAE_COVERED_CYAN_POOL_TILES, LiminalSpaceModTabs.TAB_LIMINAL_SPACES);
	public static final RegistryObject<Item> LIGHT_ALGAE_BLUE_POOL_TILE = block(LiminalSpaceModBlocks.LIGHT_ALGAE_BLUE_POOL_TILE, LiminalSpaceModTabs.TAB_LIMINAL_SPACES);
	public static final RegistryObject<Item> MIDWEIGHT_ALGAE_BLUE_POOL_TILES = block(LiminalSpaceModBlocks.MIDWEIGHT_ALGAE_BLUE_POOL_TILES, LiminalSpaceModTabs.TAB_LIMINAL_SPACES);
	public static final RegistryObject<Item> HEAVILY_COVERED_ALGAE_BLUE_POOL_TILES = block(LiminalSpaceModBlocks.HEAVILY_COVERED_ALGAE_BLUE_POOL_TILES, LiminalSpaceModTabs.TAB_LIMINAL_SPACES);
	public static final RegistryObject<Item> EXTREME_ALGAE_COVERED_BLUE_POOL_TILES = block(LiminalSpaceModBlocks.EXTREME_ALGAE_COVERED_BLUE_POOL_TILES, LiminalSpaceModTabs.TAB_LIMINAL_SPACES);
	public static final RegistryObject<Item> CHLORINE_TABLET = REGISTRY.register("chlorine_tablet", () -> new ChlorineTabletItem());
	public static final RegistryObject<Item> BLOCKOF_ALGAE = block(LiminalSpaceModBlocks.BLOCKOF_ALGAE, LiminalSpaceModTabs.TAB_LIMINAL_SPACES);
	public static final RegistryObject<Item> POOL_WATER_BUCKET = REGISTRY.register("pool_water_bucket", () -> new PoolWaterItem());
	public static final RegistryObject<Item> BLEACH = REGISTRY.register("bleach", () -> new BleachItem());
	public static final RegistryObject<Item> AMMONIA_CANISTER = REGISTRY.register("ammonia_canister", () -> new AmmoniaCanisterItem());
	public static final RegistryObject<Item> HALITE = block(LiminalSpaceModBlocks.HALITE, LiminalSpaceModTabs.TAB_LIMINAL_SPACES);
	public static final RegistryObject<Item> POOL_TILE_SLAB = block(LiminalSpaceModBlocks.POOL_TILE_SLAB, LiminalSpaceModTabs.TAB_LIMINAL_SPACES);
	public static final RegistryObject<Item> POOL_TILE_STAIRS = block(LiminalSpaceModBlocks.POOL_TILE_STAIRS, LiminalSpaceModTabs.TAB_LIMINAL_SPACES);
	public static final RegistryObject<Item> LIMESTONE = block(LiminalSpaceModBlocks.LIMESTONE, LiminalSpaceModTabs.TAB_LIMINAL_SPACES);
	public static final RegistryObject<Item> ABYSSAL_STONEBRICK = block(LiminalSpaceModBlocks.ABYSSAL_STONEBRICK, LiminalSpaceModTabs.TAB_LIMINAL_SPACES);
	public static final RegistryObject<Item> ABYSALL_STONE = block(LiminalSpaceModBlocks.ABYSALL_STONE, LiminalSpaceModTabs.TAB_LIMINAL_SPACES);
	public static final RegistryObject<Item> LIMINALITE_BLOCK = block(LiminalSpaceModBlocks.LIMINALITE_BLOCK, LiminalSpaceModTabs.TAB_LIMINAL_SPACES);
	public static final RegistryObject<Item> REFINED_LIMINALITE = REGISTRY.register("refined_liminalite", () -> new RefinedLiminaliteItem());
	public static final RegistryObject<Item> RAW_LIMINALITE = REGISTRY.register("raw_liminalite", () -> new RawLiminaliteItem());
	public static final RegistryObject<Item> RAW_LIMINALITE_BLOCK = block(LiminalSpaceModBlocks.RAW_LIMINALITE_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> LIMINALITE_ORE = block(LiminalSpaceModBlocks.LIMINALITE_ORE, LiminalSpaceModTabs.TAB_LIMINAL_SPACES);
	public static final RegistryObject<Item> POOL_TILES_CYAN = block(LiminalSpaceModBlocks.POOL_TILES_CYAN, LiminalSpaceModTabs.TAB_LIMINAL_SPACES);
	public static final RegistryObject<Item> POOL_TILE = block(LiminalSpaceModBlocks.POOL_TILE, LiminalSpaceModTabs.TAB_LIMINAL_SPACES);
	public static final RegistryObject<Item> POOL_TILE_BLUE = block(LiminalSpaceModBlocks.POOL_TILE_BLUE, LiminalSpaceModTabs.TAB_LIMINAL_SPACES);
	public static final RegistryObject<Item> POWDERED_CHLORINE = REGISTRY.register("powdered_chlorine", () -> new PowderedChlorineItem());
	public static final RegistryObject<Item> CHEMICAL_EXTRACTOR_MACHINE = block(LiminalSpaceModBlocks.CHEMICAL_EXTRACTOR_MACHINE, LiminalSpaceModTabs.TAB_LIMINAL_SPACES);
	public static final RegistryObject<Item> CHEMICAL_EXTRACOTR_ON = block(LiminalSpaceModBlocks.CHEMICAL_EXTRACOTR_ON, null);
	public static final RegistryObject<Item> ALGAE_BALL = REGISTRY.register("algae_ball", () -> new AlgaeBallItem());
	public static final RegistryObject<Item> POOL_TILE_CYAN_SLAB = block(LiminalSpaceModBlocks.POOL_TILE_CYAN_SLAB, LiminalSpaceModTabs.TAB_LIMINAL_SPACES);
	public static final RegistryObject<Item> POOL_TILE_BLUE_SLAB = block(LiminalSpaceModBlocks.POOL_TILE_BLUE_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> MUSTARD_GAS_GRENADE = REGISTRY.register("mustard_gas_grenade", () -> new MustardGasGrenadeItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
