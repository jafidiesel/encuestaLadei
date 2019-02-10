package main.java.com.javaRestfull.encuesta.ClasesDAO;

import main.java.com.javaRestfull.encuesta.ClasesImp.OpcionImp;
import main.java.com.javaRestfull.encuesta.ClasesImp.TagImp;

import java.util.List;
import java.util.Optional;

public class TagDAO implements Dao<TagImp> {


    @Override
    public Optional<TagImp> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<TagImp> getAll() {
        return null;
    }

    @Override
    public void save(TagImp tagImp) {

    }

    @Override
    public void update(TagImp tagImp, String[] params) {

    }

    @Override
    public void delete(TagImp tagImp) {

    }
}
