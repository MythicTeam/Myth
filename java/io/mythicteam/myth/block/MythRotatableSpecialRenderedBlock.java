package io.mythicteam.myth.block;

import io.mythicteam.myth.tileentity.TileEntityRotatable;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import org.lwjgl.Sys;

/**
 * Created by KeeperofMee on 2014-09-08.
 */
public class MythRotatableSpecialRenderedBlock extends  MythSpecialRenderedBlock {

	public MythRotatableSpecialRenderedBlock(String name, Material material, Class<? extends TileEntity> tileEntity) {
		super(name, material, tileEntity);
	}

	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemstack)
	{
		super.onBlockAdded(world, x, y, z);
		int rotation = MathHelper.floor_double((double) (entity.rotationYaw * 4F / 360F) + 0.5D) & 3;
		float angle = 0.0f;
		if(rotation == 0) {
			world.setBlockMetadataWithNotify(x, y, z, 2, 2);
			angle = 0.0f;
		}

		if(rotation == 1) {
			world.setBlockMetadataWithNotify(x, y, z, 5, 2);
			angle = 90.0f;
		}

		if(rotation == 2) {
			world.setBlockMetadataWithNotify(x, y, z, 3, 2);
			angle = 180.0f;
		}

		if(rotation == 3) {
			world.setBlockMetadataWithNotify(x, y, z, 4, 2);
			angle = 270.0f;
		}

		changeDirection(world, x, y, z, angle);
	}

	private void changeDirection(World world, int x, int y, int z, float angle) {
		if (world.getTileEntity(x, y, z) instanceof TileEntityRotatable) {
			TileEntityRotatable rotatable;
			rotatable = (TileEntityRotatable) world.getTileEntity(x, y, z);
			rotatable.angle = angle;
		}
	}

}
