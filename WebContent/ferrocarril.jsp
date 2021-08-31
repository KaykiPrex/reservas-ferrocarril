<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ferrocarriles Argentinos : Admin</title>
</head>
<body>
<div class="contenedor-principal">
	<%@ include file="sesion.jsp" %>
	<%@ include file="titulo.jsp" %>
	<%@ include file="botoneraAdmin.jsp" %>
	<div class="cuerpo">
		<p> ferrocarril
		<FORM method="POST" action="ControladorAgregarVagonJSP">
		Añadir Vagon<BR>
		<BR>
		
		<TABLE border="1">
			<TR>
				<TD>Numero Vagon</TD>
				<TD><INPUT name="numeroVagon"></TD>
			</TR>

			<TR>
				<TD>Estado Vagon- 1=Libre 2=En Taller 3=Ocupado</TD>
				<TD><INPUT name="estadoVagon"></TD>
			</TR>

			<TR>
				<TD>Id Clase</TD>
				<TD><INPUT name="clase"></TD>
			</TR>

			<TR>
				<TD>Id Ferrocarril</TD>
				<TD><INPUT name="ferrocarril"></TD>
			</TR>

			
			<TR>
				<TD><INPUT type="submit" value="Agregar"></TD>
			</TR>
		</TABLE>
	</FORM>
	</div>
	
	
</div>
<%@ include file="pie-pagina.jsp" %>
	

</body>
</html>