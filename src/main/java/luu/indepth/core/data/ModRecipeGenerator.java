package luu.indepth.core.data;

import luu.indepth.block.ModBlocks;
import luu.indepth.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        //smelting
        offerSmelting(exporter, List.of(ModItems.TRUFFLE), RecipeCategory.FOOD, ModItems.FIRD,
                90f, 1, "testing");

        //for when 9 of something becomes a block, and the block becomes 9 of something. like iron
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.FIRD, RecipeCategory.BUILDING_BLOCKS,
                ModBlocks.BLOODSTONE);

        //Gfunkledy example
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModBlocks.SPEEDYBLOCK)
                .pattern("SSS")
                .pattern("SCS")
                .pattern("SSS")
                .input('S', Items.STONE_AXE)
                .input('C', Items.STONE_PICKAXE)
                .criterion(FabricRecipeProvider.hasItem(Items.STONE_AXE),
                        FabricRecipeProvider.conditionsFromItem(Items.STONE_AXE))
                .criterion(FabricRecipeProvider.hasItem(Items.STONE_PICKAXE),
                        FabricRecipeProvider.conditionsFromItem(Items.STONE_PICKAXE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.COPPER_CHESTPLATE)));
    }
}
