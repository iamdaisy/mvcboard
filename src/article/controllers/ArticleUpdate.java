package article.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import article.models.ArticleDAO;
import article.models.ArticleDAOImpl;
import article.models.ArticleVO;

public class ArticleUpdate extends AbstractController {
	private static Logger logger = Logger.getLogger(ArticleUpdate.class);
	
	public ModelAndeView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
		
		
		ArticleDAO articleDAO = ArticleDAOImpl.getInstance();
		try {
			long no = Long.parseLong(request.getParameter("no"));
			ArticleVO articleVO = articleDAO.getDetail(no);
			return new ModelAndeView("/WEB-INF/views/article/update.jsp", "articleVO", articleVO);
			
		} catch (Exception e) {
			e.printStackTrace();
			ModelAndeView mav = new ModelAndeView("/WEB-INF/views/result.jsp");
			mav.addObject("msg", e.getMessage());
			mav.addObject("url", "list");
			return mav;
		}
		
	}

}
