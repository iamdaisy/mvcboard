package article.controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import article.models.ArticleDAO;
import article.models.ArticleDAOImpl;

public class PageNation {
	
	private static Logger logger = 
			LoggerFactory.getLogger(PageNation.class);
	
	long pg = 1;
	long pageCount = 0;						// 전체 페이지 수 
	long totalCount = 0; 					// 전체 게시물 수
	long blockSize = 10;					// 한페이지에서 출력할 페이지 수
	int pageSize = 10; 						// 페이지당 출력할 게시물 수
	long startPage = 0; 					// 페이지 블럭 시작 페이지
	long endPage = 0;   					// 페이지 블럭 끝페이지
	
	long startnum = 0;  
	long endnum = 0;    
	private StringBuffer display = new StringBuffer();
	
	public PageNation(long pg) throws Exception {
		this.pg = pg;
		startnum = (pg - 1) * pageSize + 1;
		endnum = pg * pageSize;
		startPage =  (pg - 1)/blockSize * blockSize + 1;
		endPage =  (pg - 1)/blockSize * blockSize + blockSize;
		
		ArticleDAO articleDAO = ArticleDAOImpl.getInstance();
		totalCount = articleDAO.getTotalCount();
		pageCount = totalCount/ pageSize;				
		if(totalCount % pageSize != 0) {
			pageCount ++;
		}
		if(pageCount <endPage) endPage = pageCount;
		
		display.append("<ul class='pagination'>");
		if (startPage == 1) {
			display.append("<li><a>[이전블럭]</a></li>");
		} else {
			display.append("<li><a href='list?pg=" + (startPage - 1) + "'>[이전블럭]</a></li>");
		}
		for(long p = startPage; p <= endPage; p++) {
			if (p == pg) {
				display.append("<li class=\"active\"><a>" + p + "</a></li>");
			} else {
				display.append("<li><a href='list?pg="+ p + "'>" + p + "</a></li>");
			}
		}
		if (endPage == pageCount) {
			display.append("<li><a>[다음블럭]</a></li>");
		} else {
			display.append("<li><a href='list?pg=" + (endPage + 1) + "'>[다음블럭]</a></li>");
		}
		display.append("</ul>");
	}

	public long getPg() {
		return pg;
	}

	public void setPg(long pg) {
		this.pg = pg;
	}

	public long getPageCount() {
		return pageCount;
	}

	public void setPageCount(long pageCount) {
		this.pageCount = pageCount;
	}

	public long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
	}

	public long getBlockSize() {
		return blockSize;
	}

	public void setBlockSize(long blockSize) {
		this.blockSize = blockSize;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public long getStartPage() {
		return startPage;
	}

	public void setStartPage(long startPage) {
		this.startPage = startPage;
	}

	public long getEndPage() {
		return endPage;
	}

	public void setEndPage(long endPage) {
		this.endPage = endPage;
	}

	public long getStartnum() {
		return startnum;
	}

	public void setStartnum(long startnum) {
		this.startnum = startnum;
	}

	public long getEndnum() {
		return endnum;
	}

	public void setEndnum(long endnum) {
		this.endnum = endnum;
	}

	public StringBuffer getDisplay() {
		return display;
	}

	public void setDisplay(StringBuffer display) {
		this.display = display;
	}

	@Override
	public String toString() {
		return "PageNation [pg=" + pg + ", pageCount=" + pageCount + ", totalCount=" + totalCount + ", blockSize="
				+ blockSize + ", pageSize=" + pageSize + ", startPage=" + startPage + ", endPage=" + endPage
				+ ", startnum=" + startnum + ", endnum=" + endnum + ", display=" + display + "]";
	}
}
