package com.deltabeee.dcrops;

import com.deltabeee.dcrops.block.ModBlocks;
import com.deltabeee.dcrops.block.entity.ModBlockEntities;
import com.deltabeee.dcrops.effect.ModEffects;
import com.deltabeee.dcrops.item.ModItems;
import com.deltabeee.dcrops.recipe.ModRecipes;
import com.deltabeee.dcrops.screen.GrinderScreen;
import com.deltabeee.dcrops.screen.ModMenuTypes;
import com.mojang.logging.LogUtils;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(DCrops.MOD_ID)
public class DCrops {
    public static final String MOD_ID = "dcrops";
    private static final Logger LOGGER = LogUtils.getLogger();

    public DCrops() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModBlockEntities.register(modEventBus);
        ModEffects.register(modEventBus);
        ModMenuTypes.register(modEventBus);
        ModRecipes.register(modEventBus);

        modEventBus.addListener(this::clientSetup);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        MenuScreens.register(ModMenuTypes.GRINDER_MENU.get(), GrinderScreen::new);
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.CANNABIS_CROP.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PSILOCYBIN_CROP.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.COCA_CROP.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.EPHEDRA_CROP.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.SASSAFRAS_CROP.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.OPIUM_CROP.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.GINGER_CROP.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.REFINERY.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.ADVANCED_REFINERY.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRINDER.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.CHEMISTRY_TABLE.get(), RenderType.translucent());
        }
    }
}
