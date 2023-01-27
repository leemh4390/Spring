package kr.co.farmstory2.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import kr.co.farmstory2.vo.ArticleVO;

@Mapper
@Repository
public interface ArticleDAO {
	
	public void insertArticle(ArticleVO vo);
	public void selectArtilce();
	public void selectArtilces();
	public void updateArtilce();
	public void deleteArtilce();
}
