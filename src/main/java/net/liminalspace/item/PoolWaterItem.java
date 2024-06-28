
package net.liminalspace.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.liminalspace.init.LiminalSpaceModTabs;
import net.liminalspace.init.LiminalSpaceModFluids;

public class PoolWaterItem extends BucketItem {
	public PoolWaterItem() {
		super(LiminalSpaceModFluids.POOL_WATER, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(LiminalSpaceModTabs.TAB_LIMINAL_SPACES));
	}
}
