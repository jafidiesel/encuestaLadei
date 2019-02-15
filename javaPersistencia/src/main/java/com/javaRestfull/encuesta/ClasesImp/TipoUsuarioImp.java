package main.java.com.javaRestfull.encuesta.ClasesImp;

import main.java.com.javaRestfull.encuesta.EntidadesInterfaces.TipoUsuarioInt;

public class TipoUsuarioImp implements TipoUsuarioInt {
    private String codTipoUsuario;
    private String nombreTipoUsuario;
    private String descripcionTipoUsuario;

    public String getCodTipoUsuario() {
        return codTipoUsuario;
    }

    public void setCodTipoUsuario(String codTipoUsuario) {
        this.codTipoUsuario = codTipoUsuario;
    }

    public String getNombreTipoUsuario() {
        return nombreTipoUsuario;
    }

    public void setNombreTipoUsuario(String nombreTipoUsuario) {
        this.nombreTipoUsuario = nombreTipoUsuario;
    }

    public String getDescripcionTipoUsuario() {
        return descripcionTipoUsuario;
    }

    public void setDescripcionTipoUsuario(String descripcionTipoUsuario) {
        this.descripcionTipoUsuario = descripcionTipoUsuario;
    }
}
