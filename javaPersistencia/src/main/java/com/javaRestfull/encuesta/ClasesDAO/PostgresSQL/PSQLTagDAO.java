package main.java.com.javaRestfull.encuesta.ClasesDAO.PostgresSQL;

import main.java.com.javaRestfull.encuesta.ClasesDAO.Criterio;
import main.java.com.javaRestfull.encuesta.ClasesDAO.TagDAO;
import main.java.com.javaRestfull.encuesta.Entities.TagEntity;

import java.util.List;
import java.util.Optional;

public class PSQLTagDAO implements TagDAO {

    @Override
    public Object get(String nombreClase, Criterio criterio) {
        return Optional.empty();
    }

    @Override
    public List<TagEntity> getAll() {
        return null;
    }

    @Override
    public void save(TagEntity tagEntity) {

    }

    @Override
    public void update(TagEntity tagEntity, String[] params) {

    }

    @Override
    public void delete(TagEntity tagEntity) {

    }
}
