package luu.indepth.Registry;

import luu.indepth.Indepth;
import luu.indepth.item.*;
import luu.indepth.item.custom.ArthroAmulet;

//import assets.indepth.bungled.needsrework.DowsingRodItem;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.registry.Registry;

public class ModItems {

    public static final Item TRUFFLE = registerItem("truffle_chunk",
            new Item(new FabricItemSettings().rarity(Rarity.RARE).food(ModFoodComponents.TRUFFLE)));

    /*
    public static final Item DOWSING = registerItem("dowsing",
            new DowsingRodItem(new FabricItemSettings()));
    */

    public static final Item FIRD = registerItem("fird",
            new Item(new FabricItemSettings().rarity(Rarity.RARE)));

    public static final Item NICKEL_INGOT = registerItem("nickel_ingot",
            new Item(new FabricItemSettings()));


    public static final Item ARTHROAMULET = registerItem("arthroamulet",
            new ArthroAmulet(new FabricItemSettings().maxCount(1).fireproof().rarity(Rarity.EPIC)));

    public static final Item GRANITE_SWORD = registerItem("granite_sword",
            new SwordItem(ModToolMaterials.GRANITE, 1, 2f, new FabricItemSettings().maxCount(1)));

    public static final Item GRANITE_AXE = registerItem("granite_axe",
            new ModAxeItem(ModToolMaterials.GRANITE, 3, 1f, new FabricItemSettings().maxCount(1)));

    public static final Item GRANITE_PICKAXE = registerItem("granite_pickaxe",
            new ModPickaxeItem(ModToolMaterials.GRANITE, 1, 2f, new FabricItemSettings().maxCount(1)));

    public static final Item GRANITE_SHOVEL = registerItem("granite_shovel",
            new ShovelItem(ModToolMaterials.GRANITE, 1, 2f, new FabricItemSettings().maxCount(1)));

   public static final Item GRANITE_HOE = registerItem("granite_hoe",
           new ModHoe(ModToolMaterials.GRANITE, 1, 2f, new FabricItemSettings().maxCount(1)));

   //COPPER

    public static final Item CLIPPERS = registerItem("clippers",
            new ShearsItem(new FabricItemSettings().maxCount(1).maxDamage(238)));

    public static final Item COPPER_HELMET = registerItem("copper_helmet",
            new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.HEAD, new FabricItemSettings().maxCount(1)));

    public static final Item COPPER_CHESTPLATE = registerItem("copper_chestplate",
            new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.CHEST, new FabricItemSettings().maxCount(1)));

    public static final Item COPPER_LEGGINGS = registerItem("copper_leggings",
            new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.LEGS, new FabricItemSettings().maxCount(1)));

    public static final Item COPPER_BOOTS = registerItem("copper_boots",
            new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.FEET, new FabricItemSettings().maxCount(1)));

    public static final Item COPPER_STAFF = registerItem("copper_staff",
            new Item(new FabricItemSettings().maxCount(1)));



    //nickel
   public static final Item NICKEL_HELMET = registerItem("nickel_helmet",
           new ArmorItem(ModArmorMaterials.NICKEL, EquipmentSlot.HEAD, new FabricItemSettings().maxCount(1)));

    public static final Item NICKEL_CHESTPLATE = registerItem("nickel_chestplate",
            new ArmorItem(ModArmorMaterials.NICKEL, EquipmentSlot.CHEST, new FabricItemSettings().maxCount(1)));

        public static final Item NICKEL_LEGGINGS = registerItem("nickel_leggings",
          new ArmorItem(ModArmorMaterials.NICKEL, EquipmentSlot.LEGS, new FabricItemSettings().maxCount(1)));

   public static final Item NICKEL_BOOTS = registerItem("nickel_boots",
            new ArmorItem(ModArmorMaterials.NICKEL, EquipmentSlot.FEET, new FabricItemSettings().maxCount(1)));





    private static Item registerItem(String name, Item item) {

        //v registers item we pass in
        return Registry.register(Registries.ITEM, new Identifier(Indepth.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {

        addToItemGroup(ModItemGroup.IDITEMS, NICKEL_BOOTS);

    }


    private static void addToItemGroup(ItemGroup group, Item item) {

        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));

    }
    public static void RegisterModItems(){
        Indepth.LOGGER.info("Registering mod items for " + Indepth.MOD_ID);

        addItemsToItemGroup();
    }
}
