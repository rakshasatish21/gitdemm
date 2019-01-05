package com.log4j;

import org.apache.log4j.Logger;

public class Log4j_Project {
	public static void main(String[] args) {
		System.out.println("Log4j project");
		Logger log=Logger.getLogger("Log4j");
		log.info("Log4j is working..");
		log.error("Some error..");
	}

}
