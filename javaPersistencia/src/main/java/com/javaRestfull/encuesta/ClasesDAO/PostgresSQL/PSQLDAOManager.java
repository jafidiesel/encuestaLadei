package main.java.com.javaRestfull.encuesta.ClasesDAO.PostgresSQL;

import main.java.com.javaRestfull.encuesta.ClasesDAO.*;

public class PSQLDAOManager implements DAOManager {

    private static  PSQLDAOManager instance;

    private Object object = null;


    public static PSQLDAOManager getInstance() {
        if(instance == null){
            instance = new PSQLDAOManager();
        }
        return instance;
    }


    @Override
    public Object getDAO(String nombre) {
        if(nombre.compareTo("main.java.com.javaRestfull.encuesta.ClasesDto.PreguntaDTO") == 0){
            object = new PSQLPreguntaDAO();
        }else if(nombre.compareTo("CuestionarioDTO")==0){
            object = new PSQLPreguntaDAO();
        }

        return object;
    }


}
