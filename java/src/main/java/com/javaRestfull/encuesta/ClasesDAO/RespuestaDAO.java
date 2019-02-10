package main.java.com.javaRestfull.encuesta.ClasesDAO;

import main.java.com.javaRestfull.encuesta.ClasesImp.RespuestaImp;

import java.util.List;
import java.util.Optional;

public class RespuestaDAO implements Dao<RespuestaImp> {
    @Override
    public Optional<RespuestaImp> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<RespuestaImp> getAll() {
        return null;
    }

    @Override
    public void save(RespuestaImp respuestaImp) {

    }

    @Override
    public void update(RespuestaImp respuestaImp, String[] params) {

    }

    @Override
    public void delete(RespuestaImp respuestaImp) {

    }
}
