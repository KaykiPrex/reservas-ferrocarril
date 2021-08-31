package dao;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Ferrocarril;
import datos.Vagon;
import datos.Viaje;
import datos.Usuario;
import datos.Pasaje;
public class PasajeDao {
private static Session session;
private Transaction tx;


private void iniciaOperacion() throws HibernateException {
session = HibernateUtil.getSessionFactory().openSession();
tx = session.beginTransaction();
}


private void manejaExcepcion(HibernateException he) throws HibernateException {
tx.rollback();
throw new HibernateException("ERROR en la capa de acceso a datos", he);
}


public Pasaje traerPasaje(int idPasaje) throws HibernateException {
Pasaje objeto = null;
try {
iniciaOperacion();
objeto = (Pasaje) session.get(Pasaje.class, idPasaje);
} finally {
session.close();
}
return objeto;
}


public List<Pasaje> traerPPasaje(Usuario u) throws HibernateException {
List<Pasaje> lista=null;
try {
iniciaOperacion();
String hQL="from Pasaje p inner join fetch p.usuario u where u.idUsuario="+u.getIdUsuario(); // prestar atencion en como pongo esta linea porque sino hace mal el metodo
lista = session .createQuery(hQL).list() ;
} finally {
session.close();
}
return lista;
}

public List<Pasaje> traerPPasaje(Viaje v) throws HibernateException {
List<Pasaje> lista=null;
try {
iniciaOperacion();
String hQL="from Pasaje p inner join fetch p.viaje v where v.idViaje="+v.getIdViaje(); // prestar atencion en como pongo esta linea porque sino hace mal el metodo
lista = session .createQuery(hQL).list() ;
} finally {
session.close();
}
return lista;
}



public int agregar(Pasaje objeto) {
	int id = 0;
	try {
	iniciaOperacion();
	id = Integer.parseInt(session.save(objeto).toString());
	tx.commit();
	} catch (HibernateException he) {
	manejaExcepcion(he);
	throw he;
	} 
	finally 
	{
	session.close();
	}
	return id;
	}



public void eliminar(Pasaje objeto) throws HibernateException {
try {
iniciaOperacion();
session.delete(objeto);
tx.commit();
} catch (HibernateException he) {
manejaExcepcion(he);
throw he;
} finally {
session.close();
}
}



public void actualizar(Pasaje objeto) throws HibernateException {
	try {
	iniciaOperacion();
	session.update(objeto);
	tx.commit();
	} catch (HibernateException he) {
		manejaExcepcion(he);
		throw he;
		} finally {
		session.close();
		}
		}

public List<Pasaje> traerPasaje() throws HibernateException {
List<Pasaje> lista=null;
try {
iniciaOperacion();
lista=session.createQuery("from Pasaje p order by p.idPasaje asc").list();
} finally {
session.close();

}
return lista;
}

	
}