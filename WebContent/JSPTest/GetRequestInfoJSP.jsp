<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"："http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>GetAddress</title>
</head>
<body>
	<%
		out.println("RequestURI：" + request.getRequestURI() + "<br>");
		out.println("：" + request.getCookies() + "<br>");

		out.print("<hr>Remote：<br>");
		out.println("RemoteHost：" + request.getRemoteHost() + "<br>");
		out.println("RemotePort：" + request.getRemotePort() + "<br>");
		out.println("你的 IP：" + request.getRemoteAddr() + "<br>");

		out.print("<hr>Local：<br>");
		out.println("LocalAddr：" + request.getLocalAddr() + "<br>");
		out.println("LocalName：" + request.getLocalName() + "<br>");
		out.println("LocalPort：" + request.getLocalPort() + "<br>");

		out.print("<hr>Server：<br>");
		out.println("ServerName：" + request.getServerName() + "<br>");
		out.println("ServerPort：" + request.getServerPort() + "<br>");

		out.print("<hr>Session：<br>");
		out.println("Session：" + request.getSession() + "<br>");
		out.println("RequestedSessionId：" + request.getRequestedSessionId() + "<br>");
		out.println("changeSessionId：" + request.changeSessionId() + "<br>");
		out.println("RequestedSessionId：" + request.getRequestedSessionId() + "<br>");
	%>

</body>
</html>