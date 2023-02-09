package org.zerock.web;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.MemberVO;
//[page 137] 20190529
import org.zerock.persistence.MemberDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class TEST5_MemberDAOTest {
	
	@Inject
//	root-context.xml에 등록된 SqlSessionFactory 주입
	private MemberDAO memberDAO;
	
	@Test
	public void testTime() throws Exception{
		System.out.println(memberDAO.getTime());
	}
	
	@Test
	public void testInsertMember() throws Exception{
		
		MemberVO memberVO= new MemberVO();
		
		memberVO.setUserid("testID_01");
		memberVO.setUserpw("testPW_01");
		memberVO.setUsername("TestNAME_01");
//		memberVO.setUseremail("test2@test.com");
		memberVO.setEmail("test01@test.com");
		
		memberDAO.insertMember(memberVO);
	}

}
