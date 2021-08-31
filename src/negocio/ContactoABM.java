package negocio;
import dao.ClaseDao;
import dao.ContactoDao;
import datos.Clase;



import datos.Contacto;
import datos.Usuario;

import java.util.List;



public class ContactoABM {
private ContactoDao dao=new ContactoDao();

public int agregar(String direccion,String telefono,String email,Usuario usuario){ 
Contacto c=new Contacto(direccion,telefono,email,usuario);
return dao.agregar(c);
}

public void modificar(Contacto c){ /* implementar antes de actualizar que no exista un cliente con el mismo documento a modificar y con el mismo id, lanzar la Exception */
dao.actualizar(c);
}

public void eliminar(int idContacto){/*en este caso es física en gral. no se se aplicaría este caso de uso, si se hiciera habría que validar que el cliente no tenga dependencias*/
Contacto c=dao.traerContacto(idContacto); //Implementar que si es null que arroje la excepción la Excepción
dao.eliminar(c);
}


public Contacto traerContacto(int idContacto){
Contacto c =dao.traerContacto(idContacto);
return c;
}
}