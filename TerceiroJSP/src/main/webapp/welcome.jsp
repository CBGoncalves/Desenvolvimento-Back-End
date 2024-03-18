<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Página de Seja Bem-vindo</title>
</head>
<body>
<%
	String name = request.getParameter("username");
	out.print("Bem-vindo "+name);
%>
</body>
</html>