/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.liminalspace.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber
public class LiminalSpaceModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		ItemStack itemstack = event.getItemStack();
		if (itemstack.getItem() == Items.REDSTONE)
			event.setBurnTime(1600);
		else if (itemstack.getItem() == LiminalSpaceModItems.ALGAE_BALL.get())
			event.setBurnTime(2000);
		else if (itemstack.getItem() == LiminalSpaceModBlocks.BLOCKOF_ALGAE.get().asItem())
			event.setBurnTime(3000);
	}
}
