package com.isjwjwjw.fantasyforgery.data;

import com.isjwjwjw.fantasyforgery.block.ModBlocks;
import com.isjwjwjw.fantasyforgery.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider);
    }
    @Override
    protected void buildRecipes(RecipeOutput output){
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,
                ModBlocks.TERRIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.TERRIUM_INGOT.get())
                .unlockedBy("has_terrium_ingot", has(ModItems.TERRIUM_INGOT.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,
                ModBlocks.RAW_TERRIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.RAW_TERRIUM.get())
                .unlockedBy("has_raw_terrium", has(ModItems.RAW_TERRIUM.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,
                ModBlocks.TINIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.TINIUM_INGOT.get())
                .unlockedBy("has_tinium_ingot", has(ModItems.TINIUM_INGOT.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,
                ModBlocks.RAW_TINIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.RAW_TINIUM.get())
                .unlockedBy("has_raw_tinium", has(ModItems.RAW_TINIUM.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,
                ModBlocks.BRONZIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.BRONZIUM_INGOT.get())
                .unlockedBy("has_bronzium_ingot", has(ModItems.BRONZIUM_INGOT.get()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,
                ModItems.TERRIUM_INGOT.get(), 9)
                .requires(ModBlocks.TERRIUM_BLOCK.get())
                .unlockedBy("has_terrium_block", has(ModBlocks.TERRIUM_BLOCK.get()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,
                ModItems.RAW_TERRIUM.get(), 9)
                .requires(ModBlocks.RAW_TERRIUM_BLOCK.get())
                .unlockedBy("has_raw_terrium_block", has(ModBlocks.RAW_TERRIUM_BLOCK.get()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,
                ModItems.TINIUM_INGOT.get(), 9)
                .requires(ModBlocks.TINIUM_BLOCK.get())
                .unlockedBy("has_tinium_block", has(ModBlocks.TINIUM_BLOCK.get()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,
                ModItems.RAW_TINIUM.get(), 9)
                .requires(ModBlocks.RAW_TINIUM_BLOCK.get())
                .unlockedBy("has_raw_tinium_block", has(ModBlocks.RAW_TINIUM_BLOCK.get()))
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,
                ModItems.BRONZIUM_INGOT.get(), 9)
                .requires(ModBlocks.BRONZIUM_BLOCK.get())
                .unlockedBy("has_bronzium_block", has(ModBlocks.BRONZIUM_BLOCK.get()))
                .save(output);

    }

}
