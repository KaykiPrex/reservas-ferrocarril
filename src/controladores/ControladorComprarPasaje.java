package controladores;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import negocio.PasajeABM;
import negocio.UsuarioABM;
import negocio.ViajeABM;
import datos.Pasaje;
import datos.Usuario;
import datos.Viaje;
public class ControladorComprarPasaje extends HttpServlet {
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
PasajeABM pasajeABM = new PasajeABM();
UsuarioABM usuarioABM=new UsuarioABM();
int idPasaje = Integer.parseInt(request.getParameter("id"));
HttpSession session = request.getSession();
Pasaje pasaje = pasajeABM.traerPasaje(idPasaje);
pasaje.setOcupado(true);
int idUsuario = 62;
Usuario usuario = usuarioABM.traerUsuario(idUsuario); // falta pasarle el id de usuario del usuario que entro al sistema
pasaje.setUsuario(usuario);
pasajeABM.modificar(pasaje);


request.setAttribute("pasaje", pasaje);
request.getRequestDispatcher("/vistaPasajeComprado.jsp").forward(request ,response);







}
catch (Exception e) {
//response.sendError(500, "Hubo un problema al traer el listado de viajes.");
e.printStackTrace();
}
}
}
