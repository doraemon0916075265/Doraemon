<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>簡單計算</title>
</head>
<body>
	<%
		out.print("haha<br>");
		out.print(22 + 33 + +3 + 5 + "<br>");
		out.print(22 + 33 + "<br>" + 22 + 33 + +3 + 5 + "<br>");
		out.print("a" + 22 + 33 + +3 + 5 + "<br>");
	%>

	${2*3}

	<%
		int i = 18;
		Date time = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd aaa hh:mm:ss");
		String now = sdf.format(time);
	%>
	<%
		out.print("<hr>");
		out.print(i);
	%>
	<p>
		現在時間：<%=new Date()%></p>
	<p>
		現在時間：<%
		out.print(now);
	%>
	</p>
	<hr>
	<%
		int day = 5;

		if (day >= 1 && day <= 5) {
			out.print("上班日<br>");
		} else if (day > 5 && day <= 7) {
			out.print("休假<br>");
		} else {
			out.print("別亂輸入<br>");
		}

		switch (day) {
		case 1: {
			out.print("你輸入 1<br>");
		}
		case 2: {
			out.print("你輸入 2<br>");
		}
		case 3: {
			out.print("你輸入 3<br>");
		}
		case 4: {
			out.print("你輸入 4<br>");
		}
		case 5: {
			out.print("你輸入 5<br>");
		}
		case 6: {
			out.print("你輸入 6<br>");
		}
		case 7: {
			out.print("你輸入 7<br>");
		}
		default: {
			out.print("defalt<br>");
		}
		}
	%>

	<hr>

	<%
		int wordsize = 5;
		int k;
		for (k = 1; k < wordsize; k++) {
	%>
	<font style="color:blue;font-size:<%=k%>em">Tower of Saviors</font>
	<br>
	<%
		}
	%>
	

</body>
</html>