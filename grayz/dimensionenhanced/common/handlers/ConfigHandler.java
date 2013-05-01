package grayz.dimensionenhanced.common.handlers;


import java.io.File;
import java.util.logging.Level;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import net.minecraftforge.common.Configuration;

public class ConfigHandler 
{

    

    
    public static void initConfig(FMLPreInitializationEvent event)
    {
        File file = new File(event.getModConfigurationDirectory(), "DimensionEnhanced.cfg");
        Configuration config = new Configuration(file);
        
        config.load();
        
        InitConfigBlocks(config);
        InitConfigItems(config);
        config.save();
    }
    
    public static int ID_EnderDirt;
    public static int ID_EnderGrass;
    public static int ID_EnderStone;
    public static int ID_EnderCobblestone;
    public static int ID_EnderPortal;
    public static int ID_CompressedEnder;
    
    public static void InitConfigBlocks(Configuration config)
    {
            int bID = 200;
            ID_EnderDirt  = config.getTerrainBlock(config.CATEGORY_BLOCK, "Ender Dirt", bID++, "Ender Dirt").getInt();
            ID_EnderGrass = config.getTerrainBlock(config.CATEGORY_BLOCK, "Ender Grass", bID++, "Ender Grass").getInt();
            ID_EnderStone = config.getTerrainBlock(config.CATEGORY_BLOCK, "Ender Stone", bID++, "Ender Stone").getInt();
            ID_EnderCobblestone = config.getBlock(config.CATEGORY_BLOCK, "Ender CobbleStone", bID++, "Ender CobbleStone").getInt();
            ID_EnderPortal = config.getBlock(config.CATEGORY_BLOCK, "Ender Portal", bID++, "Ender Portal").getInt();
            ID_CompressedEnder = config.getBlock(config.CATEGORY_BLOCK, "Compressed Ender", bID++, "Compressed Ender").getInt();
            
            //For blocks:
            // ID_*BLOCK/ITEMNAMEHERE* = config.getBlock(config.CATEGORY_BLOCK, “blockNameHereID”, //123).getInt(123);
            //For general options:
            // VAR_NAME_HERE = config.get (config.CATEGORY_GENERAL, “optionNameHere”, //optionDefaultValue).getInt(optionDefaultValue);


       
    }
    
    public static int ID_EnderNugget;
    
    public static void InitConfigItems(Configuration config)
    {
        int id = 3333;
        ID_EnderNugget = config.getItem(config.CATEGORY_ITEM, "Ender Nugget", id++).getInt();
    }



}
