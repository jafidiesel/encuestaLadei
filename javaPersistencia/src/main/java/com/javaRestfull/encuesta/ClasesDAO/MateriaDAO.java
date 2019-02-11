package main.java.com.javaRestfull.encuesta.ClasesDAO;

import main.java.com.javaRestfull.encuesta.ClasesImp.MateriaImp;
import main.java.com.javaRestfull.encuesta.ClasesImp.OpcionImp;

import java.util.List;
import java.util.Optional;

public class MateriaDAO implements Dao<MateriaImp> {


    @Override
    public Optional<MateriaImp> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<MateriaImp> getAll() {
        return null;
    }

    @Override
    public void save(MateriaImp materiaImp) {

    }

    @Override
    public void update(MateriaImp materiaImp, String[] params) {

    }

    @Override
    public void delete(MateriaImp materiaImp) {

    }
}
