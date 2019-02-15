package main.java.com.javaRestfull.encuesta.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "detalleUsuario", schema = "public", catalog = "EncuestaDB")
public class DetalleUsuarioEntity implements Serializable {
    private Object oidDetalleUsuario;
    private String clave;
    private String valor;
    private UsuarioEntity usuarioByOidDetalleUsuario;

    @Id
    @Column(name = "oidDetalleUsuario")
    public Object getOidDetalleUsuario() {
        return oidDetalleUsuario;
    }

    public void setOidDetalleUsuario(Object oidDetalleUsuario) {
        this.oidDetalleUsuario = oidDetalleUsuario;
    }

    @Basic
    @Column(name = "clave")
    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Basic
    @Column(name = "valor")
    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DetalleUsuarioEntity that = (DetalleUsuarioEntity) o;
        return Objects.equals(oidDetalleUsuario, that.oidDetalleUsuario) &&
                Objects.equals(clave, that.clave) &&
                Objects.equals(valor, that.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oidDetalleUsuario, clave, valor);
    }

    @OneToOne
    @JoinColumn(name = "oidDetalleUsuario", referencedColumnName = "oidUsuario", nullable = false)
    public UsuarioEntity getUsuarioByOidDetalleUsuario() {
        return usuarioByOidDetalleUsuario;
    }

    public void setUsuarioByOidDetalleUsuario(UsuarioEntity usuarioByOidDetalleUsuario) {
        this.usuarioByOidDetalleUsuario = usuarioByOidDetalleUsuario;
    }
}
