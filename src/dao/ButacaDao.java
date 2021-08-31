package dao;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Butaca;
import datos.Vagon;
public class ButacaDao {
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


public Butaca traerButaca(int idButaca) throws HibernateException {
Butaca obj = null;
try {
iniciaOperacion();
String hQL="from Butaca b inner join fetch b.vagon v where b.idButaca="+idButaca;
obj = (Butaca) session.createQuery(hQL).uniqueResult();
} finally {
session.close();
}
return obj;
}


public List<Butaca> traerButaca(Vagon v) throws HibernateException {
List<Butaca> lista=null;
try {
iniciaOperacion();
String hQL="from Butaca b inner join fetch b.vagon v where v.idVagon="+v.getIdVagon(); // prestar atencion en como pongo esta linea porque sino hace mal el metodo
lista = session .createQuery(hQL).list() ;
} finally {
session.close();
}
return lista;
}



public int agregar(Butaca objeto) {
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



public void eliminar(Butaca objeto) throws HibernateException {
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



public void actualizar(Butaca objeto) throws HibernateException {
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
	
}