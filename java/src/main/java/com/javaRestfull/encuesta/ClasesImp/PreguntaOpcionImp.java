package main.java.com.javaRestfull.encuesta.ClasesImp;

import java.util.List;

public class PreguntaOpcionImp {
    private String codPreguntaOpcion;
    private PreguntaImp preguntaImp;
    private OpcionImp opcionImp;
    private TagImp tagImp;


    public PreguntaImp getPreguntaImp() {
        return preguntaImp;
    }

    public void setPreguntaImp(PreguntaImp preguntaImp) {
        this.preguntaImp = preguntaImp;
    }

    public OpcionImp getOpcionImp() {
        return opcionImp;
    }

    public void setOpcionImp(OpcionImp opcionImp) {
        this.opcionImp = opcionImp;
    }

    public TagImp getTagImp() {
        return tagImp;
    }

    public void setTagImp(TagImp tagImp) {
        this.tagImp = tagImp;
    }

    public String getCodPreguntaOpcion() {
        return codPreguntaOpcion;
    }

    public void setCodPreguntaOpcion(String codPreguntaOpcion) {
        this.codPreguntaOpcion = codPreguntaOpcion;
    }
}
