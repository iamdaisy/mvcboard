<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ tablib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="vo" value="${articleVO}"> </c:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="shortcut icon" href="/favicon.ico" />
</head>
<body>
<table>
	<caption>게시물 상세보기</caption>
<tr>
	<th>글번호</th>
	<td>${vo.no}</td>
</tr>
<tr>
	<th>작성자</th>
	<td>${vo.name}</td>
</tr>
<tr>
	<th>제목</th>
	<td>${vo.title}</td>
</tr>
<tr>
	<th>내용</th>
	<td>${vo.content}</td>
</tr>
<tr>
	<th>날짜</th>
	<td>${vo.regdate}</td>
</tr>
<tr>
	<th>조회수</th>
	<td>${vo.viewcount}</td>
</tr>
</table><br/>
<a href="list">리스트</a>
<a href="update?no=${vo.no}">수정</a>
<a href="delete?no=${vo.no}">삭제</a>
</form>
</body>
</html>