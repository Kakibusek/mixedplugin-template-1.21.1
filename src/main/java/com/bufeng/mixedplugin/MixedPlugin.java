package com.bufeng.mixedplugin;

import com.bufeng.mixedplugin.block.ModBlocks;
import com.bufeng.mixedplugin.item.ModItemGroups;
import com.bufeng.mixedplugin.item.ModItems;
import com.bufeng.mixedplugin.tag.ModBlockTags;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MixedPlugin implements ModInitializer {
	public static final String MOD_ID = "mixedplugin";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		// Register items
		ModItems.registerModItems();

		// Register blocks
		ModBlocks.registerModBlocks();

		//Register item groups
		ModItemGroups.registerModItemGroups();
		ModBlockTags.registerModBlockTags();

//		int[] colorMap = GrassColorsMixin.getColorMap();
//		LOGGER.info("Grass Colors Length: {}", colorMap.length);
//
//		int[] newColorMap = new int[128];
//		GrassColorsMixin.setColorMap(newColorMap);
//		LOGGER.info("New Grass Colors Length: {}", GrassColorsMixin.getColorMap().length);
		// Send a message to the console

//		FuelRegistry.INSTANCE.add(ModItems.DZQ_COAL, 20000);
		LOGGER.info("Hello Fabric world!");

	}

	


}