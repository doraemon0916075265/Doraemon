<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JavaBean 的使用範例</title>
</head>
<body>
	<jsp:useBean id="myBean" scope="page" class="javabean.BeanSample" />
	<jsp:setProperty property="username" name="myBean" value="文文" />

	<p>
		名字：<jsp:getProperty property="username" name="myBean" /></p>

</body>
</html>