package main.java.com.javaRestfull.encuesta.Fabricas;

import main.java.com.javaRestfull.encuesta.Decorador.DecoradorABMEncuesta;

public class FabricaExperto {
    private static FabricaExperto instancia;

    public FabricaExperto() {

    }

    public void finalize() throws Throwable {

    }

    public Object crearExperto(String s) {
        return new DecoradorABMEncuesta();
    }

    public static FabricaExperto getinstancia() {
        if (instancia == null) {

            instancia = new FabricaExperto();
        }
        return instancia;
    }
}
