<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@page import="datos.Viaje"%>
<%@page import="datos.Funciones"%>
<%@page import="java.util.List"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Objetos 2</title>
</head>
<body>

<BR>
Listado Sin utilizar JSTL
<table border="1">
 <tr>
 <th>Id Viaje</th>
 <th>Fecha</th>
<th>Cantidad Pasajes Libres</th>
<th>Terminal Salida</th>
<th>Terminal Llegada</th>
</tr>
 <% List<Viaje> viajes=(List)request.getAttribute("viajes");
 for(Viaje viaje:viajes){ %>
 <tr>
<td><%= viaje.getIdViaje() %></td>
<td><%= Funciones.traerFechaCorta(viaje.getFechaHora()) %></td>
<td><%= viaje.getCantidadPasajesLibres() %></td>
<td><%=  viaje.getTerminalSalida() %></td>
<td><%=  viaje.getTerminalLlegada() %></td>
 </tr>
 <% } %>
</table>

<FORM method="POST" action="ControladorListaPasaje">
<TR>
				<TD>Ingrese el id del viaje:</TD>
				<TD><INPUT name="id"></TD>
</TR>
<TR>
				<TD><INPUT type="submit" value="Buscar"></TD>
			</TR>
</FORM>

<BR>
<A href="/Objetos2/ListaViajes.jsp">Volver...</A>
</body>
</html>