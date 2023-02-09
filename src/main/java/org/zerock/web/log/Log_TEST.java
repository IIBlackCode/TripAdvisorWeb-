package org.zerock.web.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log_TEST {
	
	private static final Logger logger = LoggerFactory.getLogger(Log_TEST.class);
	
	public void loggerTest(String log) {
		
		logger.info("[ "+log+" is called ]");
		
	}

}
