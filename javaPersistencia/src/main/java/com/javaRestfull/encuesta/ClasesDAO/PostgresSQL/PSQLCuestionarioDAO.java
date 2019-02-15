package main.java.com.javaRestfull.encuesta.ClasesDAO.PostgresSQL;

import main.java.com.javaRestfull.encuesta.ClasesDAO.Criterio;
import main.java.com.javaRestfull.encuesta.ClasesDAO.CuestionarioDAO;
import main.java.com.javaRestfull.encuesta.Entities.CuestionarioEntity;

import java.util.List;
import java.util.Optional;

public class PSQLCuestionarioDAO implements CuestionarioDAO {

    //No se tiene el ID por lo que no se puede buscar por el mismo y se utilizan criterios de busqueda
    @Override
    public Object get(String nombreClase, Criterio criterio) {
        return Optional.empty();
    }

    @Override
    public List<CuestionarioEntity> getAll() {
        return null;
    }

    @Override
    public void save(CuestionarioEntity cuestionarioEntity) {

    }

    @Override
    public void update(CuestionarioEntity cuestionarioEntity, String[] params) {

    }

    @Override
    public void delete(CuestionarioEntity cuestionarioEntity) {

    }
}
