package kr.co.oauth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OauthController {
	
	@GetMapping("member/login")
	public String login() {
		return "member/login";
	}

}
