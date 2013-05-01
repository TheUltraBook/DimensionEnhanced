package grayz.dimensionenhanced.common;

import grayz.dimensionenhanced.common.handlers.BlockHandler;
import grayz.dimensionenhanced.common.handlers.ConfigHandler;
import grayz.dimensionenhanced.common.handlers.DimensionHandler;
import grayz.dimensionenhanced.common.handlers.LoggerHandler;
import grayz.dimensionenhanced.lib.Util;

import java.util.logging.Level;

import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;


@Mod (modid = Util.MOD_ID, name = Util.MOD_NAME, version = Util.MOD_VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class DimensionEnhanced 
{
	
	@SidedProxy(clientSide = Util.MOD_CLIENT_PROXY, serverSide = Util.MOD_COMMON_PROXY)
	public static CommonProxyDimensionEnhanced proxy;
	
	
	
	public static final CreativeTabs tab = new DimensionEnhancedCreativeTab(CreativeTabs.getNextID(), Util.MOD_ID);
	
	
	
	@PreInit
	public void PreInit(FMLPreInitializationEvent event) 
	{
		LoggerHandler.init();		
		LoggerHandler.log(Level.INFO, "Pre Initialization Started");		
		ConfigHandler.initConfig(event);		
		LoggerHandler.log(Level.INFO, "Pre Initialization Completed");
		
	}

	@Init
	public void Init(FMLInitializationEvent event) 
	{
		LoggerHandler.log(Level.INFO, "Initialization Started");
		proxy.registerRenderInformation();		
		BlockHandler.init();
		DimensionHandler.init();      
		LoggerHandler.log(Level.INFO, "Initialization Completed");

	}
	
	@PostInit
	public void postInit(FMLPostInitializationEvent event) 
	{
		LoggerHandler.log(Level.INFO, "Post Initialization Started");		
		LoggerHandler.log(Level.INFO, "Post Initialization Completed");
	}

}
