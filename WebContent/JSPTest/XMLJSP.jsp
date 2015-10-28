<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html xmlns="http://www.w3c.org/1999/xhtml" xmlns:jsp="http://java.sun.com/JSP/Page">
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>XMLJSP</title>
</head>
<body>
	<jsp:element name="xmlElement">
	<jsp:attribute name="xmlElementAttr">
	value
	</jsp:attribute>
	<jsp:body>
	body
	</jsp:body>
	</jsp:element>

	<jsp:element name="name">
	<jsp:attribute name="nameAttr">
	nameAttr
	</jsp:attribute>
	<jsp:attribute name="color">
	blue
	</jsp:attribute>
	<jsp:body>
	name body
	</jsp:body>
	</jsp:element>
</body>
</html>