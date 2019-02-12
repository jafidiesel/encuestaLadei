package main.java.com.javaRestfull.encuesta.ClasesDAO;

import java.util.List;

//Intermediario
public interface Dao<T> {

    Object get(String nombreClase, Criterio criterio);

    List<T> getAll();

    void save(T t);

    void update(T t, String[] params);

    void delete(T t);
}

