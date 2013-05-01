package grayz.dimensionenhanced.common.block;

import grayz.dimensionenhanced.common.DimensionEnhanced;
import grayz.dimensionenhanced.common.handlers.TabHandler;
import grayz.dimensionenhanced.lib.Util;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class DimensionEnhancedBlock extends Block
{

    public DimensionEnhancedBlock(int par1, Material material)
    {
        super(par1, material);
        setCreativeTab(TabHandler.tab);
        
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + this.getUnlocalizedName().substring(5));
    }
}
