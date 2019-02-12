package main.java.com.javaRestfull.encuesta.Experto;

import main.java.com.javaRestfull.encuesta.ClasesDto.PreguntaDTO;
import main.java.com.javaRestfull.encuesta.Fachada.FachadaPersistencia;

public class ExpertoABMEncuesta {

    public void darAltaEncuenta(){

        //Revisar
        //CuestionarioInt cuestionarioImp = (CuestionarioImp)FabricaEntidad.getInstance().createEntidad("CuestionarioImp");
       PreguntaDTO preguntaDTO = new PreguntaDTO();
        preguntaDTO.setCodPreguntaDTO("er23");
        preguntaDTO.setDescripcionPreguntaDTO("dade");
        FachadaPersistencia.getInstance().guardar(preguntaDTO);
    }

    public void getEncuesta(){

    }
}
