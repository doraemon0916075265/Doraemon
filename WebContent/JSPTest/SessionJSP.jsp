<%@ page import="java.io.*,java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Session JSP</title>
</head>
<body>
	<%
		//獲取session創建時間
		Date createTime = new Date(session.getCreationTime());
		//獲取最後訪問頁面的時間
		Date lastAccessTime = new Date(session.getLastAccessedTime());

		String title = "Welcome Back to my website";
		Integer visitCount = new Integer(0);
		String visitCountKey = new String("visitCountKey");
		String userIDKey = new String("userID");
		String userID = new String("ABCD");

		//檢測網頁是否由新的訪問用戶
		if (session.isNew()) {
			title = "Welcome to my website";
			session.setAttribute(userIDKey, userID);
			session.setAttribute(visitCountKey, visitCount);
		}

		visitCount = (Integer) (session.getAttribute(visitCountKey));
		visitCount = visitCount + 1;
		userID = (String) (session.getAttribute(userIDKey));
		session.setAttribute(visitCountKey, visitCount);
	%>

	<center>
		<h1>Session Tracking</h1>

		<table border="1" align="center">
			<tr bgcolor="#949494">
				<th>Session info</th>
				<th>Value</th>
			</tr>
			<tr>
				<td>id</td>
				<td>
					<%
						out.print(session.getId());
					%>
				</td>
			</tr>
			<tr>
				<td>Creation Time</td>
				<td>
					<%
						out.print(createTime);
					%>
				</td>
			</tr>
			<tr>
				<td>Time of Last Access</td>
				<td>
					<%
						out.print(lastAccessTime);
					%>
				</td>
			</tr>
			<tr>
				<td>User ID</td>
				<td>
					<%
						out.print(userID);
					%>
				</td>
			</tr>
			<tr>
				<td>Number of visits</td>
				<td>
					<%
						out.print(visitCount);
					%>
				</td>
			</tr>
		</table>
	</center>
</body>
</html>