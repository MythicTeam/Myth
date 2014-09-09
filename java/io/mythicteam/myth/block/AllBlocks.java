package io.mythicteam.myth.block;

import io.mythicteam.myth.tileentity.TileEntityForge;
import io.mythicteam.myth.tileentity.TileEntityRotatable;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class AllBlocks {

	public static Block 
	raskovnik,
	forge;

	/**
	 * Adds all blocks in the mod
	 */
	public static void addMythBlocks() {
		//Please keep the list sorted and categorized		
		
		//Plants and Herbs
		raskovnik = new MythHerb("raskovnik", Material.vine).setStepSound(Block.soundTypeGrass);

		//Temp
		forge = new MythRotatableSpecialRenderedBlock("forge", Material.rock, TileEntityForge.class);
	}
}
