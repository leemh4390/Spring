package kr.co.farmstory2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.farmstory2.dao.UserDAO;
import kr.co.farmstory2.repo.UserRepo;
import kr.co.farmstory2.vo.TermsVO;

@Service
public class UserService {
	
	@Autowired
	private UserDAO dao;
	
	@Autowired
	private UserRepo repo;
	
	public void insertUser() {}
	public void selectUser() {}
	public void selectUsers() {}
	
	public TermsVO selectTerms() {
		return dao.selectTerms();
	}
	
	public int countUid(String uid) {
		return dao.countUid(uid);
	}
	
	public void updateUser() {}
	public void deleteUser() {}

}
