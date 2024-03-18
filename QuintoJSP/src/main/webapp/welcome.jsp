<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Página Bem-vindo</title>
</head>
<body>
	<%
	String nome = request.getParameter("nome");
	String senha = request.getParameter("senha");
	if(senha.equals("1234")){
		out.print("Bem-vindo "+nome);
		out.print("Current Time: "+Calendar.getInstance().getTime());
	} else {
		out.print("Erro, verifique usuário ou senha");
	} %>
</body>
</html>