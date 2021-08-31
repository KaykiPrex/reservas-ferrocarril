package test;

import java.util.List;
import java.util.Set;

import datos.Pasaje;
import datos.Vagon;
import datos.Vagon;
import datos.Viaje;
import negocio.VagonABM;
import negocio.VagonABM;
import negocio.ViajeABM;

public class TraerUsuario {

	public static void main(String[] args) {
		try {
		ViajeABM viajeABM = new ViajeABM();
		int viajes=1;
		Viaje viaje = viajeABM.traerViaje(viajes);
		for(Pasaje pasaje : viaje.getPasajes())
		{
			System.out.println(pasaje);
		}
		
		
			
		
	
		}
		catch ( Exception e ){ 
			System.out.println( "Excepcion: " + e.getMessage() );
			}
	}
}
		
	


