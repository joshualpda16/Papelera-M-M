package dao;

    import java.util.List;
    import datos.Rubro;
    import org.hibernate.HibernateException;
    import org.hibernate.Session;
    import org.hibernate.Transaction;
    import datos.HibernateUtil;

public class RubroDao {
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
        
    public void actualizaRubro(Rubro rubro) throws HibernateException {
        try {
            iniciaOperacion();
            sesion.update(rubro);
            tx.commit();
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }
    }
    
    public void eliminarRubro(Rubro rubro) throws HibernateException {
        try {
            iniciaOperacion();
            sesion.delete(rubro);
            tx.commit();
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }
    }
   
    public int guardaRubro(Rubro rubro) {
        int id = 0;
        try {
            iniciaOperacion();
            id = (int) sesion.save(rubro);
            tx.commit();
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }
        return id;
    }
    
    public Rubro traerRubro(int idRubro) throws HibernateException {
        Rubro rubro = null;
        try {
            iniciaOperacion();
            rubro = (Rubro) sesion.get(Rubro.class, idRubro);
        } finally {
            sesion.close();
        }
        return rubro;
    }
    
    public List<Rubro> traerListaRubros() throws HibernateException {
        List<Rubro> listaRubros = null;
        try {
            iniciaOperacion();
            listaRubros =sesion.createQuery("from Rubro").list();
        } finally {
            sesion.close();
        }
        return listaRubros;
    }
}
