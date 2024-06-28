/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.liminalspace.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.liminalspace.block.entity.ChemicalExtractorMachineBlockEntity;
import net.liminalspace.block.entity.ChemicalExtracotrOnBlockEntity;
import net.liminalspace.LiminalSpaceMod;

public class LiminalSpaceModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, LiminalSpaceMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> CHEMICAL_EXTRACTOR_MACHINE = register("chemical_extractor_machine", LiminalSpaceModBlocks.CHEMICAL_EXTRACTOR_MACHINE, ChemicalExtractorMachineBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CHEMICAL_EXTRACOTR_ON = register("chemical_extracotr_on", LiminalSpaceModBlocks.CHEMICAL_EXTRACOTR_ON, ChemicalExtracotrOnBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
