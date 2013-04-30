package grayz.dimensionenhanced.common.handlers;

import java.util.logging.Level;
import java.util.logging.Logger;

import cpw.mods.fml.common.FMLLog;

public class LoggerHandler {
	private static Logger logger = Logger.getLogger("Dimension Enhanced");

	public static void init()
	{
		logger.setParent(FMLLog.getLogger());
	}

	public static void log(Level level, String message)
	{
		logger.log(level, message);
	}
}