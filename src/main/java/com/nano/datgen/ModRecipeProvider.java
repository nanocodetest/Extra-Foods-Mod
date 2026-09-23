package com.nano.datgen;

import com.nano.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancements.Advancement;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.level.ItemLike;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import static net.minecraft.data.recipes.ShapedRecipeBuilder.shaped;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, BootstrapContext<Recipe<?>> recipes, BootstrapContext<Advancement> advancements) {
        return new RecipeProvider(recipes, advancements) {
            @Override
            public void buildRecipes() {

                shaped(RecipeCategory.MISC, ModItems.PATTY_BURGER)
                        .pattern(" T ")
                        .pattern(" P ")
                        .pattern(" B ")
                        .define('T', ModItems.TOP_BUN)
                        .define('P', ModItems.PATTY)
                        .define('B', ModItems.BOTTOM_BUN)
                        .unlockedBy("has_patty", has(ModItems.PATTY))
                        .group("extra_food_items")
                        .save(output);

                shaped(RecipeCategory.MISC, ModItems.CHEESEBURGER)
                        .pattern(" C")
                        .pattern(" Y")
                        .define('C', ModItems.CHEESE)
                        .define('Y', ModItems.PATTY_BURGER)
                        .unlockedBy("has_patty", has(ModItems.PATTY))
                        .group("extra_food_items")
                        .save(output);

                shaped(RecipeCategory.MISC, ModItems.HAMBURGER)
                        .pattern(" E ")
                        .pattern("MKL")
                        .pattern(" O ")
                        .define('E', ModItems.CHEESEBURGER)
                        .define('M', ModItems.MAYONNAISE)
                        .define('K', ModItems.KETCHUP)
                        .define('L', ModItems.LETTUCE)
                        .define('O', ModItems.TOMATO)
                        .unlockedBy("has_patty", has(ModItems.PATTY))
                        .group("extra_food_items")
                        .save(output);
            }
        };
    }
    @Override
    public String getName() {
        return "ExtraFoodsRecipes";
    }
}
