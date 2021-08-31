package negocio;
import dao.ButacaDao;
import dao.VagonDao;
import dao.ViajeDao;
import datos.Butaca;
import datos.Funciones;
import datos.Usuario;
import datos.Vagon;
import datos.Viaje;












import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import org.hibernate.HibernateException;


public class ViajeABM {
private ViajeDao dao=new ViajeDao();

public Viaje traerViaje(int idViaje){
Viaje v =dao.traerViaje(idViaje);
return v;
}

public int agregar(GregorianCalendar fechaHora,int cantidadPasajesLibres,int cantidadVagones, String idTerminalSalida, String idTerminalLlegada){ 
Viaje v=new Viaje(fechaHora,cantidadPasajesLibres,cantidadVagones,idTerminalSalida,idTerminalLlegada);
return dao.agregar(v);
}

public void modificar(Viaje v){ /* implementar antes de actualizar que no exista un cliente con el mismo documento a modificar y con el mismo id, lanzar la Exception */
dao.actualizar(v);
}

public void eliminar(int idViaje){/*en este caso es física en gral. no se se aplicaría este caso de uso, si se hiciera habría que validar que el cliente no tenga dependencias*/
Viaje v=dao.traerViaje(idViaje); //Implementar que si es null que arroje la excepción la Excepción
dao.eliminar(v);
}

public Viaje traerViajeYVagones(int idViaje){
Viaje v =dao.traerViajeYVagones(idViaje);
return v;
}

public void GeneraraPasaje(Viaje viaje) // este metodo genera la cantidad de pasajes segun los vagones de un viaje .Se generan la cantidad de pasajes segun  las butacas que contenga ese vagon
{
	PasajeABM pasajeABM=new PasajeABM();
	ButacaDao butacaDao=new ButacaDao();
	for(Vagon vagon : viaje.getVagones())  // lista de vagones del viaje que entra
	{
		for(Butaca b : butacaDao.traerButaca(vagon)) // recorro la lista de butacas que tiene ese vagon
		{
			pasajeABM.agregar(b, viaje); // agrego la cantidad de pasajes LIBRES segun la cantidad de butaca de ese vagon
		}
		// vuelve al primer for y hace lo mismo con otro vagon del viaje que entra
	}
	}

public void generarVagones(Viaje viaje) throws Exception // agrego a un viaje NUEVO vagones libres
{
int contador=0; // variable que corresponde a la cantidadVagones(numero de vagones que puede tener ese viaje) 
VagonDao vagonDao=new VagonDao();
VagonABM vagonABM=new VagonABM(); // parametro Estado
List<Vagon> listaVagon = vagonDao.traerVagonesPorEstado(1); // traigo la lista general de vagones
int cantidadVagones=viaje.getCantidadVagones();

for(int i=0;i<=listaVagon.size()-1;i++)  // recorro la lista vago hasta el final
{
	
	int numero=listaVagon.get(i).getIdVagon(); // numero va a tener el id del vagon
	Vagon vagon=vagonABM.traerVagon(numero); // traigo el vagon con el id que va a ser NUMERO
	if(contador<cantidadVagones) // si ese vagon no tiene viajes y contador es menor a el numero de vagones que puede tener el viaje hacer
	{
		Vagon vagon1=vagonABM.traerVagon(numero); // traer el vagon:NUMERO
		viaje.agregar(vagon1); // agregar VAGON1 al viaje que entra
		vagon.setEstadoVagon(3);
		vagonABM.modificar(vagon);
		contador++; // sumo uno al contador para que me valla contando la cantidad de vagones que agrego a el viaje que entra
	}
	}
if(contador==0)throw new Exception ("\nNo quedan vagones libres para agregar a este viaje"); // salta una excepcion si no hay vagones libres para agregar a un viaje
}


public void addVagonToViaje(int idVagon, int idViaje) {
	
	ViajeDao viajeDao = new ViajeDao();
	VagonDao vagonDao = new VagonDao();
	Viaje actViaje = viajeDao.traerViaje(idViaje);
	Vagon actVagon = vagonDao.traerVagon(idVagon);
	
	actViaje.getVagones().add(actVagon);
	viajeDao.actualizar(actViaje);
}



public void removeVagonToViaje(int idVagon, int idViaje) {
	ViajeDao viajeDao = new ViajeDao();
	VagonDao vagonDao = new VagonDao();
	Viaje actViaje = viajeDao.traerViajeYVagones(idViaje); 
	Vagon actVagon = vagonDao.traerVagon(idVagon);
	Vagon vBorrar = null;
	for (Vagon e : actViaje.getVagones()) {
		if (e.equals(actVagon)) {
			vBorrar = e;
			break;
		}
	}
	actViaje.getVagones().remove(vBorrar);
	viajeDao.actualizar(actViaje);
}

public List<Viaje> traerViaje(){return dao.traerViaje();
}

public List<Viaje> traerViajesDeUnMes(int viaje) throws Exception
{
	int contador=0;
	List<Viaje> lista = new ArrayList<Viaje>();
	for(Viaje v : traerViaje())
	{
		GregorianCalendar fecha = v.getFechaHora();
		int mes = Funciones.traerMes(fecha);
		if(mes == viaje)
		{
			lista.add(v);
			contador++;
		}
	}
	if(contador==0) throw new Exception("NO EXISTEN VIAJES EN ESTE MES");
	return lista;
}

}


