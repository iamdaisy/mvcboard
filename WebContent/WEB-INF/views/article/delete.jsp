<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="shortcut icon" href="/favicon.ico" />
</head>
<body>
<form action="deleteAction" method="post">
<table>
	<caption>게시물 삭제</caption>
	
<tr>
	<th>글번호</th>
	<td>${no}
		<input type="hidden" name="no"  value="${no}"/>
	</td>
</tr>	
<tr>
	<th>비밀번호</th>
	<td><input type="password" name="pwd" />
		<div style="color : red"> * 처음 글 등록시 입력한 패스워드를 재 입력하세요</div>
	</td>
</tr>
</table>
<input type="submit" value="삭제" />
</form>
</body>
</html>