package grayz.dimensionenhanced.common.dimension;

import grayz.dimensionenhanced.common.handlers.BlockHandler;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenEnder extends BiomeGenBase
{
    public BiomeGenEnder(int var1)
    {
        super(var1);
        this.setBiomeName("Ender");
        this.spawnableCreatureList.clear();
        this.spawnableMonsterList.clear();
        this.topBlock = (byte)BlockHandler.enderGrass.blockID;
        this.fillerBlock = (byte)BlockHandler.enderDirt.blockID;
    }
}
