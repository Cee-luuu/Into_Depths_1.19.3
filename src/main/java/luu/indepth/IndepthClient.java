package luu.indepth;
import luu.indepth.Registry.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

import net.fabricmc.api.ClientModInitializer;

public class IndepthClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        /*
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.COPPER_TRAPDOOR, RenderLayer.getCutout());
        */
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PANTHER_SPORE, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.FOUNTAIN_LEAF, RenderLayer.getCutout());
//        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.FOUNTAIN_LOTUS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PANTHER_CAP, RenderLayer.getCutout());

    }
}
