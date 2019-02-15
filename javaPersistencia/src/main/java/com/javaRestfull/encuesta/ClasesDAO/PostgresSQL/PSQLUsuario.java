package main.java.com.javaRestfull.encuesta.ClasesDAO.PostgresSQL;

import main.java.com.javaRestfull.encuesta.ClasesDAO.Criterio;
import main.java.com.javaRestfull.encuesta.ClasesDAO.UsuarioDAO;
import main.java.com.javaRestfull.encuesta.Entities.UsuarioEntity;

import java.util.List;
import java.util.Optional;

public class PSQLUsuario implements UsuarioDAO {

    @Override
    public Object get(String nombreClase, Criterio criterio) {
        return Optional.empty();
    }

    @Override
    public List<UsuarioEntity> getAll() {
        return null;
    }

    @Override
    public void save(UsuarioEntity usuarioEntity) {

    }

    @Override
    public void update(UsuarioEntity usuarioEntity, String[] params) {

    }

    @Override
    public void delete(UsuarioEntity usuarioEntity) {

    }
}
