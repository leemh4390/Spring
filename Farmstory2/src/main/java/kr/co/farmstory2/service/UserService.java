package kr.co.farmstory2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import kr.co.farmstory2.dao.UserDAO;
import kr.co.farmstory2.repo.UserRepo;
import kr.co.farmstory2.vo.TermsVO;
import kr.co.farmstory2.vo.UserVO;

@Service
public class UserService {
	
	@Autowired
	private UserDAO dao;
	
	@Autowired
	private UserRepo repo;
	
	@Autowired
	private PasswordEncoder encode;
	
	public int insertUser(UserVO vo) {
		vo.setPass(encode.encode(vo.getPass2()));
		int result = dao.insertUser(vo);
		
		return result;
		
	}
	public void selectUser() {}
	public void selectUsers() {}
	
	public TermsVO selectTerms() {
		return dao.selectTerms();
	}
	
	public int countUid(String uid) {
		return dao.countUid(uid);
	}
	
	public int countNick(String nick) {
		return dao.countNick(nick);
	}
	
	public void updateUser() {}
	public void deleteUser() {}

}
