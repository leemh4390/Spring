package kr.co.farmstory2.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import kr.co.farmstory2.entity.UserEntity;
import kr.co.farmstory2.repo.UserRepo;

@Service
public class SecurityUserService implements UserDetailsService{
	
	@Autowired
	private UserRepo repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		UserEntity user = repo.findById(username).get();
		
		if(user == null) {
			throw new UsernameNotFoundException(username);
		}
		
		UserDetails userDts = MyUserDetails.builder()
							  .user(user)
							  .build();
		
		return userDts;
	}

}
