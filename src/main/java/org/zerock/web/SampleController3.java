package org.zerock.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.ProductVO;

@Controller
@RequestMapping("SampleController3")
public class SampleController3 {
	
	private static final Logger logger = LoggerFactory.getLogger(SampleController3.class);
	
	String domain = "";
	
	public void loggerTest(String log) {
		
		logger.info("[ "+log+" is called ]");
		
	}
	
	@RequestMapping("SAMPLE")
	public String testList(Model model) {
		loggerTest("SampleController3/SAMPLE");
		
		//Make Sample Data
		ProductVO product = new ProductVO("Sample Product", 10000);
		
		loggerTest("SAMPLE");
		
		model.addAttribute(product);
		
		return "SampleController3";
	}
	
}
