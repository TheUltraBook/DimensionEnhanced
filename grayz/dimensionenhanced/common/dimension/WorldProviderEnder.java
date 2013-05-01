package grayz.dimensionenhanced.common.dimension;

import grayz.dimensionenhanced.common.handlers.DimensionHandler;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

public class WorldProviderEnder extends WorldProvider
{
    public void registerWorldChunkManager()
    {
        this.worldChunkMgr = new WorldChunkManagerHell(BiomeGenBase.desert, 0.8F, 0.1F);
        this.dimensionId = DimensionHandler.enderID;
    }
    
    
    public String getDimensionName() 
    {
        return "Ender";
    }
    
    public boolean canRespawnHere()
    {
        return false;
    }
    
    public String getSaveFolder()
    {
        return "Ender";
    }
    
  
    
    public boolean isSurfaceWorld()
    {
        return false;
    }
    
    
        
    public float calculateCelestialAngle(long var1, float var3)
    {
        return 0.5F;
    }
    
    @Override
    public IChunkProvider createChunkGenerator()
    {
        return new ChunkProviderEnder(worldObj, worldObj.getSeed(), true);
    }
}