package main.java.com.javaRestfull.encuesta.ClasesDAO;

import main.java.com.javaRestfull.encuesta.ClasesDto.ComisionDTO;

import java.util.List;
import java.util.Optional;


public class ComisionDAO implements Dao<ComisionDTO> {


    @Override
    public Optional<ComisionDTO> get(String nombreClase, Criterio criterio) {
        return Optional.empty();
    }

    @Override
    public List<ComisionDTO> getAll() {
        return null;
    }

    @Override
    public void save(ComisionDTO comisionDTO) {

    }

    @Override
    public void update(ComisionDTO comisionDTO, String[] params) {

    }

    @Override
    public void delete(ComisionDTO comisionDTO) {

    }
}
