package com.nano.item;

import com.nano.ExtraFoodsMod;
import com.nano.food.ModFoods;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class ModItems {
    public static final Item HAMBURGER = registerItem("hamburger", properties -> new Item(properties
            .food(ModFoods.HAMBURGER, ModFoods.HAMBURGER_CONSUMABLE)));
    public static final Item PATTY_BURGER = registerItem("patty_burger", properties -> new Item(properties
            .food(ModFoods.PATTY_BURGER, ModFoods.PATTY_BURGER_CONSUMABLE)));
    public static final Item CHEESEBURGER = registerItem("cheeseburger", properties -> new Item(properties
            .food(ModFoods.CHEESEBURGER, ModFoods.CHEESEBURGER_CONSUMABLE)));

    public static final Item MAYONNAISE = registerItem("mayonnaise", properties -> new Item(properties
            .food(ModFoods.MAYONNAISE, ModFoods.MAYONNAISE_CONSUMABLE)));
    public static final Item KETCHUP = registerItem("ketchup", properties -> new Item(properties
            .food(ModFoods.KETCHUP, ModFoods.KETCHUP_CONSUMABLE)));
    public static final Item LETTUCE = registerItem("lettuce", properties -> new Item(properties
            .food(ModFoods.LETTUCE, ModFoods.LETTUCE_CONSUMABLE)));
    public static final Item TOMATO = registerItem("tomato", properties -> new Item(properties
            .food(ModFoods.TOMATO, ModFoods.TOMATO_CONSUMABLE)));
    public static final Item CHEESE = registerItem("cheese", properties -> new Item(properties
            .food(ModFoods.CHEESE, ModFoods.CHEESE_CONSUMABLE)));
    public static final Item PATTY = registerItem("patty", properties -> new Item(properties
            .food(ModFoods.PATTY, ModFoods.PATTY_CONSUMABLE)));
    public static final Item BOTTOM_BUN = registerItem("bottom_bun", properties -> new Item(properties
            .food(ModFoods.BOTTOM_BUN, ModFoods.BOTTOM_BUN_CONSUMABLE)));
    public static final Item TOP_BUN = registerItem("top_bun", properties -> new Item(properties
            .food(ModFoods.TOP_BUN, ModFoods.TOP_BUN_CONSUMABLE)));

    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(ExtraFoodsMod.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(ExtraFoodsMod.MOD_ID, name)))));
    }

    public static void registerModItems() {
        ExtraFoodsMod.LOGGER.info("Registering Mod Items for" + ExtraFoodsMod.MOD_ID);

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.FOOD_AND_DRINKS).register(output -> {
            output.accept(HAMBURGER);
            output.accept(MAYONNAISE);
            output.accept(KETCHUP);
            output.accept(LETTUCE);
            output.accept(TOMATO);
            output.accept(CHEESE);
            output.accept(PATTY);
            output.accept(BOTTOM_BUN);
            output.accept(TOP_BUN);
        });
    }
}