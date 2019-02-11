package main.java.com.javaRestfull.encuesta.Experto;

import main.java.com.javaRestfull.encuesta.ClasesImp.CuestionarioImp;
import main.java.com.javaRestfull.encuesta.EntidadesInterfaces.CuestionarioInt;
import main.java.com.javaRestfull.encuesta.Fachada.FachadaPersistencia;

public class ExpertoABMEncuesta {

    public void darAltaEncuenta(){

        //Revisar
        CuestionarioInt cuestionarioImp = new CuestionarioImp();
        FachadaPersistencia.getInstance().guardar(cuestionarioImp);
    }

    public void getEncuesta(){

    }
}
