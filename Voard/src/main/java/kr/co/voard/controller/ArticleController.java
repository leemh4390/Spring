package kr.co.voard.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;
import kr.co.voard.service.ArticleService;
import kr.co.voard.vo.ArticleVO;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ArticleController {
	
	@Autowired
	private ArticleService service;
	
	@PostMapping("/write")
	public int insertArticle(@RequestBody ArticleVO vo, HttpServletRequest req){
		String regip = req.getRemoteAddr();
		vo.setRegip(regip);
		int result = service.insertArticle(vo);
		
		return result;
	}
	
	@GetMapping("/list")
	public Map<String, Object> selectArticles(String pg){
		
		int currentPage = service.getCurrentPage(pg);
		int start = service.getLimitStart(currentPage);
		
		int total = service.selectCountTotal();
		int lastPageNum = service.getLastPageNum(total);
		int pageStartNum = service.getPageStartNum(total, start);
		int groups[] = service.getPageGroup(currentPage, lastPageNum);
		
		List<ArticleVO> articles = service.selectArticles(start);
		
		/*model.addAttribute("articles", articles);
		model.addAttribute("currentPage", currentPage);
		model.addAttribute("lastPageNum", lastPageNum);
		model.addAttribute("pageStartNum", pageStartNum);
		model.addAttribute("groups", groups);*/
		
		Map<String, Object> resultmapMap = new HashMap<>();
		
		resultmapMap.put("articles", articles);
		resultmapMap.put("currentPage", currentPage);
		resultmapMap.put("lastPageNum", lastPageNum);
		resultmapMap.put("pageStartNum", pageStartNum);
		resultmapMap.put("groups", groups);
		
		return resultmapMap;
	}
	
	
	
}
