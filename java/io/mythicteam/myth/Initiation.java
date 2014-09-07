package io.mythicteam.myth;

import java.util.Arrays;
import java.util.List;

import io.mythicteam.myth.event.FMLEventHandler;
import io.mythicteam.myth.event.ForgeEventHandler;
import io.mythicteam.myth.event.ServerEvents;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.Mod.Metadata;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;

public class Initiation {
    /**
     * The ModMetadata containing mcmod.info data
     */
    @Metadata(Myth.MODID)
    protected static ModMetadata meta;
	
	protected static void preInit(FMLPreInitializationEvent event) {
    	setModMeta();
    	
        MinecraftForge.EVENT_BUS.register(new ForgeEventHandler());
		FMLCommonHandler.instance().bus().register(new FMLEventHandler());	
	}

	protected static void init(FMLInitializationEvent event) {
		
	}

	protected static void postInit(FMLPostInitializationEvent event) {
		
	}
	
    protected static void serverStart(FMLServerStartingEvent event) 
    {
    	System.out.println("Server Started!");
        MinecraftForge.EVENT_BUS.register(new ServerEvents());
    }
    
    /**
     * Fills the mcmod.info file
     */
    private static void setModMeta()
    {
    	/**
    	 * List containing the www.minecraftforum.net usernames of the authors.
    	 */
        final List<String> authors = Arrays.asList(new String[] {"GamingTutsDK"}); //Add your own name
        meta.modId = Myth.MODID;
        meta.name = Myth.NAME;
        meta.description = "WIP";
        //meta.url = "www.google.dk";
        meta.logoFile = "/myth_logo.png";
        meta.version = Myth.VERSION;
        meta.authorList = authors;
        meta.credits = "The helpful Minecraft community.";
        meta.autogenerated = false;
    }
}
