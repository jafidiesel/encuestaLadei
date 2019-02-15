package main.java.com.javaRestfull.encuesta.ClasesDAO.PostgresSQL;

import main.java.com.javaRestfull.encuesta.ClasesDAO.Criterio;
import main.java.com.javaRestfull.encuesta.ClasesDAO.OpcionDAO;
import main.java.com.javaRestfull.encuesta.Entities.OpcionEntity;

import java.util.List;
import java.util.Optional;

public class PSQLOpcionDAO implements OpcionDAO {


    @Override
    public Object get(String nombreClase, Criterio criterio) {
        return Optional.empty();
    }

    @Override
    public List<OpcionEntity> getAll() {
        return null;
    }

    @Override
    public void save(OpcionEntity opcionEntity) {

    }

    @Override
    public void update(OpcionEntity opcionEntity, String[] params) {

    }

    @Override
    public void delete(OpcionEntity opcionEntity) {

    }
}
