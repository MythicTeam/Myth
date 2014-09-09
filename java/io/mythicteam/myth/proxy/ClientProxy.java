package io.mythicteam.myth.proxy;

import cpw.mods.fml.client.registry.ClientRegistry;
import io.mythicteam.myth.model.ModelForge;
import io.mythicteam.myth.renders.TileEntityModelRender;
import io.mythicteam.myth.tileentity.TileEntityForge;
import io.mythicteam.myth.tileentity.TileEntityRotatable;

/**
 * Created by KeeperofMee on 2014-09-07.
 **/
public class ClientProxy implements Proxy{

	@Override
	public void registerRenders() {

		//Temporary
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityForge.class, new TileEntityModelRender(new ModelForge()));
	}

}
