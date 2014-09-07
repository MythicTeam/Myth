package io.mythicteam.myth;

import io.mythicteam.myth.event.ServerEvents;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;

public class Initiation {
	protected static void loadPreInit(FMLPreInitializationEvent event) {
		
	}

	protected static void loadInit(FMLInitializationEvent event) {
		
	}

	protected static void loadPostInit(FMLPostInitializationEvent event) {
		
	}
	
    protected static void serverStart(FMLServerStartingEvent event) 
    {
    	System.out.println("Server Started!");
        MinecraftForge.EVENT_BUS.register(new ServerEvents());
    }
}
