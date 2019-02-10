package main.java.com.javaRestfull.encuesta.ClasesDAO;

import main.java.com.javaRestfull.encuesta.ClasesImp.OpcionImp;
import main.java.com.javaRestfull.encuesta.ClasesImp.UsuarioImp;

import java.util.List;
import java.util.Optional;

public class UsuarioDAO implements Dao<UsuarioImp> {

    @Override
    public Optional<UsuarioImp> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<UsuarioImp> getAll() {
        return null;
    }

    @Override
    public void save(UsuarioImp usuarioImp) {

    }

    @Override
    public void update(UsuarioImp usuarioImp, String[] params) {

    }

    @Override
    public void delete(UsuarioImp usuarioImp) {

    }
}
