package main.java.com.javaRestfull.encuesta.ClasesDAO;

import main.java.com.javaRestfull.encuesta.ClasesImp.CuestionarioImp;

import java.util.List;
import java.util.Optional;

public class CuestionarioDAO implements Dao<CuestionarioImp> {

    @Override
    public Optional<CuestionarioImp> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<CuestionarioImp> getAll() {
        return null;
    }

    @Override
    public void save(CuestionarioImp cuestionarioImp) {

    }

    @Override
    public void update(CuestionarioImp cuestionarioImp, String[] params) {

    }

    @Override
    public void delete(CuestionarioImp cuestionarioImp) {

    }
}
