package com.deltabeee.dcrops.item;

import com.deltabeee.dcrops.DCrops;
import com.deltabeee.dcrops.block.ModBlocks;
import com.deltabeee.dcrops.effect.ModEffects;
import com.deltabeee.dcrops.item.custom.PillBottleItem;
import com.deltabeee.dcrops.item.custom.SmokeItem;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DCrops.MOD_ID);

    // CROP ITEMS

    public static final RegistryObject<Item> CANNABIS_SEEDS = ITEMS.register("cannabis_seeds",
            () -> new ItemNameBlockItem(ModBlocks.CANNABIS_CROP.get(),
                    new Item.Properties().tab(ModCreativeModeTab.TAB_CROPS)));

    public static final RegistryObject<Item> CANNABIS = ITEMS.register("cannabis",
                () -> new Item (new Item.Properties().tab(ModCreativeModeTab.TAB_CROPS)
                        .food(new FoodProperties.Builder().nutrition(0).saturationMod(0.1f).build())));

    public static final RegistryObject<Item> OPIUM_SEEDS = ITEMS.register("opium_seeds",
            () -> new ItemNameBlockItem(ModBlocks.OPIUM_CROP.get(),
                    new Item.Properties().tab(ModCreativeModeTab.TAB_CROPS)));

    public static final RegistryObject<Item> OPIUM_POD = ITEMS.register("opium_pod",
            () -> new Item (new Item.Properties().tab(ModCreativeModeTab.TAB_CROPS)));

    public static final RegistryObject<Item> OPIUM_POPPY = ITEMS.register("opium_poppy",
            () -> new Item (new Item.Properties().tab(ModCreativeModeTab.TAB_CROPS)));

    public static final RegistryObject<Item> PSILOCYBIN_SPORES = ITEMS.register("psilocybin_spores",
            () -> new ItemNameBlockItem(ModBlocks.PSILOCYBIN_CROP.get(),
                    new Item.Properties().tab(ModCreativeModeTab.TAB_CROPS)));

    public static final RegistryObject<Item> PSILOCYBIN = ITEMS.register("psilocybin",
            () -> new Item (new Item.Properties().tab(ModCreativeModeTab.TAB_CROPS)
                    .food(new FoodProperties.Builder().nutrition(4).saturationMod(2.4f).build())));

    public static final RegistryObject<Item> COCA_SEEDS = ITEMS.register("coca_seeds",
            () -> new ItemNameBlockItem(ModBlocks.COCA_CROP.get(),
                    new Item.Properties().tab(ModCreativeModeTab.TAB_CROPS)));

    public static final RegistryObject<Item> COCA_LEAF = ITEMS.register("coca_leaf",
            () -> new Item (new Item.Properties().tab(ModCreativeModeTab.TAB_CROPS)
                    .food(new FoodProperties.Builder().nutrition(1).saturationMod(0.4f).build())));

    public static final RegistryObject<Item> EPHEDRA_FRUITS = ITEMS.register("ephedra_fruits",
            () -> new ItemNameBlockItem(ModBlocks.EPHEDRA_CROP.get(),
                    new Item.Properties().tab(ModCreativeModeTab.TAB_CROPS)));

    public static final RegistryObject<Item> EPHEDRA_CLIPPINGS = ITEMS.register("ephedra_clippings",
            () -> new Item (new Item.Properties().tab(ModCreativeModeTab.TAB_CROPS)));

    public static final RegistryObject<Item> SASSAFRAS_SEED = ITEMS.register("sassafras_seed",
            () -> new ItemNameBlockItem(ModBlocks.SASSAFRAS_CROP.get(),
                    new Item.Properties().tab(ModCreativeModeTab.TAB_CROPS)));

    public static final RegistryObject<Item> SASSAFRAS_ROOTS = ITEMS.register("sassafras_roots",
            () -> new Item (new Item.Properties().tab(ModCreativeModeTab.TAB_CROPS)));

    public static final RegistryObject<Item> GINGER = ITEMS.register("ginger",
            () -> new ItemNameBlockItem(ModBlocks.GINGER_CROP.get(), (new Item.Properties().tab(ModCreativeModeTab.TAB_CROPS)
                    .food(new FoodProperties.Builder().nutrition(4).saturationMod(4.0f).alwaysEat()
                            .effect(new MobEffectInstance(ModEffects.ANTIHISTAMINES.get(), 200, 0), 1).build()))));



    // MISC

    public static final RegistryObject<Item> COPPER_WIRE = ITEMS.register("copper_wire",
            () -> new Item (new Item.Properties().tab(ModCreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> PILL_BOTTLE = ITEMS.register("pill_bottle",
            () -> new Item (new Item.Properties().tab(ModCreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> SYRINGE = ITEMS.register("syringe",
            () -> new Item (new Item.Properties().tab(ModCreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> DRIED_CANNABIS = ITEMS.register("dried_cannabis",
            () -> new Item (new Item.Properties().tab(ModCreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> DRIED_CANNABIS_BRICK = ITEMS.register("dried_cannabis_brick",
            () -> new Item (new Item.Properties().tab(ModCreativeModeTab.TAB_MISC)));

    // DRUGS

    public static final RegistryObject<Item> OPIOIDS = ITEMS.register("opioids",
            () -> new PillBottleItem(new Item.Properties().tab(ModCreativeModeTab.TAB_DRUGS)
                    .food(new FoodProperties.Builder().alwaysEat().nutrition(0)
                            .effect(new MobEffectInstance(ModEffects.NUMBED.get(), 6000, 0), 1).build())));

    public static final RegistryObject<Item> ANTIHISTAMINES = ITEMS.register("antihistamines",
            () -> new PillBottleItem (new Item.Properties().tab(ModCreativeModeTab.TAB_DRUGS)
                    .food(new FoodProperties.Builder().alwaysEat().nutrition(0)
                            .effect(new MobEffectInstance(ModEffects.ANTIHISTAMINES.get(), 6000, 0), 1).build())));

    public static final RegistryObject<Item> HEROIN = ITEMS.register("heroin",
            () -> new Item (new Item.Properties().tab(ModCreativeModeTab.TAB_DRUGS)
                    .food(new FoodProperties.Builder().alwaysEat().nutrition(0)
                            .effect(new MobEffectInstance(ModEffects.NUMBED.get(), 1200, 0), 1)
                            .effect(new MobEffectInstance(MobEffects.CONFUSION, 1200, 0), 1).build())));

    public static final RegistryObject<Item> COCAINE = ITEMS.register("cocaine",
            () -> new Item (new Item.Properties().tab(ModCreativeModeTab.TAB_DRUGS)
                    .food(new FoodProperties.Builder().nutrition(0).saturationMod(0.2f).build())));

    public static final RegistryObject<Item> JOINT = ITEMS.register("joint",
            () -> new SmokeItem(new Item.Properties().tab(ModCreativeModeTab.TAB_DRUGS)
                    .food(new FoodProperties.Builder().alwaysEat().nutrition(0)
                            .effect(new MobEffectInstance(ModEffects.STONED.get(), 1200, 0), 1)
                            .effect(new MobEffectInstance(MobEffects.ABSORPTION, 1200, 5), 1).build())));

        public static void register(IEventBus eventBus) {
            ITEMS.register(eventBus);
        }
}
