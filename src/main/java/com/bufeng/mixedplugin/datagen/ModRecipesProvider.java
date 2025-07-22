package com.bufeng.mixedplugin.datagen;

import com.bufeng.mixedplugin.block.ModBlocks;
import com.bufeng.mixedplugin.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipesProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> TEST_ITEM = List.of(ModItems.RAW_TEST_ITEM, Items.ICE);
    public ModRecipesProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.TEST_ITEM,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.TEST_BLOCK);
        offerSmelting(exporter, TEST_ITEM, RecipeCategory.MISC, ModItems.TEST_ITEM,
                0.7f, 200, "mixedplugin_test");
        offerBlasting(exporter, TEST_ITEM, RecipeCategory.MISC, ModItems.TEST_ITEM,
                0.7f, 100, "mixedplugin_test");
    }
}
