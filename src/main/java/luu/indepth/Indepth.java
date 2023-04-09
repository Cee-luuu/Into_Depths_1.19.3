package luu.indepth;

import luu.indepth.block.ModBlocks;
import luu.indepth.item.ModItems;
import luu.indepth.utils.ModItemGroup;
import luu.indepth.utils.ModRegistries;
import net.fabricmc.api.ModInitializer;
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
		ModBlocks.registerModBlocks();
		ModItems.RegisterModItems();

		ModRegistries.registerModStuffs();

	}
}
