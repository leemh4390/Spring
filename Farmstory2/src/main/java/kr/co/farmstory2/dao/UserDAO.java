package kr.co.farmstory2.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import kr.co.farmstory2.vo.TermsVO;

@Mapper
@Repository
public interface UserDAO {
	
	public void insertUser();
	public void selectUser();
	public void selectUsers();
	
	public TermsVO selectTerms();
	
	public int countUid(String uid);
	
	public void updateUser();
	public void deleteUser();
	
}
