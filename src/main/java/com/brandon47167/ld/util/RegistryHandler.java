package com.brandon47167.ld.util;


import com.brandon47167.ld.blocks.*;
import com.brandon47167.ld.items.ItemBase;
import com.brandon47167.ld.ld;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ld.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ld.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
    //Items
    public static final RegistryObject<Item> esca = ITEMS.register("esca", ItemBase::new);
    public static final RegistryObject<Item> isocarapace = ITEMS.register("isocarapace", ItemBase::new);
    public static final RegistryObject<Item> TungstenIngot = ITEMS.register("tungsten_ingot", ItemBase::new);
    public static final RegistryObject<Item> TungstenNugget = ITEMS.register("tungsten_nugget", ItemBase::new);
    public static final RegistryObject<Item> rainbow_fish = ITEMS.register("rainbow_fish", ItemBase::new);
    // Blocks

    public static final RegistryObject<Block> Chiseled_Pearl_Block = BLOCKS.register("chiseled_pearl_block", ChiseledPearlBlock::new);

    public static final RegistryObject<Block> Dead_Seafoam_Block = BLOCKS.register("dead_seafoam_block", DeadSeafoamBlock::new);

    public static final RegistryObject<Block> Tungsten_Block = BLOCKS.register("tungsten_block", TungstenBlock::new);

    public static final RegistryObject<Block> Seafoam_Coral_Block = BLOCKS.register("seafoam_coral", SeafoamCoral::new);

    // Block Items
    public static final RegistryObject<Item> Chiseled_Pearl_Item = ITEMS.register("chiseled_pearl_block", () -> new BlockItemBase(Chiseled_Pearl_Block.get()));

    public static final RegistryObject<Item> Dead_Seafoam_Item = ITEMS.register("dead_seafoam_block", () -> new BlockItemBase(Dead_Seafoam_Block.get()));
    public static final RegistryObject<Item> Tungsten_Block_Item = ITEMS.register("tungsten_block", () -> new BlockItemBase(Tungsten_Block.get()));

    public static final RegistryObject<Item> Seafoam_Coral = ITEMS.register("seafoam_coral", () -> new BlockItemBase(Seafoam_Coral_Block.get()));

}