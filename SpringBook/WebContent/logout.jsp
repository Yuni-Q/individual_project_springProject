<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>logout</title>
</head>
<body>
<%
// 로그인 성공 했으면 로그인 성공 페이지 말고 걍 메인으로 보내기
	response.sendRedirect("/SpringBook/");
%>
</body>
</html>