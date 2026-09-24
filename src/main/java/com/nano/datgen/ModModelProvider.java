package com.nano.datgen;

import com.nano.food.ModFoods;
import com.nano.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        //Items
        itemModelGenerators.generateFlatItem(ModItems.KNIFE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.HAMMER, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.FRIES_CARTON, ModelTemplates.FLAT_ITEM);
        //Hamburger
        itemModelGenerators.generateFlatItem(ModItems.HAMBURGER, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.PATTY_BURGER, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.CHEESEBURGER, ModelTemplates.FLAT_ITEM);
        //French Fries
        itemModelGenerators.generateFlatItem(ModItems.FRENCH_FRIES, ModelTemplates.FLAT_ITEM);
        //Ingredients
        itemModelGenerators.generateFlatItem(ModItems.MAYONNAISE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.KETCHUP, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.LETTUCE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.TOMATO, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.CHEESE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.PATTY, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RAW_PATTY, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.BOTTOM_BUN, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.TOP_BUN, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.FRIES, ModelTemplates.FLAT_ITEM);
    }
}
