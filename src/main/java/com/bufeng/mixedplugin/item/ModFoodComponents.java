package com.bufeng.mixedplugin.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent LCF_CHICKEN = new FoodComponent.Builder().nutrition(10).saturationModifier(0.8f).build();
    public static final FoodComponent LCF_PORK = new FoodComponent.Builder().nutrition(10).saturationModifier(0.8f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,100, 5), 1.0f)
            .alwaysEdible()
            .build();
    public static final FoodComponent STARDUST_JELLY = new FoodComponent.Builder().nutrition(10).saturationModifier(0.8f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,100, 5), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION,100, 5), 1.0f)
            .build();

}
