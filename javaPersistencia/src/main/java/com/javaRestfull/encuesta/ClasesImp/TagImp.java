package main.java.com.javaRestfull.encuesta.ClasesImp;

import main.java.com.javaRestfull.encuesta.EntidadesInterfaces.TagInt;

public class TagImp implements TagInt {
    private String codTag;
    private String nombrTag;
    private String descripcionTag;

    public String getCodTag() {
        return codTag;
    }

    public void setCodTag(String codTag) {
        this.codTag = codTag;
    }

    public String getNombrTag() {
        return nombrTag;
    }

    public void setNombrTag(String nombrTag) {
        this.nombrTag = nombrTag;
    }

    public String getDescripcionTag() {
        return descripcionTag;
    }

    public void setDescripcionTag(String descripcionTag) {
        this.descripcionTag = descripcionTag;
    }
}
