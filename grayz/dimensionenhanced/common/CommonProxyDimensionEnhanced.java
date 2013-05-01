package grayz.dimensionenhanced.common;

import java.util.logging.Level;

import grayz.dimensionenhanced.common.handlers.BlockHandler;
import grayz.dimensionenhanced.common.handlers.ConfigHandler;
import grayz.dimensionenhanced.common.handlers.DimensionHandler;
import grayz.dimensionenhanced.common.handlers.LoggerHandler;
import grayz.dimensionenhanced.common.handlers.TabHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CommonProxyDimensionEnhanced 
{

	public void registerRenderInformation()
	{

	}
	
	public void preInit(FMLPreInitializationEvent event)
	{
	    LoggerHandler.init();      
        LoggerHandler.log(Level.INFO, "Pre Initialization Started");
	    ConfigHandler.initConfig(event);
	    LoggerHandler.log(Level.INFO, "Pre Initialization Completed");
	    
	}

	public void init(FMLInitializationEvent event)
	{
	    
	    LoggerHandler.log(Level.INFO, "Initialization Started");
        registerRenderInformation();      
        BlockHandler.init();
        DimensionHandler.initDimensions();      
        LoggerHandler.log(Level.INFO, "Initialization Completed");
	    
	}
}
