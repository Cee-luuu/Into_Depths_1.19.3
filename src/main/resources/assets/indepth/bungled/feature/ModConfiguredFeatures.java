package luu.indepth.world.feature;

/*
import luu.indepth.Indepth;
import luu.indepth.Registry.ModBlocks;
import luu.indepth.block.custom.ModSaplingBlock;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.structure.StrongholdGenerator;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.util.math.intprovider.IntProviderType;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.AcaciaFoliagePlacer;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.BendingTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;
import java.util.Random;

public class ModConfiguredFeatures {

// the fountain leaf
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> FOUNTAIN_TREE =
            ConfiguredFeatures.register("fountain_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.FOUNTAIN_LOG),
                    new BendingTrunkPlacer(2, 3, 3,  3, ConstantIntProvider.create(2)),

                    BlockStateProvider.of(ModBlocks.FOUNTAIN_LEAF),
                    new AcaciaFoliagePlacer(ConstantIntProvider.create(1),ConstantIntProvider.create(1)),
                    new TwoLayersFeatureSize(3, 3, 2)).build());

    public static final RegistryEntry<PlacedFeature> FOUNTAIN_CHECKED =
            PlacedFeatures.register("fountain_checked", FOUNTAIN_TREE,
                    PlacedFeatures.wouldSurvive(ModBlocks.FOUNTAIN_LOTUS));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> FOUNTAIN_SPAWN =
            ConfiguredFeatures.register("fountain_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(FOUNTAIN_CHECKED, 0.5f)),
                            FOUNTAIN_CHECKED));

    // the pandher cap
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> PANTHER_TREE =
            ConfiguredFeatures.register("panther_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.PANTHER_LOG),
                    new StraightTrunkPlacer(1, 1, 2),
                    BlockStateProvider.of(ModBlocks.PANTHER_CAP),
                    new AcaciaFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(1)),
                    new TwoLayersFeatureSize(1, 1, 1)).build());

    public static final RegistryEntry<PlacedFeature> PANTHER_CHECKED =
            PlacedFeatures.register("panther_checked", PANTHER_TREE,
                    PlacedFeatures.wouldSurvive(ModBlocks.PANTHER_SPORE));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> PANTHER_SPAWN =
            ConfiguredFeatures.register("panther_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(PANTHER_CHECKED, 0.5f)),
                            PANTHER_CHECKED));


    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> MOREL_MUSHROOM =
            ConfiguredFeatures.register("morel_mushroom", Feature.FLOWER,
                    ConfiguredFeatures.createRandomPatchFeatureConfig(3, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                            new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.MOREL)))));



    public static void registerConfiguredFeatures() {
        System.out.println("Registering ModConfiguredFeatures for " + Depths.MOD_ID);
}}

 */
