<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>read.jsp</title>
<link href="css/agency.css" rel="stylesheet">
</head>
<body>
<jsp:include page = "list.jsp"/> 

<article>
	<table border="1">
		<tr>
			<td>글번호:</td>
			<td>${board.articleNum}</td>
		</tr>
		<tr>
			<td>제목:</td>
			<td>${board.title}</td>
		</tr>
		<tr>
			<td>작성자:</td>
			<td>${board.writer}</td>
		</tr>
		<tr>
			<td>작성일:</td>
			<td>${board.writeDate}</td>
		</tr>
		<tr>
			<td>내용:</td>
			<td>${board.content}</td>
		</tr>
	</table>
	<a href="board.do">[목록으로]</a>
	<c:if test="${sessionScope.loginId == board.writer}">
		<a href="updateForm.do">[수정하기]</a>
		<a href="updateForm.do">[삭제하기]</a>
	</c:if>
	</article>
</body>
</html>






