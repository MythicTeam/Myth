package io.mythicteam.myth.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class AllBlocks {

	public static Block 
	raskovnik;

	/**
	 * Adds all blocks in the mod
	 */
	public static void addMythBlocks() {
		//Please keep the list sorted and categorized		
		
		//Plants and Herbs
		raskovnik = new MythHerb("raskovnik", Material.vine).setStepSound(Block.soundTypeGrass);
	}
}
