package luu.indepth.utils;

import luu.indepth.Indepth;
import luu.indepth.block.ModBlocks;
import luu.indepth.item.ModItems;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class ModRegistries {
    public static void registerModStuffs(){
        registerFuels();
        registerFlammableBlock();
        registerStrippableBlocks();
		registerCompostables();
    }

    private static void registerFuels(){
        Indepth.LOGGER.info("Registering fuels for" + Indepth.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add (ModItems.FIRD, 1);
    }

    private static void registerStrippableBlocks() {
        StrippableBlockRegistry.register(ModBlocks.FOUNTAIN_LOG, ModBlocks.STRIPPED_FOUNTAIN_LOG);
        StrippableBlockRegistry.register(ModBlocks.FOUNTAIN_WOOD, ModBlocks.STRIPPED_FOUNTAIN_WOOD);
    }

    private static void registerFlammableBlock() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        registry.add(ModBlocks.FOUNTAIN_LOG, 7, 7);
		registry.add(ModBlocks.STRIPPED_FOUNTAIN_LOG, 7, 7);
		registry.add(ModBlocks.FOUNTAIN_WOOD, 7, 7);
		registry.add(ModBlocks.STRIPPED_FOUNTAIN_WOOD, 7, 7);

		registry.add(ModBlocks.FOUNTAIN_PLANKS, 5, 20);
		registry.add(ModBlocks.FOUNTAIN_LEAFE, 30, 60);

		registry.add(ModBlocks.PANTHER_PLANKS, 5, 20);
    }

	private static void registerCompostables() {
		CompostingChanceRegistry registry = CompostingChanceRegistry.INSTANCE;

		registry.add(ModBlocks.FOUNTAIN_LEAFE.asItem(),0.6F );
		registry.add(ModBlocks.FOUNTAIN_LOTUS.asItem(), 0.3666F);
		registry.add(ModBlocks.MOREL.asItem(),0.3666F );

		registry.add(ModItems.TRUFFLE, 1.0F);
	}
}
