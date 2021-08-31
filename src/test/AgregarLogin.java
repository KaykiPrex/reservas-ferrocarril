package test;

import java.util.GregorianCalendar;

import negocio.ContactoABM;
import negocio.LoginABM;
import negocio.UsuarioABM;
import datos.Usuario;

public class AgregarLogin {

	public static void main(String[] args) {
		try
		{
			UsuarioABM usuarioABM=new UsuarioABM();
			LoginABM loginABM=new LoginABM();
			
			Usuario Usuario=usuarioABM.traerUsuario(1);	
			int login=Usuario.getDni();
			int clave=123456;
			int privilegio=1;
			GregorianCalendar ultimoLogin=new GregorianCalendar(2015,05,10);
			GregorianCalendar ultimoCambioClave=new GregorianCalendar(2015,05,10);
			
				
		  long ultimoIdLogin=loginABM.agregar(login, clave, privilegio, ultimoLogin, ultimoCambioClave, Usuario);
			
		
		}
		catch ( Exception e ){ 
			System.out.println( "Excepcion: " + e.getMessage() );
			}
		
	}

}
