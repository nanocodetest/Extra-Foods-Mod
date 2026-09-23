package com.nano.food;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;
import org.spongepowered.asm.mixin.Final;


public class ModFoods {
    //Hamburger
    public static final FoodProperties HAMBURGER = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f).build();
    public static final FoodProperties PATTY_BURGER = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f).build();
    public static final FoodProperties CHEESEBURGER = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f).build();
    //Ingredients
    public static final FoodProperties MAYONNAISE = new FoodProperties.Builder().nutrition(1).saturationModifier(0.25f).build();
    public static final FoodProperties KETCHUP = new FoodProperties.Builder().nutrition(1).saturationModifier(0.25f).build();
    public static final FoodProperties LETTUCE = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f).build();
    public static final FoodProperties TOMATO = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f).build();
    public static final FoodProperties CHEESE = new FoodProperties.Builder().nutrition(2).saturationModifier(0.24f).build();
    public static final FoodProperties PATTY = new FoodProperties.Builder().nutrition(5).saturationModifier(0.25f).build();
    public static final FoodProperties BOTTOM_BUN = new FoodProperties.Builder().nutrition(2).saturationModifier(0.25f).build();
    public static final FoodProperties TOP_BUN = new FoodProperties.Builder().nutrition(2).saturationModifier(0.25f).build();

    public static final Consumable HAMBURGER_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.HASTE, 300), 0.15f)).build();
    public static final Consumable PATTY_BURGER_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.HASTE, 300), 0.15f)).build();
    public static final Consumable CHEESEBURGER_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.HASTE, 300), 0.15f)).build();

    public static final Consumable MAYONNAISE_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.NAUSEA, 200), 0.15f)).build();
    public static final Consumable KETCHUP_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.NAUSEA, 100), 0.15f)).build();
    public static final Consumable LETTUCE_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.STRENGTH, 200), 0.15f)).build();
    public static final Consumable TOMATO_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.STRENGTH, 200), 0.15f)).build();
    public static final Consumable CHEESE_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.BAD_OMEN, 50), 0.15f)).build();
    public static final Consumable PATTY_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 100), 0.15f)).build();
    public static final Consumable BOTTOM_BUN_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SATURATION, 200), 0.15f)).build();
    public static final Consumable TOP_BUN_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SATURATION, 200), 0.15f)).build();
}
