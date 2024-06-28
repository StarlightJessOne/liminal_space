/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.liminalspace.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.liminalspace.client.particle.MustardParticleParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class LiminalSpaceModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.register(LiminalSpaceModParticleTypes.MUSTARD_PARTICLE.get(), MustardParticleParticle::provider);
	}
}
