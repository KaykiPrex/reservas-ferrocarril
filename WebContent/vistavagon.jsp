<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="datos.Vagon"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Objetos 2</title>
</head>
<BODY>
	<% Vagon vagon=(Vagon)request.getAttribute("vagon"); %>
	<BR> Id:
	<%= vagon.getIdVagon() %><BR> NumeroVagon :
	<%= vagon.getNumeroVagon() %><BR> Clase :
	<%= vagon.getClase()  %><BR> Ferrocarril :
	<%= vagon.getFerrocarril()  %><BR>

	<BR>
	<A href="/Objetos2/AgregarVagon.jsp">Volver...</A>
</BODY>
</html>
