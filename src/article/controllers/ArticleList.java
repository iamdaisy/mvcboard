package article.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import article.models.ArticleDAO;
import article.models.ArticleDAOImpl;
import article.models.ArticleVO;
import article.models.PageVO;

public class ArticleList extends AbstractController {

	@Override
	public ModelAndeView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
		
		long pg = 1;
		try{
			pg=Long.parseLong(request.getParameter("pg"));
		} catch (Exception e) {}
		
		int pageSize = 10; //페이지당 출력할 게시물 수
		long startnum = (pg - 1) * pageSize + 1;
		long endnum = pg * pageSize;
		PageVO pageVO = new PageVO(startnum, endnum);
		
		
		ArticleDAO articleDAO = ArticleDAOImpl.getInstance();
		
		ModelAndeView mav = new ModelAndeView();
		try {
			List<ArticleVO> list = articleDAO.getArticleList(pageVO);
			mav.setViewName("/WEB-INF/views/article/list.jsp");
			mav.addObject("list", list);
			
		} catch (Exception e) {
			e.printStackTrace();
			mav.setViewName("/WEB-INF/views/result.jsp");
			mav.addObject("url", "게시물 리스트 출력에러\n관리자에게 문의하세요.");
			mav.addObject("url", "test");
		}
		return mav;
	}
	

}
