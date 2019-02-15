package main.java.com.javaRestfull.encuesta.ClasesDAO.PostgresSQL;

import main.java.com.javaRestfull.encuesta.ClasesDAO.Criterio;
import main.java.com.javaRestfull.encuesta.ClasesDAO.RespuestaDAO;
import main.java.com.javaRestfull.encuesta.Entities.RespuestaEntity;

import java.util.List;
import java.util.Optional;

public class PSQLRespuestaDAO implements RespuestaDAO {

    @Override
    public Object get(String nombreClase, Criterio criterio) {
        return Optional.empty();
    }

    @Override
    public List<RespuestaEntity> getAll() {
        return null;
    }

    @Override
    public void save(RespuestaEntity respuestaEntity) {

    }

    @Override
    public void update(RespuestaEntity respuestaEntity, String[] params) {

    }

    @Override
    public void delete(RespuestaEntity respuestaEntity) {

    }
}
