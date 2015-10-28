<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>九九乘法表</title>
</head>
<body>

	<c:forEach var="x" begin="1" end="9">
		<c:forEach var="y" begin="1" end="9" varStatus="yvs">
			<c:out value="${x}"></c:out>*<c:out value="${y}"></c:out>=<c:out value="${x*y}"></c:out>
			<c:choose>
				<c:when test="${yvs.index>5}">
					<c:out value="QQ${yvs.index}"></c:out>
				</c:when>
			</c:choose>
		</c:forEach>
		<%
			out.print("<br>");
		%>
	</c:forEach>
</body>
</html>