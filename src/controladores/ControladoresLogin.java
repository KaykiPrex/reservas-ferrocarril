package controladores;
import java.io.IOException;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import negocio.ClaseABM;
import negocio.LoginABM;
import negocio.VagonABM;
import dao.FerrocarrilDao;
import datos.Clase;
import datos.Ferrocarril;
import datos.Login;
import datos.Vagon;

public class ControladoresLogin extends HttpServlet {
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
response.setContentType("text/html;charset=UTF-8");

try {
	LoginABM loginABM=new LoginABM();
	HttpSession session = request.getSession();
	int usuario = Integer.parseInt(request.getParameter("usuario"));
	int contraseña = Integer.parseInt(request.getParameter("contraseña"));
	Login login=loginABM.validarUsuario(usuario, contraseña);
	
		login.setUltimoLogin(new GregorianCalendar());
		loginABM.modificar(login);
		session.setAttribute("IdUsuario", login.getIdUsuario() );
		if(login.getPrivilegio()==1)
		{
		
			request.getRequestDispatcher("inicio-usuario.jsp").forward(request ,response);
		
		
		}
		else
		{	
			request.getRequestDispatcher("inicio-admin.jsp").forward(request, response);
		}
	
}
catch (Exception e) {
response.sendRedirect("Login.jsp"); // hacer pagina

}
}
}
