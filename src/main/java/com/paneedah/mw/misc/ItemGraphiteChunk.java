package com.paneedah.mw.misc;

import com.paneedah.mw.ModernWarfareMod;
import com.paneedah.mw.utils.ModReference;
import net.minecraft.item.Item;

public class ItemGraphiteChunk extends Item {

    public ItemGraphiteChunk() {
        setMaxStackSize(64);
        setTranslationKey(ModReference.MWC_ID + "_" + "GraphiteChunk");
//        setTextureName(ModReference.MWC_ID + ":" + "graphitechunk");
        setCreativeTab(ModernWarfareMod.BlocksTab);
    }
}
