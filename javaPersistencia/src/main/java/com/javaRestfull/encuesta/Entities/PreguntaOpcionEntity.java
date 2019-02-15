package main.java.com.javaRestfull.encuesta.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
@Entity
@Table(name = "preguntaOpcion", schema = "public", catalog = "EncuestaDB")
public class PreguntaOpcionEntity implements Serializable {
    private String codPreguntaOpcion;
    private Object oidPreguntaOpcion;
    private OpcionEntity opcionByOidPreguntaOpcion;
    private PreguntaEntity preguntaByOidPreguntaOpcion;
    private TagEntity tagByOidPreguntaOpcion;
    private RespuestaEntity respuestaByOidPreguntaOpcion;

    @Basic
    @Column(name = "codPreguntaOpcion")
    public String getCodPreguntaOpcion() {
        return codPreguntaOpcion;
    }

    public void setCodPreguntaOpcion(String codPreguntaOpcion) {
        this.codPreguntaOpcion = codPreguntaOpcion;
    }

    @Id
    @Column(name = "oidPreguntaOpcion")
    public Object getOidPreguntaOpcion() {
        return oidPreguntaOpcion;
    }

    public void setOidPreguntaOpcion(Object oidPreguntaOpcion) {
        this.oidPreguntaOpcion = oidPreguntaOpcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PreguntaOpcionEntity that = (PreguntaOpcionEntity) o;
        return Objects.equals(codPreguntaOpcion, that.codPreguntaOpcion) &&
                Objects.equals(oidPreguntaOpcion, that.oidPreguntaOpcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codPreguntaOpcion, oidPreguntaOpcion);
    }

    @OneToOne
    @JoinColumn(name = "oidPreguntaOpcion", referencedColumnName = "oidOpcion", nullable = false)
    public OpcionEntity getOpcionByOidPreguntaOpcion() {
        return opcionByOidPreguntaOpcion;
    }

    public void setOpcionByOidPreguntaOpcion(OpcionEntity opcionByOidPreguntaOpcion) {
        this.opcionByOidPreguntaOpcion = opcionByOidPreguntaOpcion;
    }

    @OneToOne
    @JoinColumn(name = "oidPreguntaOpcion", referencedColumnName = "oidPregunta", nullable = false)
    public PreguntaEntity getPreguntaByOidPreguntaOpcion() {
        return preguntaByOidPreguntaOpcion;
    }

    public void setPreguntaByOidPreguntaOpcion(PreguntaEntity preguntaByOidPreguntaOpcion) {
        this.preguntaByOidPreguntaOpcion = preguntaByOidPreguntaOpcion;
    }

    @OneToOne
    @JoinColumn(name = "oidPreguntaOpcion", referencedColumnName = "oidTag", nullable = false)
    public TagEntity getTagByOidPreguntaOpcion() {
        return tagByOidPreguntaOpcion;
    }

    public void setTagByOidPreguntaOpcion(TagEntity tagByOidPreguntaOpcion) {
        this.tagByOidPreguntaOpcion = tagByOidPreguntaOpcion;
    }

    @OneToOne(mappedBy = "preguntaOpcionByOidRespuesta")
    public RespuestaEntity getRespuestaByOidPreguntaOpcion() {
        return respuestaByOidPreguntaOpcion;
    }

    public void setRespuestaByOidPreguntaOpcion(RespuestaEntity respuestaByOidPreguntaOpcion) {
        this.respuestaByOidPreguntaOpcion = respuestaByOidPreguntaOpcion;
    }
}
