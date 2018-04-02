<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<html>
<head>
<title>index.jsp</title>
	<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no">
    <title>index.jsp</title>
    <script type="text/javascript" src="https://openapi.map.naver.com/openapi/v3/maps.js?clientId=Z7v2W6Im79RkF7XilfcJ"></script>
</head>
<body>
	<h2>이곳은 메인 화면입니다.</h2>
	<c:if test="${empty sessionScope.loginId}">
	<form action="login.do" method="post">
		<table border="1">
			<tr>
				<td>아이디:</td>
				<td>
					<input type="text" name="userId">
				</td>
			</tr>
			<tr>
				<td>패스워드:</td>
				<td>
					<input type="password" name="userPw">
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="로그인">
				</td>
			</tr>
		</table>
	</form>
	<hr>
	
		<a href="joinForm.do">
			<button>회원가입</button>
		</a>
		<a href="joinForm.do">
			<button>ip/pw 찾기</button>
		</a>
	</c:if>
	<c:if test="${not empty sessionScope.loginId}">
		<%
	response.sendRedirect("/SpringBook/main.jsp");
		%>
	</c:if>
	<hr>

</body>
</html>