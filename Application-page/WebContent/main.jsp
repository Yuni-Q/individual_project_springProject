<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<link href="css/agency.css" rel="stylesheet">
</head>
<body>
	<jsp:include page = "list.jsp"/> 
	
	<article>
		<%
		String id = request.getParameter("id");	
		%>
		<c:set var="content"><%=id%></c:set>
 
			 
		<c:if test="${not empty param.id}">
			
			<jsp:include page = "${content}"/> 
			
	    </c:if>
			
			


	
	</article>
</body>
</html>