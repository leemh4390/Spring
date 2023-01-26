package kr.co.farmstory2.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.co.farmstory2.vo.UserVO;

@Repository
public interface UserRepo extends JpaRepository<UserVO, String>{
	
	public int countByUid(String uid);

}
