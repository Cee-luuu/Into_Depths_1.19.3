package luu.indepth.item.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.RangedWeaponItem;
import net.minecraft.item.Vanishable;

import java.util.function.Predicate;

public class DepthWand extends RangedWeaponItem implements Vanishable {
    public DepthWand(Settings settings) {
        super(settings);
    }

    @Override
    public Predicate<ItemStack> getProjectiles() {
        return null;
    }

    @Override
    public int getRange() {
        return 0;
    }
}
