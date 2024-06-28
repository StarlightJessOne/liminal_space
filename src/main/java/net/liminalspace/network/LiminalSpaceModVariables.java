package net.liminalspace.network;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class LiminalSpaceModVariables {
	public static double craftime = 0;

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
	}
}
