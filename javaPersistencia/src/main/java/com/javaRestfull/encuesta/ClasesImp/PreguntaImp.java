package main.java.com.javaRestfull.encuesta.ClasesImp;

import main.java.com.javaRestfull.encuesta.EntidadesInterfaces.PreguntaInt;

public class PreguntaImp implements PreguntaInt {
    private String codPregunta;
    private String descripcionPregunta;

    public String getCodPregunta() {
        return codPregunta;
    }

    public void setCodPregunta(String codPregunta) {
        this.codPregunta = codPregunta;
    }

    public String getDescripcionPregunta() {
        return descripcionPregunta;
    }

    public void setDescripcionPregunta(String descripcionPregunta) {
        this.descripcionPregunta = descripcionPregunta;
    }
}
