package datos;
import java.util.Set;



public class Usuario {
	private int idUsuario;
	private int dni;
	private String apellido;
	private String nombre;
	private Set<Pasaje> pasajes; // lista de prestamos de ese cliente//
	private Contacto contacto;
	private Login login;
	
	
	


	Usuario(){} //hibernate pide un constructor vacio//
	
	
	public Usuario(int dni,String nombre,String apellido) {
	super();
	this.dni=dni;
	this.apellido=apellido;
	this.nombre=nombre;
	
	}
	
	
	
	
	public int getIdUsuario() {
		return idUsuario;
	}


	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}


	public int getDni() {
		return dni;
	}


	public void setDni(int dni) {
		this.dni = dni;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Set<Pasaje> getPasajes() {
		return pasajes;
	}


	public void setPasajes(Set<Pasaje> pasajes) {
		this.pasajes = pasajes;
	}


	public Contacto getContacto() {
		return contacto;
	}


	public void setContacto(Contacto contacto) {
		this.contacto = contacto;
	}
	
	


	public Login getLogin() {
		return login;
	}


	public void setLogin(Login login) {
		this.login = login;
	}


	public String toString(){
		return ("ID CLIENTE : "+idUsuario+"\n"+
				"APELLIDO : "+apellido+"\n"+
				"NOMBRE: "+nombre+"\n"+
				"DNI: "+dni+"\n"
				);
		}
	
	
	

}
