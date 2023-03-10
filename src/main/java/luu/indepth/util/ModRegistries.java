package luu.indepth.util;

import luu.indepth.Indepth;
import luu.indepth.Registry.ModBlocks;
import luu.indepth.Registry.ModItems;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class ModRegistries {
    public static void registerModStuffs(){
        registerFuels();
        registerFlammableBlock();
        registerStrippables();
    }


    private static void registerFuels(){
        Indepth.LOGGER.info("Registering fuels for" + Indepth.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add (ModItems.FIRD, 1);

    }

    private static void registerStrippables() {
        StrippableBlockRegistry.register(ModBlocks.FOUNTAIN_LOG, ModBlocks.STRIPPED_FOUNTAIN_LOG);
        StrippableBlockRegistry.register(ModBlocks.FOUNTAIN_WOOD, ModBlocks.STRIPPED_FOUNTAIN_WOOD);
    }
    private static void registerFlammableBlock() {
        FlammableBlockRegistry instance = FlammableBlockRegistry.getDefaultInstance();

        instance.add(ModBlocks.FOUNTAIN_LOG, 7, 7);
        instance.add(ModBlocks.STRIPPED_FOUNTAIN_LOG, 7, 7);
        instance.add(ModBlocks.FOUNTAIN_WOOD, 7, 7);
        instance.add(ModBlocks.STRIPPED_FOUNTAIN_WOOD, 7, 7);
        instance.add(ModBlocks.FOUNTAIN_PLANKS, 97, 20);
        instance.add(ModBlocks.FOUNTAIN_LEAF, 2, 4);


    }}
