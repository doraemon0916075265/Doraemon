<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>會員登入</title>
</head>
<body>
	<h3>${AppName}的天地</h3>
	<form action="LoginMember.do">
		<table>
			<thead>
				<tr>
					<th colspan="2">登入</th>
				</tr>
			</thead>
			<tr>
				<td>帳號 :</td>
				<td><input type="text" name="username" value="${param.username}"></td>
				<td>&nbsp;${error.username}</td>
			</tr>
			<tr>
				<td>密碼 :</td>
				<td><input type="text" name="password" value="${param.password}"></td>
				<td>&nbsp;${error.password}</td>
			</tr>
			<tr>
				<td></td>
				<td align="right"><input type="submit" value="登入"></td>
				<td>&nbsp;${error.fail}</td>
			</tr>
		</table>

	</form>
</body>
</html>