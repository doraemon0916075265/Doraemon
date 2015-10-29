<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>取得表單 - Checkbox</title>
</head>
<body>
	<center>
		<h1>取得表單 - Checkbox</h1>
		<ul>
			<li><p>
					<b> 蘋果 Flag : </b>
					<%=request.getParameter("apple")%>
				</p></li>
			<li><p>
					<b> 香蕉 Flag: </b>
					<%=request.getParameter("banana")%>
				</p></li>
			<li><p>
					<b> 橘子 Flag: </b>
					<%=request.getParameter("orange")%>
				</p></li>
		</ul>
	</center>
</body>
</html>