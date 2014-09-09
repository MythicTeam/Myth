package io.mythicteam.myth;

import io.mythicteam.myth.proxy.Proxy;

import java.util.Arrays;
import java.util.List;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.Metadata;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;

@Mod(modid = Myth.MODID, name = Myth.NAME, version = Myth.VERSION)
public class Myth {
	
	public static final String MODID = "myth";
	public static final String NAME = "Myth";
	public static final String VERSION = "0.0.1";

	@Instance(MODID)
	private static Myth INSTANCE;

	@SidedProxy(clientSide = "io.mythicteam.myth.proxy.ClientProxy", serverSide = "io.mythicteam.myth.proxy.CommonProxy")
	public static Proxy proxy;

	@EventHandler
	public static void preInit(FMLPreInitializationEvent event){Initiation.preInit(event);}

	@EventHandler
	public static void init(FMLInitializationEvent event){Initiation.init(event); proxy.registerRenders();}

	@EventHandler
	public static void postInit(FMLPostInitializationEvent event){Initiation.postInit(event);}

    @EventHandler
    public static void serverStart(FMLServerStartingEvent event){Initiation.serverStart(event);}
	
	public static Myth getInstance(){
		return INSTANCE;
	}
}
