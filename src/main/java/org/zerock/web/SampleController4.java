package org.zerock.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.ProductVO;

@Controller
@RequestMapping("SampleController4")
public class SampleController4 {
	
	private static final Logger logger = LoggerFactory.getLogger(SampleController4.class);
	
	String domain = "";
	
	public void loggerTest(String log) {
		
		logger.info("[ "+log+" is called ]");
		
	}
	
	@RequestMapping("TEST1")
	public String TEST1(RedirectAttributes rttr) {
		loggerTest("SampleController4/TEST1");
		
		rttr.addFlashAttribute("msg", "This is The Message!! with redirected.");
		
		return "redirect:/SampleController4/TEST2";
	}
	
	@RequestMapping("TEST2")
	public void TEST2(@ModelAttribute String msg) {
		loggerTest("SampleController4/TEST2");
//		return "redirect:/SampleController4/TEST2";
	}
	
}
