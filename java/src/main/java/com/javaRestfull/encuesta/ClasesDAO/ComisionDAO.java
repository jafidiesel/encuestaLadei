package main.java.com.javaRestfull.encuesta.ClasesDAO;

import main.java.com.javaRestfull.encuesta.ClasesImp.ComisionImp;
import main.java.com.javaRestfull.encuesta.ClasesImp.OpcionImp;

import java.util.List;
import java.util.Optional;

public class ComisionDAO implements Dao<ComisionImp> {

    @Override
    public Optional<ComisionImp> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<ComisionImp> getAll() {
        return null;
    }

    @Override
    public void save(ComisionImp comisionImp) {

    }

    @Override
    public void update(ComisionImp comisionImp, String[] params) {

    }

    @Override
    public void delete(ComisionImp comisionImp) {

    }
}
