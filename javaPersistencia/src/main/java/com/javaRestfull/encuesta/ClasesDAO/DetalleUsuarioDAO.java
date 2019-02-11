package main.java.com.javaRestfull.encuesta.ClasesDAO;

import main.java.com.javaRestfull.encuesta.ClasesImp.DetalleUsuarioImp;
import main.java.com.javaRestfull.encuesta.ClasesImp.OpcionImp;

import java.util.List;
import java.util.Optional;

public class DetalleUsuarioDAO implements Dao<DetalleUsuarioImp> {

    @Override
    public Optional<DetalleUsuarioImp> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<DetalleUsuarioImp> getAll() {
        return null;
    }

    @Override
    public void save(DetalleUsuarioImp detalleUsuarioImp) {

    }

    @Override
    public void update(DetalleUsuarioImp detalleUsuarioImp, String[] params) {

    }

    @Override
    public void delete(DetalleUsuarioImp detalleUsuarioImp) {

    }
}
