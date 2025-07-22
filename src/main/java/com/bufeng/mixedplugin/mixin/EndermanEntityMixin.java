package com.bufeng.mixedplugin.mixin;

import net.minecraft.entity.mob.EndermanEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(EndermanEntity.class)
public interface EndermanEntityMixin {
    @Invoker("teleportTo")
    void teleportTo(double x, double y, double z);
}
