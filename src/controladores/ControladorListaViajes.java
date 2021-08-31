package controladores;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import negocio.PasajeABM;
import negocio.ViajeABM;
import datos.Pasaje;
import datos.Viaje;
public class ControladorListaViajes extends HttpServlet {
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
ViajeABM viajeabm=new ViajeABM();
int mes1 = Integer.parseInt(request.getParameter("mes")); // le paso el mes del viaje en el cual quiero viajar
int mes = mes1-1; // le resto uno para que me de el mes que es , porque si le paso 5 , me va a buscar el 6
List<Viaje> viajes=viajeabm.traerViajesDeUnMes(mes); // traigo la lista de viajes segun un determinado mes
request.setAttribute("viajes", viajes);

request.getRequestDispatcher("/vistaListaViajes.jsp").forward(request ,response);


}
catch (Exception e) {

response.sendError(500,"NO EXISTEN VIAJES EN ESE MES");
}
}
}