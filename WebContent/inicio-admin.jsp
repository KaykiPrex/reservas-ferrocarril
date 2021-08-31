<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.List" %>
<%@ page import="datos.Login , negocio.LoginABM , datos.Contacto , negocio.ContactoABM" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ferrocarriles Argentinos</title>

<!-- jQuery -->
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>
<script src="js/jquery.bxslider.min.js"></script>
<link href="CSS/jquery.bxslider.css" rel="stylesheet" />
</head>
<body>

<div class="contenedor-principal">
	 
	<%@ include file="sesion.jsp" %>
	<%@ include file="titulo.jsp" %>
	<%@ include file="botoneraAdmin.jsp" %>
	
	<div class="cuerpo">
		<div id="carrusel" >
			<div> <img src="img/ferro02.jpg" width="730" height="400" > </div>
			<div> <img src="img/ferro01.jpg" width="730" height="400"> </div>
			<div> <img src="img/ferro03.jpg" width="730" height="400"> </div>
		</div>
	
	</div>
</div>

<%@ include file="pie-pagina.jsp" %>

<script>
$(document).ready(function(){
  $('#carrusel').bxSlider({slideWidth:730, auto: true, autoControls: true  });
});
</script>

</body>
</html>