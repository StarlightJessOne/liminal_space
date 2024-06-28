/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.liminalspace.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.liminalspace.LiminalSpaceMod;

public class LiminalSpaceModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, LiminalSpaceMod.MODID);
	public static final RegistryObject<SimpleParticleType> MUSTARD_PARTICLE = REGISTRY.register("mustard_particle", () -> new SimpleParticleType(false));
}
