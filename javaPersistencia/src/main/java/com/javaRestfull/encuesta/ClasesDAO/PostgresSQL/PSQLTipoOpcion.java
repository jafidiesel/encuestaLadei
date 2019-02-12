package main.java.com.javaRestfull.encuesta.ClasesDAO.PostgresSQL;

import main.java.com.javaRestfull.encuesta.ClasesDAO.Criterio;
import main.java.com.javaRestfull.encuesta.ClasesDAO.TipoOpcionDAO;
import main.java.com.javaRestfull.encuesta.Entities.TipoOpcionEntity;

import java.util.List;
import java.util.Optional;

public class PSQLTipoOpcion implements TipoOpcionDAO {

    @Override
    public Object get(String nombreClase, Criterio criterio) {
        return Optional.empty();
    }

    @Override
    public List<TipoOpcionEntity> getAll() {
        return null;
    }

    @Override
    public void save(TipoOpcionEntity tipoOpcionEntity) {

    }

    @Override
    public void update(TipoOpcionEntity tipoOpcionEntity, String[] params) {

    }

    @Override
    public void delete(TipoOpcionEntity tipoOpcionEntity) {

    }
}
