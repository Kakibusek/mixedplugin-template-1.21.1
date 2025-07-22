package com.bufeng.mixedplugin.datagen;

import com.bufeng.mixedplugin.block.ModBlocks;
import com.bufeng.mixedplugin.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {


    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.TEST_BLOCK);
        addDrop(ModBlocks.TEST_BLOCK_ORE, oreDrops(ModBlocks.TEST_BLOCK_ORE, ModItems.TEST_ITEM));
        addDrop(ModBlocks.WJZ_BLOCK);
        addDrop(ModBlocks.RAW_TEST_BLOCK);
    }
}
