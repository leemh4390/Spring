package kr.co.voard.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import kr.co.voard.vo.ArticleVO;
import kr.co.voard.vo.FileVO;

@Mapper
@Repository
public interface ArticleDAO {

	public int insertArticle(ArticleVO vo);
	public int insertFile(FileVO vo);
	public int selectCountTotal();
	public ArticleVO selectArticle(int no);
	public List<ArticleVO> selectArticles(int start);
	public FileVO selectFile(int fno);
	public int updateFileDownload(int fno);
	public void updateArticle(ArticleVO vo);
	public int deleteArticle(int no, String uid);
}
