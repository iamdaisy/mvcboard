package article.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class AbstractController {

	public abstract ModelAndeView handleRequestInternal(
			HttpServletRequest request, HttpServletResponse response);
	
}
