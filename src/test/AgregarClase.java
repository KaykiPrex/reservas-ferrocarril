package test;

import java.util.List;

import datos.Clase;
import negocio.ClaseABM;


public class AgregarClase {

	public static void main(String[] args) {
		try
		{
		ClaseABM claseABM= new ClaseABM();
		String clase = "pulman";
		int precio=5;
		int filas =8;
		
		
		
		
		
		long ultimoIdCliente=claseABM.agregar(clase, precio, filas);
		}

		catch ( Exception e ){ 
			System.out.println( "Excepcion: " + e.getMessage() );}
		}

	}


