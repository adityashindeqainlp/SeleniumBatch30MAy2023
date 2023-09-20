package Log4j;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 * @Author -- Aditya Shinde Java + Selenium 18-Sep-2023 5:14:06 pm
 **/
public class demo1 {
	
	private static Logger logger = LogManager.getLogger(demo1.class);
	
	public static void main(String[] args) {
		
		System.out.println("Process start");
		
		System.out.println();
		
		logger.info("This is Information Log");
		logger.debug("This is a debug log");
		logger.error("This is error log");
		logger.fatal("This is a fatal log");
		logger.trace("This is a Trace Log");
		logger.warn("This is a warning log");
		logger.info("This is Information Log");
		logger.debug("This is a debug log");
		logger.error("This is error log");
		logger.fatal("This is a fatal log");
		logger.trace("This is a Trace Log");
		logger.warn("This is a warning log");
		logger.info("This is Information Log");
		logger.debug("This is a debug log");
		logger.error("This is error log");
		logger.fatal("This is a fatal log");
		logger.trace("This is a Trace Log");
		logger.warn("This is a warning log");
		
		System.out.println();
		
		System.out.println("Process End ");
		
	}
	
}
