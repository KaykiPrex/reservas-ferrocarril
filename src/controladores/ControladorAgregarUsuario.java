package controladores;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import datos.Usuario;
import negocio.ContactoABM;
import negocio.LoginABM;

import java.util.GregorianCalendar;
/**
 * Servlet implementation class ControladorAgregarUsuario
 */

@SuppressWarnings("serial")
public class ControladorAgregarUsuario extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		procesarPeticion(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		procesarPeticion(request, response);
	}
	
	
	private void procesarPeticion(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		ContactoABM contactoabm = new ContactoABM();
		LoginABM loginabm = new LoginABM();
		GregorianCalendar fecha = new GregorianCalendar();
		
		Usuario usuario = new Usuario(Integer.parseInt( request.getParameter("dni") ) , request.getParameter("nombre") , request.getParameter("apellido") );
		contactoabm.agregar(request.getParameter("direccion"), request.getParameter("telefono"), request.getParameter("email"), usuario) ;
		loginabm.agregar(Integer.parseInt( request.getParameter("user") ), Integer.parseInt( request.getParameter("pass")), Integer.parseInt( request.getParameter("privilegio") ), fecha , fecha , usuario) ;
		
		request.getRequestDispatcher("confirmacion.jsp").forward(request ,response);
	}

}
