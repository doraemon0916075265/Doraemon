<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>MainJSP</title>
</head>
<body>
	<h2>MainJSP</h2>
	<%-- 	<jsp:forward page="GetRequestInfoJSP.jsp"/> --%>
	<jsp:include page="DateJSP.jsp" flush="true" />
	<jsp:include page="LifeCycleJSP.jsp" flush="true" />

	<form action="GetMethodParameter.jsp" method="GET">
		First Name: <input type="text" name="first_name"> <br /> Last Name: <input type="text" name="last_name" /> <input type="submit" value="Submit" />
	</form>

</body>
</html>