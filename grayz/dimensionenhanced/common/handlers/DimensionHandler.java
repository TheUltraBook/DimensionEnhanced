package grayz.dimensionenhanced.common.handlers;

import grayz.dimensionenhanced.common.dimension.WorldProviderEnder;
import net.minecraftforge.common.DimensionManager;

public class DimensionHandler
{
    public static int enderDimension = 20;
    
    public static void init()
    {
        DimensionManager.registerProviderType(enderDimension, WorldProviderEnder.class, false);
        DimensionManager.registerDimension(enderDimension, enderDimension);
        
    }
}
