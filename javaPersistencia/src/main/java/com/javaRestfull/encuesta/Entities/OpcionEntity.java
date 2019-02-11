package main.java.com.javaRestfull.encuesta.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "opcion", schema = "public", catalog = "EncuestaDB")
public class OpcionEntity implements Serializable {
    private String codOpcion;
    private String descripcionOpcion;
    private Object oidOpcion;
    private TipoOpcionEntity tipoOpcionByOidOpcion;
    private PreguntaOpcionEntity preguntaOpcionByOidOpcion;

    @Basic
    @Column(name = "codOpcion")
    public String getCodOpcion() {
        return codOpcion;
    }

    public void setCodOpcion(String codOpcion) {
        this.codOpcion = codOpcion;
    }

    @Basic
    @Column(name = "descripcionOpcion")
    public String getDescripcionOpcion() {
        return descripcionOpcion;
    }

    public void setDescripcionOpcion(String descripcionOpcion) {
        this.descripcionOpcion = descripcionOpcion;
    }

    @Id
    @Column(name = "oidOpcion")
    public Object getOidOpcion() {
        return oidOpcion;
    }

    public void setOidOpcion(Object oidOpcion) {
        this.oidOpcion = oidOpcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OpcionEntity that = (OpcionEntity) o;
        return Objects.equals(codOpcion, that.codOpcion) &&
                Objects.equals(descripcionOpcion, that.descripcionOpcion) &&
                Objects.equals(oidOpcion, that.oidOpcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codOpcion, descripcionOpcion, oidOpcion);
    }

    @OneToOne
    @JoinColumn(name = "oidOpcion", referencedColumnName = "oidTipoOpcion", nullable = false)
    public TipoOpcionEntity getTipoOpcionByOidOpcion() {
        return tipoOpcionByOidOpcion;
    }

    public void setTipoOpcionByOidOpcion(TipoOpcionEntity tipoOpcionByOidOpcion) {
        this.tipoOpcionByOidOpcion = tipoOpcionByOidOpcion;
    }

    @OneToOne(mappedBy = "opcionByOidPreguntaOpcion")
    public PreguntaOpcionEntity getPreguntaOpcionByOidOpcion() {
        return preguntaOpcionByOidOpcion;
    }

    public void setPreguntaOpcionByOidOpcion(PreguntaOpcionEntity preguntaOpcionByOidOpcion) {
        this.preguntaOpcionByOidOpcion = preguntaOpcionByOidOpcion;
    }
}
