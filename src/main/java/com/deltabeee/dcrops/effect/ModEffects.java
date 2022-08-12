package com.deltabeee.dcrops.effect;

import com.deltabeee.dcrops.DCrops;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS
            = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, DCrops.MOD_ID);

    public static final RegistryObject<MobEffect> ANTIHISTAMINES = MOB_EFFECTS.register("antihistamines",
            () -> new AntihistaminesEffect(MobEffectCategory.BENEFICIAL, 15784892));

    public static final RegistryObject<MobEffect> NUMBED = MOB_EFFECTS.register("numbed",
            () -> new AntihistaminesEffect(MobEffectCategory.BENEFICIAL, 65535));

    public static final RegistryObject<MobEffect> STONED = MOB_EFFECTS.register("stoned",
            () -> new StonedEffect(MobEffectCategory.BENEFICIAL, 10157824));

    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }
}
