package kr.co.farmstory2;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@SpringBootApplication
public class Farmstory2Application {

	public static void main(String[] args) {
		SpringApplication.run(Farmstory2Application.class, args);
	}
	
	public String index(Principal principal) {
		
		if(principal != null) {
			// 로그인 했을 경우
			return "/index";
			
		}else {
			// 로그인 안했을 경우
			return "redirect:/user/login";
		}
		
		
		
		
	}
	
}
