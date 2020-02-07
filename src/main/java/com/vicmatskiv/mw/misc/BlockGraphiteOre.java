package com.vicmatskiv.mw.misc;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.Ores;

public class BlockGraphiteOre extends Block {
    
    public BlockGraphiteOre() {
        super(Material.ROCK);
        setUnlocalizedName(ModernWarfareMod.MODID + "_" + "GraphiteOre");
//        setBlockTextureName(ModernWarfareMod.MODID + ":" + "graphiteore");
        setHardness(6F);
        setResistance(15F);
        setSoundType(SoundType.STONE); 
        setHarvestLevel("pickaxe", 2);
        setCreativeTab(ModernWarfareMod.BlocksTab);
    }
    
    public Item getItemDropped(int meta, Random rand, int fortune) {
        return Ores.GraphiteChunk;
    }

}
//	   @Override
//	    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
//	        return Ores.GraphiteChunk;
//	    }
//	}