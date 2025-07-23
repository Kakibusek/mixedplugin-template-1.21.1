package com.bufeng.mixedplugin;

import com.bufeng.mixedplugin.datagen.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class MixedPluginDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModENUSLanProvider::new);
		pack.addProvider(ModRecipesProvider::new);
		pack.addProvider(ModModelsProvider::new);
		pack.addProvider(ModBlockTagsProvider::new);
		pack.addProvider(ModLootTableProvider::new);
	}
}
