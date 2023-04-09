package luu.indepth.world.features;

import luu.indepth.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.AcaciaFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;

import static luu.indepth.Indepth.MOD_ID;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> PANTHER_CAP_KEY = registerKey("panther_cap");
	public static final RegistryKey<ConfiguredFeature<?, ?>> PANTHER_CAP_SPAWN_KEY = registerKey("panther_cap_spawn");

	public static final RegistryKey<ConfiguredFeature<?, ?>> FOUNTAIN_KEY = registerKey("fountain_lotus");
	public static final RegistryKey<ConfiguredFeature<?, ?>> FOUNTAIN_SPAWN_KEY = registerKey("fountain_lotus_spawn");

	public static final RegistryKey<ConfiguredFeature<?, ?>> MORAL_KEY = registerKey("moral");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
		var placedFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.PLACED_FEATURE);

        register(context, PANTHER_CAP_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.PANTHER_LOG),
                new StraightTrunkPlacer(3, 1, 2),
                BlockStateProvider.of(ModBlocks.PANTHER_CAP),
                new AcaciaFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(1)),
                new TwoLayersFeatureSize(1, 1, 1)).build());

		register(context, PANTHER_CAP_SPAWN_KEY, Feature.RANDOM_SELECTOR,
				new RandomFeatureConfig(List.of(
						new RandomFeatureEntry(placedFeatureRegistryEntryLookup.getOrThrow(ModPlacedFeatures.FOUNTAIN_PLACED_KEY),
								0.5f)), placedFeatureRegistryEntryLookup.getOrThrow(ModPlacedFeatures.FOUNTAIN_PLACED_KEY)));

        register(context, FOUNTAIN_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.FOUNTAIN_LOG),
                new StraightTrunkPlacer(5, 6, 3),
                BlockStateProvider.of(ModBlocks.FOUNTAIN_LOTUS),
                new AcaciaFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(1)),
                new TwoLayersFeatureSize(1, 0, 15)).build());

		register(context, FOUNTAIN_SPAWN_KEY, Feature.RANDOM_SELECTOR,
				new RandomFeatureConfig(List.of(
						new RandomFeatureEntry(placedFeatureRegistryEntryLookup.getOrThrow(ModPlacedFeatures.FOUNTAIN_PLACED_KEY),
						0.5f)), placedFeatureRegistryEntryLookup.getOrThrow(ModPlacedFeatures.FOUNTAIN_PLACED_KEY)));

		register(context, MORAL_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(5,10,2,
				PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(
						BlockStateProvider.of(ModBlocks.MOREL)))));
    }


    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}

