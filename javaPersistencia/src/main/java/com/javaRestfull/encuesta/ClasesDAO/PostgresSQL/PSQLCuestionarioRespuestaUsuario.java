package main.java.com.javaRestfull.encuesta.ClasesDAO.PostgresSQL;

import main.java.com.javaRestfull.encuesta.ClasesDAO.Criterio;
import main.java.com.javaRestfull.encuesta.ClasesDAO.CuestionarioRespuestaUsuarioDAO;
import main.java.com.javaRestfull.encuesta.Entities.CuestionarioRespuestaUsuarioEntity;

import java.util.List;
import java.util.Optional;

public class PSQLCuestionarioRespuestaUsuario implements CuestionarioRespuestaUsuarioDAO {

    @Override
    public Object get(String nombreClase, Criterio criterio) {
        return Optional.empty();
    }

    @Override
    public List<CuestionarioRespuestaUsuarioEntity> getAll() {
        return null;
    }

    @Override
    public void save(CuestionarioRespuestaUsuarioEntity cuestionarioRespuestaUsuarioEntity) {

    }

    @Override
    public void update(CuestionarioRespuestaUsuarioEntity cuestionarioRespuestaUsuarioEntity, String[] params) {

    }

    @Override
    public void delete(CuestionarioRespuestaUsuarioEntity cuestionarioRespuestaUsuarioEntity) {

    }
}
