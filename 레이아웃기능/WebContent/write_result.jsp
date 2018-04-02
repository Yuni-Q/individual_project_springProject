<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<title>write_result.jsp</title>
<link href="css/agency.css" rel="stylesheet">
</head>
<body>
	<jsp:include page = "list.jsp"/> 
	
	<article>
글쓰기 실행 결과 : ${writeResult}<br>
<a href="board.do">[목록으로]</a>
</article>
</body>
</html>