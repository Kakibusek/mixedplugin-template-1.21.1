package com.bufeng.mixedplugin.mixin;

import com.bufeng.mixedplugin.block.ModBlocks;
import com.bufeng.mixedplugin.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.item.Item;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.struct.InjectorGroupInfo;

import java.util.Map;

@Mixin(AbstractFurnaceBlockEntity.class)
public class AbstractFurnaceBlockEntityMixin {
    @Shadow private static volatile @Nullable Map<Item, Integer> fuelTimes;

    @Shadow private int fuelTime;

    @Inject(method = "createFuelTimeMap", at = @At("TAIL"))
    private static void addFuelTimes(CallbackInfoReturnable<Map<Item, Integer>> cir) {
        fuelTimes.put(ModItems.DZQ_COAL, 20000);
        fuelTimes.put(Item.fromBlock(ModBlocks.DZQ_COAL_BLOCK), 200000);
    }





}
