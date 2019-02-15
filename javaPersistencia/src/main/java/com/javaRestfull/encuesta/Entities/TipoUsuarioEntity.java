package main.java.com.javaRestfull.encuesta.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tipoUsuario", schema = "public", catalog = "EncuestaDB")
public class TipoUsuarioEntity implements Serializable {
    private Object oidTipoUsuario;
    private String codTipoUsuario;
    private String nombreTipoUsuario;
    private String descripcionTipoUsuario;
    private UsuarioEntity usuarioByOidTipoUsuario;

    @Id
    @Column(name = "oidTipoUsuario")
    public Object getOidTipoUsuario() {
        return oidTipoUsuario;
    }

    public void setOidTipoUsuario(Object oidTipoUsuario) {
        this.oidTipoUsuario = oidTipoUsuario;
    }

    @Basic
    @Column(name = "codTipoUsuario")
    public String getCodTipoUsuario() {
        return codTipoUsuario;
    }

    public void setCodTipoUsuario(String codTipoUsuario) {
        this.codTipoUsuario = codTipoUsuario;
    }

    @Basic
    @Column(name = "nombreTipoUsuario")
    public String getNombreTipoUsuario() {
        return nombreTipoUsuario;
    }

    public void setNombreTipoUsuario(String nombreTipoUsuario) {
        this.nombreTipoUsuario = nombreTipoUsuario;
    }

    @Basic
    @Column(name = "descripcionTipoUsuario")
    public String getDescripcionTipoUsuario() {
        return descripcionTipoUsuario;
    }

    public void setDescripcionTipoUsuario(String descripcionTipoUsuario) {
        this.descripcionTipoUsuario = descripcionTipoUsuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipoUsuarioEntity that = (TipoUsuarioEntity) o;
        return Objects.equals(oidTipoUsuario, that.oidTipoUsuario) &&
                Objects.equals(codTipoUsuario, that.codTipoUsuario) &&
                Objects.equals(nombreTipoUsuario, that.nombreTipoUsuario) &&
                Objects.equals(descripcionTipoUsuario, that.descripcionTipoUsuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oidTipoUsuario, codTipoUsuario, nombreTipoUsuario, descripcionTipoUsuario);
    }

    @OneToOne(mappedBy = "tipoUsuarioByOidUsuario")
    public UsuarioEntity getUsuarioByOidTipoUsuario() {
        return usuarioByOidTipoUsuario;
    }

    public void setUsuarioByOidTipoUsuario(UsuarioEntity usuarioByOidTipoUsuario) {
        this.usuarioByOidTipoUsuario = usuarioByOidTipoUsuario;
    }
}
