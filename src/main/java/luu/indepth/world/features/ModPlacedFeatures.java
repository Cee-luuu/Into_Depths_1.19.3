package luu.indepth.world.features;

import luu.indepth.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

import static luu.indepth.Indepth.MOD_ID;

public class ModPlacedFeatures {

	public static final RegistryKey<PlacedFeature> PANTHER_CAP_CHECKED_KEY = registerKey("panther_cap_checked");
	public static final RegistryKey<PlacedFeature> PANTHER_CAP_PLACED_KEY = registerKey("panther_cap_placed");

	public static final RegistryKey<PlacedFeature> FOUNTAIN_CHECKED_KEY = registerKey("fountain_lotus_checked");
	public static final RegistryKey<PlacedFeature> FOUNTAIN_PLACED_KEY = registerKey("fountain_lotus_placed");

	public static final RegistryKey<PlacedFeature> MORAL_PLACED_KEY = registerKey("moral_placed");

	public static void bootstrap(Registerable<PlacedFeature> context) {
		var configuredFeatureRegistryEntryLookup
				= context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

		register(context, PANTHER_CAP_CHECKED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PANTHER_CAP_KEY),
				List.of(PlacedFeatures.wouldSurvive(ModBlocks.PANTHER_CAP)));
		register(context, PANTHER_CAP_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PANTHER_CAP_KEY),
				VegetationPlacedFeatures.modifiers(PlacedFeatures.createCountExtraModifier(1, 0.1f, 1)));

		register(context, FOUNTAIN_CHECKED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.FOUNTAIN_KEY),
				List.of(PlacedFeatures.wouldSurvive(ModBlocks.FOUNTAIN_LOTUS)));
		register(context, FOUNTAIN_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.FOUNTAIN_KEY),
				VegetationPlacedFeatures.modifiers(PlacedFeatures.createCountExtraModifier(1, 0.1f, 2)));

		register(context, MORAL_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.MORAL_KEY),
				RarityFilterPlacementModifier.of(16), SquarePlacementModifier.of(),
				PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of()); // (3,0.25f, 1)))

	}


	public static RegistryKey<PlacedFeature> registerKey(String name) {
		return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(MOD_ID, name));
	}

	private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
								 RegistryEntry<ConfiguredFeature<?, ?>> configuration, List<PlacementModifier> modifiers) {

		context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
	}

	public static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context,
		RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration, PlacementModifier... modifiers) {

		register(context, key, configuration, List.of(modifiers));
	}
	private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
		return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
	}
	private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
		return modifiers(CountPlacementModifier.of(count), heightModifier);
	}
	private static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
		return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
	}
}
