package com.brandon47167.ld.blocks;

import com.brandon47167.ld.ld;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem {
    public BlockItemBase(Block block) {
        super(block, new Item.Properties().group(ld.TAB));
    }
}
