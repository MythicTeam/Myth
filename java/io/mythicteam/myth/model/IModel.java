package io.mythicteam.myth.model;

import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.client.model.IModelCustom;

/**
 * Created by KeeperofMee on 2014-09-08.
 **/
 public interface IModel {

	public static final String TEXTURE_PATH = "textures/models/techne/";
	public static final String MODEL_PATH = "models/";
	public static final String TECHNE_SUFFIX = ".tcn";
	public static final String OBJ_SUFFIX = ".obj";
	public static final String TEXTURE_SUFFIX = ".png";

	/**
	 * Use AdvancedModelLoader.
	 * @return The model.
	 * */
	public IModelCustom getModel();

	/**
	 * @return The model texture path.
	 * */
	public ResourceLocation getModelTexture();

	/**
	 * Code inside this will be executed before the model is rendered.
	 * */
	public void onPreRender(TileEntity tileEntity, double x, double y, double z);

	/**
	 * Code inside this will be executed after the model is rendered.
	 * */
	public void onPostRender(TileEntity tileEntity, double x, double y, double z);

	/**
	 * TileEntity MUST be instanceof TileEntityRotatable.
	 * @return If the model is rotatable or not.
	 * */
	public boolean isRotatable();
}
