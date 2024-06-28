/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.liminalspace.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class LiminalSpaceModTabs {
	public static CreativeModeTab TAB_LIMINAL_SPACES;

	public static void load() {
		TAB_LIMINAL_SPACES = new CreativeModeTab("tab_liminal_spaces") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(LiminalSpaceModBlocks.POOL_TILE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
