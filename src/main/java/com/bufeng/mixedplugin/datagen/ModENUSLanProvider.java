package com.bufeng.mixedplugin.datagen;

import com.bufeng.mixedplugin.block.ModBlocks;
import com.bufeng.mixedplugin.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;


public class ModENUSLanProvider extends FabricLanguageProvider {
    public ModENUSLanProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us",registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.TEST_ITEM, "Test Item");
        translationBuilder.add(ModItems.TNT, "TNT 2D VERSION");

        translationBuilder.add(ModBlocks.TEST_BLOCK, "Test Block");
        translationBuilder.add(ModBlocks.TEST_BLOCK_ORE, "Test Block Ore");
        translationBuilder.add(ModBlocks.RAW_TEST_BLOCK, "Raw Test Block");
        translationBuilder.add(ModBlocks.WJZ_BLOCK, "WJZ Block");

        translationBuilder.add("itemGroup.mixedplugin", "Mixed Plugin");
    }
}
