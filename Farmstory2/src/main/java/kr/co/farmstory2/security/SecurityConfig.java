package kr.co.farmstory2.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		// 인가(접근권한 설정)
		http.authorizeRequests().antMatchers("/").permitAll();
		http.authorizeRequests().antMatchers("/list").hasAnyRole("2", "3", "4", "5"); 
		http.authorizeRequests().antMatchers("/write").hasAnyRole("3", "4", "5");
		http.authorizeRequests().antMatchers("/view").hasAnyRole("3", "4", "5");
		http.authorizeRequests().antMatchers("/modify").hasAnyRole("3", "4", "5");
		
		//사이트 위조 방지
		http.csrf().disable();
		
	}
	
	@Autowired
	private SecurityUserService service;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.userDetailsService(service).passwordEncoder(new BCryptPasswordEncoder());
	}
	
	@Bean
	public PasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}
	
}
