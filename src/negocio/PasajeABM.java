package negocio;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import dao.PasajeDao;
import datos.Butaca;
import datos.Funciones;
import datos.Pasaje;


import datos.Usuario;
import datos.Vagon;
import datos.Viaje;





public class PasajeABM {
private PasajeDao dao=new PasajeDao();

public Pasaje traerPasaje(int idPasaje){
Pasaje p =dao.traerPasaje(idPasaje);
return p;
}

public int agregar(Butaca butaca,Viaje viaje){ 
Pasaje p=new Pasaje(butaca,viaje);
return dao.agregar(p);
}

public int agregar(boolean ocupado,Usuario usuario,Butaca butaca,Viaje viaje){ 
Pasaje p=new Pasaje(ocupado,usuario,butaca,viaje);
return dao.agregar(p);
}

public void modificar(Pasaje p){ /* implementar antes de actualizar que no exista un cliente con el mismo documento a modificar y con el mismo id, lanzar la Exception */
dao.actualizar(p);
}

public void eliminar(int idPasaje){/*en este caso es física en gral. no se se aplicaría este caso de uso, si se hiciera habría que validar que el cliente no tenga dependencias*/
Pasaje p=dao.traerPasaje(idPasaje); //Implementar que si es null que arroje la excepción la Excepción
dao.eliminar(p);
}

public List<Pasaje> traerPasaje(){return dao.traerPasaje();
}


public List<Pasaje> traerPasajeSegunViaje(int viaje) throws Exception
{
	int contador=0;
	List<Pasaje> lista = new ArrayList<Pasaje>();
	for(Pasaje p : traerPasaje())
	{
		if(p.getViaje().getIdViaje()==viaje)
		{
			lista.add(p);
			contador++;
		}
	}
	if(contador==0) throw new Exception("NO EXISTEN PASAJES PARA ESTE VIAJE");
	return lista;
}
}
