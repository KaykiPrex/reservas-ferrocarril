package datos;

import java.util.Set;

public class Clase {

		private int idClase;
		private String clase;
		private int precio;
		private int filas;
		private Set<Vagon> vagones;
		
		
Clase(){}

public Clase(String clase, int precio, int filas) {
			
this.clase = clase;
this.precio = precio;
this.filas = filas;
}
		



		
public int getIdClase() {
	return idClase;
}

public void setIdClase(int idClase) {
	this.idClase = idClase;
}

public String getClase() {
	return clase;
}

public void setClase(String clase) {
	this.clase = clase;
}

public int getPrecio() {
	return precio;
}

public void setPrecio(int precio) {
	this.precio = precio;
}

public int getFilas() {
	return filas;
}

public void setFilas(int filas) {
	this.filas = filas;
}

public Set<Vagon> getVagones() {
	return vagones;
}

public void setVagones(Set<Vagon> vagones) {
	this.vagones = vagones;
}

		public String toString() {
			return ("\nidClase: " + idClase +
					" \nclase: " + clase +
					"\nprecio: "+ precio +
					"\nfila: " + filas 
					);
		}
		
		
}
