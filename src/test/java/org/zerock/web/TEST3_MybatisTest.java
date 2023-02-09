package org.zerock.web;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//DataSourceTest 클래스 작성 page 88 20190529

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class TEST3_MybatisTest {
	
	@Inject
//	root-context.xml에 등록된 SqlSessionFactory 주입
	private SqlSessionFactory sqlFactory;
	
	@Test
	public void testFactory() throws Exception{
		
		if (sqlFactory.equals(null)) {
			System.out.println("root-context.xml에 등록된 sqlFactory 재확인 요구");
		}else {
			System.out.println("root-context.xml에 sqlSessionFactory 정상등록 확인");
			System.out.println("sqlFactory : " + sqlFactory);
		}
		
	}
	
	@Test
	public void testSession() throws Exception{
		try(SqlSession session = sqlFactory.openSession()) {
			System.out.println("session : " + session);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
}//The end of class
