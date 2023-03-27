package luu.indepth.utils;

import luu.indepth.item.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static luu.indepth.Indepth.MOD_ID;

public class ModItemGroup {
    public static ItemGroup IDITEMS;

    public static void registerItemGroups() {
        IDITEMS = FabricItemGroup.builder(new Identifier(MOD_ID, "iditems"))
                .displayName(Text.translatable("itemgroup.iditems"))
                .icon(() -> new ItemStack(ModItems.TRUFFLE)).build();
    }
}
