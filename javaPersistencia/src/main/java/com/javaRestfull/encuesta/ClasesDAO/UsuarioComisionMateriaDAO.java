package main.java.com.javaRestfull.encuesta.ClasesDAO;

import main.java.com.javaRestfull.encuesta.ClasesImp.OpcionImp;
import main.java.com.javaRestfull.encuesta.ClasesImp.UsuarioComisionMateriaImp;

import java.util.List;
import java.util.Optional;

public class UsuarioComisionMateriaDAO implements Dao<UsuarioComisionMateriaImp> {

    @Override
    public Optional<UsuarioComisionMateriaImp> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<UsuarioComisionMateriaImp> getAll() {
        return null;
    }

    @Override
    public void save(UsuarioComisionMateriaImp usuarioComisionMateriaImp) {

    }

    @Override
    public void update(UsuarioComisionMateriaImp usuarioComisionMateriaImp, String[] params) {

    }

    @Override
    public void delete(UsuarioComisionMateriaImp usuarioComisionMateriaImp) {

    }
}
