package io.mythicteam.myth.block;

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

	public MythBlock(String name, Material material, SoundType soundType, boolean isBeaconBase){
		this(name, material, soundType);
		this.isBeaconBase = isBeaconBase;
	}

	public MythBlock(String name, Material material, boolean isBeaconBase) {
		this(name, material);
		this.isBeaconBase = isBeaconBase;
	}

	public MythBlock(String name, Material material, SoundType soundType){
		this(name, material);
		setStepSound(soundType);
	}
	
	public MythBlock(String name, Material material, Block stealTextureBlock){
		this(name, material);
		setBlockTextureName(stealTextureBlock.getUnlocalizedName().substring(5));
	}

	public MythBlock(String name, Material material) {
		super(material);
		setBlockName(name);
		setBlockTextureName(Myth.MODID + ":" + name);
		setCreativeTab(MythTabs.tabBlocks);
		GameRegistry.registerBlock(this, name);
	}

	public Block setBeaconBase(){
		this.isBeaconBase = true;
		return this;
	}

	public boolean isBeaconBase(IBlockAccess worldObj, int x, int y, int z, int beaconX, int beaconY, int beaconZ){
		return isBeaconBase;
	}
	
	@Override
	public String getUnlocalizedName() {
		return Myth.MODID + super.getUnlocalizedName();
	}
}
