package luu.indepth.block;

import luu.indepth.Indepth;
import luu.indepth.utils.tooltips.ShowToolTips;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ModBlocksRegister {

	/** Block-Register without Item and without Tooltip/s */
	public static Block registerBlock(String name, Block block) {
		return Registry.register(Registries.BLOCK, new Identifier(Indepth.MOD_ID, name), block);
	}

	/** Block-Register with Item but without tooltip/s or headline */
	public static Block registerBlock(String name, Block block, ItemGroup group) {
		registerBlockItem(name, block, group);
		return Registry.register(Registries.BLOCK, new Identifier(Indepth.MOD_ID, name), block);
	}

	private static void registerBlockItem(String name, Block block, ItemGroup group){
		Item item = Registry.register(Registries.ITEM, new Identifier(Indepth.MOD_ID, name),
				new BlockItem(block, new FabricItemSettings()));
		ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
	}

	/** BlockRegister with Tooltip Headline */
	public static Block registerBlock(String name, Block block, ItemGroup group, String tooltipHeadline) {
		registerBlockItem(name, block, group, tooltipHeadline);
		return Registry.register(Registries.BLOCK, new Identifier(Indepth.MOD_ID, name), block);
	}

	private static void registerBlockItem(String name, Block block, ItemGroup group, String tooltipHeadline){
		Item item = Registry.register(Registries.ITEM, new Identifier(Indepth.MOD_ID, name),
				new BlockItem(block, new FabricItemSettings()) {
					@Override
					public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {

						ShowToolTips.showTooltips(tooltip,  tooltipHeadline);
					}
				});
		ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
	}

	/** BlockRegister with Tooltip Headline & Shift */
	public static Block registerBlock(String name, Block block, ItemGroup group, String tooltipHeadline, String tooltipShift) {
		registerBlockItem(name, block, group, tooltipHeadline, tooltipShift);
		return Registry.register(Registries.BLOCK, new Identifier(Indepth.MOD_ID, name), block);
	}

	private static void registerBlockItem(String name, Block block, ItemGroup group, String tooltipHeadline, String tooltipShift) {
		Item item = Registry.register(Registries.ITEM, new Identifier(Indepth.MOD_ID, name),
				new BlockItem(block, new FabricItemSettings()) {
					@Override
					public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {

						ShowToolTips.showTooltips(tooltip, tooltipHeadline, tooltipShift);
					}
				});
		ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
	}

	/** BlockRegister with Tooltip Headline, Shift & Ctrl */
	public static Block registerBlock(String name, Block block, ItemGroup group, String tooltipHeadline, String tooltipShift, String tooltipCtrl) {
		registerBlockItem(name, block, group, tooltipHeadline, tooltipShift, tooltipCtrl);
		return Registry.register(Registries.BLOCK, new Identifier(Indepth.MOD_ID, name), block);
	}

	private static void registerBlockItem(String name, Block block, ItemGroup group, String tooltipHeadline, String tooltipShift, String tooltipCtrl) {
		Item item = Registry.register(Registries.ITEM, new Identifier(Indepth.MOD_ID, name),
				new BlockItem(block, new FabricItemSettings()) {
					@Override
					public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {

						ShowToolTips.showTooltips(tooltip, tooltipHeadline, tooltipShift, tooltipCtrl);
					}
				});

		ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
	}

	/** BlockRegister with Tooltip Headline, Shift, Ctrl & Alt */
	public static Block registerBlock(String name, Block block, ItemGroup group, String tooltipHeadline, String tooltipShift, String tooltipCtrl, String tooltipAlt) {
		registerBlockItem(name, block, group, tooltipHeadline, tooltipShift, tooltipCtrl, tooltipAlt);
		return Registry.register(Registries.BLOCK, new Identifier(Indepth.MOD_ID, name), block);
	}

	private static void registerBlockItem(String name, Block block, ItemGroup group, String tooltipHeadline, String tooltipShift, String tooltipCtrl, String tooltipAlt) {
		Item item = Registry.register(Registries.ITEM, new Identifier(Indepth.MOD_ID, name),
				new BlockItem(block, new FabricItemSettings()) {
					@Override
					public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {

						ShowToolTips.showTooltips(tooltip, tooltipHeadline, tooltipShift, tooltipCtrl, tooltipAlt);
					}
				});

		ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
	}
}
