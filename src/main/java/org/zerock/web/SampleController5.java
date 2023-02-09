package org.zerock.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.ProductVO;

@Controller
@RequestMapping("SampleController5")
public class SampleController5 {
	
	private static final Logger logger = LoggerFactory.getLogger(SampleController5.class);
	
	String domain = "";
	
	public void loggerTest(String log) {
		
		logger.info("[ "+log+" is called ]");
		
	}
	
	@RequestMapping("doJSON_TEST")
//	public @ResponseBody ProductVO doJSON_TEST() {
	public @ResponseBody ModelAndView doJSON_TEST() {
		
		ModelAndView model = new ModelAndView();
		
		
		loggerTest("SampleController5/doJSON_TEST");
		
		ProductVO vo = new ProductVO("Sample Product", 9999990);
		model.addObject("productVO", vo);
		
		return model;
		
	}
	
}
