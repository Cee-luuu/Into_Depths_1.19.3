package luu.indepth;

import net.fabricmc.api.ClientModInitializer;

import static luu.indepth.utils.renderer.ModBlockRenderer.renderModBlocks;

public class IndepthClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

		renderModBlocks();

    }
}
