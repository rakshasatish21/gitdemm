package ty;

import org.apache.log4j.Logger;

public class Log4j {
	

	public static void main(String[] args) {
		System.out.println("working");
		
		Logger logs = Logger.getLogger("Log4j");
		logs.info("log4j fine");
		logs.info("log4j fine");
		logs.info("log4j fine");
		logs.info("log4j fine");
		logs.info("log4j fine");
		System.out.println("log4j working....");
		logs.info("log4j fine");
	}

}
