package test;

import dao.UsuarioDao;
import datos.Pasaje;
import datos.Usuario;
import negocio.PasajeABM;
import negocio.UsuarioABM;



public class ComprarPasaje {

	public static void main(String[] args) {
		PasajeABM pasajeABM = new PasajeABM();
			
		
		Pasaje pasaje=pasajeABM.traerPasaje(1);
		pasaje.setOcupado(true);
		
		pasajeABM.modificar(pasaje);
		
		
		
		
	}

}
