package main.java.com.javaRestfull.encuesta.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tag", schema = "public", catalog = "EncuestaDB")
public class TagEntity implements Serializable {
    private String codTag;
    private String nombreTag;
    private String descripcionTag;
    private Object oidTag;
    private PreguntaOpcionEntity preguntaOpcionByOidTag;

    @Basic
    @Column(name = "codTag")
    public String getCodTag() {
        return codTag;
    }

    public void setCodTag(String codTag) {
        this.codTag = codTag;
    }

    @Basic
    @Column(name = "nombreTag")
    public String getNombreTag() {
        return nombreTag;
    }

    public void setNombreTag(String nombreTag) {
        this.nombreTag = nombreTag;
    }

    @Basic
    @Column(name = "descripcionTag")
    public String getDescripcionTag() {
        return descripcionTag;
    }

    public void setDescripcionTag(String descripcionTag) {
        this.descripcionTag = descripcionTag;
    }

    @Id
    @Column(name = "oidTag")
    public Object getOidTag() {
        return oidTag;
    }

    public void setOidTag(Object oidTag) {
        this.oidTag = oidTag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TagEntity tagEntity = (TagEntity) o;
        return Objects.equals(codTag, tagEntity.codTag) &&
                Objects.equals(nombreTag, tagEntity.nombreTag) &&
                Objects.equals(descripcionTag, tagEntity.descripcionTag) &&
                Objects.equals(oidTag, tagEntity.oidTag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codTag, nombreTag, descripcionTag, oidTag);
    }

    @OneToOne(mappedBy = "tagByOidPreguntaOpcion")
    public PreguntaOpcionEntity getPreguntaOpcionByOidTag() {
        return preguntaOpcionByOidTag;
    }

    public void setPreguntaOpcionByOidTag(PreguntaOpcionEntity preguntaOpcionByOidTag) {
        this.preguntaOpcionByOidTag = preguntaOpcionByOidTag;
    }
}
