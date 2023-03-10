package luu.indepth.Registry;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class ModFlammableRegistry {
    public static void registerFlammableBlocks() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        registry.add(ModBlocks.PANTHER_PLANKS, 5, 150);
    }
}
