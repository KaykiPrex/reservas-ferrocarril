package datos;

import java.util.Set;

public class Butaca {
	private int idButaca;
	private String butaca;
	private Set<Pasaje> pasajes;
	private Vagon vagon;
	
Butaca(){}

public Butaca(String butaca,Vagon vagon)
{
	this.butaca=butaca;
	this.vagon=vagon;
	
}

public int getIdButaca() {
	return idButaca;
}

public void setIdButaca(int idButaca) {
	this.idButaca = idButaca;
}

public String getButaca() {
	return butaca;
}

public void setButaca(String butaca) {
	this.butaca = butaca;
}


public Set<Pasaje> getPasajes() {
	return pasajes;
}

public void setPasajes(Set<Pasaje> pasajes) {
	this.pasajes = pasajes;
}

public Vagon getVagon() {
	return vagon;
}

public void setVagon(Vagon vagon) {
	this.vagon = vagon;
}

public String toString()
{
	return("\nId Butaca: "+idButaca+
			"\nButaca: "+butaca
			);
}

}
