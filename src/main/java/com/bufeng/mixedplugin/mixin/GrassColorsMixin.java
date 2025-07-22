package com.bufeng.mixedplugin.mixin;

import net.minecraft.world.biome.GrassColors;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(GrassColors.class)
public interface GrassColorsMixin {
    @Accessor("colorMap")
        static int[] getColorMap(){
        throw new AssertionError();
    }

    @Accessor("Color Map")
        static void setColorMap(int[] colorMap){
        throw new AssertionError();
    }

}
