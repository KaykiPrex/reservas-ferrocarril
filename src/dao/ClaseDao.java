package dao;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import datos.Clase;
public class ClaseDao {
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

public int agregar(Clase objeto) {
int id = 0;
try {
iniciaOperacion();
id = Integer.parseInt(session.save(objeto).toString());
tx.commit();
} 
catch (HibernateException he) {
manejaExcepcion(he);
throw he;
} finally {
session.close();
}
return id;
}

public void actualizar(Clase objeto) throws HibernateException {
try {
iniciaOperacion();
session.update(objeto);
tx.commit();
} 
catch (HibernateException he) 
{
manejaExcepcion(he);
throw he;
} 
finally {
session.close();
}
}

public void eliminar(Clase objeto) throws HibernateException {
try {
iniciaOperacion();
session.delete(objeto);
tx.commit();
} 
catch (HibernateException he) {
manejaExcepcion(he);
throw he;
} 
finally {
session.close();
}
}

public Clase traerClase(int idClase) throws HibernateException {
Clase objeto = null;
try {
iniciaOperacion();
objeto = (Clase) session.get(Clase.class, idClase);
} finally {
session.close();
}
return objeto;
}



public List<Clase> traerClase() throws HibernateException {
List<Clase> lista=null;
try {
iniciaOperacion();
lista=session.createQuery("from Clase c order by c.clase asc c.precio asc").list();
} finally {
session.close();
}
return lista;
}
}