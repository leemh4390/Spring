package kr.co.farmstory2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.farmstory2.service.ArticleService;
import kr.co.farmstory2.vo.ArticleVO;

@Controller
public class ArticleController {
	
	@Autowired
	private ArticleService service;
	
	@PostMapping("/board/write")
	public String insertArticle(ArticleVO vo) {
		service.insertArticle(vo);
		return "/index";
	}

}
