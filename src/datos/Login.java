package datos;

import java.util.GregorianCalendar;

public class Login {

	private int idUsuario;
	private int login; // usuario de la cuenta
	private int clave;
	private int privilegio;
	private GregorianCalendar ultimoLogin;
	private GregorianCalendar ultimoCambioClave;
	private Usuario usuario;
	
Login(){}

public Login(int login,int clave,int privilegio,GregorianCalendar ultimoLogin , GregorianCalendar ultimoCambioClave,Usuario usuario)
{
	this.login=login;
	this.clave=clave;
	this.privilegio=privilegio;
	this.ultimoLogin=ultimoLogin;
	this.ultimoCambioClave=ultimoCambioClave;
	this.usuario=usuario;
	}

public int getIdUsuario() {
	return idUsuario;
}

public void setIdUsuario(int idUsuario) {
	this.idUsuario = idUsuario;
}




public int getLogin() {
	return login;
}

public void setLogin(int login) {
	this.login = login;
}

public int getClave() {
	return clave;
}

public void setClave(int clave) {
	this.clave = clave;
}

public int getPrivilegio() {
	return privilegio;
}

public void setPrivilegio(int privilegio) {
	this.privilegio = privilegio;
}

public GregorianCalendar getUltimoLogin() {
	return ultimoLogin;
}

public void setUltimoLogin(GregorianCalendar ultimoLogin) {
	this.ultimoLogin = ultimoLogin;
}

public GregorianCalendar getUltimoCambioClave() {
	return ultimoCambioClave;
}

public void setUltimoCambioClave(GregorianCalendar ultimoCambioClave) {
	this.ultimoCambioClave = ultimoCambioClave;
}

public Usuario getUsuario() {
	return usuario;
}

public void setUsuario(Usuario usuario) {
	this.usuario = usuario;
}

public String ToString()
{
	return ("Id login: "+idUsuario);
	}




}
