package main.java.com.javaRestfull.encuesta.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tipoOpcion", schema = "public", catalog = "EncuestaDB")
public class TipoOpcionEntity implements Serializable {
    private String codTipoOpcion;
    private String descripcionTipoOpcion;
    private Object oidTipoOpcion;
    private OpcionEntity opcionByOidTipoOpcion;

    @Basic
    @Column(name = "codTipoOpcion")
    public String getCodTipoOpcion() {
        return codTipoOpcion;
    }

    public void setCodTipoOpcion(String codTipoOpcion) {
        this.codTipoOpcion = codTipoOpcion;
    }

    @Basic
    @Column(name = "descripcionTipoOpcion")
    public String getDescripcionTipoOpcion() {
        return descripcionTipoOpcion;
    }

    public void setDescripcionTipoOpcion(String descripcionTipoOpcion) {
        this.descripcionTipoOpcion = descripcionTipoOpcion;
    }

    @Id
    @Column(name = "oidTipoOpcion")
    public Object getOidTipoOpcion() {
        return oidTipoOpcion;
    }

    public void setOidTipoOpcion(Object oidTipoOpcion) {
        this.oidTipoOpcion = oidTipoOpcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipoOpcionEntity that = (TipoOpcionEntity) o;
        return Objects.equals(codTipoOpcion, that.codTipoOpcion) &&
                Objects.equals(descripcionTipoOpcion, that.descripcionTipoOpcion) &&
                Objects.equals(oidTipoOpcion, that.oidTipoOpcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codTipoOpcion, descripcionTipoOpcion, oidTipoOpcion);
    }

    @OneToOne(mappedBy = "tipoOpcionByOidOpcion")
    public OpcionEntity getOpcionByOidTipoOpcion() {
        return opcionByOidTipoOpcion;
    }

    public void setOpcionByOidTipoOpcion(OpcionEntity opcionByOidTipoOpcion) {
        this.opcionByOidTipoOpcion = opcionByOidTipoOpcion;
    }
}
