package dao;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Login;
import datos.Usuario;
import datos.Contacto;
public class LoginDao {
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

public int agregar(Login objeto) {
int id = 0;
try {
iniciaOperacion();
id = Integer.parseInt(session.save(objeto).toString());
tx.commit();
} catch (HibernateException he) {
manejaExcepcion(he);
throw he;
} finally {
session.close();
}
return id;
}

public void actualizar(Login objeto) throws HibernateException {
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

public void eliminar(Login objeto) throws HibernateException {
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

public Login traerLogin(int idLogin) throws HibernateException {
Login objeto = null;
try {
iniciaOperacion();
String hql="from Login l inner join fetch l.usuario u where u.idUsuario=" + idLogin;
objeto = (Login) session.createQuery(hql).uniqueResult();
} finally {
session.close();
}
return objeto;
}

public Login buscarLogin(int idLogin) throws HibernateException {
Login objeto = null;
try {
iniciaOperacion();
String hql="from Login l inner join fetch l.usuario where l.login=" + idLogin;
objeto = (Login) session.createQuery(hql).uniqueResult();
} finally {
session.close();
}
return objeto;
}

public Login buscarContraseña(int clave) throws HibernateException {
Login objeto = null;
try {
iniciaOperacion();
String hql="from Login l inner join fetch l.usuario u where l.clave=" + clave;
objeto = (Login) session.createQuery(hql).uniqueResult();
} finally {
session.close();
}
return objeto;
}
}

