package luu.indepth.Registry;

import luu.indepth.Indepth;
import luu.indepth.block.PantherTrunk;
import luu.indepth.block.custom.*;
/*
import assets.indepth.bungled.needsrework.ModDoorBlock;
import assets.indepth.bungled.needsrework.ModTrapdoorBlock;
 */
import luu.indepth.item.ModItemGroup;
//import luu.indepth.world.feature.tree.FountainLotusGenerator;
//import luu.indepth.world.feature.tree.PantherSporeGenerator;
import luu.indepth.world.tree.PantherCapSporeGenerator;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class ModBlocks {

    public static final Block BLOODSTONE = registerBlock("bloodstone",
            new Block(FabricBlockSettings
                    .of(Material.STONE)
                    .strength(4.0f, 6.0f)
                    .sounds(BlockSoundGroup.BASALT)
                    .requiresTool()
            ), ModItemGroup.IDITEMS);
    public static final Block BLOODSTONE_SLAB = registerBlock("bloodstone_slab",
            new SlabBlock(FabricBlockSettings
                    .of(Material.STONE)
                    .strength(4.0f, 10.0f)
                    .sounds(BlockSoundGroup.BASALT)
                    .requiresTool()
            ), ModItemGroup.IDITEMS);
    public static final Block BLOODSTONE_STAIRS = registerBlock("bloodstone_stairs",
            new ModStairsBlock(ModBlocks.BLOODSTONE.getDefaultState(),
                    FabricBlockSettings
                            .of(Material.STONE)
                            .strength(4.0f, 10.0f)
                            .sounds(BlockSoundGroup.BASALT)
                            .requiresTool()
            ), ModItemGroup.IDITEMS);

    public static final Block BLOODSTONE_POLISHED = registerBlock("bloodstone_polished",
            new Block(FabricBlockSettings
                    .of(Material.STONE)
                    .strength(4.0f, 10.0f)
                    .sounds(BlockSoundGroup.BASALT)
                    .requiresTool()
                    ), ModItemGroup.IDITEMS);
    public static final Block BLOODSTONE_POLISHED_SLAB = registerBlock("bloodstone_polished_slab",
            new SlabBlock(FabricBlockSettings
                    .of(Material.STONE)
                    .strength(4.0f, 10.0f)
                    .sounds(BlockSoundGroup.BASALT)
                    .requiresTool()
            ), ModItemGroup.IDITEMS);
    public static final Block BLOODSTONE_POLISHED_STAIRS = registerBlock("bloodstone_polished_stairs",
            new ModStairsBlock(ModBlocks.BLOODSTONE.getDefaultState(),
                    FabricBlockSettings
                            .of(Material.STONE)
                            .strength(4.0f, 10.0f)
                            .sounds(BlockSoundGroup.BASALT)
                            .requiresTool()
            ), ModItemGroup.IDITEMS);
    public static final Block BLOODSTONE_POLISHED_WALL = registerBlock("bloodstone_polished_wall",
            new WallBlock(FabricBlockSettings
                    .of(Material.STONE)
                    .strength(4.0f, 10.0f)
                    .sounds(BlockSoundGroup.BASALT)
                    .requiresTool()
            ), ModItemGroup.IDITEMS);






    public static final Block BLOODSTONE_BRICKS = registerBlock("bloodstone_bricks",
            new Block(FabricBlockSettings
                    .of(Material.STONE)
                    .strength(4.0f, 10.0f)
                    .sounds(BlockSoundGroup.BASALT)
                    .requiresTool()
                    ), ModItemGroup.IDITEMS);

    public static final Block BLOODSTONE_TILES = registerBlock("bloodstone_tiles",
            new Block(FabricBlockSettings
                    .of(Material.STONE)
                    .strength(4.0f, 10.0f)
                    .sounds(BlockSoundGroup.BASALT)
                    .requiresTool()
                     ), ModItemGroup.IDITEMS);
    public static final Block BLOODSTONE_TILES_SLAB = registerBlock("bloodstone_tiles_slab",
            new SlabBlock(FabricBlockSettings
                    .of(Material.STONE)
                    .strength(4.0f, 10.0f)
                    .sounds(BlockSoundGroup.BASALT)
                    .requiresTool()
            ), ModItemGroup.IDITEMS);
    public static final Block BLOODSTONE_TILES_STAIRS = registerBlock("bloodstone_tiles_stairs",
            new ModStairsBlock(ModBlocks.BLOODSTONE.getDefaultState(),
                    FabricBlockSettings
                            .of(Material.STONE)
                            .strength(4.0f, 10.0f)
                            .sounds(BlockSoundGroup.BASALT)
                            .requiresTool()
            ), ModItemGroup.IDITEMS);
    public static final Block BLOODSTONE_TILES_WALL = registerBlock("bloodstone_tiles_wall",
            new WallBlock(FabricBlockSettings
                    .of(Material.STONE)
                    .strength(4.0f, 10.0f)
                    .sounds(BlockSoundGroup.BASALT)
                    .requiresTool()
            ), ModItemGroup.IDITEMS);


/*
    public static final Block BLOODSTONE_BUTTON = registerBlock("bloodstone_button",
            new ModStoneButtonBlock(FabricBlockSettings
                    .of(Material.STONE)
                    .strength(4.0f, 10.0f)
                    .sounds(BlockSoundGroup.BASALT)
                    .requiresTool()
                    .noCollision()
            ), ModItemGroup.IDITEMS);
*/
/*
    public static final Block BLOODSTONE_PRESSURE_PLATE = registerBlock("bloodstone_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings
                    .of(Material.STONE)
                    .strength(4.0f, 10.0f)
                    .sounds(BlockSoundGroup.BASALT)
                    .requiresTool()
            ), ModItemGroup.IDITEMS);
*/
    public static final Block BLOODSTONE_FENCE = registerBlock("bloodstone_fence",
            new FenceBlock(FabricBlockSettings
                    .of(Material.STONE)
                    .strength(4.0f, 10.0f)
                    .sounds(BlockSoundGroup.BASALT)
                    .requiresTool()
            ), ModItemGroup.IDITEMS);
/*
    public static final Block BLOODSTONE_GATE = registerBlock("bloodstone_fence_gate",
            new FenceGateBlock(FabricBlockSettings
                    .of(Material.STONE)
                    .strength(4.0f, 10.0f)
                    .sounds(BlockSoundGroup.BASALT)
                    .requiresTool()
            ), ModItemGroup.IDITEMS);
    public static final Block BLOODSTONE_WALL = registerBlock("bloodstone_wall",
            new WallBlock(FabricBlockSettings
                    .of(Material.STONE)
                    .strength(4.0f, 10.0f)
                    .sounds(BlockSoundGroup.BASALT)
                    .requiresTool()
            ), ModItemGroup.IDITEMS);
*/



/*
    public static final Block PUFFBALL = registerBlock("puffball",
            new Puffball(FabricBlockSettings
                    .of(Material.UNDERWATER_PLANT)
                    .strength(0.0f, 0.0f)
                    .sounds(BlockSoundGroup.FUNGUS)
            ), ModItemGroup.IDITEMS);

            //control + shift + /
*/

    //Magma bricks
    public static final Block MAGMA_BRICKS = registerBlock("magma_bricks",
            new Block(FabricBlockSettings
                    .of(Material.STONE)
                    .strength(1f, 20f)
                    .sounds(BlockSoundGroup.NETHER_BRICKS)
                    .requiresTool()
                    .luminance(4)
            ), ModItemGroup.IDITEMS);
    public static final Block MAGMA_BLACKSTONE = registerBlock("magma_blackstone",
            new Block(FabricBlockSettings
                    .of(Material.STONE)
                    .strength(1f, 20f)
                    .sounds(BlockSoundGroup.BASALT)
                    .requiresTool()
                    .luminance(4)
            ), ModItemGroup.IDITEMS);



    //granide
    public static final Block GRANITE_BRICKS = registerBlock("granite_bricks",
            new Block(FabricBlockSettings
                    .of(Material.STONE)
                    .strength(1.5f, 6f)
                    .sounds(BlockSoundGroup.STONE)
                    .requiresTool()
            ), ModItemGroup.IDITEMS);

    public static final Block GRANITE_TILES = registerBlock("granite_tiles",
            new Block(FabricBlockSettings
                    .of(Material.STONE)
                    .strength(1.5f, 6f)
                    .sounds(BlockSoundGroup.STONE)
                    .requiresTool()
            ), ModItemGroup.IDITEMS);
    public static final Block GRANITE_TILES_SLAB = registerBlock("granite_tiles_slab",
            new SlabBlock(FabricBlockSettings
                    .of(Material.STONE)
                    .strength(4.0f, 10.0f)
                    .sounds(BlockSoundGroup.STONE)
                    .requiresTool()
            ), ModItemGroup.IDITEMS);
    public static final Block GRANITE_TILES_STAIRS = registerBlock("granite_tiles_stairs",
            new ModStairsBlock(Blocks.POLISHED_GRANITE.getDefaultState(),
                    FabricBlockSettings
                            .of(Material.STONE)
                            .strength(4.0f, 10.0f)
                            .sounds(BlockSoundGroup.STONE)
                            .requiresTool()
            ), ModItemGroup.IDITEMS);



    public static final Block DIORITE_BRICKS = registerBlock("diorite_bricks",
            new Block(FabricBlockSettings
                    .of(Material.STONE)
                    .strength(1.5f, 6f)
                    .sounds(BlockSoundGroup.STONE)
                    .requiresTool()
            ), ModItemGroup.IDITEMS);

    public static final Block DIORITE_TILES = registerBlock("diorite_tiles",
            new Block(FabricBlockSettings
                    .of(Material.STONE)
                    .strength(1.5f, 6f)
                    .sounds(BlockSoundGroup.STONE)
                    .requiresTool()
            ), ModItemGroup.IDITEMS);
    public static final Block DIORITE_TILES_SLAB = registerBlock("diorite_tiles_slab",
            new SlabBlock(FabricBlockSettings
                    .of(Material.STONE)
                    .strength(4.0f, 10.0f)
                    .sounds(BlockSoundGroup.STONE)
                    .requiresTool()
            ), ModItemGroup.IDITEMS);
    public static final Block DIORITE_TILES_STAIRS = registerBlock("diorite_tiles_stairs",
            new ModStairsBlock(Blocks.POLISHED_DIORITE.getDefaultState(),
                    FabricBlockSettings
                            .of(Material.STONE)
                            .strength(4.0f, 10.0f)
                            .sounds(BlockSoundGroup.BASALT)
                            .requiresTool()
            ), ModItemGroup.IDITEMS);

    public static final Block CUT_COBBLE = registerBlock("cut_cobble",
            new Block(FabricBlockSettings
                    .of(Material.STONE)
                    .strength(1.5f, 6f)
                    .sounds(BlockSoundGroup.STONE)
                    .requiresTool()
            ), ModItemGroup.IDITEMS);

    public static final Block M_CUT_COBBLE = registerBlock("m_cut_cobble",
            new Block(FabricBlockSettings
                    .of(Material.STONE)
                    .strength(1.5f, 6f)
                    .sounds(BlockSoundGroup.STONE)
                    .requiresTool()
            ), ModItemGroup.IDITEMS);
    public static final Block STONE_TILES = registerBlock("stone_tiles",
            new Block(FabricBlockSettings
                    .of(Material.STONE)
                    .strength(1.5f, 6f)
                    .sounds(BlockSoundGroup.STONE)
                    .requiresTool()
            ), ModItemGroup.IDITEMS);

    public static final Block D_SMOOTHSTONE = registerBlock("d_smoothstone",
            new Block(FabricBlockSettings
                    .of(Material.STONE)
                    .strength(1.5f, 6f)
                    .sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .requiresTool()
            ), ModItemGroup.IDITEMS);

    public static final Block B_SMOOTHSTONE = registerBlock("b_smoothstone",
            new Block(FabricBlockSettings
                    .of(Material.STONE)
                    .strength(1.5f, 6f)
                    .sounds(BlockSoundGroup.GILDED_BLACKSTONE)
                    .requiresTool()
            ), ModItemGroup.IDITEMS);

    public static final Block D_SMOOTHSTONE_TILES = registerBlock("d_smoothstone_tiles",
            new Block(FabricBlockSettings
                    .of(Material.STONE)
                    .strength(1.5f, 6f)
                    .sounds(BlockSoundGroup.DEEPSLATE_TILES)
                    .requiresTool()
            ), ModItemGroup.IDITEMS);


    public static final Block BRICK_TILES = registerBlock("brick_tiles",
            new Block(FabricBlockSettings
                    .of(Material.STONE)
                    .strength(1.5f, 6f)
                    .sounds(BlockSoundGroup.STONE)
                    .requiresTool()
            ), ModItemGroup.IDITEMS);

    public static final Block BRICK_BIG = registerBlock("brick_big",
            new Block(FabricBlockSettings
                    .of(Material.STONE)
                    .strength(1.5f, 6f)
                    .sounds(BlockSoundGroup.STONE)
                    .requiresTool()
            ), ModItemGroup.IDITEMS);


    public static final Block PANTHER_LOG = registerBlock("panther_log",
            new PantherTrunk(FabricBlockSettings
                    .copyOf(Blocks.BIRCH_LOG)
                    .nonOpaque()
                    .sounds(BlockSoundGroup.WOOD)
                    .requiresTool()
            ), ModItemGroup.IDITEMS);

    public static final Block PANTHER_CAP = registerBlock("panther_cap",
            new Block(FabricBlockSettings
                    .copyOf(Blocks.WARPED_WART_BLOCK)
                    .sounds(BlockSoundGroup.WART_BLOCK)
                    .requiresTool()
                    .nonOpaque()
            ), ModItemGroup.IDITEMS);
    public static final Block PANTHER_PLANKS = registerBlock("panther_planks",
            new Block(FabricBlockSettings
                    .copy(Blocks.BIRCH_PLANKS)
                    .sounds(BlockSoundGroup.WOOD)
                    .strength(1, 1)
                    .dynamicBounds()
            ), ModItemGroup.IDITEMS);


    public static final Block PANTHER_SPORE = registerBlock("panther_spore",
            new SaplingBlock(new PantherCapSporeGenerator(), FabricBlockSettings
                    .copy(Blocks.BIRCH_LOG)
                    .strength(3.0f)
                    .sounds(BlockSoundGroup.WOOD)
            ), ModItemGroup.IDITEMS);

    public static final Block FOUNTAIN_LOG = registerBlock("fountain_log",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.BIRCH_LOG)
                    .strength(3.0f)
                    .sounds(BlockSoundGroup.WOOD)
            ), ModItemGroup.IDITEMS);

    public static final Block FOUNTAIN_WOOD = registerBlock("fountain_wood",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.BIRCH_WOOD)
                    .strength(3.0f)
                    .sounds(BlockSoundGroup.WOOD)
            ), ModItemGroup.IDITEMS);

    public static final Block STRIPPED_FOUNTAIN_LOG = registerBlock("stripped_fountain_log",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.STRIPPED_BIRCH_LOG)
                    .strength(3.0f)
                    .sounds(BlockSoundGroup.WOOD)
            ), ModItemGroup.IDITEMS);

    public static final Block STRIPPED_FOUNTAIN_WOOD = registerBlock("stripped_fountain_wood",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.STRIPPED_BIRCH_WOOD)
                    .strength(3.0f)
                    .sounds(BlockSoundGroup.WOOD)
            ), ModItemGroup.IDITEMS);

    public static final Block FOUNTAIN_PLANKS = registerBlock("fountain_planks",
            new Block(FabricBlockSettings
                    .copy(Blocks.BIRCH_PLANKS)
                    .strength(3.0f)
                    .sounds(BlockSoundGroup.WOOD)
            ), ModItemGroup.IDITEMS);

    public static final Block FOUNTAIN_LEAF = registerBlock("fountain_leaf",
            new LeavesBlock(FabricBlockSettings
                    .copy(Blocks.BIG_DRIPLEAF)
                    .strength(2.0f)
                    .nonOpaque()
                    .dynamicBounds()
                    .sounds(BlockSoundGroup.WOOD)
            ), ModItemGroup.IDITEMS);
/*
    public static final Block FOUNTAIN_LOTUS = registerBlock("fountain_lotus",
            new ModSaplingBlock(new FountainLotusGenerator(),
                    FabricBlockSettings
                    .copy(Blocks.BIRCH_SAPLING)
                    .strength(2.0f)
                    .nonOpaque()
                    .dynamicBounds()
                    .sounds(BlockSoundGroup.WOOD)
            ), ModItemGroup.IDITEMS);
*/



    public static final Block TUFF_BRICKS = registerBlock("tuff_bricks",
            new Block(FabricBlockSettings
                    .of(Material.AGGREGATE)
                    .strength(1.5f, 6f)
                    .sounds(BlockSoundGroup.TUFF)
                    .requiresTool()
            ), ModItemGroup.IDITEMS);
    public static final Block TUFF_BRICKS_STAIRS = registerBlock("tuff_bricks_stairs",
            new ModStairsBlock(Blocks.TUFF.getDefaultState(), FabricBlockSettings
                    .of(Material.AGGREGATE)
                    .strength(1.5f, 6f)
                    .sounds(BlockSoundGroup.TUFF)
                    .requiresTool()
            ), ModItemGroup.IDITEMS);
    public static final Block TUFF_BRICKS_SLAB = registerBlock("tuff_bricks_slab",
            new SlabBlock(FabricBlockSettings
                    .of(Material.STONE)
                    .strength(1.5f, 6.0f)
                    .sounds(BlockSoundGroup.BASALT)
                    .requiresTool()
            ), ModItemGroup.IDITEMS);
    public static final Block TUFF_STAIRS = registerBlock("tuff_stairs",
            new ModStairsBlock(Blocks.TUFF.getDefaultState(), FabricBlockSettings
                    .of(Material.AGGREGATE)
                    .strength(1.5f, 6f)
                    .sounds(BlockSoundGroup.TUFF)
                    .requiresTool()
            ), ModItemGroup.IDITEMS);
    public static final Block TUFF_SLAB = registerBlock("tuff_slab",
            new SlabBlock(FabricBlockSettings
                    .of(Material.STONE)
                    .strength(1.5f, 6.0f)
                    .sounds(BlockSoundGroup.BASALT)
                    .requiresTool()
            ), ModItemGroup.IDITEMS);
    public static final Block TUFF_WALL = registerBlock("tuff_wall",
            new WallBlock(FabricBlockSettings
                    .of(Material.AGGREGATE)
                    .strength(1.5f, 6.0f)
                    .sounds(BlockSoundGroup.TUFF)
                    .requiresTool()
            ), ModItemGroup.IDITEMS);
    public static final Block TUFF_BRICKS_WALL = registerBlock("tuff_bricks_wall",
            new WallBlock(FabricBlockSettings
                    .of(Material.AGGREGATE)
                    .strength(1.5f, 6.0f)
                    .sounds(BlockSoundGroup.TUFF)
                    .requiresTool()
            ), ModItemGroup.IDITEMS);




    public static final Block SPEEDYBLOCK = registerBlock("speedyblock",
            new SpeedyBlock(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(1982978.5f, 200f)
                    .sounds(BlockSoundGroup.ANVIL)
                    .requiresTool()
            ), ModItemGroup.IDITEMS
            /*
            "tooltip.Indepth.speedyblock"
            */
    );





/*
    public static final Block MOREL = registerBlock("morel",
            new IndepthFungusBlock(FabricBlockSettings
                    .of(Material.UNDERWATER_PLANT, MapColor.PALE_YELLOW)
                    .sounds(BlockSoundGroup.FUNGUS)
                    .noCollision()
                    .ticksRandomly()
                    .breakInstantly()
                    .dynamicBounds()
            ), ModItemGroup.IDITEMS);

*/

/*
    public static final Block COPPER_DOOR = registerBlock("copper_door",
            new ModDoorBlock(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(4.0f, 10.0f)
                    .sounds(BlockSoundGroup.COPPER)
                    .nonOpaque()
                    .requiresTool()
            ), ModItemGroup.IDITEMS);
    public static final Block COPPER_TRAPDOOR = registerBlock("copper_trapdoor",
            new ModTrapdoorBlock(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(4.0f, 10.0f)
                    .sounds(BlockSoundGroup.COPPER)
                    .requiresTool()
                    .nonOpaque()
            ), ModItemGroup.IDITEMS);
 */

    public static final Block MYTHRIL_LAMP = registerBlock("mythril_lamp",
            new MythrilLampBlock(FabricBlockSettings
                    .of(Material.REPAIR_STATION)
                    .strength(4.0f, 6.0f)
                    .sounds(BlockSoundGroup.ANVIL)
                    .requiresTool()
                    .luminance((state) -> state.get(MythrilLampBlock.CLICKED) ? 25 : 0)
            ), ModItemGroup.IDITEMS);



/*
    private static Block registerBlock(String name, Block block, ItemGroup group, String tooltipKey) {
        registerBlockItem(name, block, group, tooltipKey);
        return Registry.register(Registries.BLOCK, new Identifier(Indepth.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group, String tooltipKey) {
        return Registry.register(Registries.ITEM, new Identifier(Indepth.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)) {
                    @Override
                    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                        tooltip.add(Text.translatable(tooltipKey));
                    }
                });
    }
*/
    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(Indepth.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        Item item = Registry.register(Registries.ITEM, new Identifier(Indepth.MOD_ID, name),
               new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }

    public static void registerModBlocks(){
        Indepth.LOGGER.info("Registering Mod blocks for" + Indepth.MOD_ID);

    }
}
