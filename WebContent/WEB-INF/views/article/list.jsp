<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="shortcut icon" href="/favicon.ico" />
<style type="text/css">
table.type08 {
    border-collapse: collapse;
    text-align: left;
    line-height: 1.5;
    border-left: 1px solid #ccc;
    margin: 20px 10px;
}

table.type08 thead th {
    padding: 10px;
    font-weight: bold;
    border-top: 1px solid #ccc;
    border-right: 1px solid #ccc;
    border-bottom: 2px solid #c00;
    background: #dcdcd1;
}
table.type08 tbody th {
    width: 150px;
    padding: 10px;
    font-weight: bold;
    vertical-align: top;
    border-right: 1px solid #ccc;
    border-bottom: 1px solid #ccc;
    background: #ececec;
}
table.type08 td {
    width: 350px;
    padding: 10px;
    vertical-align: top;
    border-right: 1px solid #ccc;
    border-bottom: 1px solid #ccc;
}

</style>
</head>
<body>
<table class="type08">
	<caption>게시물 리스트</caption>
<thead>
<tr>
	<th scope="cols">번호</th>
	<th scope="cols">제목</th>
	<th scope="cols">작성자</th>
	<th scope="cols">작성일</th>
	<th scope="cols">조회수</th>
</tr>
</thead>
<tbody>
<c:forEach items="${list}" var="vo"> 
<tr>
	<td>${vo.no}</td>
	<td><a href="detail?no=${vo.no}">${vo.title}</a></td>
	<td>${vo.name}</a></td>
	<td>${vo.regdate}</td>
	<td>${vo.viewcount}</td>
</tr>
</c:forEach>
<tr>
	<td colspan="5"> ${pageNation.display}
	
	
	
	
<%-- 	<c:choose>
		<c:when test="${startPage == 1}"> [이전블럭] </c:when>
		<c:otherwise>
			<a href="list?pg=${startPage - 1}"> [이전블럭] </a>
		</c:otherwise>
	</c:choose>
	
	
	<c:forEach var="p" begin="${startPage}" end="${endPage}" >
		<c:if test="${p != pg}">
			<a href="list?pg=${p}">${p}</a>
		</c:if>
		<c:if test="${p == pg}">
			${p}
		</c:if>
	</c:forEach>

	<c:choose>
		<c:when test="${endPage == pageCount}"> [다음블럭] </c:when>
		<c:otherwise>
			<a href="list?pg=${endPage + 1}"> [다음블럭] </a>
		</c:otherwise>
	</c:choose>
 --%>


	
	
<!-- 	
	if(startPage == 1) {
		[이전블럭]
	 } else { 
		<a href="list.jsp?pg==startPage - 1 ">[이전블럭]</a>
	} 
	
			for(long p=startPage; p <= endPage; p++) { %>
				 if (p == pg) { 
					p 
				 } else {
				<a href="list.jsp?pg==p ">p</a>
				 } 
	      } 
	     
	      if(endPage == pageCount) { 
	     	[다음블럭]
	      } else {
	     	<a href="list.jsp?pg=endPage + 1">[다음블럭]</a>
	     }  -->

	</td>
</tr>
</tbody>
</table><br/>
<a href="insert">글쓰기</a><br/>
</body>
</html>