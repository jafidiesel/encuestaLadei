package main.java.com.javaRestfull.encuesta.Decorador;

import main.java.com.javaRestfull.encuesta.Experto.ExpertoABMEncuesta;
import main.java.com.javaRestfull.encuesta.Fachada.FachadaPersistenciaInterna;

public class DecoradorABMEncuesta extends ExpertoABMEncuesta {
    public DecoradorABMEncuesta(){

        super();
    }

    @Override
    public void darAltaEncuenta() {
        FachadaPersistenciaInterna.getInstance().beginTransaction();
        super.darAltaEncuenta();
    }

    @Override
    public void getEncuesta() {
        super.getEncuesta();
    }
}
