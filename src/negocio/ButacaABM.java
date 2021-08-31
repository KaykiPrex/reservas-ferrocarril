package negocio;
import dao.ButacaDao;
import datos.Butaca;


import datos.Vagon;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import org.hibernate.HibernateException;


public class ButacaABM {
private ButacaDao dao=new ButacaDao();

public Butaca traerButaca(int idButaca){
Butaca b =dao.traerButaca(idButaca);
return b;
}

public List<Butaca> traerButaca(Vagon v) throws Exception {
List<Butaca> butaca=dao.traerButaca(v);
if(butaca.size()==0)throw new Exception("El vagon "+v.getIdVagon()+" no tiene butacas"); // preguntar si el tamaño de la lista es igual a 0 , me tira la excepcion de que ese cliente no tiene prestamos
return dao.traerButaca(v);
}

public int agregar(String butaca, Vagon vagon){ 
Butaca b=new Butaca(butaca,vagon);
return dao.agregar(b);
}

public void modificar(Butaca b){ /* implementar antes de actualizar que no exista un cliente con el mismo documento a modificar y con el mismo id, lanzar la Exception */
dao.actualizar(b);
}

public void eliminar(int idButaca){/*en este caso es física en gral. no se se aplicaría este caso de uso, si se hiciera habría que validar que el cliente no tenga dependencias*/
Butaca b=dao.traerButaca(idButaca); //Implementar que si es null que arroje la excepción la Excepción
dao.eliminar(b);
}



}

	