package main.java.com.javaRestfull.encuesta.EntidadesInterfaces;

import main.java.com.javaRestfull.encuesta.ClasesImp.TipoOpcionImp;

public interface OpcionInt {
    public TipoOpcionImp getTipoOpcionImp();

    public void setTipoOpcionImp(TipoOpcionImp tipoOpcionImp);

    public String getCodOpcion();

    public void setCodOpcion(String codOpcion);

    public String getDescripcionOpcion();

    public void setDescripcionOpcion(String descripcionOpcion);

}
