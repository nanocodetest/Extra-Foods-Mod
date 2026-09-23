package com.nano.creativemodetab;

import com.nano.ExtraFoodsMod;
import com.nano.food.ModFoods;
import com.nano.item.ModItems;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {
    public static final CreativeModeTab EXTRA_FOOD_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(ExtraFoodsMod.MOD_ID, "extra_food_items"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.HAMBURGER))
                .title(Component.translatable("creativemodetab.extra-foods-mod.extra_food_items"))
                .displayItems((parameters, output) -> {
                    output.accept(ModItems.HAMBURGER);
                    output.accept(ModItems.PATTY_BURGER);
                    output.accept(ModItems.CHEESEBURGER);
                }).build());

    public static final CreativeModeTab INGREDIENTS_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(ExtraFoodsMod.MOD_ID, "ingredient_items"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.PATTY))
                    .title(Component.translatable("creativemodetab.extra-foods-mod.ingredient_items"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.TOP_BUN);
                        output.accept(ModItems.BOTTOM_BUN);
                        output.accept(ModItems.PATTY);
                        output.accept(ModItems.MAYONNAISE);
                        output.accept(ModItems.KETCHUP);
                        output.accept(ModItems.LETTUCE);
                        output.accept(ModItems.TOMATO);
                        output.accept(ModItems.CHEESE);
                    }).build());

    public static void registerModCreativeModeTabs() {
        ExtraFoodsMod.LOGGER.info("Registering Creative Mode Tabs for " + ExtraFoodsMod.MOD_ID);
    }
}
