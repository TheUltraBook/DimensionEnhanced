package grayz.dimensionenhanced.common.command;

import grayz.dimensionenhanced.common.handlers.DimensionHandler;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayerMP;

public class DimensionEnhancedCommand extends CommandBase
{
    @Override
    public String getCommandName() 
    {
        return "DimE";
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) 
    {
        if(args[0].matches("Ender"))
        {
            EntityPlayerMP playerMP = (EntityPlayerMP) sender;
            if(playerMP.dimension == 0)
                playerMP.travelToDimension(DimensionHandler.enderID);
            else
                playerMP.travelToDimension(0);
        }        
    }
}
