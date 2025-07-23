package com.bufeng.mixedplugin.datagen;

import com.bufeng.mixedplugin.block.ModBlocks;
import com.bufeng.mixedplugin.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModModelsProvider extends FabricModelProvider {
    public ModModelsProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TEST_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TEST_BLOCK_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WJZ_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_TEST_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.TEST_ITEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.TNT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_TEST_ITEM, Models.GENERATED);
    }
}
