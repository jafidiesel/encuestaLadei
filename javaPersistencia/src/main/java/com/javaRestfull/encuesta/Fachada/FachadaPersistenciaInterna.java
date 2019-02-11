package main.java.com.javaRestfull.encuesta.Fachada;

import main.java.com.javaRestfull.encuesta.ClasesDAO.Criterio;
import main.java.com.javaRestfull.encuesta.Fabricas.FabricaDAO;
import main.java.com.javaRestfull.encuesta.Persistencia.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import java.util.List;


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

    public List<Object> buscar(String claseABuscar, List<Criterio> criterioList) {

        Criteria cr = null;
        try {
            cr = HibernateUtil.getSession().createCriteria(Class.forName("Clases." + claseABuscar), claseABuscar.toLowerCase());
        } catch (ClassNotFoundException e) {
            System.out.println("Error creating criteria. " + e);
        }

        //   if (criterioList == null) {
        for (Criterio criterio : criterioList) {
            String atributo = criterio.getAtributo();
            String operacion = criterio.getOperacion();
            Object valor = criterio.getValor();

            switch (operacion) {
                case "=":
                    if(criterio.getValor()!=null)
                        cr.add(Restrictions.conjunction(Restrictions.eq(atributo, valor)));
                    else cr.add(Restrictions.conjunction(Restrictions.isNull(atributo)));
                    break;
                case "<":
                    cr.add(Restrictions.conjunction(Restrictions.lt(atributo, valor)));
                    break;
                case ">":
                    cr.add(Restrictions.conjunction(Restrictions.gt(atributo, valor)));
                    break;
                case "<=":
                    cr.add(Restrictions.conjunction(Restrictions.le(atributo, valor)));
                    break;
                case ">=":
                    cr.add(Restrictions.conjunction(Restrictions.ge(atributo, valor)));
                    break;
                case "<>":
                    cr.add(Restrictions.conjunction(Restrictions.ne(atributo, valor)));
                    break;
                case "contains":
                    //Todos las colecciones deben empezar de la siguiente manera: claseColeccionList
                    //Generamos el nombre de esa colección a partir del atributo
                    String lista = String.valueOf(atributo.charAt(0))
                            .toLowerCase() + atributo.substring(1);// + "List"; //materiaList, detalleReposicionList
                                cr.createAlias(lista, "lista")
                            .add(Restrictions.conjunction(Restrictions.eq("lista.OID", ((main.java.com.javaRestfull.encuesta.Entities.EntidadGeneral) valor).getOid())));
                    break;
            }

        }
        //    }

        return cr.list();
    }

    public List<Object> buscar(String claseABuscar) {
        Criteria cr = null;
        try {
            cr = HibernateUtil.getSession().createCriteria(Class.forName("Clases." + claseABuscar), claseABuscar.toLowerCase());


        } catch (ClassNotFoundException e) {
            System.out.println("Error creating criteria. " + e);
        }



        return cr.list();
    }


    /*public void guardar(Object objeto) {
        HibernateUtil.getSession().save(objeto);
    }*/

    public void guardar(Object object){
        FabricaDAO.getInstance().obtenerDAO(object.getClass().getName()).save(object);

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
