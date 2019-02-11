package main.java.com.javaRestfull.encuesta.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "pregunta", schema = "public", catalog = "EncuestaDB")
public class PreguntaEntity implements Serializable {
    private String codPregunta;
    private String descripcionPregunta;
    private Object oidPregunta;
    private PreguntaOpcionEntity preguntaOpcionByOidPregunta;

    @Basic
    @Column(name = "codPregunta")
    public String getCodPregunta() {
        return codPregunta;
    }

    public void setCodPregunta(String codPregunta) {
        this.codPregunta = codPregunta;
    }

    @Basic
    @Column(name = "descripcionPregunta")
    public String getDescripcionPregunta() {
        return descripcionPregunta;
    }

    public void setDescripcionPregunta(String descripcionPregunta) {
        this.descripcionPregunta = descripcionPregunta;
    }

    @Id
    @Column(name = "oidPregunta")
    public Object getOidPregunta() {
        return oidPregunta;
    }

    public void setOidPregunta(Object oidPregunta) {
        this.oidPregunta = oidPregunta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PreguntaEntity that = (PreguntaEntity) o;
        return Objects.equals(codPregunta, that.codPregunta) &&
                Objects.equals(descripcionPregunta, that.descripcionPregunta) &&
                Objects.equals(oidPregunta, that.oidPregunta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codPregunta, descripcionPregunta, oidPregunta);
    }

    @OneToOne(mappedBy = "preguntaByOidPreguntaOpcion")
    public PreguntaOpcionEntity getPreguntaOpcionByOidPregunta() {
        return preguntaOpcionByOidPregunta;
    }

    public void setPreguntaOpcionByOidPregunta(PreguntaOpcionEntity preguntaOpcionByOidPregunta) {
        this.preguntaOpcionByOidPregunta = preguntaOpcionByOidPregunta;
    }
}
