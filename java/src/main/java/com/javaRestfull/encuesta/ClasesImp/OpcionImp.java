package main.java.com.javaRestfull.encuesta.ClasesImp;

public class OpcionImp {
    private String codOpcion;
    private String descripcionOpcion;
    private TipoOpcionImp tipoOpcionImp;

    public TipoOpcionImp getTipoOpcionImp() {
        return tipoOpcionImp;
    }

    public void setTipoOpcionImp(TipoOpcionImp tipoOpcionImp) {
        this.tipoOpcionImp = tipoOpcionImp;
    }

    public String getCodOpcion() {
        return codOpcion;
    }

    public void setCodOpcion(String codOpcion) {
        this.codOpcion = codOpcion;
    }

    public String getDescripcionOpcion() {
        return descripcionOpcion;
    }

    public void setDescripcionOpcion(String descripcionOpcion) {
        this.descripcionOpcion = descripcionOpcion;
    }

}
