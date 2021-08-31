package test;

import java.util.GregorianCalendar;






import dao.ButacaDao;
import datos.Butaca;
import datos.Vagon;
import datos.Viaje;
import negocio.ButacaABM;
import negocio.VagonABM;
import negocio.ViajeABM;


public class AgregarViaje {

	public static void main(String[] args) {
		try
		{
			
		ButacaDao butacaDao=new ButacaDao();
		ButacaABM butacaABM= new ButacaABM();
		VagonABM vagonABM=new VagonABM();
		ViajeABM viajeABM=new ViajeABM();
		GregorianCalendar fechaHora=new GregorianCalendar();//tu fecha de nacimiento
		int cantidadPasajesLibres = 5;
		int cantidadVagones=1;
		String terminal1="lanus";
		String terminal2="lomaz";
		
		
		
		
		int ultimoIdViaje=viajeABM.agregar(fechaHora, cantidadPasajesLibres, cantidadVagones, terminal1, terminal2);
		Viaje viaje = viajeABM.traerViaje(ultimoIdViaje); // traigo el viaje nuevo
		viajeABM.generarVagones(viaje); // genero vagones para ese viaje segun el atributo cantidadVagones
		viajeABM.GeneraraPasaje(viaje); // genero los pasajes de ese Viaje
		}

		catch ( Exception e ){ 
			System.out.println( "Excepcion: " + e.getMessage() );}
		}
		


	}


