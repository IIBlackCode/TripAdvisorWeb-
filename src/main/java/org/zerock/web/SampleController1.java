package org.zerock.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.web.log.Log_TEST;

@Controller
@RequestMapping("SampleController1/")
public class SampleController1 {
	
//	private static final Logger logger = LoggerFactory.getLogger(SampleController1.class);
	
	String domain = "";
	Log_TEST log_t = new Log_TEST();
	
//	public void loggerTest(String log) {
//		
//		logger.info("[ "+log+" is called ]");
//		
//	}
	
	
	@RequestMapping("test1")
	public String test1() {
		domain = "test1";
//		loggerTest(domain);
		log_t.loggerTest(domain);
		return "redirect:/";
	}
	
	@RequestMapping("test2")
	public String test2() {
		domain = "test2";
//		loggerTest(domain);
		log_t.loggerTest(domain);
		return "redirect:/";
	}
	
	@RequestMapping("test3")
	public String test3() {
		domain = "test3";
//		loggerTest(domain);
		log_t.loggerTest(domain);
		return "redirect:/";
	}
	
	@RequestMapping("test4")
	public String test4() {
		domain = "test4";
//		loggerTest(domain);
		log_t.loggerTest(domain);
		return "redirect:/";
	}
	
	@RequestMapping("test5")
	public String test5() {
		domain = "test5";
//		loggerTest(domain);
		log_t.loggerTest(domain);
		return "redirect:/";
	}
	
	
}
