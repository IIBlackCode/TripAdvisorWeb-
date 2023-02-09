package org.zerock.web;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

//DataSourceTest 클래스 작성 page 120 20190529
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class TEST4_SampleControllerTest {
	
	@Inject
//	root-context.xml에 등록된 SqlSessionFactory 주입
	private SqlSessionFactory sqlFactory;
	
	private static final Logger logger = LoggerFactory.getLogger(TEST4_SampleControllerTest.class);
	
	@Inject
	private WebApplicationContext wac;
	
	private MockMvc mockMvc;
	
	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
		logger.info("setup..");
	}
	
	@Test
	public void SampleController1() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/SampleController1/test1"));
		mockMvc.perform(MockMvcRequestBuilders.get("/SampleController1/test2"));
		mockMvc.perform(MockMvcRequestBuilders.get("/SampleController1/test3"));
		mockMvc.perform(MockMvcRequestBuilders.get("/SampleController1/test4"));
		mockMvc.perform(MockMvcRequestBuilders.get("/SampleController1/test5"));
	}
	
	@Test
	public void SampleController() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/SampleController2"));
	}
	
	@Test
	public void SampleController3() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/SampleController3/SAMPLE"));
	}
	
	@Test
	public void SampleController4() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/SampleController4/TEST1"));
	}
	
	@Test
	public void SampleController5() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/SampleController5/doJSON_TEST"));
	}
}
