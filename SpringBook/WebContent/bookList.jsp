<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<body>
	<center>
		<form action="bookList.do">
			<input type="text" name="keyword"> <input type="submit"
				value="검색">
		</form>

	</center>
	<c:forEach items="${bookList}" var="b">
		<form action="/SpringBook	/writeForm.do" method="post">
			<table border="1" align="center">
				<tr>
					<td rowspan="2" width="100" align="center">
					<input type="hidden" name="image" size="10" value="${b.image}">
					 <img name=image src="${b.image}">
					</td>
					<td colspan="4" width="800" align="center"><input type="text" 
						name="title" size="90" value="${b.title}"></td>
				</tr>
				<tr>
					<td width="200" align="center"><input type="text"
						name="author" size="10" value="${b.author}"></td>
					<td width="200" align="center"><input type="text"
						name="publisher" size="10" value="${b.publisher}"></td>
					<td width="200" align="center"><input type="text"
						name="pubdate" size="10" value="${b.pubdate}"></td>
					<td colspan="4" align="right"><a href="main.jsp">main으로</a> <input
						type="submit" value="작성"></td>
				</tr>
			</table>
		</form>

	</c:forEach>
</body>
</html>