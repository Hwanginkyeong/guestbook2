<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<%
	String stringNo = (String)request.getAttribute("stringNo");
	int no =  Integer.parseInt(request.getParameter("no"));
	System.out.println(no);
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
		<br>
		<form action="/guestbook2/gbc" method="get">	
				비밀번호 <input type="password" name="password" values="">
				<input type="text" name="action" value="delete">
				<input type="text" name="no" value="<%=no%>">
				<button type="submit">확인</button>
	</form>
		<br>
		<a href="/guestbook2/gbc?action=addlist">메인으로 돌아가기</a>
		
</body>
</html>
