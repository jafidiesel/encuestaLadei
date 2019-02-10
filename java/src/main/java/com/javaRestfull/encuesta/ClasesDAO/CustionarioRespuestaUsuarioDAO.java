package main.java.com.javaRestfull.encuesta.ClasesDAO;

import main.java.com.javaRestfull.encuesta.ClasesImp.CuestionarioRespuestaUsuarioImp;
import main.java.com.javaRestfull.encuesta.ClasesImp.OpcionImp;

import java.util.List;
import java.util.Optional;

public class CustionarioRespuestaUsuarioDAO implements Dao<CuestionarioRespuestaUsuarioImp> {


    @Override
    public Optional<CuestionarioRespuestaUsuarioImp> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<CuestionarioRespuestaUsuarioImp> getAll() {
        return null;
    }

    @Override
    public void save(CuestionarioRespuestaUsuarioImp cuestionarioRespuestaUsuarioImp) {

    }

    @Override
    public void update(CuestionarioRespuestaUsuarioImp cuestionarioRespuestaUsuarioImp, String[] params) {

    }

    @Override
    public void delete(CuestionarioRespuestaUsuarioImp cuestionarioRespuestaUsuarioImp) {

    }
}
