<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>DateJSP</title>
</head>
<body>
	<hr>
	<h2>DateJSP</h2>
	<%
		response.setHeader("Refresh", "1");
	%>
	<br> 現在時間：<%=new Date()%>
	<%
		out.print("<br>");
		out.print((int) (Math.random() * 10000));
	%>
</body>
</html>