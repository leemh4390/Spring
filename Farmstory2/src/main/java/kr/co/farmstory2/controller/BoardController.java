package kr.co.farmstory2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {
	
	@GetMapping("introduction/hello")
	public String hello() {
		return "introduction/hello";
	}
	
	@GetMapping("introduction/direction")
	public String direciton() {
		return "introduction/direction";
	}
	
	
	@GetMapping("/board/list")
	public String list(Model model, String group, String cate) {
		model.addAttribute("cate",cate);
		model.addAttribute("group",group);
		return "board/list";
	}
	
	@GetMapping("/board/write")
	public String write() {
		return "/board/write";
	}	
	
	
	
	@GetMapping("/market/market")
	public String market() {
		return "/market/market";
	}
	
	@GetMapping("/croptalk/story")
	public String croptalk() {
		return "/croptalk/story";
	}
	
	@GetMapping("/event/evnet")
	public String event() {
		return "/event/evnet";
	}
	
	@GetMapping("/community/notice")
	public String commnuity() {
		return "/community/notice";
	}
}
