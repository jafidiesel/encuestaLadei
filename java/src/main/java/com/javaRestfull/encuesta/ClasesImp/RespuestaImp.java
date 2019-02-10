package main.java.com.javaRestfull.encuesta.ClasesImp;

public class RespuestaImp {
    private String codRespuesta;
    private String observacion;
    private PreguntaOpcionImp preguntaOpcionImp;

    public PreguntaOpcionImp getPreguntaOpcionImp() {
        return preguntaOpcionImp;
    }

    public void setPreguntaOpcionImp(PreguntaOpcionImp preguntaOpcionImp) {
        this.preguntaOpcionImp = preguntaOpcionImp;
    }

    public String getCodRespuesta() {
        return codRespuesta;
    }

    public void setCodRespuesta(String codRespuesta) {
        this.codRespuesta = codRespuesta;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
}
