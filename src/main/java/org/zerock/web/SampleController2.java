package org.zerock.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController2 {
	
	private static final Logger logger = LoggerFactory.getLogger(SampleController2.class);
	
	String domain = "";
	
	public void loggerTest(String log) {
		
		logger.info("[ "+log+" is called ]");
		
	}
	@RequestMapping("SampleController2")
	public String testList( @ModelAttribute("msg") String msg) {
		loggerTest("SampleController2");
		return "SampleController2";
	}
	
}
