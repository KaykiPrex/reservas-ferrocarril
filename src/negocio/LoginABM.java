package negocio;
import dao.ClaseDao;
import dao.LoginDao;
import datos.Clase;



import datos.Login;
import datos.Usuario;

import java.util.GregorianCalendar;
import java.util.List;



public class LoginABM {
private LoginDao dao=new LoginDao();

public int agregar(int login,int clave,int privilegio,GregorianCalendar ultimoLogin,GregorianCalendar ultimoCambioClave,Usuario usuario){ 
Login l=new Login(login,clave,privilegio, ultimoLogin,ultimoCambioClave,usuario);
return dao.agregar(l);
}

public void modificar(Login l){ /* implementar antes de actualizar que no exista un cliente con el mismo documento a modificar y con el mismo id, lanzar la Exception */
dao.actualizar(l);
}

public void eliminar(int idLogin){/*en este caso es f�sica en gral. no se se aplicar�a este caso de uso, si se hiciera habr�a que validar que el cliente no tenga dependencias*/
Login l=dao.traerLogin(idLogin); //Implementar que si es null que arroje la excepci�n la Excepci�n
dao.eliminar(l);
}


public Login traerLogin(int idLogin){
Login l =dao.traerLogin(idLogin);
return l;
}

public Login validarUsuario(int login, int clave) throws Exception
{
	boolean bandera=false;
	Login l=dao.buscarLogin(login);
	if(l==null)throw new Exception ("Usuario invalido");
	else
	{
		if(l.getClave()==clave)
		{
		bandera=true;
		}
		else
		{
			if(l==null)throw new Exception ("Contrase�a invalido");
		}
	}
	return l;
	}
}