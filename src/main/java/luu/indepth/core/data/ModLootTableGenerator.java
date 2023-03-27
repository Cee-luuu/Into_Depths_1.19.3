package luu.indepth.core.data;

import luu.indepth.block.ModBlocks;
import luu.indepth.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
	public ModLootTableGenerator(FabricDataOutput dataOutput) {
		super(dataOutput);
	}

	@Override
	public void generate() {
		// addDrop(ModBlocks.PANTHER_LOG);

		addDrop(ModBlocks.MAGMA_BLACKSTONE, ModItems.FIRD);
		addDrop(ModBlocks.SNOW_CAMPFIRE);

	}
}
