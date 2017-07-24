package watson.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import article.controllers.AbstractController;
import article.controllers.ModelAndeView;

public class Text2SpeechAction extends AbstractController{
    private static Logger logger = LoggerFactory.getLogger(Text2SpeechAction.class);
    
    @Override
    public ModelAndeView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
        String statement = request.getParameter("statement");
        String voice = request.getParameter("voice");
        
        logger.info("statement : " + statement);
        logger.info("voice : " + voice);
        
        return null;
    }

}