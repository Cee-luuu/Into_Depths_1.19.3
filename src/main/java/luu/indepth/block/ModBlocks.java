package luu.indepth.block;

import luu.indepth.Indepth;
import luu.indepth.block.custom.*;
import luu.indepth.utils.ModItemGroup;
import luu.indepth.world.tree.ModSaplingGeneration;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.text.Text;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import static luu.indepth.Indepth.MOD_ID;

public class ModBlocks extends ModBlocksRegister {

	/** Blood Stone */
    public static final Block BLOODSTONE = registerBlock("bloodstone",
			new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f, 6.0f)
					.sounds(BlockSoundGroup.BASALT).requiresTool()), ModItemGroup.IDITEMS);

    public static final Block BLOODSTONE_SLAB = registerBlock("bloodstone_slab",
			new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f, 10.0f)
					.sounds(BlockSoundGroup.BASALT).requiresTool()),ModItemGroup.IDITEMS);

    public static final Block BLOODSTONE_STAIRS = registerBlock("bloodstone_stairs",
			new ModStairsBlock(ModBlocks.BLOODSTONE.getDefaultState(),FabricBlockSettings.of(Material.STONE)
			.strength(4.0f, 10.0f).sounds(BlockSoundGroup.BASALT).requiresTool()), ModItemGroup.IDITEMS);

	/*
    public static final Block BLOODSTONE_BUTTON = registerBlock("bloodstone_button",
    		new ModStoneButtonBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f, 10.0f)
    		.sounds(BlockSoundGroup.BASALT).requiresTool().noCollision()), ModItemGroup.IDITEMS); */

	/*
    public static final Block BLOODSTONE_PRESSURE_PLATE = registerBlock("bloodstone_pressure_plate",
    		new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of(Material.STONE)
    		.strength(4.0f, 10.0f).sounds(BlockSoundGroup.BASALT).requiresTool()), ModItemGroup.IDITEMS); */

	public static final Block BLOODSTONE_FENCE = registerBlock("bloodstone_fence",
			new FenceBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f, 10.0f)
					.sounds(BlockSoundGroup.BASALT).requiresTool()), ModItemGroup.IDITEMS);

	/*
    public static final Block BLOODSTONE_FENCE_GATE = registerBlock("bloodstone_fence_gate",
     		new FenceGateBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f, 10.0f)
     		.sounds(BlockSoundGroup.BASALT).requiresTool()), ModItemGroup.IDITEMS); */

	public static final Block BLOODSTONE_WALL = registerBlock("bloodstone_wall",
			new WallBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f, 10.0f)
					.sounds(BlockSoundGroup.BASALT).requiresTool()),ModItemGroup.IDITEMS);

    public static final Block BLOODSTONE_POLISHED = registerBlock("bloodstone_polished",
			new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f, 10.0f)
					.sounds(BlockSoundGroup.BASALT).requiresTool()), ModItemGroup.IDITEMS);

    public static final Block BLOODSTONE_POLISHED_SLAB = registerBlock("bloodstone_polished_slab",
			new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f, 10.0f)
					.sounds(BlockSoundGroup.BASALT).requiresTool()),ModItemGroup.IDITEMS);

    public static final Block BLOODSTONE_POLISHED_STAIRS = registerBlock("bloodstone_polished_stairs",
			new ModStairsBlock(ModBlocks.BLOODSTONE.getDefaultState(),FabricBlockSettings.of(Material.STONE)
			.strength(4.0f, 10.0f).sounds(BlockSoundGroup.BASALT).requiresTool()), ModItemGroup.IDITEMS);

    public static final Block BLOODSTONE_POLISHED_WALL = registerBlock("bloodstone_polished_wall",
			new WallBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f, 10.0f)
					.sounds(BlockSoundGroup.BASALT).requiresTool()),ModItemGroup.IDITEMS);

    public static final Block BLOODSTONE_BRICKS = registerBlock("bloodstone_bricks",
			new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f, 10.0f)
					.sounds(BlockSoundGroup.BASALT).requiresTool()),ModItemGroup.IDITEMS);

    public static final Block BLOODSTONE_TILES = registerBlock("bloodstone_tiles",
			new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f, 10.0f)
					.sounds(BlockSoundGroup.BASALT).requiresTool()),ModItemGroup.IDITEMS);

    public static final Block BLOODSTONE_TILES_SLAB = registerBlock("bloodstone_tiles_slab",
			new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f, 10.0f)
					.sounds(BlockSoundGroup.BASALT).requiresTool()),ModItemGroup.IDITEMS);

    public static final Block BLOODSTONE_TILES_STAIRS = registerBlock("bloodstone_tiles_stairs",
			new ModStairsBlock(ModBlocks.BLOODSTONE.getDefaultState(),FabricBlockSettings.of(Material.STONE)
					.strength(4.0f, 10.0f).sounds(BlockSoundGroup.BASALT).requiresTool()), ModItemGroup.IDITEMS);

    public static final Block BLOODSTONE_TILES_WALL = registerBlock("bloodstone_tiles_wall",
			new WallBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f, 10.0f)
					.sounds(BlockSoundGroup.BASALT).requiresTool()),ModItemGroup.IDITEMS);

    /** Magma Bricks */
    public static final Block MAGMA_BRICKS = registerBlock("magma_bricks",
			new Block(FabricBlockSettings.of(Material.STONE).strength(1f, 20f)
					.sounds(BlockSoundGroup.NETHER_BRICKS).requiresTool().luminance(4)),ModItemGroup.IDITEMS);

    public static final Block MAGMA_BLACKSTONE = registerBlock("magma_blackstone",
			new Block(FabricBlockSettings.of(Material.STONE).strength(1f, 20f)
					.sounds(BlockSoundGroup.BASALT).requiresTool().luminance(4)),ModItemGroup.IDITEMS);

    /** Granite */
    public static final Block GRANITE_BRICKS = registerBlock("granite_bricks",
			new Block(FabricBlockSettings.of(Material.STONE).strength(1.5f, 6f)
					.sounds(BlockSoundGroup.STONE).requiresTool()), ModItemGroup.IDITEMS);

    public static final Block GRANITE_TILES = registerBlock("granite_tiles",
			new Block(FabricBlockSettings.of(Material.STONE).strength(1.5f, 6f)
					.sounds(BlockSoundGroup.STONE).requiresTool()), ModItemGroup.IDITEMS);

    public static final Block GRANITE_TILES_SLAB = registerBlock("granite_tiles_slab",
			new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f, 10.0f)
					.sounds(BlockSoundGroup.STONE).requiresTool() ),ModItemGroup.IDITEMS);

    public static final Block GRANITE_TILES_STAIRS = registerBlock("granite_tiles_stairs",
			new ModStairsBlock(Blocks.POLISHED_GRANITE.getDefaultState(),FabricBlockSettings.of(Material.STONE)
			.strength(4.0f, 10.0f).sounds(BlockSoundGroup.STONE).requiresTool()), ModItemGroup.IDITEMS);

	/** Diorite */
    public static final Block DIORITE_BRICKS = registerBlock("diorite_bricks",
			new Block(FabricBlockSettings.of(Material.STONE).strength(1.5f, 6f)
					.sounds(BlockSoundGroup.STONE).requiresTool()),ModItemGroup.IDITEMS);

    public static final Block DIORITE_TILES = registerBlock("diorite_tiles",
			new Block(FabricBlockSettings.of(Material.STONE).strength(1.5f, 6f)
					.sounds(BlockSoundGroup.STONE).requiresTool()), ModItemGroup.IDITEMS);

    public static final Block DIORITE_TILES_SLAB = registerBlock("diorite_tiles_slab",
			new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f, 10.0f)
					.sounds(BlockSoundGroup.STONE).requiresTool()),ModItemGroup.IDITEMS);

    public static final Block DIORITE_TILES_STAIRS = registerBlock("diorite_tiles_stairs",
			new ModStairsBlock(Blocks.POLISHED_DIORITE.getDefaultState(),FabricBlockSettings.of(Material.STONE)
					.strength(4.0f, 10.0f).sounds(BlockSoundGroup.BASALT).requiresTool()), ModItemGroup.IDITEMS);

	/** Stone */
    public static final Block CUT_COBBLE = registerBlock("cut_cobble",
			new Block(FabricBlockSettings.of(Material.STONE).strength(1.5f, 6f)
					.sounds(BlockSoundGroup.STONE).requiresTool()), ModItemGroup.IDITEMS);

    public static final Block M_CUT_COBBLE = registerBlock("m_cut_cobble",
			new Block(FabricBlockSettings.of(Material.STONE).strength(1.5f, 6f)
					.sounds(BlockSoundGroup.STONE).requiresTool()), ModItemGroup.IDITEMS);

    public static final Block STONE_TILES = registerBlock("stone_tiles",
			new Block(FabricBlockSettings.of(Material.STONE).strength(1.5f, 6f)
					.sounds(BlockSoundGroup.STONE).requiresTool()), ModItemGroup.IDITEMS);

    public static final Block D_SMOOTH_STONE = registerBlock("d_smooth_stone",
			new Block(FabricBlockSettings.of(Material.STONE).strength(1.5f, 6f)
					.sounds(BlockSoundGroup.DEEPSLATE_BRICKS).requiresTool()), ModItemGroup.IDITEMS);

    public static final Block B_SMOOTH_STONE = registerBlock("b_smooth_stone",
			new Block(FabricBlockSettings.of(Material.STONE).strength(1.5f, 6f)
					.sounds(BlockSoundGroup.GILDED_BLACKSTONE).requiresTool()), ModItemGroup.IDITEMS);

    public static final Block D_SMOOTH_STONE_TILES = registerBlock("d_smooth_stone_tiles",
			new Block(FabricBlockSettings.of(Material.STONE).strength(1.5f, 6f)
					.sounds(BlockSoundGroup.DEEPSLATE_TILES).requiresTool()),ModItemGroup.IDITEMS);

	/** Brick */
    public static final Block BRICK_TILES = registerBlock("brick_tiles",
			new Block(FabricBlockSettings.of(Material.STONE).strength(1.5f, 6f)
					.sounds(BlockSoundGroup.STONE).requiresTool()), ModItemGroup.IDITEMS);

    public static final Block BRICK_BIG = registerBlock("brick_big",
			new Block(FabricBlockSettings.of(Material.STONE).strength(1.5f, 6f)
					.sounds(BlockSoundGroup.STONE).requiresTool()), ModItemGroup.IDITEMS);

	/** Tuff */
    public static final Block TUFF_BRICKS = registerBlock("tuff_bricks",
			new Block(FabricBlockSettings.of(Material.AGGREGATE).strength(1.5f, 6f)
					.sounds(BlockSoundGroup.TUFF).requiresTool()), ModItemGroup.IDITEMS);

    public static final Block TUFF_BRICKS_STAIRS = registerBlock("tuff_bricks_stairs",
			new ModStairsBlock(Blocks.TUFF.getDefaultState(), FabricBlockSettings.of(Material.AGGREGATE)
					.strength(1.5f, 6f).sounds(BlockSoundGroup.TUFF).requiresTool()), ModItemGroup.IDITEMS);

    public static final Block TUFF_BRICKS_SLAB = registerBlock("tuff_bricks_slab",
			new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(1.5f, 6.0f)
					.sounds(BlockSoundGroup.BASALT).requiresTool()), ModItemGroup.IDITEMS);

    public static final Block TUFF_STAIRS = registerBlock("tuff_stairs",new ModStairsBlock(
			Blocks.TUFF.getDefaultState(), FabricBlockSettings.of(Material.AGGREGATE).strength(1.5f, 6f)
			.sounds(BlockSoundGroup.TUFF).requiresTool()), ModItemGroup.IDITEMS);

	public static final Block TUFF_SLAB = registerBlock("tuff_slab",
			new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(1.5f, 6.0f)
					.sounds(BlockSoundGroup.BASALT).requiresTool()), ModItemGroup.IDITEMS);

    public static final Block TUFF_WALL = registerBlock("tuff_wall",
			new WallBlock(FabricBlockSettings.of(Material.AGGREGATE).strength(1.5f, 6.0f)
					.sounds(BlockSoundGroup.TUFF).requiresTool()), ModItemGroup.IDITEMS);

    public static final Block TUFF_BRICKS_WALL = registerBlock("tuff_bricks_wall",
			new WallBlock(FabricBlockSettings.of(Material.AGGREGATE).strength(1.5f, 6.0f)
					.sounds(BlockSoundGroup.TUFF).requiresTool()),ModItemGroup.IDITEMS);

	/** Panther */
    public static final Block PANTHER_LOG = registerBlock("panther_log",
			new PantherTrunk(FabricBlockSettings.copyOf(Blocks.BIRCH_LOG).nonOpaque()
					.sounds(BlockSoundGroup.WOOD).requiresTool()), ModItemGroup.IDITEMS);

    public static final Block PANTHER_CAP = registerBlock("panther_cap",
			new Block(FabricBlockSettings.copyOf(Blocks.WARPED_WART_BLOCK).sounds(BlockSoundGroup.WART_BLOCK)
					.requiresTool().nonOpaque()), ModItemGroup.IDITEMS);

    public static final Block PANTHER_PLANKS = registerBlock("panther_planks",
			new Block(FabricBlockSettings.copy(Blocks.BIRCH_PLANKS).sounds(BlockSoundGroup.WOOD)
					.strength(1, 1).dynamicBounds()),ModItemGroup.IDITEMS);

	public static final Block PANTHER_SPORE = registerBlock("panther_spore", new SaplingBlock(
			new ModSaplingGeneration.PantherCapSporeSapling(), FabricBlockSettings.copy(Blocks.BIRCH_SAPLING)
					.strength(3.0f).sounds(BlockSoundGroup.WOOD)),ModItemGroup.IDITEMS);

	/** Fountain */
	public static final Block FOUNTAIN_LOG = registerBlock("fountain_log",
			new PillarBlock(FabricBlockSettings.copy(Blocks.BIRCH_LOG)
					.strength(3.0f).sounds(BlockSoundGroup.WOOD)), ModItemGroup.IDITEMS);

	public static final Block FOUNTAIN_WOOD = registerBlock("fountain_wood",
			new PillarBlock(FabricBlockSettings.copy(Blocks.BIRCH_WOOD)
					.strength(3.0f).sounds(BlockSoundGroup.WOOD)), ModItemGroup.IDITEMS);

	public static final Block STRIPPED_FOUNTAIN_LOG = registerBlock("stripped_fountain_log",
			new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_BIRCH_LOG)
					.strength(3.0f).sounds(BlockSoundGroup.WOOD)), ModItemGroup.IDITEMS);

	public static final Block STRIPPED_FOUNTAIN_WOOD = registerBlock("stripped_fountain_wood",
			new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_BIRCH_WOOD)
					.strength(3.0f).sounds(BlockSoundGroup.WOOD)), ModItemGroup.IDITEMS);

	public static final Block FOUNTAIN_PLANKS = registerBlock("fountain_planks",
			new Block(FabricBlockSettings.copy(Blocks.BIRCH_PLANKS).strength(3.0f)
					.sounds(BlockSoundGroup.WOOD)), ModItemGroup.IDITEMS);

	public static final Block FOUNTAIN_LEAFE = registerBlock("fountain_leaf",
			new LeavesBlock(FabricBlockSettings.copy(Blocks.BIG_DRIPLEAF).strength(2.0f)
					.sounds(BlockSoundGroup.DRIPSTONE_BLOCK).nonOpaque().dynamicBounds()),ModItemGroup.IDITEMS);

    public static final Block FOUNTAIN_LOTUS = registerBlock("fountain_lotus",
			new ModSaplingBlock(new ModSaplingGeneration.FountainLotusSapling(), FabricBlockSettings.copy(Blocks.BIRCH_SAPLING)
					.strength(2.0f).nonOpaque().dynamicBounds().sounds(BlockSoundGroup.WOOD)), ModItemGroup.IDITEMS);

    public static final Block MOREL = registerBlock("morel",new DepthsFungusBlock(FabricBlockSettings
			.of(Material.CARPET, MapColor.PALE_YELLOW).sounds(BlockSoundGroup.FUNGUS).noCollision()
			.ticksRandomly().breakInstantly().dynamicBounds(), null), ModItemGroup.IDITEMS);

//    public static final Block COPPER_DOOR = registerBlock("copper_door",new ModDoorBlock(FabricBlockSettings.of(Material.METAL)
//    		.strength(4.0f, 10.0f).sounds(BlockSoundGroup.COPPER).nonOpaque().requiresTool()), ModItemGroup.IDITEMS);
//
//    public static final Block COPPER_TRAPDOOR = registerBlock("copper_trapdoor",new ModTrapdoorBlock(FabricBlockSettings.of(Material.METAL)
//    		.strength(4.0f, 10.0f).sounds(BlockSoundGroup.COPPER).requiresTool().nonOpaque()), ModItemGroup.IDITEMS);
//
//    public static final Block PUFFBALL = registerBlock("puffball", new Puffball(FabricBlockSettings.of(Material.UNDERWATER_PLANT)
//            .strength(0.0f, 0.0f).sounds(BlockSoundGroup.FUNGUS)), ModItemGroup.IDITEMS,
//			"", "tooltip.puff_ball.shift", "tooltip.puff_ball.ctrl");

	/** Misc */
    public static final Block MYTHRIL_LAMP = registerBlock("mythril_lamp",new MythrilLampBlock(FabricBlockSettings
			.of(Material.REPAIR_STATION).strength(4.0f, 6.0f).sounds(BlockSoundGroup.ANVIL).requiresTool()
			.luminance((state) -> state.get(MythrilLampBlock.CLICKED) ? 25 : 0))

				/** if you want/need a tooltip without keybindings you must add the "appendTooltip" method like this,
					but you can't use it at the same time with the TooltipShift/Ctrl/Al functionality
					because the tooltip/s with keybindings will override the 'simple' tooltip! */
				{@Override
				public void appendTooltip(ItemStack stack, @Nullable BlockView world, List<Text> tooltip, TooltipContext options) {
					tooltip.add(Text.translatable("tooltip.mythril_lamp")); }}

				/** but, anonymous classes/methods are no longer needed,
				 *  because I've added an extra tooltip key called 'tooltipHeadline'
				 *  If you want to use a tooltip without keybinding use the following
				 *  If you want to use a tooltip with keybinding put an
				 *  empty headline tooltip at the first followed by the tooltip/s
				 *  with/for Shift ( Ctrl & Alt). For an example take a look to the
				 *  SPEEDYBLOCK */

				, ModItemGroup.IDITEMS,

			"tooltip.mythril_lamp.hl", "tooltip.mythril_lamp.shift",
			"tooltip.mythril_lamp.ctrl", "tooltip.mythril_lamp.alt");

	public static final Block SUGAR_CUBE = registerBlock("sugar_cube",
			new Block(FabricBlockSettings.of(Material.METAL).strength(1.5f, 4.0f)
					.sounds(BlockSoundGroup.GRAVEL)), ModItemGroup.IDITEMS,"tooltip.sugar_cube",
			"tooltip.sugar_cube.shift", "tooltip.sugar_cube.ctrl", "tooltip.sugar_cube.alt");

	public static final Block SPEEDYBLOCK = registerBlock("speedyblock",
			new SpeedyBlock(FabricBlockSettings.of(Material.METAL).strength(1982978.5f, 200f)
					.sounds(BlockSoundGroup.ANVIL).requiresTool()), ModItemGroup.IDITEMS,
			"", "tooltip.speedyblock.shift");

	/** Block & Item Registering is out sourced to the "ModBlockRegister* class */

    public static void registerModBlocks() { Indepth.LOGGER.info("Registering Mod blocks for" + MOD_ID); }

}
