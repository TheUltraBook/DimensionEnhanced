package grayz.dimensionenhanced.common;

import grayz.dimensionenhanced.common.handlers.BlockHandler;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class DimensionEnhancedCreativeTab extends CreativeTabs
{
    public DimensionEnhancedCreativeTab(int id, String name)
    {
        super(id, name);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public String getTranslatedTabLabel()
    {
        return "Dimension Enhanced";
    }

    @Override
    @SideOnly(Side.CLIENT)
    public int getTabIconItemIndex()
    {
        
        return BlockHandler.enderGrass.blockID;
        
    }
}