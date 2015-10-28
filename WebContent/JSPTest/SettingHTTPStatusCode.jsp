<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Setting HTTP Status Code</title>
</head>
<body>
	<%
		//設置錯誤代碼，並說明原因
		response.sendError(404, "Need authentication!!!");
	%>
</body>
</html>