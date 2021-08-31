package negocio;
import dao.ClaseDao;
import datos.Clase;


import java.util.List;



public class ClaseABM {
private ClaseDao dao=new ClaseDao();

public int agregar(String clase, int precio, int filas){ 
Clase c=new Clase(clase,precio,filas);
return dao.agregar(c);
}

public void modificar(Clase c){ /* implementar antes de actualizar que no exista un cliente con el mismo documento a modificar y con el mismo id, lanzar la Exception */
dao.actualizar(c);
}

public void eliminar(int idClase){/*en este caso es física en gral. no se se aplicaría este caso de uso, si se hiciera habría que validar que el cliente no tenga dependencias*/
Clase c=dao.traerClase(idClase); //Implementar que si es null que arroje la excepción la Excepción
dao.eliminar(c);
}


public Clase traerClase(int idClase){
Clase c =dao.traerClase(idClase);
return c;
}

public List<Clase> traerClase(){return dao.traerClase();
}



}