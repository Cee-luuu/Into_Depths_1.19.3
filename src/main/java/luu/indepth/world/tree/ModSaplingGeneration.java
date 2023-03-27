package luu.indepth.world.tree;

import luu.indepth.world.features.ModConfiguredFeatures;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

public class ModSaplingGeneration {

	public static class FountainLotusSapling extends SaplingGenerator {
		@Override
		protected @Nullable RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
			return ModConfiguredFeatures.FOUNTAIN_KEY;
		}
	}

	public static class PantherCapSporeSapling extends SaplingGenerator {
		@Override
		protected @Nullable RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
			return ModConfiguredFeatures.PANTHER_CAP_KEY;
		}
	}
}