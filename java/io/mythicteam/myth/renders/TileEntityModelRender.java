package io.mythicteam.myth.renders;

import io.mythicteam.myth.model.IModel;
import io.mythicteam.myth.tileentity.TileEntityRotatable;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;

/**
 * @author KeeperofMee
 * Used to load .obj(blender) files and .tcn(techne).
 */
public class TileEntityModelRender extends TileEntitySpecialRenderer{

	private IModelCustom model;
	private IModel iModel;
	private ResourceLocation location;

	/**
	 * @param args Contains all the paths.
	 * 0 is the mods id.
	 * 1 is the model path.
	 * 2 is the texture location.
	 * */
	public TileEntityModelRender(String[] args){
		this.model = AdvancedModelLoader.loadModel(new ResourceLocation(args[0] + ":" + args[1]));
		this.location = new ResourceLocation(args[0] + ":" + args[2]);
	}

	/**
	 * @param modid The mods id.
	 * @param modelPath The models location.
	 * @param textureLocation is the texture location.
	 * */
	public TileEntityModelRender(String modid, String modelPath, String textureLocation){
		this.model = AdvancedModelLoader.loadModel(new ResourceLocation(modid + ":" + modelPath));
		this.location = new ResourceLocation(modid + ":" + textureLocation);
	}

	/**
	 * Load a model using the recommended IModel interface.
	 * @param model The model.
	 * */
	public TileEntityModelRender(IModel model){
		this.model = model.getModel();
		this.iModel = model;
		this.location = model.getModelTexture();
	}

	@Override
	public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float partialTick)
	{
		GL11.glPushMatrix();
		GL11.glTranslatef((float) x + 0.5f, (float) y, (float) z + 0.5f);
		this.bindTexture(location);
		GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
		final float SCALE = 1F/16F;
		GL11.glScalef(SCALE, SCALE, SCALE);
		if(iModel != null){
			iModel.onPreRender(tileEntity, x, y, z);
			if(iModel.isRotatable()){
				if(tileEntity instanceof TileEntityRotatable){
					float metadata = tileEntity.getBlockMetadata();
					TileEntityRotatable rotatable = (TileEntityRotatable) tileEntity;

					GL11.glRotatef(rotatable.angle, 0f, 1f, 0f);
				}
			}
		}
		model.renderAll();
		if(iModel != null){
			iModel.onPostRender(tileEntity, x, y, z);
		}
		GL11.glPopMatrix();
	}


}
