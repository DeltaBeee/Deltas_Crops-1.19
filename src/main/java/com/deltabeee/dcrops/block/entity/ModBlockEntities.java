package com.deltabeee.dcrops.block.entity;

import com.deltabeee.dcrops.DCrops;
import com.deltabeee.dcrops.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, DCrops.MOD_ID);

    public static final RegistryObject<BlockEntityType<GrinderBlockEntity>> GRINDER_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("grinder_block_entity", () ->
                    BlockEntityType.Builder.of(GrinderBlockEntity::new,
                            ModBlocks.GRINDER.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
