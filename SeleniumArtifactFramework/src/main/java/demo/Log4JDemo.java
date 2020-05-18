package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class Log4JDemo {
	
	private static Logger Logger = LogManager.getLogger(Log4JDemo.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("\n Hello World....!    \n");
			
			
			Logger.info("This is Information Message");
			Logger.error("This is Error Message");
			Logger.warn("This is Warning Message");
			Logger.fatal("This is Fatal Message");
			
			System.out.println("\n This is Completed \n");
			
	}

}
