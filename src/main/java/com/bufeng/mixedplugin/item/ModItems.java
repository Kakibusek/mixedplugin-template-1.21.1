package com.bufeng.mixedplugin.item;

import com.bufeng.mixedplugin.MixedPlugin;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    //Create items and initialize the through item.settings() method
    public static final Item TEST_ITEM = registerItem("test_item", new Item(new Item.Settings()));
    public static final Item TNT = registerItem("tnt", new Item(new Item.Settings()));
    public static final Item RAW_TEST_ITEM = registerItem("raw_test_item", new Item(new Item.Settings()));
    public static final Item LCF_CHICKEN = registerItem("lcf_chicken", new Item(new Item.Settings().food(ModFoodComponents.LCF_CHICKEN)));
    public static final Item LCF_PORK = registerItem("lcf_pork", new Item(new Item.Settings().food(ModFoodComponents.LCF_PORK)));

    //Define the register method
    private static Item registerItem(String id, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MixedPlugin.MOD_ID, id), item);
    }
    //Add items to item group/Make items can be visible in minecraft inventory
    private static void addItemsToItemGroup(FabricItemGroupEntries fabricItemGroupEntries) {
        fabricItemGroupEntries.add(TEST_ITEM);
        fabricItemGroupEntries.add(TNT);
    }
    //Register items in this mod&Add items to item group
    public static void registerModItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToItemGroup);
        MixedPlugin.LOGGER.info("Registering Mod Items for " + MixedPlugin.MOD_ID);
    }
}
