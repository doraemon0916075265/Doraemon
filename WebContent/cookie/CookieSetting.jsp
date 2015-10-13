<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>cookie</title>
<script type="text/javascript">
	function SetCookie(x) {
		if (x == '0') {
			document.cookie = "name=Jordan" + "age=18";
		} else if (x == '1') {
			document.cookie = "name=" + "age=";
		}
	}
	function ShowCookie() {
		alert(document.cookie);
	}
</script>

</head>
<body>
	<input type="button" value="設定 Cookie" onclick="SetCookie(0);">
	<input type="button" value="清除 cookie" onclick="SetCookie(1);">
	<input type="button" value="Show Cookie" onclick="ShowCookie();">
</body>
</html>