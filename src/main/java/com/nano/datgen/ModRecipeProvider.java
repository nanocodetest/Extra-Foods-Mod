package com.nano.datgen;

import com.nano.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancements.Advancement;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Recipe;

import java.util.concurrent.CompletableFuture;

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

                shaped(RecipeCategory.MISC, ModItems.PATTY)
                        .pattern(" H")
                        .pattern(" S")
                        .define('H', ModItems.HAMMER)
                        .define('S', Items.BEEF)
                        .unlockedBy("has_beef", has(Items.BEEF))
                        .group("extra_food_items")
                        .save(output);

                shaped(RecipeCategory.MISC, ModItems.FRIES)
                        .pattern(" P")
                        .pattern(" K")
                        .define('P', ModItems.KNIFE)
                        .define('K', Items.BAKED_POTATO)
                        .unlockedBy("has_baked_potato", has(Items.BAKED_POTATO))
                        .group("extra_food_items")
                        .save(output);

                shaped(RecipeCategory.MISC, ModItems.FRENCH_FRIES)
                        .pattern(" F")
                        .pattern(" N")
                        .define('F', ModItems.FRIES)
                        .define('N', ModItems.FRIES_CARTON)
                        .unlockedBy("has_patty", has(ModItems.PATTY))
                        .group("extra_food_items")
                        .save(output);

                shaped(RecipeCategory.MISC, ModItems.BOTTOM_BUN)
                        .pattern("   ")
                        .pattern("   ")
                        .pattern("XWR")
                        .define('X', Items.EGG)
                        .define('W', Items.WHEAT)
                        .define('R', Items.WATER_BUCKET)
                        .unlockedBy("has_egg", has(Items.EGG))
                        .unlockedBy("has_egg", has(Items.WHEAT))
                        .unlockedBy("has_egg", has(Items.WATER_BUCKET))
                        .group("extra_food_items")
                        .save(output);

                shaped(RecipeCategory.MISC, ModItems.TOP_BUN)
                        .pattern("VU ")
                        .pattern("   ")
                        .pattern("   ")
                        .define('V', Items.EGG)
                        .define('U', Items.WHEAT)
                        .unlockedBy("has_egg", has(Items.EGG))
                        .unlockedBy("has_egg", has(Items.WHEAT))
                        .unlockedBy("has_egg", has(Items.WATER_BUCKET))
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
