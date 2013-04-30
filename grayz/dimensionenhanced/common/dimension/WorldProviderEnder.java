package grayz.dimensionenhanced.common.dimension;

import grayz.dimensionenhanced.common.DimensionEnhanced;
import grayz.dimensionenhanced.common.handlers.DimensionHandler;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

public class WorldProviderEnder extends WorldProvider
{
    public void registerWorldChunkManager()
    {
        this.worldChunkMgr = new WorldChunkManagerHell(BiomeGenBase.beach, 0.8F, 0.1F);
        this.dimensionId = DimensionHandler.enderDimension;
    }
    
    
    public String getDimensionName() 
    {
        return "Ender";
    }
    
    public boolean canRespawnHere()
    {
        return true;
    }
    
    @Override
    public IChunkProvider createChunkGenerator()
    {
        return new ChunkProviderEnder(worldObj, worldObj.getSeed(), true);
    }
}