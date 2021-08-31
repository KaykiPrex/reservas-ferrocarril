package test;

import datos.Vagon;
import datos.Viaje;
import negocio.VagonABM;
import negocio.ViajeABM;

public class AgregarVagonAViaje {

	public static void main(String[] args) {
		
		try
		{
		
		
		ViajeABM viajeABM=new ViajeABM();
		VagonABM vagonABM=new VagonABM();
		int id=8;
		int id2=2;
		Viaje viaje = viajeABM.traerViaje(id);
		Vagon vagon = vagonABM.traerVagon(id2);
		viaje.agregar(vagon);
		
		
	
		
		
		}

			catch ( Exception e ){ 
				System.out.println( "Excepcion: " + e.getMessage() );}
			}
		// TODO Auto-generated method stub

	

}
