package kr.co.farmstory2.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import kr.co.farmstory2.vo.TermsVO;
import kr.co.farmstory2.vo.UserVO;

@Mapper
@Repository
public interface UserDAO {
	
	public int insertUser(UserVO vo);
	public void selectUser();
	public void selectUsers();
	
	public TermsVO selectTerms();
	
	public int countUid(String uid);
	
	public int countNick(String nick);
	
	public void updateUser();
	public void deleteUser();
	
}
