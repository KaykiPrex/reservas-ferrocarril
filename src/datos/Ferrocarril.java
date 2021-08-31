package datos;

import java.util.Set;

public class Ferrocarril {

	private int idFerrocarril;
	private String ferrocarril;
	private Set<Vagon> vagones;
	
Ferrocarril(){}

public Ferrocarril(String ferrocarril)
{
	this.ferrocarril=ferrocarril;
}

public int getIdFerrocarril() {
	return idFerrocarril;
}

public void setIdFerrocarril(int idFerrocarril) {
	this.idFerrocarril = idFerrocarril;
}

public String getFerrocarril() {
	return ferrocarril;
}

public void setFerrocarril(String ferrocarril) {
	this.ferrocarril = ferrocarril;
}



public Set<Vagon> getVagones() {
	return vagones;
}

public void setVagones(Set<Vagon> vagones) {
	this.vagones = vagones;
}

public String toString()
{
	return("\nId Ferrocarril: "+idFerrocarril+
			"\nFerrocarril: "+ferrocarril
			);
}
}
