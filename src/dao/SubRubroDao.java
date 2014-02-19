

package dao;

    import datos.HibernateUtil;
import datos.SubRubro;
import java.util.List;
    import org.hibernate.HibernateException;
    import org.hibernate.Session;
    import org.hibernate.Transaction;

public class SubRubroDao {
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
    
    public int guardarSubRubro(SubRubro subRubro ) {
        int id = 0;
        try {
            iniciaOperacion();
            id = (int) sesion.save(subRubro );
            tx.commit();
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }
        return id;
    }
    
    public SubRubro traerSubRubro(int idSubRubro) throws HibernateException {
        SubRubro subRubro = null;
        try {
            iniciaOperacion();
            subRubro = (SubRubro) sesion.get(SubRubro.class, idSubRubro);
        } finally {
            sesion.close();
        }
        return subRubro;
    }
    
    public List<SubRubro> traerListaSubRubros() throws HibernateException {
        List<SubRubro> listaSubRubros = null;
        try {
            iniciaOperacion();
            listaSubRubros =sesion.createQuery("from SubRubro").list();
        } finally {
            sesion.close();
        }
        return listaSubRubros;
    }

    public List<SubRubro> traerDeUnRubro(int id) {
        List<SubRubro> listaSubRubros = null;
        try {
            iniciaOperacion();
            listaSubRubros =sesion.createQuery("from SubRubro where idRubro="+id).list();
        } finally {
            sesion.close();
        }
        return listaSubRubros;
    }
    
}
