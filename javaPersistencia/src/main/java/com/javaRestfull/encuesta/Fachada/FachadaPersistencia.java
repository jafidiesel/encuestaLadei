package main.java.com.javaRestfull.encuesta.Fachada;

public class FachadaPersistencia {

    private static FachadaPersistencia instance;

    public FachadaPersistencia() {
    }

    public static FachadaPersistencia getInstance() {
        if (instance == null) {
            instance = new FachadaPersistencia();
        }
        return instance;
    }

    //public List<Object> buscar(String claseABuscar, List<Criterio> criterioList) {
       // return FachadaPersistenciaInterna.getInstance().buscar(claseABuscar, criterioList);
    //}

    public void guardar(Object objeto) {
        FachadaPersistenciaInterna.getInstance().guardar(objeto);
    }
}
