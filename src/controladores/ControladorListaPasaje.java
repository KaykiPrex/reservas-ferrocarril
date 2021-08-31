package controladores;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import negocio.PasajeABM;
import negocio.ViajeABM;
import datos.Pasaje;
import datos.Viaje;
public class ControladorListaPasaje extends HttpServlet {
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
ServletException, IOException {
procesarPeticion(request, response);
}
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
ServletException, IOException {
procesarPeticion(request, response);
}
private void procesarPeticion(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {

try {
int id = Integer.parseInt(request.getParameter("id")); // ingreso el id del viaje que quiero comprar
PasajeABM pasajeABM = new PasajeABM();
List<Pasaje> pasajes = pasajeABM.traerPasajeSegunViaje(id); // cargo la lista de pasajes de el viaje que pase por parametro 
List<Pasaje> pasajeSinOcupar = new ArrayList<Pasaje>();
for(Pasaje pasaje : pasajes)
{
	if(pasaje.isOcupado()==false)
	{
		pasajeSinOcupar.add(pasaje);
	}
}
request.setAttribute("pasajeSinOcupar", pasajeSinOcupar);
request.getRequestDispatcher("/vistaListaPasajes.jsp").forward(request ,response); /// voy a vistaListaPasaje


}
catch (Exception e) {
response.sendError(500,"NO EXISTEN PASAJES PARA ESE VIAJE");

}
}
}
