
package net.liminalspace.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.liminalspace.init.LiminalSpaceModTabs;

public class BleachItem extends Item {
	public BleachItem() {
		super(new Item.Properties().tab(LiminalSpaceModTabs.TAB_LIMINAL_SPACES).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return -78;
	}
}
