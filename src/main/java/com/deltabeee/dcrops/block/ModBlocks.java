package com.deltabeee.dcrops.block;

import com.deltabeee.dcrops.DCrops;
import com.deltabeee.dcrops.block.custom.*;
import com.deltabeee.dcrops.block.custom.crops.*;
import com.deltabeee.dcrops.item.ModCreativeModeTab;
import com.deltabeee.dcrops.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, DCrops.MOD_ID);


    //BLOCKS

    public static final RegistryObject<Block> COCAINE_BRICKS = registerBlock("cocaine_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.QUARTZ).requiresCorrectToolForDrops()
                    .strength(1.5F, 1200.0F)), ModCreativeModeTab.TAB_MISC);


    // CROPS

    public static final RegistryObject<Block> CANNABIS_CROP = BLOCKS.register("cannabis_crop",
            () -> new CannabisCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> PSILOCYBIN_CROP = BLOCKS.register("psilocybin_crop",
            () -> new PsilocybinCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> COCA_CROP = BLOCKS.register("coca_crop",
            () -> new CocaCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> EPHEDRA_CROP = BLOCKS.register("ephedra_crop",
            () -> new EphedraCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> SASSAFRAS_CROP = BLOCKS.register("sassafras_crop",
            () -> new SassafrasCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> OPIUM_CROP = BLOCKS.register("opium_crop",
            () -> new OpiumCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> GINGER_CROP = BLOCKS.register("ginger_crop",
            () -> new GingerCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    // MACHINERY

    public static final RegistryObject<Block> REFINERY = registerBlock("refinery",
            () -> new RefineryBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).noOcclusion()),
            CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> ADVANCED_REFINERY = registerBlock("advanced_refinery",
            () -> new AdvancedRefineryBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()),
            CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> GRINDER = registerBlock("grinder",
            () -> new GrinderBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()),
            CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> CHEMISTRY_TABLE = registerBlock("chemistry_table",
            () -> new ChemistryTableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()),
            CreativeModeTab.TAB_DECORATIONS);

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }
                                                                            public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
