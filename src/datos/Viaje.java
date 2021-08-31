package datos;
import java.util.GregorianCalendar;
import java.util.Set;
import datos.Funciones;

import negocio.ViajeABM;
public class Viaje {
	private int idViaje;
	private GregorianCalendar fechaHora;
	private int cantidadPasajesLibres;
	private int cantidadVagones;
	private String TerminalSalida;
	private String TerminalLlegada;
	private Set<Pasaje> pasajes;
	private Set<Vagon> vagones;

Viaje(){}

public Viaje(GregorianCalendar fechaHora,int cantidadPasajesLibres,int cantidadVagones, String TerminalSalida, String TerminalLlegada)
{
	super();
	this.fechaHora=fechaHora;
	this.cantidadPasajesLibres=cantidadPasajesLibres;
	this.cantidadVagones=cantidadVagones;
	this.TerminalSalida=TerminalSalida;
	this.TerminalLlegada=TerminalLlegada;
}

public int getIdViaje() {
	return idViaje;
}

public void setIdViaje(int idViaje) {
	this.idViaje = idViaje;
}

public GregorianCalendar getFechaHora() {
	return fechaHora;
}

public void setFechaHora(GregorianCalendar fechaHora) {
	this.fechaHora = fechaHora;
}

public int getCantidadPasajesLibres() {
	return cantidadPasajesLibres;
}

public void setCantidadPasajesLibres(int cantidadPasajesLibres) {
	this.cantidadPasajesLibres = cantidadPasajesLibres;
}

public int getCantidadVagones() {
	return cantidadVagones;
}

public void setCantidadVagones(int cantidadVagones) {
	this.cantidadVagones = cantidadVagones;
}



public String getTerminalSalida() {
	return TerminalSalida;
}

public void setTerminalSalida(String terminalSalida) {
	TerminalSalida = terminalSalida;
}

public String getTerminalLlegada() {
	return TerminalLlegada;
}

public void setTerminalLlegada(String terminalLlegada) {
	TerminalLlegada = terminalLlegada;
}

public Set<Pasaje> getPasajes() {
	return pasajes;
}

public void setPasajes(Set<Pasaje> pasajes) {
	this.pasajes = pasajes;
}



public Set<Vagon> getVagones() {
	return vagones;
}

public void setVagones(Set<Vagon> vagones) {
	this.vagones = vagones;
}


public boolean equals(Viaje v)
{
	boolean igual=false;
	if(this.idViaje==v.idViaje)
	{
		igual=true;
	}
	
	return igual;
}



	public void agregar(Vagon vagon) throws Exception{
	boolean agregar=false;
	for(Vagon v : vagones)
	{
		if(v.equals(vagon)) 
		{
			agregar=true;
			break;
		}
	}
	
	if(agregar)throw new Exception("ERROR : El "+ vagon.getIdVagon() + " ya pertenece a el Viaje : " + this.getIdViaje());
	vagones.add(vagon);
	vagon.getViajes().add(this);
	ViajeABM ViajeABM= new ViajeABM();
	ViajeABM.addVagonToViaje(vagon.getIdVagon(),idViaje);
	}
	
		 
	 public void remove(Vagon vagon) throws Exception {
			Vagon vBorrar = null;
			for (Vagon v : vagones) {
				if (v.equals(vagon)) {
					vBorrar = v;
					break;
				}
			}
			if (vBorrar == null)throw new Exception("ERROR: El" + vagon.getIdVagon() + " NO pertence al Viaje " + this.getIdViaje());
			vagones.remove(vBorrar);
			vagon.getViajes().remove(this);
			ViajeABM viajeABM= new ViajeABM();
			viajeABM.removeVagonToViaje(vagon.getIdVagon(), idViaje);
		}


public String toString()
{
	return("\nId Viaje: "+idViaje+
			"\nFechaHora: "+Funciones.traerFechaCorta(fechaHora)+
			"\nCantidad Pasajes Libres: "+cantidadPasajesLibres+
			"\nCantidad Vagones: "+cantidadVagones+
			"\nTerminal Salida : "+TerminalSalida+
			"\nTerminal Llegada : "+TerminalLlegada
			
			);
}

}
