package io.mythicteam.myth;

import io.mythicteam.myth.proxy.Proxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

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
	public static void preInit(FMLPreInitializationEvent event){Initiation.loadPreInit(event);}

	@EventHandler
	public static void init(FMLInitializationEvent event){Initiation.loadInit(event);}

	@EventHandler
	public static void postInit(FMLPostInitializationEvent event){Initiation.loadPostInit(event);}

	public static Myth getInstance(){
		return INSTANCE;
	}
}
