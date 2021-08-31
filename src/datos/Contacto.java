package datos;

public class Contacto {
	private int idUsuario;
	private String direccion;
	private String telefono;
	private String email;
	private Usuario usuario;
	
	
Contacto(){}

public Contacto(String direccion,String telefono,String email,Usuario usuario)
{
	this.direccion=direccion;
	this.telefono=telefono;
	this.email=email;
	this.usuario=usuario;
	
}




public int getIdUsuario() {
	return idUsuario;
}

public void setIdUsuario(int idUsuario) {
	this.idUsuario = idUsuario;
}

public String getDireccion() {
	return direccion;
}

public void setDireccion(String direccion) {
	this.direccion = direccion;
}

public String getTelefono() {
	return telefono;
}

public void setTelefono(String telefono) {
	this.telefono = telefono;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public Usuario getUsuario() {
	return usuario;
}

public void setUsuario(Usuario usuario) {
	this.usuario = usuario;
}

public String toString()
{
	return( "\nId contacto : "+idUsuario+
			"\nDireccion :"+direccion+
			"\nTelefono: "+telefono+
			"\nEmail: "+email
			);
}

}
