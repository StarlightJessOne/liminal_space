/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.liminalspace.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.liminalspace.fluid.types.PoolWaterFluidType;
import net.liminalspace.LiminalSpaceMod;

public class LiminalSpaceModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, LiminalSpaceMod.MODID);
	public static final RegistryObject<FluidType> POOL_WATER_TYPE = REGISTRY.register("pool_water", () -> new PoolWaterFluidType());
}
