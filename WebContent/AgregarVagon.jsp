<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<HTML>
<HEAD>
<META http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<TITLE>Objetos 2</TITLE>
</HEAD>
<BODY>
	<%@ include file="/cabecera.jsp"%>
	<FORM method="POST" action="ControladorAgregarVagonJSP">
		Búsqueda de vagon<BR>
		<BR>
		<%=	session.getAttribute("login")		%>
		<TABLE border="0">
			<TR>
				<TD>Numero Vagon:</TD>
				<TD><INPUT name="numeroVagon"></TD>
			</TR>

			<TR>
				<TD>Estado Vagon -> 1=libre 2=en taller 3=ocupado:</TD>
				<TD><INPUT name="estadoVagon"></TD>
			</TR>

			<TR>
				<TD>Id Clase:</TD>
				<TD><INPUT name="clase"></TD>
			</TR>

			<TR>
				<TD>Id Ferrocarril:</TD>
				<TD><INPUT name="ferrocarril"></TD>
			</TR>

			
			<TR>
				<TD><INPUT type="submit" value="Agregar"></TD>
			</TR>
		</TABLE>
	</FORM>
</BODY>
</HTML>

