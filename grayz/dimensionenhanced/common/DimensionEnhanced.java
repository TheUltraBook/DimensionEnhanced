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
	
	
	
	
	
	
	
	@PreInit
	public void PreInit(FMLPreInitializationEvent event) 
	{
		proxy.preInit(event);		
	}

	@Init
	public void Init(FMLInitializationEvent event) 
	{
		proxy.init(event);

	}
	
	@PostInit
	public void postInit(FMLPostInitializationEvent event) 
	{
	
	}

}
