<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>read.jsp</title>
<script>
function myFunction() {
    alert("2113543132132");
}
</script>
</head>
<body>
	<form action="updateForm.do" method="post">
		<table border="1">
			<tr>
				<td>글번호:</td>
				<td><input type="text" name="articleNum" size="10"	value="${board.articleNum}"> 
				
				</td>
			</tr>
			<tr>
				<td>제목:</td>
				<td>
				<input type="text" name="title" size="90" required="required" value="${board.title}">
				</td>
			</tr>
			<tr>
				<td>작성자:</td>
				<td>
				<input type="text" name="writer" size="90" required="required" value="${board.writer}">
				</td>
			</tr>
			<tr>
				<td>작성일:</td>
				<td>
				<input type="text" name="writeDate" size="90" required="required" value="${board.writeDate}">
				</td>
			</tr>
			<tr>
				<td>내용:</td>
				<td>
				<input type="text" name="content" size="90" required="required" value="${board.content}">
				</td>
			</tr>
			<tr>
				<td>작가:</td>
				<td>
				<input type="text" name="author" size="90" required="required" value="${board.author}">
				</td>
			</tr>
			<tr>
				<td>출판사:</td>
				<td>
				<input type="text" name="publisher" size="90" required="required" value="${board.publisher}">
				</td>
			</tr>
			<tr>
				<td>출판년도:</td>
				<td>
				<input type="text" name="pubdate" size="90" required="required" value="${board.pubdate}">
				</td>
			</tr>
			<tr>
				<td>이미지:</td>
				<td>
					<input type="hidden" name="image" size="10"
					value="${board.image}"> 	 
					<img name=image src="${board.image}">	
				</td>
			</tr>
			<tr>
				<td>
					 <input type="submit" value="수정하기">
					 <a href="delete.do?articleNum=${board.articleNum}">[삭제하기]</a>
				</td>
			</tr>
		</table>

	</form>
	<a href="board.do">[목록으로]</a>
	<c:if test="${sessionScope.loginId == board.writer}">
		
	</c:if>
</body>
</html>






