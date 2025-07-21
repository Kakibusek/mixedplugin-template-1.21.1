package com.bufeng.mixedplugin.block;

import com.bufeng.mixedplugin.MixedPlugin;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    //Register Blocks and Define the harness/resistence value
    public static final Block TEST_BLOCK = register("test_block", new Block(AbstractBlock.Settings.create().requiresTool().strength(3.0f, 3.0f)));
    public static final Block TEST_BLOCK_ORE = register("test_block_ore", new Block(AbstractBlock.Settings.create().requiresTool().strength(4.5f, 6.0f)));
    public static final Block RAW_TEST_BLOCK = register("raw_test_block", new Block(AbstractBlock.Settings.create().requiresTool().strength(3.0f, 3.0f)));
    public static final Block WJZ_BLOCK = register("wjz_block", new Block(AbstractBlock.Settings.create().strength(3.0f, 3.0f)));

    //Register Block Items
    public static void registerBlockItems(String id, Block block) {
        Item item = Registry.register(Registries.ITEM, Identifier.of(MixedPlugin.MOD_ID, id), new BlockItem(block, new Item.Settings()));
        if (item instanceof BlockItem) {
            ((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS, item);
        }

    }
    //Define Block return results
    public static Block register(String id, Block block) {
        registerBlockItems(id, block);
        return Registry.register(Registries.BLOCK, Identifier.of(MixedPlugin.MOD_ID, id), block);
    }

    //Initialize Blocks
    public static void registerModBlocks() {
        MixedPlugin.LOGGER.info("Registering ModBlocks for " + MixedPlugin.MOD_ID);
    }
}
