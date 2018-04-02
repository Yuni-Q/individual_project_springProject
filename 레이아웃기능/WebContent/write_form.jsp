<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<title>write_form.jsp</title>
<link href="css/agency.css" rel="stylesheet">
</head>
<body>
<jsp:include page = "list.jsp"/> 

<article>
<form action="write.do" method="post">
	<table border="1">
		
		<tr>
	                <td rowspan="2" width="100" align="center">
	                	<input type="text" name="image" size="30" required="required" placeholder="사진을 넣어주세요." formtarget="">
	                </td>
	                <td colspan="3" width="800" align="center">
						<input type="text" name="title" size="90" required="required" value="${b.title}">
					</td>
	            </tr>
	            <tr>
	            	<td width="200" align="center">
						<input type="text" name="pubdate" size="30" required="required" placeholder="저자를 입력하세요">
					</td>
	                <td width="200" align="center">
	                	<input type="text" name="pubdate" size="30" required="required" placeholder="출판사를 입력하세요.">
	                </td>
	                <td width="200" align="center">
	                	<input type="text" name="pubdate" size="30" required="required" placeholder="출판년도를 출력하세요.">
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
</article>
</body>
</html>