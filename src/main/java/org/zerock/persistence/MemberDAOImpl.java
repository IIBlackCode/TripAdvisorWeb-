package org.zerock.persistence;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.zerock.domain.MemberVO;


//[page 134] Interface에 등록된 작업 Overriding으로 구현
//1. Interface로 실행할 작업 등록
//2. 실행할 쿼리문 Mapper 등록
//3. 해당 인터페이스를 Overriding으로 구현
@Repository
public class MemberDAOImpl implements MemberDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberDAO.class);
	
	@Inject
	private SqlSession sqlSession;

	private static final String namespace = "org.zerock.mapper.MemberMapper";
	
	
	@Override
	public String getTime() {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(namespace+".getTime");
	}

	@Override
	public void insertMember(MemberVO memberVO) {
		// TODO Auto-generated method stub
		sqlSession.insert(namespace+".insertMember",memberVO);
	}

	@Override
	public MemberVO readMember(String userid) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("readMember() Method Run..");
		MemberVO memberVO = sqlSession.selectOne(namespace+".selectMember",userid);
		System.out.println("The End of Read Member()");
		return memberVO;
	}

	@Override
	public MemberVO readWithPW(String userid, String userpw) throws Exception {
		// TODO Auto-generated method stub
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("userid", userid);
		paramMap.put("userpw", userpw);
		return sqlSession.selectOne(namespace+".readWithPW", paramMap);
	}
	
}
