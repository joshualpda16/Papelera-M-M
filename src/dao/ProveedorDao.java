package dao;

import datos.HibernateUtil;
import datos.Proveedor;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ProveedorDao {
    private static Session sesion;
    private Transaction tx;
    
    private void iniciaOperacion() throws HibernateException {
        sesion = HibernateUtil.getSessionFactory().openSession();
        tx = sesion.beginTransaction();
    }
    
    private void manejaExcepcion(HibernateException he) throws HibernateException {
        tx.rollback();
        throw new HibernateException("Ocurrió un error en la capa de acceso a datos", he);
    }
    
    public Proveedor traerProveedor(int idProveedor) throws HibernateException {
        Proveedor prov = null;
        try {
            iniciaOperacion();
            prov = (Proveedor) sesion.get(Proveedor.class, idProveedor);
        } finally {
            sesion.close();
        }
        return prov;
    }
    
    public List<Proveedor> traerListaProveedores() throws HibernateException {
        List<Proveedor> lista = null;
        try {
            iniciaOperacion();
            lista =sesion.createQuery("from Proveedor").list();
        } finally {
            sesion.close();
        }
        return lista;
    }
    
    public int guardaProveedor(Proveedor prov) {
        int id = 0;
        try {
            iniciaOperacion();
            id = (int) sesion.save(prov);
            tx.commit();
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }
        return id;
    }
}
