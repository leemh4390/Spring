package kr.co.farmstory2.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.farmstory2.service.UserService;
import kr.co.farmstory2.vo.TermsVO;

@Controller
public class UserController {
	
	@Autowired
	private UserService service;
	
	@GetMapping("user/login")
	public String login() {
		return "user/login";
	}
	
	@GetMapping("user/register")
	public String register() {
		return "user/register";
	}
	
	@GetMapping("user/terms")
	public String terms(Model model) {
		TermsVO vo = service.selectTerms();
		model.addAttribute("vo", vo);
		return "user/terms";
	}
	
	@ResponseBody
	@GetMapping("user/countUid")
	public Map<String, Integer> countUid(String uid) {
		int result = service.countUid(uid);
		Map<String, Integer> map = new HashMap<>();
		map.put("result", result);
		return map;
	}
}
