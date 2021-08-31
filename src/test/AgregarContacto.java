package test;

import java.util.List;

import datos.Usuario;
import negocio.ClaseABM;
import negocio.ContactoABM;
import negocio.UsuarioABM;

public class AgregarContacto {

	public static void main(String[] args) {
	
		try
		{
			UsuarioABM usuarioABM=new UsuarioABM();
			ContactoABM contactoABM=new ContactoABM();
			
			String direccion="bolivia 2089";
			String telefono="4241-7307";
			String email="m.d.p_93@hotmail.com";
			Usuario usuario=usuarioABM.traerUsuario(1);		
				
		  long ultimoIdContacto=contactoABM.agregar(direccion, telefono, email, usuario);
			
		
		}
		catch ( Exception e ){ 
			System.out.println( "Excepcion: " + e.getMessage() );
			}
		
			
		

	}

}
