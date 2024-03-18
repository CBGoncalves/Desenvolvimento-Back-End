<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   	<%@ page import="UsuarioDao"%>
   	<jsp:useBean id="u" class="Usuario"></jsp:useBean>
   	<jsp:setProperty property="*" name="u">
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	int i = UsuarioDao.save(u);
	if(i > 0) {
		response.sendRedirect("adduser-success.jsp");
	} else {
		response.sendRedirect("adduser-error.jsp");
	}
%>
</body>
</html>