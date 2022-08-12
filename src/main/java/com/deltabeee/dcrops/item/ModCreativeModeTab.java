package com.deltabeee.dcrops.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab TAB_CROPS = new CreativeModeTab("dcrops_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CANNABIS.get());
        }
    };
    public static final CreativeModeTab TAB_MISC = new CreativeModeTab("dmisc_tab") {
        @Override
        public ItemStack makeIcon() { return new ItemStack(ModItems.COPPER_WIRE.get()); }
    };
    public static final CreativeModeTab TAB_DRUGS = new CreativeModeTab("ddrugs_tab") {
        @Override
        public ItemStack makeIcon() { return new ItemStack(ModItems.OPIOIDS.get()); }
    };
}
