package org.zerock.persistence;

import org.zerock.domain.MemberVO;

//[page 129] 실제로 실행해야 하는 작업을 Interface로 정의
// 1. Interface로 실행할 작업 등록
// 2. 실행할 쿼리문 Mapper 등록
// 3. 해당 인터페이스를 Overriding으로 구현 
public interface MemberDAO {
	
	//시간을 갖고오는 작업
	public String getTime();
	
	//INSERT 쿼리문 실행 작업 :
	public void insertMember(MemberVO memberVO);
	
	//[page 141 사용자 등록과 조회에 대한 처리]
	//userid로 user정보 조회
	public MemberVO readMember(String userid) throws Exception;
	//userid와 userPW로 user정보 조회
	public MemberVO readWithPW(String userid, String userpw) throws Exception;

}
