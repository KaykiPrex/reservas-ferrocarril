<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP Example</title>
<link rel="stylesheet" href="estilos.css" 	>
<link rel="stylesheet" href="fuente.css" 	>
</head>
<body bgcolor="#00AEF5">

<table border="2" cellpadding="5" width="300">
	<tr>  
		<td width= 500 ><img src="img\logo.png"      ></td> 	
		<td width=150 VALIGN=TOP ><img src="img\trenPortada.jpg"   ></td>	
	
	</tr>


</table>  

<form name="loginform" action="ControladoresLogin" method="post">

<p>&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;Usuario &nbsp; &nbsp;&nbsp; &nbsp;: <input type=text name="usuario"><br> 
   &nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;Password   &nbsp; &nbsp;:  <input name="contraseña" type="password"><br>
&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;<input type="submit"> 

</form>

</body>
</html>