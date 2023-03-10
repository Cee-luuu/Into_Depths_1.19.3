package luu.indepth.data;

import luu.indepth.Registry.ModBlocks;
import luu.indepth.Registry.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.GrassBlock;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.PANTHER_LOG);

        addDrop(ModBlocks.MAGMA_BLACKSTONE, ModItems.FIRD);

    }
}
