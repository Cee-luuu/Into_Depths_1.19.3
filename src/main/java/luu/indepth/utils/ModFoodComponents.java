package luu.indepth.utils;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent TRUFFLE = new FoodComponent.Builder().hunger(5).saturationModifier(10f).meat().build();
    public static final FoodComponent MOREL = new FoodComponent.Builder().hunger(1).saturationModifier(1f).build();

}
