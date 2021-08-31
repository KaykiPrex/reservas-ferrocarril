package controladores;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import negocio.UsuarioABM;
import datos.Usuario;

public class ControladorMostrarUsuarioJSP extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		procesarPeticion(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		procesarPeticion(request, response);
	}

	private void procesarPeticion(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		try {
			int dni = Integer.parseInt(request.getParameter("dni"));
			UsuarioABM usuarioabm = new UsuarioABM();
			Usuario usuario = usuarioabm.traerDni(dni);
			request.setAttribute("usuario", usuario);
			request.getRequestDispatcher("/vistacliente.jsp").forward(request, response);
		} catch (Exception e) {
			response.sendError(500, "El id Ingresado no existe en la base de datos.");
		}
	}
}
