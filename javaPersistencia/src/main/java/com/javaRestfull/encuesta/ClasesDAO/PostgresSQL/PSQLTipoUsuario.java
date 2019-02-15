package main.java.com.javaRestfull.encuesta.ClasesDAO.PostgresSQL;

import main.java.com.javaRestfull.encuesta.ClasesDAO.Criterio;
import main.java.com.javaRestfull.encuesta.ClasesDAO.TipoUsuarioDAO;
import main.java.com.javaRestfull.encuesta.Entities.TipoUsuarioEntity;

import java.util.List;
import java.util.Optional;

public class PSQLTipoUsuario implements TipoUsuarioDAO {

    @Override
    public Object get(String nombreClase, Criterio criterio) {
        return Optional.empty();
    }

    @Override
    public List<TipoUsuarioEntity> getAll() {
        return null;
    }

    @Override
    public void save(TipoUsuarioEntity tipoUsuarioEntity) {

    }

    @Override
    public void update(TipoUsuarioEntity tipoUsuarioEntity, String[] params) {

    }

    @Override
    public void delete(TipoUsuarioEntity tipoUsuarioEntity) {

    }
}
