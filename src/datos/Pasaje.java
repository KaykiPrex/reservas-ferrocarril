package datos;

public class Pasaje {
	private int idPasaje;
	private boolean ocupado;
	private Usuario usuario;
	private Butaca butaca;
	private Viaje viaje;
	
	
Pasaje(){}

public Pasaje(Butaca butaca,Viaje viaje)
{
	this.ocupado=false;
	this.butaca=butaca;
	this.viaje=viaje;
}

public Pasaje(boolean ocupado,Usuario usuario,Butaca butaca,Viaje viaje)
{
	this.ocupado=ocupado;
	this.usuario=usuario;
	this.butaca=butaca;
	this.viaje=viaje;
}

public int getIdPasaje() {
	return idPasaje;
}

public void setIdPasaje(int idPasaje) {
	this.idPasaje = idPasaje;
}



public boolean isOcupado() {
	return ocupado;
}

public void setOcupado(boolean ocupado) {
	this.ocupado = ocupado;
}



public Usuario getUsuario() {
	return usuario;
}

public void setUsuario(Usuario usuario) {
	this.usuario = usuario;
}



public Butaca getButaca() {
	return butaca;
}

public void setButaca(Butaca butaca) {
	this.butaca = butaca;
}

public Viaje getViaje() {
	return viaje;
}

public void setViaje(Viaje viaje) {
	this.viaje = viaje;
}



public String toString()
{
	return( "\nIdPasaje : "+idPasaje+
			"\nOcupado : "+ocupado
			);
}



}
