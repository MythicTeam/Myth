package io.mythicteam.myth.model;

import io.mythicteam.myth.Myth;
import io.mythicteam.myth.tileentity.TileEntityRotatable;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;

/**
 * Created by KeeperofMee on 2014-09-08.
 **/
 public class ModelForge implements IModel {

	private static final String MODEL_NAME = "forge";

	@Override
	public IModelCustom getModel() {
		return AdvancedModelLoader.loadModel(new ResourceLocation(Myth.MODID, MODEL_PATH + MODEL_NAME + TECHNE_SUFFIX));
	}

	@Override
	public ResourceLocation getModelTexture() {
		return new ResourceLocation(Myth.MODID, TEXTURE_PATH + MODEL_NAME + TEXTURE_SUFFIX);
	}

	@Override
	public void onPreRender(TileEntity tileEntity, double x, double y, double z) {

	}

	@Override
	public void onPostRender(TileEntity tileEntity, double x, double y, double z) {

	}

	@Override
	public boolean isRotatable() {
		return true;
	}

}
