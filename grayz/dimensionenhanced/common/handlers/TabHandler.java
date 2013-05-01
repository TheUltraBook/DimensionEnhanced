package grayz.dimensionenhanced.common.handlers;

import grayz.dimensionenhanced.common.DimensionEnhancedCreativeTab;
import grayz.dimensionenhanced.lib.Util;
import net.minecraft.creativetab.CreativeTabs;

public class TabHandler
{
    
    public static final CreativeTabs tab = new DimensionEnhancedCreativeTab(CreativeTabs.getNextID(), Util.MOD_ID);
    
}
