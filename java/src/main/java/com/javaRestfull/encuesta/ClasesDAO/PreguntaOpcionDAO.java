package main.java.com.javaRestfull.encuesta.ClasesDAO;

import main.java.com.javaRestfull.encuesta.ClasesImp.OpcionImp;
import main.java.com.javaRestfull.encuesta.ClasesImp.PreguntaOpcionImp;

import java.util.List;
import java.util.Optional;

public class PreguntaOpcionDAO implements Dao<PreguntaOpcionImp> {

    @Override
    public Optional<PreguntaOpcionImp> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<PreguntaOpcionImp> getAll() {
        return null;
    }

    @Override
    public void save(PreguntaOpcionImp preguntaOpcionImp) {

    }

    @Override
    public void update(PreguntaOpcionImp preguntaOpcionImp, String[] params) {

    }

    @Override
    public void delete(PreguntaOpcionImp preguntaOpcionImp) {

    }
}
