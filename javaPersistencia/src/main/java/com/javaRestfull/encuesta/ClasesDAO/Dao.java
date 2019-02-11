package main.java.com.javaRestfull.encuesta.ClasesDAO;

import java.util.List;
import java.util.Optional;

//Intermediario
public interface Dao<T> {

    Optional<T> get(long id);

    List<T> getAll();

    void save(T t);

    void update(T t, String[] params);

    void delete(T t);
}

