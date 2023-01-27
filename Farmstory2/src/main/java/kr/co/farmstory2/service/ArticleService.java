package kr.co.farmstory2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.farmstory2.dao.ArticleDAO;
import kr.co.farmstory2.vo.ArticleVO;

@Service
public class ArticleService {
	
	@Autowired
	private ArticleDAO dao;
	
	public void insertArticle(ArticleVO vo) {
		dao.insertArticle(vo);
	}
	public void selectArticle() {}
	public void selectArticles() {}
	public void updateArticle() {}
	public void deleteArticle() {}

}
