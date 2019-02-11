package main.java.com.javaRestfull.encuesta.ClasesImp;

import main.java.com.javaRestfull.encuesta.EntidadesInterfaces.ComisionInt;

public class ComisionImp implements ComisionInt {
    private String codComision;
    private String nombreComision;

    public String getCodComision() {
        return codComision;
    }

    public void setCodComision(String codComision) {
        this.codComision = codComision;
    }

    public String getNombreComision() {
        return nombreComision;
    }

    public void setNombreComision(String nombreComision) {
        this.nombreComision = nombreComision;
    }
}
