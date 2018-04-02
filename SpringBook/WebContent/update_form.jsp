<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<title>update_form.jsp</title>
</head>
<body>

<form action="update.do" method="post">
	<table border="1">
		
		<tr>
	                <td rowspan="2" width="100" align="center">
	                	<input type="hidden" name="image" size="30" value="${image}">
	                	<input type="hidden" name="articleNum" size="30" value="${articleNum}">
	                	 <img name=image src="${image}">
	                </td>
	                <td colspan="3" width="800" align="center">
	                	<input type="text" name="title" size="90" required="required" value="${title}">
						
					</td>
	            </tr>
	            <tr>
	            	<td width="200" align="center">
						<input type="text" name="author" size="30" required="required" value="${author}">
					</td>
	                <td width="200" align="center">
	                	<input type="text" name="publisher" size="30" required="required" value="${publisher}">
	                </td>
	                <td width="200" align="center">
	                	<input type="text" name="pubdate" size="30" required="required" value="${pubdate}">
	            </tr>
		<tr>
			<td colspan="4">
				<textarea rows="30" cols="140" 
				placeholder="내용을 입력하세요." name="content" ></textarea>
			</td>
		</tr>
		<tr>
			<td colspan="4" align="right">
				 <a href="main.jsp">main으로</a> 
				 <input type="submit" value="작성완료">
			</td>
		</tr>
	</table>
</form>
</body>
</html>