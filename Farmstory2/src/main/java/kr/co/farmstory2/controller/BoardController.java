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
	
    @GetMapping("board/modify")
    public String modify(Model model, String group, String cate){
        model.addAttribute("group", group);
        model.addAttribute("cate", cate);
        return "board/modify";
    }

    @GetMapping("board/view")
    public String view(Model model, String group, String cate){
        model.addAttribute("group", group);
        model.addAttribute("cate", cate);
        return "board/view";
    }

    @GetMapping("board/write")
    public String write(Model model, String group, String cate){
        model.addAttribute("group", group);
        model.addAttribute("cate", cate);
        return "board/write";
    }
}
