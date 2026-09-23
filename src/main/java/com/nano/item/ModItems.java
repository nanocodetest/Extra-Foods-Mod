package com.nano.item;

import com.nano.ExtraFoodsMod;
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
    //Hamburger
    public static final Item HAMBURGER = registerItem("hamburger", Item::new);
    //Ingredients
    public static final Item MAYONNAISE = registerItem("mayonnaise", Item::new);
    public static final Item KETCHUP = registerItem("ketchup", Item::new);
    public static final Item LETTUCE = registerItem("lettuce", Item::new);
    public static final Item TOMATO = registerItem("tomato", Item::new);
    public static final Item PATTY = registerItem("patty", Item::new);
    public static final Item BOTTOM_BUN = registerItem("bottom_bun", Item::new);
    public static final Item TOP_BUN = registerItem("top_bun", Item::new);

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
            output.accept(PATTY);
            output.accept(BOTTOM_BUN);
            output.accept(TOP_BUN);
        });
    }
}
