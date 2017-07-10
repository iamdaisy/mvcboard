package article.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import article.models.ArticleDAO;
import article.models.ArticleDAOImpl;
import article.models.ArticleVO;

public class ArticleUpdateAction extends AbstractController {
	
	

	@Override
	public ModelAndeView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
		long no = Long.parseLong(request.getParameter("no"));
		String name = request.getParameter("name");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String pwd = request.getParameter("pwd");
		
		ArticleVO articleVO = new ArticleVO();
		articleVO.setNo(no);
		articleVO.setName(name);
		articleVO.setTitle(title);
		articleVO.setContent(content);
		articleVO.setPwd(pwd);
		
		
		ArticleDAO articleDAO = ArticleDAOImpl.getInstance();
		ModelAndeView mav = new ModelAndeView("/WEB-INF/views/result.jsp");
		
		
		try {
			articleDAO.updateArticle(articleVO);
			mav.addObject("msg", "글 수정 성공");
			mav.addObject("url", "detail?no=" + no);
		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("msg", e.getMessage());
			mav.addObject("url", "javascript:history.back();");
			
		}
		return mav;
		
	}

}
