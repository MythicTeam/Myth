package io.mythicteam.myth;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import io.mythicteam.myth.init.LoadingDock;
import io.mythicteam.myth.proxy.Proxy;

/**
 * Created by KeeperofMee on 2014-09-07.
 */
@Mod(modid = Myth.MOD_ID, name = Myth.NAME, version = Myth.VERSION)
public class Myth {

	public static final String MOD_ID = "myth";
	public static final String NAME = "Myth";
	public static final String VERSION = "1.0.0";

	@Mod.Instance(MOD_ID)
	private static Myth INSTANCE;

	@SidedProxy(clientSide = "io.mythicteam.myth.proxy.ClientProxy", serverSide = "io.mythicteam.myth.proxy.CommonProxy")
	public static Proxy proxy;

	@Mod.EventHandler
	public static void preInit(FMLPreInitializationEvent event){
		LoadingDock.loadPreInit(event);
	}

	@Mod.EventHandler
	public static void init(FMLInitializationEvent event){
		LoadingDock.loadInit(event);
	}

	@Mod.EventHandler
	public static void postInit(FMLPostInitializationEvent event){
		LoadingDock.loadPostInit(event);
	}

	public static Myth getInstance(){
		return INSTANCE;
	}
}
