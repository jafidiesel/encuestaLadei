package main.java.com.javaRestfull.encuesta.EntidadesInterfaces;

import main.java.com.javaRestfull.encuesta.ClasesImp.PreguntaOpcionImp;

public interface RespuestaInt {

    public PreguntaOpcionImp getPreguntaOpcionImp();

    public void setPreguntaOpcionImp(PreguntaOpcionImp preguntaOpcionImp);

    public String getCodRespuesta();

    public void setCodRespuesta(String codRespuesta);

    public String getObservacion();

    public void setObservacion(String observacion);
}
