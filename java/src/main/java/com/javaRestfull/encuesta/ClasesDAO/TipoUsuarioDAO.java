package main.java.com.javaRestfull.encuesta.ClasesDAO;

import main.java.com.javaRestfull.encuesta.ClasesImp.OpcionImp;
import main.java.com.javaRestfull.encuesta.ClasesImp.TipoUsuarioImp;

import java.util.List;
import java.util.Optional;

public class TipoUsuarioDAO implements Dao<TipoUsuarioImp> {


    @Override
    public Optional<TipoUsuarioImp> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<TipoUsuarioImp> getAll() {
        return null;
    }

    @Override
    public void save(TipoUsuarioImp tipoUsuarioImp) {

    }

    @Override
    public void update(TipoUsuarioImp tipoUsuarioImp, String[] params) {

    }

    @Override
    public void delete(TipoUsuarioImp tipoUsuarioImp) {

    }
}
