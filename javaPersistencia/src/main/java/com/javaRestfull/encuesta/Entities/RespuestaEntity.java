package main.java.com.javaRestfull.encuesta.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "respuesta", schema = "public", catalog = "EncuestaDB")
public class RespuestaEntity implements Serializable {
    private String codRespuesta;
    private String observacion;
    private Object oidRespuesta;
    private CuestionarioRespuestaUsuarioEntity cuestionarioRespuestaUsuarioByOidRespuesta;
    private PreguntaOpcionEntity preguntaOpcionByOidRespuesta;

    @Basic
    @Column(name = "codRespuesta")
    public String getCodRespuesta() {
        return codRespuesta;
    }

    public void setCodRespuesta(String codRespuesta) {
        this.codRespuesta = codRespuesta;
    }

    @Basic
    @Column(name = "observacion")
    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Id
    @Column(name = "oidRespuesta")
    public Object getOidRespuesta() {
        return oidRespuesta;
    }

    public void setOidRespuesta(Object oidRespuesta) {
        this.oidRespuesta = oidRespuesta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RespuestaEntity that = (RespuestaEntity) o;
        return Objects.equals(codRespuesta, that.codRespuesta) &&
                Objects.equals(observacion, that.observacion) &&
                Objects.equals(oidRespuesta, that.oidRespuesta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codRespuesta, observacion, oidRespuesta);
    }

    @OneToOne
    @JoinColumn(name = "oidRespuesta", referencedColumnName = "oidCuestionarioUsuario", nullable = false)
    public CuestionarioRespuestaUsuarioEntity getCuestionarioRespuestaUsuarioByOidRespuesta() {
        return cuestionarioRespuestaUsuarioByOidRespuesta;
    }

    public void setCuestionarioRespuestaUsuarioByOidRespuesta(CuestionarioRespuestaUsuarioEntity cuestionarioRespuestaUsuarioByOidRespuesta) {
        this.cuestionarioRespuestaUsuarioByOidRespuesta = cuestionarioRespuestaUsuarioByOidRespuesta;
    }

    @OneToOne
    @JoinColumn(name = "oidRespuesta", referencedColumnName = "oidPreguntaOpcion", nullable = false)
    public PreguntaOpcionEntity getPreguntaOpcionByOidRespuesta() {
        return preguntaOpcionByOidRespuesta;
    }

    public void setPreguntaOpcionByOidRespuesta(PreguntaOpcionEntity preguntaOpcionByOidRespuesta) {
        this.preguntaOpcionByOidRespuesta = preguntaOpcionByOidRespuesta;
    }
}
