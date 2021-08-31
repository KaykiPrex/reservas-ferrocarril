<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="datos.Pasaje"%>
<%@page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Objetos 2</title>
</head>
<BODY>

<table border="1">
 <tr>
 <th>Id Pasaje</th>
 <th>Id Butaca</th> 
</tr>
 <% List<Pasaje> pasajes=(List)request.getAttribute("pasajeSinOcupar");
 for(Pasaje pasaje:pasajes){ %>
 <tr>
<td><%= pasaje.getIdPasaje() %></td>
<td><%= pasaje.getButaca().getIdButaca() %></td>
 </tr>
 <% } %>
</table>

<FORM method="POST" action="ControladorComprarPasaje">
<TR>
				<TD>Ingrese el id del pasaje:</TD>
				<TD><INPUT name="id"></TD>
</TR>
<TR>
				<TD><INPUT type="submit" value="Comprar"></TD>
			</TR>
</FORM>
	
	
</BODY>
</html>