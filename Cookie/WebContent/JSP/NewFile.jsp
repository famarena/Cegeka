<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import= "java.io.PrintWriter" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> <%="Welcome user!" + request.getAttribute("user") %></h1>
<h2> 
<%
String username = null;
Cookie[] cookies = request.getCookies();

	for(Cookie c : cookies){
		username = c.getValue();
		out.println(username);
	}
%>
</h2>
</body>
</html>