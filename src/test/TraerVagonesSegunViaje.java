package test;

import negocio.ViajeABM;
import dao.ButacaDao;
import datos.Butaca;
import datos.Vagon;
import datos.Viaje;

public class TraerVagonesSegunViaje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
		
		ButacaDao butacaDao=new ButacaDao();
		ViajeABM viajeABM=new ViajeABM();
		
		int id=26;
		
				
		Viaje viaje2= viajeABM.traerViajeYVagones(id);
		System.out.println(viaje2.getVagones());
		
	
		
		
		}

			catch ( Exception e ){ 
				System.out.println( "Excepcion: " + e.getMessage() );}
			}
	}


