package main.java.com.javaRestfull.encuesta.ClasesDAO.PostgresSQL;

import main.java.com.javaRestfull.encuesta.ClasesDAO.Criterio;
import main.java.com.javaRestfull.encuesta.ClasesDAO.DetalleUsuarioDAO;
import main.java.com.javaRestfull.encuesta.Entities.DetalleUsuarioEntity;

import java.util.List;
import java.util.Optional;

public class PSQLDetalleUsuario implements DetalleUsuarioDAO {

    @Override
    public Object get(String nombreClase, Criterio criterio) {
        return Optional.empty();
    }

    @Override
    public List<DetalleUsuarioEntity> getAll() {
        return null;
    }

    @Override
    public void save(DetalleUsuarioEntity detalleUsuarioEntity) {

    }

    @Override
    public void update(DetalleUsuarioEntity detalleUsuarioEntity, String[] params) {

    }

    @Override
    public void delete(DetalleUsuarioEntity detalleUsuarioEntity) {

    }
}
