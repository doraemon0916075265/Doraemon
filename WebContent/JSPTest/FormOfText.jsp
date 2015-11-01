<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>文字表單</title>
</head>
<body>
	<center>
		<h1>文字表單</h1>
		<!-- 		<form action="GetTextParameter.jsp" method="GET"> -->
		<form action="GetAllParameterEnumeration.jsp" method="POST" target="_blank">
			First Name: <input type="text" name="first_name"><br> <br>Last Name: <input type="text" name="last_name" /><br> <br> <input type="submit" value="送出" />
		</form>
	</center>
</body>
</html>