/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.liminalspace.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.liminalspace.potion.MustardGasPoisoningMobEffect;
import net.liminalspace.potion.AmmoniaMobEffect;
import net.liminalspace.LiminalSpaceMod;

public class LiminalSpaceModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, LiminalSpaceMod.MODID);
	public static final RegistryObject<MobEffect> MUSTARD_GAS_POISONING = REGISTRY.register("mustard_gas_poisoning", () -> new MustardGasPoisoningMobEffect());
	public static final RegistryObject<MobEffect> AMMONIA = REGISTRY.register("ammonia", () -> new AmmoniaMobEffect());
}
