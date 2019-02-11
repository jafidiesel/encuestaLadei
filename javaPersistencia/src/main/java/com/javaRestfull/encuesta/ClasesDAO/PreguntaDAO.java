package main.java.com.javaRestfull.encuesta.ClasesDAO;

import main.java.com.javaRestfull.encuesta.ClasesImp.OpcionImp;
import main.java.com.javaRestfull.encuesta.ClasesImp.PreguntaImp;

import java.util.List;
import java.util.Optional;

public class PreguntaDAO implements Dao<PreguntaImp> {

    @Override
    public Optional<PreguntaImp> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<PreguntaImp> getAll() {
        return null;
    }

    @Override
    public void save(PreguntaImp preguntaImp) {

    }

    @Override
    public void update(PreguntaImp preguntaImp, String[] params) {

    }

    @Override
    public void delete(PreguntaImp preguntaImp) {

    }
}
