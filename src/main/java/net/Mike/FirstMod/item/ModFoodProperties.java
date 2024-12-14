package net.Mike.FirstMod.item;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties RADISH = new FoodProperties.Builder().nutrition(3).saturationModifier(0.6f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 200), 0.50f).build();
}
