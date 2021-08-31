package datos;

import java.util.Set;

import negocio.VagonABM;

public class Vagon {
	private int idVagon;
	private int numeroVagon;
	private int estadoVagon;
	private Clase clase;
	private Ferrocarril ferrocarril;
	private Set<Viaje> viajes;
	private Set<Butaca> butacas;
	
Vagon(){}

public Vagon(int numeroVagon,int estadoVagon,Clase clase,Ferrocarril ferrocarril)
{
	this.numeroVagon=numeroVagon;
	this.estadoVagon=estadoVagon;
	this.clase=clase;
	this.ferrocarril=ferrocarril;
}

public int getIdVagon() {
	return idVagon;
}

public void setIdVagon(int idVagon) {
	this.idVagon = idVagon;
}

public int getNumeroVagon() {
	return numeroVagon;
}

public void setNumeroVagon(int numeroVagon) {
	this.numeroVagon = numeroVagon;
}


public int getEstadoVagon() {
	return estadoVagon;
}

public void setEstadoVagon(int estadoVagon) {
	this.estadoVagon = estadoVagon;
}

public Clase getClase() {
	return clase;
}

public void setClase(Clase clase) {
	this.clase = clase;
}



public Ferrocarril getFerrocarril() {
	return ferrocarril;
}

public void setFerrocarril(Ferrocarril ferrocarril) {
	this.ferrocarril = ferrocarril;
}



public Set<Viaje> getViajes() {
	return viajes;
}

public void setViajes(Set<Viaje> viajes) {
	this.viajes = viajes;
}



public Set<Butaca> getButacas() {
	return butacas;
}

public void setButacas(Set<Butaca> butacas) {
	this.butacas = butacas;
}

public boolean equals(Vagon v)
{
	boolean igual=false;
	if((this.idVagon==v.idVagon))
	{
		igual=true;
	}
	
	return igual;
}



	public void agregar(Viaje viaje) throws Exception{
	boolean agregar=false;
	for(Viaje c : viajes)
	{
		if(c.equals(viajes)) 
		{
			agregar=true;
			break;
		}
	}
	
	if(agregar)throw new Exception("ERROR : El "+ viaje.getIdViaje() + "ya pertenece a el Vagon : " + this.getIdVagon());
	viajes.add(viaje);
	viaje.getVagones().add(this);
	VagonABM vagonABM= new VagonABM();
	vagonABM.addViajeToVagon(viaje.getIdViaje(),idVagon);
	}
	
		 
	 public void removeViaje(Viaje viaje) throws Exception {
			Viaje vBorrar = null;
			for (Viaje c : viajes) {
				if (c.equals(viaje)) {
					vBorrar = c;
					break;
				}
			}
			if (vBorrar == null)throw new Exception("ERROR: El" + viaje.getIdViaje() + " NO pertence al Vagon: " + this.getIdVagon());
			viajes.remove(vBorrar);
			viaje.getVagones().remove(this);
			VagonABM vagonABM= new VagonABM();
			vagonABM.removeViajeToVagon(viaje.getIdViaje(), idVagon);
		}

		

public String toString() {
	return ("\nidVagon: " + idVagon +
			" \tNumeroVagon: " + numeroVagon
			
			
			
			);
}

}
