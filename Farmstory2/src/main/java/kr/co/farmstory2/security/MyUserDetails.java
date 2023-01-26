package kr.co.farmstory2.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class MyUserDetails implements UserDetails{@Override
	
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		//계정이 갖는 권한 목록 리턴
		List<GrantedAuthority> authorities = new ArrayList<>();
		return authorities;
	}

	@Override
	public String getPassword() {
		// 계정이 가지는 비밀번호
		return null;
	}

	@Override
	public String getUsername() {
		// 계정이 갖는 아이디
		return null;
	}

	@Override
	public boolean isAccountNonExpired() {
		// 계정 만료 여부
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// 계정 잠긴 여부
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// 계정 비밀번호 만료 여부
		return true;
	}

	@Override
	public boolean isEnabled() {
		// 계정 활성화 여부
		return true;
	}
	
	

}
