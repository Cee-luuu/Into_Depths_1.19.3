package luu.indepth;

import luu.indepth.Registry.ModBlocks;
import luu.indepth.Registry.ModFlammableRegistry;
import luu.indepth.Registry.ModItems;
import luu.indepth.item.ModItemGroup;
import luu.indepth.util.ModRegistries;
//import luu.indepth.world.feature.ModConfiguredFeatures;
//import luu.indepth.world.gen.ModWorldGen;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Indepth implements ModInitializer {
	public static final String MOD_ID = "indepth";
	public static final Logger LOGGER = LoggerFactory.getLogger("indepth");


	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ModItemGroup.registerItemGroups();

//		ModConfiguredFeatures.registerConfiguredFeatures();

		ModItems.RegisterModItems();
		ModBlocks.registerModBlocks();

		ModRegistries.registerModStuffs();

		ModFlammableRegistry.registerFlammableBlocks();

	//	ModWorldGen.generateModWorldGen();
	}
}