package io.mythicteam.myth.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import io.mythicteam.myth.Myth;
import io.mythicteam.myth.init.MythTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;

/**
 * Created by KeeperofMee on 2014-09-07.
 */
public class MythBlock extends Block {

	boolean isBeaconBase = false;

	public MythBlock(Material material, String name, SoundType soundType, boolean isBeaconBase){
		this(material, name, soundType);
		this.isBeaconBase = isBeaconBase;
	}

	public MythBlock(Material material, String name, boolean isBeaconBase) {
		this(material, name);
		this.isBeaconBase = isBeaconBase;
	}

	public MythBlock(Material material, String name, SoundType soundType){
		this(material, name);
		setStepSound(soundType);
	}
	
	public MythBlock(Material material, String name, Block stealTextureBlock){
		this(material, name);
		setBlockTextureName(stealTextureBlock.getUnlocalizedName().substring(5));
	}

	public MythBlock(Material material, String name) {
		super(material);
		setBlockName(name);
		setBlockTextureName(Myth.MODID + ":" + name);
		setCreativeTab(MythTabs.MYTH_BLOCKS);
		GameRegistry.registerBlock(this, name);
	}

	public Block setBeaconBase(){
		this.isBeaconBase = true;
		return this;
	}

	public boolean isBeaconBase(IBlockAccess worldObj, int x, int y, int z, int beaconX, int beaconY, int beaconZ){
		return isBeaconBase;
	}
}
