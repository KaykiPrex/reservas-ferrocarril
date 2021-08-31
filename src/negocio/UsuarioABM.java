package negocio;
import dao.UsuarioDao;
import datos.Usuario;

import java.util.List;



public class UsuarioABM {
private UsuarioDao dao=new UsuarioDao();

public int agregar(int dni,String nombre,String apellido){ 
Usuario u=new Usuario(dni,nombre,apellido);
return dao.agregar(u);
}

public void modificar(Usuario u){ /* implementar antes de actualizar que no exista un cliente con el mismo documento a modificar y con el mismo id, lanzar la Exception */
dao.actualizar(u);
}

public void eliminar(int idUsuario){/*en este caso es física en gral. no se se aplicaría este caso de uso, si se hiciera habría que validar que el cliente no tenga dependencias*/
Usuario u=dao.traerUsuario(idUsuario); //Implementar que si es null que arroje la excepción la Excepción
dao.eliminar(u);
}


public Usuario traerUsuario(int idUsuario){
Usuario u =dao.traerUsuario(idUsuario);
return u;
}

public Usuario traerDni(int dni)throws Exception{
Usuario u= dao.traerDNI(dni);
if(u==null)throw new Exception("Este dni de cliente no esta en la base de datos");// implementar si c es null lanzar Exception
return u;
}

public List<Usuario> traerUsuario(){return dao.traerUsuario();
}
}