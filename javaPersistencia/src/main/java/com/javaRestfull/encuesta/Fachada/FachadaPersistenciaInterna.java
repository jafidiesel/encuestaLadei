package main.java.com.javaRestfull.encuesta.Fachada;

import main.java.com.javaRestfull.encuesta.ClasesDAO.PostgresSQL.PSQLDAOManager;
import main.java.com.javaRestfull.encuesta.ClasesDAO.PostgresSQL.PSQLPreguntaDAO;
import main.java.com.javaRestfull.encuesta.ClasesDAO.PreguntaDAO;
import main.java.com.javaRestfull.encuesta.ClasesDto.PreguntaDTO;
import main.java.com.javaRestfull.encuesta.Persistencia.HibernateUtil;


public class  FachadaPersistenciaInterna {
    private static FachadaPersistenciaInterna fachadaInterna;

    public FachadaPersistenciaInterna() {
    }

    public static FachadaPersistenciaInterna getInstance() {
        if (fachadaInterna == null) {
            fachadaInterna = new FachadaPersistenciaInterna();
        }
        return fachadaInterna;
    }

   // public List<Object> buscar(String claseABuscar, List<Criterio> criterioList) {

    //}

    //public List<Object> buscar(String claseABuscar) {

    //}


    /*public void guardar(Object objeto) {
        HibernateUtil.getSession().save(objeto);
    }*/

    public void guardar(Object object){
        PreguntaDAO preguntaDAO= (PSQLPreguntaDAO) PSQLDAOManager.getInstance().getDAO(object.getClass().getName());
        preguntaDAO.save((PreguntaDTO) object);
    }

    public void beginTransaction() {
        HibernateUtil.getSession().beginTransaction();
    }

    public void endTransaction(boolean commit) {
        if (commit) {
            HibernateUtil.getSession().getTransaction().commit();
        } else {
            HibernateUtil.getSession().getTransaction().rollback();
        }
        HibernateUtil.getSession().close();
        HibernateUtil.getSessionFactory().close();
    }


}
