package com.shanghai.stock.OKcoinHuobi;

import java.util.Properties;

import org.apache.commons.logging.impl.Log4JLogger;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.chainsaw.Main;

public class LogTest {
	
	Logger logger = Logger.getLogger(LogTest.class);
	
	public LogTest(){
		logger.warn("error");
		
		logger.info("sss");
		
		logger.info("成交");
	}
	
	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		LogTest logTest = new LogTest();
		

	}
}
