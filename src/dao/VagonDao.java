package dao;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;






import datos.Usuario;
import datos.Vagon;
import datos.Viaje;
public class VagonDao {
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

public Vagon traerVagon(int idVagon) throws HibernateException {
Vagon objeto = null;
try {
iniciaOperacion();
//Aqui abajo esta la linea correjida
objeto = (Vagon) session.createQuery("from Vagon v  inner join fetch v.ferrocarril f  inner join fetch v.clase where v.idVagon ="+idVagon).uniqueResult();
} finally {
session.close();
}
return objeto;
}


public int agregar(Vagon objeto) {
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



public void eliminar(Vagon objeto) throws HibernateException {
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



public void actualizar(Vagon objeto) throws HibernateException {
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

public Vagon traerVagonYViajes(int idVagon) throws HibernateException {
Vagon objeto = null;
try {
iniciaOperacion();
String hql="from Vagon v inner join fetch v.viajes where v.idVagon ="+ idVagon;
System.out.println(hql);;
objeto = (Vagon) session.createQuery(hql).uniqueResult();
} finally {
	 session.close();
}
return objeto;
}


public List<Vagon> traerVagon() throws HibernateException {
List<Vagon> lista=null;
try {
iniciaOperacion();
lista=session.createQuery("from Vagon v order by v.numeroVagon asc").list();
} finally {
session.close();

}
return lista;
}

public List<Vagon> traerVagonesPorEstado(int estado) throws HibernateException {
List<Vagon> lista=null;
try {
iniciaOperacion();
lista=session.createQuery("from Vagon v where v.estadoVagon= "+ estado+"order by v.numeroVagon asc").list();
} finally {
session.close();

}
return lista;
}

}
	