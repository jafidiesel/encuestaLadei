package main.java.com.javaRestfull.encuesta.ClasesDAO;

import main.java.com.javaRestfull.encuesta.ClasesImp.OpcionImp;

import java.util.List;
import java.util.Optional;

public class TipoOpcionDAO implements Dao<OpcionImp> {

    @Override
    public Optional<OpcionImp> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<OpcionImp> getAll() {
        return null;
    }

    @Override
    public void save(OpcionImp opcionImp) {

    }

    @Override
    public void update(OpcionImp opcionImp, String[] params) {

    }

    @Override
    public void delete(OpcionImp opcionImp) {

    }
}
