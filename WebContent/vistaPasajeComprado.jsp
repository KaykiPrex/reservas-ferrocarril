<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="datos.Pasaje"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Objetos 2</title>
</head>
<BODY>
	<% Pasaje pasaje=(Pasaje)request.getAttribute("pasaje"); %>
	<BR> Id:
	<%= pasaje.getIdPasaje() %><BR> Id Butaca :
	<%= pasaje.getButaca().getIdButaca() %><BR> Id viaje :
	<%= pasaje.getViaje().getIdViaje()  %><BR> 

	<BR>
	
</BODY>
</html>