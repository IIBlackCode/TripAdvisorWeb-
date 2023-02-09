package org.zerock.web;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.MemberVO;
//[page 137] 20190529
import org.zerock.persistence.MemberDAO;
import org.zerock.web.log.Log_TEST;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class TEST7_MemberDAOTest3 {
	
	@Inject
//	root-context.xml에 등록된 SqlSessionFactory 주입
	private MemberDAO memberDAO;
	
	private static final Logger logger = LoggerFactory.getLogger(TEST7_MemberDAOTest3.class);
	
	@Test 
	public void testReadMember1() throws Exception {
		
		MemberVO memberRead = new MemberVO();
		memberRead = memberDAO.readMember("testID_00");
		
		logger.info("[readMember] :",memberRead);
		System.out.println(memberRead);
	}
	
	@Test 
	public void readWithPW() throws Exception {
		
		MemberVO memberReadWithPW = new MemberVO();
		memberReadWithPW = memberDAO.readWithPW("testID_00", "testPW_00");
		
		logger.info("[readMember] :",memberReadWithPW);
		System.out.println(memberReadWithPW);
		
	}
}
