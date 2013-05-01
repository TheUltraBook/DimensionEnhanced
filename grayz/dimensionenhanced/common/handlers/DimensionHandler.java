package grayz.dimensionenhanced.common.handlers;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import grayz.dimensionenhanced.common.dimension.WorldProviderEnder;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.DimensionManager;

public class DimensionHandler
{
    
    public static BiomeGenBase enderBiome;
    
    public static int enderBiomeID;
    
    public static boolean KeepLoadedEnder;
    
    public static int enderID;
    
    public static void initDimensions()
    {
        DimensionManager.registerProviderType(enderID, WorldProviderEnder.class, KeepLoadedEnder);
        DimensionManager.registerDimension(enderID, enderID);
        
    }
    
    public static void initDimensionsConfig(FMLPreInitializationEvent event, Configuration config)
    {
        KeepLoadedEnder = config.get("Dimensions", "Keep Ender Dimension Loaded", false).getBoolean(false);
        
        enderID = config.get("Dimensions", "Ender Dimension ID", 7).getInt();
        
        enderBiomeID  = config.get("Dimensions", "Ender Biome ID", 24).getInt();
    }
}
