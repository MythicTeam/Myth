package io.mythicteam.myth.tileentity;

import net.minecraft.tileentity.TileEntity;

/**
 * Created by KeeperofMee on 2014-09-08.
 **/
public class TileEntityRotatable extends TileEntity {

	public float angle;

	/**
	 * All model tileentities must have an empty constructor.
	 * */
	public TileEntityRotatable(){this.angle = 0;}

}
