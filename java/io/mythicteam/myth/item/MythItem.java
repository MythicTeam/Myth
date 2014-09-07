package io.mythicteam.myth.item;

import io.mythicteam.myth.Myth;
import io.mythicteam.myth.init.MythTabs;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;
import cpw.mods.fml.common.registry.GameRegistry;

public class MythItem extends Item{	
	private EnumChatFormatting infoFormat = EnumChatFormatting.DARK_PURPLE;
	
	public MythItem(String name){
		setUnlocalizedName(name);
		setTextureName(Myth.MODID + ":" + name);
		GameRegistry.registerItem(this, name);
		setCreativeTab(MythTabs.tabMaterials);
	}
	
	/**
	 * Sets the format that is used in the item Information
	 * @param format
	 */
	public void setInfoFormat(EnumChatFormatting format){
		infoFormat = format;
	}
	
	@Override
	public void addInformation(ItemStack itemstack, EntityPlayer player, List list, boolean par4) {
		String beforeTranslation = getUnlocalizedName() + ".info";
		String afterTranslation = StatCollector.translateToLocal(beforeTranslation);
		
		System.out.print("before : " + beforeTranslation);
		System.out.println(" after: " + afterTranslation);
		
		if(beforeTranslation != afterTranslation){
			list.add(infoFormat + afterTranslation);
		}
	}	
	
	@Override
	public String getUnlocalizedName() {
        return Myth.MODID + "." + super.getUnlocalizedName();
	}
	
	/*@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		return Myth.MODID + "." + super.getUnlocalizedName(itemstack);
	}*/
	
	@Override
	public String getUnlocalizedNameInefficiently(ItemStack itemstack) {
		return Myth.MODID + "." + super.getUnlocalizedNameInefficiently(itemstack);
	}
}
