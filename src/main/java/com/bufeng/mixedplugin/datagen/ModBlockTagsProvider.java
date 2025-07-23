package com.bufeng.mixedplugin.datagen;

import com.bufeng.mixedplugin.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registiresFuture) {
        super(output, registiresFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.TEST_BLOCK)
                .add(ModBlocks.WJZ_BLOCK)
                .add(ModBlocks.RAW_TEST_BLOCK);
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.TEST_BLOCK_ORE);
        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.RAW_TEST_BLOCK);
    }
}
