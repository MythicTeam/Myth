package io.mythicteam.myth.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

/**
 * Created by KeeperofMee on 2014-09-07.
 */
public class MythTabs {

	public static final CreativeTabs MYTH_BLOCKS = new CreativeTabs("mythBlocks") {
		@Override
		public Item getTabIconItem() {
			return Item.getItemFromBlock(/*Placeholder*/Blocks.stone);
		}
	};

}
