package main.java.com.javaRestfull.encuesta.ClasesDAO.PostgresSQL;

import main.java.com.javaRestfull.encuesta.ClasesDAO.Criterio;
import main.java.com.javaRestfull.encuesta.ClasesDAO.PreguntaOpcionDAO;
import main.java.com.javaRestfull.encuesta.Entities.PreguntaOpcionEntity;

import java.util.List;
import java.util.Optional;

public class PSQLPreguntaOpcion implements PreguntaOpcionDAO {

    @Override
    public Object get(String nombreClase, Criterio criterio) {
        return Optional.empty();
    }

    @Override
    public List<PreguntaOpcionEntity> getAll() {
        return null;
    }

    @Override
    public void save(PreguntaOpcionEntity preguntaOpcionEntity) {

    }

    @Override
    public void update(PreguntaOpcionEntity preguntaOpcionEntity, String[] params) {

    }

    @Override
    public void delete(PreguntaOpcionEntity preguntaOpcionEntity) {

    }
}
