package grayz.dimensionenhanced.common.block;

import grayz.dimensionenhanced.common.DimensionEnhanced;
import grayz.dimensionenhanced.common.handlers.BlockHandler;
import grayz.dimensionenhanced.lib.Util;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockEnderGrass extends Block
{
    public BlockEnderGrass(int par1)
    {
        super(par1, Material.ground);
        setTickRandomly(true);
        setCreativeTab(DimensionEnhanced.tab);
    }

    @SideOnly(Side.CLIENT)
    private Icon sides, bottom, top;

    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        if (par1World.isRemote)
        {
            return;
        }

        if (par1World.getBlockLightValue(par2, par3 + 1, par4) < 4 && Block.lightOpacity[par1World.getBlockId(par2, par3 + 1, par4)] > 2)
        {
            par1World.setBlock(par2, par3, par4, BlockHandler.enderGrass.blockID, 0, 2);
        }
        else if (par1World.getBlockLightValue(par2, par3 + 1, par4) >= 9)
        {
            for (int i = 0; i < 45; i++)
            {
                int j = (par2 + par5Random.nextInt(3)) - 1;
                int k = (par3 + par5Random.nextInt(5)) - 3;
                int l = (par4 + par5Random.nextInt(3)) - 1;
                int i1 = par1World.getBlockId(j, k + 1, l);

                if (par1World.getBlockId(j, k, l) == BlockHandler.enderGrass.blockID && par1World.getBlockLightValue(j, k + 1, l) >= 4 && Block.lightOpacity[i1] <= 2)
                {
                    par1World.setBlock(j, k, l, BlockHandler.enderGrass.blockID, 0, 2);
                }
            }
        }
    }

    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        super.randomDisplayTick(par1World, par2, par3, par4, par5Random);

        if (par5Random.nextInt(75) == 0)
        {
            par1World.spawnParticle("depthsuspend", (float)par2 + par5Random.nextFloat(), (float)par3 + 1.1F, (float)par4 + par5Random.nextFloat(), 20.0D, 20.0D, 20.0D);
        }
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.sides  = par1IconRegister.registerIcon(Util.MOD_ID + ":" + this.getUnlocalizedName2() + "Side");
        this.bottom = par1IconRegister.registerIcon(Util.MOD_ID + ":" + this.getUnlocalizedName2() + "Bottom");
        this.top    = par1IconRegister.registerIcon(Util.MOD_ID + ":" + this.getUnlocalizedName2() + "Top");
    }

    @SideOnly(Side.CLIENT)
    public Icon getBlockTextureFromSideAndMetadata(int i, int j)
    {
            if (i == 0)
            {
                    return bottom;
            }
            if (i == 1)
            {
                    return top;
            }
            else
            {
                    return sides;
            }
    }
    public int quantityDropped(int par1, int par2)
    {
        return 1;
    }

    public int idDropped(int par1, Random random, int par2)
    {
        return BlockHandler.enderDirt.blockID;
    }

}
