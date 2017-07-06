package article.models;

import java.util.List;

public interface ArticleDAO {

	void insertArticle(ArticleVO articleVO) throws Exception;
	List<ArticleVO> getArticleList() throws Exception;
	ArticleVO getDetail(long no) throws Exception;
	

}
