/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.liminalspace.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.liminalspace.LiminalSpaceMod;

public class LiminalSpaceModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, LiminalSpaceMod.MODID);
	public static final RegistryObject<SoundEvent> TEST = REGISTRY.register("test", () -> new SoundEvent(new ResourceLocation("liminal_space", "test")));
}
