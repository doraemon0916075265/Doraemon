<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>生命週期</title>
</head>
<body>
	<%!private int initVar = 0;
	private int serviceVar = 0;
	private int destroyVar = 0;%>

	<%!public void jspInit() {
		initVar++;
		System.out.println("JSP 被初始化");
	}

	public void jspDestroy() {
		initVar++;
		System.out.println("JSP 被銷毀");
	}%>
	<%
		serviceVar++;
		System.out.println("JSP 做了 " + serviceVar + " 次請求");

		String content01 = "初始化次數：" + initVar;
		String content02 = "請求次數：" + serviceVar;
		String content03 = "銷毀次數：" + destroyVar;
	%>

	<h3><%=content01%></h3>
	<h3><%=content02%></h3>
	<h3><%=content03%></h3>


</body>
</html>