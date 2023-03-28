package luu.indepth.utils.renderer;

import luu.indepth.block.ModBlocks;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class ModBlockRenderer {

	public static void renderModBlocks() {
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PANTHER_SPORE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.FOUNTAIN_LEAFE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.FOUNTAIN_LOTUS, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PANTHER_CAP, RenderLayer.getCutout());

//        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.COPPER_TRAPDOOR, RenderLayer.getCutout());
	}
}
