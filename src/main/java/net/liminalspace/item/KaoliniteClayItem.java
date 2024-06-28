
package net.liminalspace.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.liminalspace.init.LiminalSpaceModTabs;

public class KaoliniteClayItem extends Item {
	public KaoliniteClayItem() {
		super(new Item.Properties().tab(LiminalSpaceModTabs.TAB_LIMINAL_SPACES).stacksTo(64).rarity(Rarity.COMMON));
	}
}
