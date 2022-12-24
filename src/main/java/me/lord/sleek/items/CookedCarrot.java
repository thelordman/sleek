package me.lord.sleek.items;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public class CookedCarrot extends Item {
    public CookedCarrot(Settings settings) {
        super(settings.food(new FoodComponent.Builder().hunger(6).saturationModifier(6.6f).build()));
    }
}
