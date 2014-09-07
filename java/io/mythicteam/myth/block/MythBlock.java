package io.mythicteam.myth.block;

import io.mythicteam.myth.Myth;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.registry.GameRegistry;

public class MythBlock extends Block{
	protected MythBlock(String name, Material material) {
		super(material);
		setBlockName(name);
		setBlockTextureName(Myth.MODID + ":" + name.toLowerCase());
		GameRegistry.registerBlock(this, name);
		setCreativeTab(CreativeTabs.tabBlock);
	}
	
	protected MythBlock(String name, Block vanillaTexture, Material material) {
		super(material);
		setBlockName(name);
		setBlockTextureName(vanillaTexture.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(this, name);
		setCreativeTab(CreativeTabs.tabBlock);
	}
}
