<%@ page import="java.io.*,java.util.*"%>
<html>
<head>
<title>Auto Refresh Header Example</title>
</head>
<body>
	<center>
		<h2>Auto Refresh Header Example</h2>
		<%
			//設置每隔5秒自動刷新
			response.setIntHeader("Refresh", 1);
			//獲取當前時間
			Calendar calendar = new GregorianCalendar();
			String am_pm;
			int hour = calendar.get(Calendar.HOUR);
			int minute = calendar.get(Calendar.MINUTE);
			int second = calendar.get(Calendar.SECOND);
			if (calendar.get(Calendar.AM_PM) == 0)
				am_pm = "AM";
			else
				am_pm = "PM";
			String CT = hour + ":" + minute + ":" + second + " " + am_pm;
			out.println("Current Time is: " + CT + "<hr>");
			out.print((int) (Math.random() * 10000));
		%>
	</center>
</body>
</html>