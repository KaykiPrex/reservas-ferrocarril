package controladores;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import negocio.ClaseABM;
import negocio.VagonABM;
import dao.FerrocarrilDao;
import datos.Clase;
import datos.Ferrocarril;
import datos.Vagon;

public class ControladorAgregarVagonJSP extends HttpServlet {
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
	
FerrocarrilDao ferrocarrilDao=new FerrocarrilDao();
ClaseABM claseABM=new ClaseABM();
VagonABM vagonabm=new VagonABM();

int numeroVagon = Integer.parseInt(request.getParameter("numeroVagon"));
int estadoVagon = Integer.parseInt(request.getParameter("estadoVagon"));
Clase clase = claseABM.traerClase(Integer.parseInt(request.getParameter("clase")));
Ferrocarril ferrocarril=ferrocarrilDao.traerFerrocarril(Integer.parseInt(request.getParameter("ferrocarril")));

int vagonid=vagonabm.agregar(numeroVagon, estadoVagon, clase, ferrocarril);
Vagon vagon=vagonabm.traerVagon(vagonid);
request.setAttribute("vagon", vagon);
request.getRequestDispatcher("vistavagon.jsp").forward(request ,response);
}
catch (Exception e) {
//response.sendError(500,"ERROR!!");
e.printStackTrace();
}
}
}
