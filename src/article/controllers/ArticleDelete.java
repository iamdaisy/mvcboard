package article.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

public class ArticleDelete extends AbstractController {
	private static Logger logger = Logger.getLogger(ArticleDelete.class);
	
	public ModelAndeView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
		
	
			long no = Long.parseLong(request.getParameter("no"));
			return new ModelAndeView("/WEB-INF/views/article/delete.jsp", "no", no);
			
	
	}

}
