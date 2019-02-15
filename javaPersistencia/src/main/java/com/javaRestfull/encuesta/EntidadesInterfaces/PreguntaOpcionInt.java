package main.java.com.javaRestfull.encuesta.EntidadesInterfaces;

import main.java.com.javaRestfull.encuesta.ClasesImp.OpcionImp;
import main.java.com.javaRestfull.encuesta.ClasesImp.PreguntaImp;
import main.java.com.javaRestfull.encuesta.ClasesImp.TagImp;

public interface PreguntaOpcionInt {

    public PreguntaImp getPreguntaImp();

    public void setPreguntaImp(PreguntaImp preguntaImp);

    public OpcionImp getOpcionImp();

    public void setOpcionImp(OpcionImp opcionImp);

    public TagImp getTagImp();

    public void setTagImp(TagImp tagImp);

    public String getCodPreguntaOpcion();

    public void setCodPreguntaOpcion(String codPreguntaOpcion);
}
