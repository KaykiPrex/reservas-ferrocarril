<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<body>
<p>Contacto<br>
 Datos Personales<BR>
		<BR>
<FORM method="POST" action="ControladorAgregarUsuario">
		
		
		<TABLE border="1">
			<TR>
				<TD>Dni</TD>
				<TD><INPUT name="dni"></TD>
			</TR>

			<TR>
				<TD>Nombre</TD>
				<TD><INPUT name="nombre"></TD>
			</TR>

			<TR>
				<TD>Apellido</TD>
				<TD><INPUT name="apellido"></TD>
			</TR>

			<TR>
				<TD>Direccion</TD>
				<TD><INPUT name="direccion"></TD>
			</TR>
			<TR>
				<TD>Telefono</TD>
				<TD><INPUT name="telefono"></TD>
			</TR>
			<TR>
				<TD>Email</TD>
				<TD><INPUT name="email"></TD>
			</TR>
			<TR>
				<TD>Usuario</TD>
				<TD><INPUT name="user"></TD>
			</TR>
			<TR>
				<TD>Clave</TD>
				<TD><INPUT name="pass"></TD>
			</TR>
			<TR>
				<TD>Privilegio</TD>
				<TD><INPUT name="privilegio"></TD>
			</TR>

			
			<TR>
				<TD><INPUT type="submit" value="Agregar"></TD>
			</TR>
		</TABLE>
</FORM>

</body>
</html>