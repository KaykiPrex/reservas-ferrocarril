package negocio;
import dao.ClaseDao;
import dao.VagonDao;
import dao.ViajeDao;
import datos.Butaca;
import datos.Clase;



import datos.Ferrocarril;
import datos.Usuario;
import datos.Vagon;
import datos.Viaje;

import java.util.GregorianCalendar;
import java.util.List;



public class VagonABM {
private VagonDao dao=new VagonDao();

public Vagon traerVagon(int idVagon){
Vagon v =dao.traerVagon(idVagon);
return v;
}



public int agregar(int numeroVagon,int estadoVagon,Clase clase,Ferrocarril ferrocarril){ 
Vagon v=new Vagon(numeroVagon,estadoVagon,clase,ferrocarril);
return dao.agregar(v);
}

public void modificar(Vagon v){ /* implementar antes de actualizar que no exista un cliente con el mismo documento a modificar y con el mismo id, lanzar la Exception */
dao.actualizar(v);
}

public void eliminar(int idVagon){/*en este caso es física en gral. no se se aplicaría este caso de uso, si se hiciera habría que validar que el cliente no tenga dependencias*/
Vagon v=dao.traerVagon(idVagon); //Implementar que si es null que arroje la excepción la Excepción
dao.eliminar(v);
}



public Vagon traerVagonYViajes(int idVagon){
Vagon v =dao.traerVagonYViajes(idVagon);
if(v==null)
{
	v=null;
	}
return v;
}




public void addViajeToVagon(int idViaje, int idVagon) {
	ViajeDao viajeDao = new ViajeDao();
	VagonDao vagonDao = new VagonDao();
	Vagon actVagon = vagonDao.traerVagon(idVagon);
	Viaje actViaje = viajeDao.traerViaje(idViaje);
	actVagon.getViajes().add(actViaje);
	vagonDao.actualizar(actVagon);
}




public void removeViajeToVagon(int idViaje, int idVagon) {
	ViajeDao viajeDao = new ViajeDao();
	VagonDao vagonDao = new VagonDao();
	Vagon actVagon = vagonDao.traerVagonYViajes(idVagon);
	Viaje actViaje = viajeDao.traerViaje(idViaje);
	Viaje vBorrar = null;
	for (Viaje v : actVagon.getViajes()) {
		if (v.equals(actViaje)) {
			vBorrar = v;
			break;
		}
	}
	actVagon.getViajes().remove(actViaje);
	vagonDao.actualizar(actVagon);
}

public void GenerarButaca(Vagon v,Clase c)
{
	ButacaABM butacaABM= new ButacaABM();
	
	int filas=c.getFilas(); // traigo las filas que va a tener ese vagon segun la CLASE
	for(int i =1;i<=filas;i++)
	{
		char letra='A'; // inicio con la letra A
		for(int asiento=1;asiento<=4;asiento++) // recorro de 1 a 4
		{
		  String butaca=i+String.valueOf(letra); //butaca va a tener el numero de fila(i) + asiento(letra)
		  butacaABM.agregar(butaca, v); // agrego esa butaca
		  letra++;
		}
		
	}
	
	}


public List<Vagon> traerVagon(){return dao.traerVagon();
}
}


