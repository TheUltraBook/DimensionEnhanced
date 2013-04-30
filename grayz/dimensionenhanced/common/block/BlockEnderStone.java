package grayz.dimensionenhanced.common.block;

import grayz.dimensionenhanced.common.handlers.BlockHandler;

import java.util.Random;

import net.minecraft.block.material.Material;

public class BlockEnderStone extends DimensionEnhancedBlock
{

    public BlockEnderStone(int par1)
    {
        super(par1, Material.rock);
        
    }

    public int quantityDropped(int par1, int par2)
    {
        return 1;
    }

    public int idDropped(int par1, Random random, int par2)
    {
        return BlockHandler.enderCobblestone.blockID;
    }
}
