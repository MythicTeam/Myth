package io.mythicteam.myth.block;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Created by KeeperofMee on 2014-09-08.
 */
public class MythSpecialRenderedBlock extends MythBlock implements ITileEntityProvider{

	protected Class tileEntity;

	public MythSpecialRenderedBlock(String name, Material material, Class<? extends TileEntity> tileEntity) {
		super(name, material);
		this.tileEntity = tileEntity;
	}

	@Override
	public int getRenderType() {
		return -1;
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}

	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		try {
			return (TileEntity) tileEntity.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
}
