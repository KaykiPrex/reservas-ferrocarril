<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ferrocarriles Argentinos : Admin</title>
<link rel="stylesheet" href="CSS/estilo-pagina.css" 	>
</head>
<body>
<div class="contenedor-principal">
	<%@ include file="sesion.jsp" %>
	<%@ include file="titulo.jsp" %>
	<%@ include file="botoneraAdmin.jsp" %>
	<div class="cuerpo">
		<p> Los datos fueron cargados correctamente !
		<ul class="navi">
			<li> <a href="http://localhost:8080/Objetos2/cliente.jsp">Aceptar</a> </li>										
		</ul>  
	</div>
	
	
</div>
<%@ include file="pie-pagina.jsp" %>
	

</body>
</html>