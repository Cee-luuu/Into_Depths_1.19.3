package luu.indepth.core.data;

import luu.indepth.world.features.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class ModVegetationGenerators {

	public static void vegetationGenerators() {

		generateTrees();
		generateShrooms();
		generateFlower();
	}

	private static void generateTrees() {
		BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS),
				GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.FOUNTAIN_PLACED_KEY);
	}
	private static void generateShrooms() {
		BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FOREST),
				GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.MORAL_PLACED_KEY);
		BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS),
				GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.MORAL_PLACED_KEY);
	}
	private static void generateFlower() {

	}
}
