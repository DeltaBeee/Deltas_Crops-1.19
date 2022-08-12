package com.deltabeee.dcrops.event;

import com.deltabeee.dcrops.DCrops;
import com.deltabeee.dcrops.recipe.GrinderRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = DCrops.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerModifierSerializers(@Nonnull final RegisterEvent event) {
        event.register(ForgeRegistries.Keys.RECIPE_TYPES, helper -> {
            helper.register(new ResourceLocation(DCrops.MOD_ID, GrinderRecipe.Type.ID), GrinderRecipe.Type.INSTANCE);
        });
    }
}