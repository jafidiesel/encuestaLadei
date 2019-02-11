package main.java.com.javaRestfull.encuesta.ClasesImp;

import main.java.com.javaRestfull.encuesta.EntidadesInterfaces.TipoOpcionInt;

public class TipoOpcionImp implements TipoOpcionInt {
    private String codTipoOpcion;
    private String descripcionTipoOpcion;

    public String getCodTipoOpcion() {
        return codTipoOpcion;
    }

    public void setCodTipoOpcion(String codTipoOpcion) {
        this.codTipoOpcion = codTipoOpcion;
    }

    public String getDescripcionTipoOpcion() {
        return descripcionTipoOpcion;
    }

    public void setDescripcionTipoOpcion(String descripcionTipoOpcion) {
        this.descripcionTipoOpcion = descripcionTipoOpcion;
    }
}
