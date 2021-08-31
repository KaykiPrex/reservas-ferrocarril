package dao;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;





import datos.Usuario;
import datos.Viaje;
public class ViajeDao {
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


public Viaje traerViaje(int idViaje) throws HibernateException {
Viaje objeto = null;
try {
iniciaOperacion();
objeto = (Viaje) session.get(Viaje.class, idViaje);
} finally {
session.close();
}
return objeto;
}






public int agregar(Viaje objeto) {
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



public void eliminar(Viaje objeto) throws HibernateException {
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



public void actualizar(Viaje objeto) throws HibernateException {
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

public Viaje traerViajeYVagones(int idViaje) throws HibernateException {
	 Viaje objeto = null;
	 try {
	 iniciaOperacion();
	 String hql="from Viaje v inner join fetch v.vagones where v.idViaje ="+ idViaje;
	 objeto = (Viaje) session.createQuery(hql).uniqueResult();

	 } finally {
	 session.close();
	 }
	 return objeto;
	 }

public List<Viaje> traerViaje() throws HibernateException {
List<Viaje> lista=null;
try {
iniciaOperacion();
lista=session.createQuery("from Viaje v order by v.idViaje asc v.fechaHora asc v.cantidadPasajesLibres asc v.TerminalSalida asc v.TerminalLlegada").list();

} finally {
session.close();
}
return lista;
}
}
	