package com.bufeng.mixedplugin.item;


import com.bufeng.mixedplugin.MixedPlugin;
import com.bufeng.mixedplugin.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    //Create Customized Item Group
    public static final RegistryKey<ItemGroup> MIXEDPLUGIN_GROUP = register("mixedplugin_group");

    //Register Item Group
    private static RegistryKey<ItemGroup> register(String id){
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(MixedPlugin.MOD_ID, id));
    }

    //Initialize Item Group
    public static void registerModItemGroups(){
        Registry.register(Registries.ITEM_GROUP, MIXEDPLUGIN_GROUP,
                ItemGroup.create(ItemGroup.Row.TOP, 7)
                        .displayName(Text.translatable("itemGroup.mixedplugin"))
                        .icon(() -> new ItemStack(ModItems.TEST_ITEM))
                        .entries((displayContext, entries) -> {
                            entries.add(ModItems.TEST_ITEM);
                            entries.add(ModItems.TNT);

                            entries.add(ModBlocks.TEST_BLOCK);
                            entries.add(ModBlocks.TEST_BLOCK_ORE);
                            entries.add(ModBlocks.RAW_TEST_BLOCK);
                            entries.add(ModBlocks.WJZ_BLOCK);
                        })
                        .build());
        MixedPlugin.LOGGER.info("Registering Mod Item Groups for " + MixedPlugin.MOD_ID);
    }
}
