package grayz.dimensionenhanced.common.handlers;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import grayz.dimensionenhanced.common.block.BlockCompressedEnder;
import grayz.dimensionenhanced.common.block.BlockEnderCobblestone;
import grayz.dimensionenhanced.common.block.BlockEnderDirt;
import grayz.dimensionenhanced.common.block.BlockEnderGrass;
import grayz.dimensionenhanced.common.block.BlockEnderPortal;
import grayz.dimensionenhanced.common.block.BlockEnderStone;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPortal;

public class BlockHandler
{
    
    public static ConfigHandler id;
    public static Block enderDirt;
    public static Block enderGrass;
    public static Block enderStone;
    public static Block enderCobblestone;
    public static BlockPortal enderPortal;
    public static Block compressedEnder;
    
    public static void init()
    {

        enderDirt = new BlockEnderDirt(id.ID_EnderDirt).setUnlocalizedName("enderDirt");
        enderGrass = new BlockEnderGrass(id.ID_EnderGrass).setUnlocalizedName("enderGrass");
        enderStone = new BlockEnderStone(id.ID_EnderStone).setUnlocalizedName("enderStone");
        enderCobblestone = new BlockEnderCobblestone(id.ID_EnderCobblestone).setUnlocalizedName("enderCobble");
        enderPortal = (BlockPortal) new BlockEnderPortal(id.ID_EnderPortal).setUnlocalizedName("enderPortal");
        compressedEnder = new BlockCompressedEnder(id.ID_CompressedEnder).setUnlocalizedName("compressedEnder");

        
        LanguageRegistry.addName(enderDirt, "Ender Dirt");
        LanguageRegistry.addName(enderGrass, "Ender Grass");
        LanguageRegistry.addName(enderStone, "Ender Stone");
        LanguageRegistry.addName(enderCobblestone, "Ender Cobblestone");
        LanguageRegistry.addName(compressedEnder, "Compressed Ender");
        
        GameRegistry.registerBlock(enderDirt, "grayz_enderDirt");
        GameRegistry.registerBlock(enderGrass, "grayz_EnderGrass");
        GameRegistry.registerBlock(enderStone, "grayz_enderStone");
        GameRegistry.registerBlock(enderCobblestone, "grayz_enderCobblestone");
        GameRegistry.registerBlock(enderPortal, "grayz_enderPortal");
        GameRegistry.registerBlock(compressedEnder, "grayz_compressedEnder");
    }
}