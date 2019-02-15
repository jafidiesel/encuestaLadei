package main.java.com.javaRestfull.encuesta.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "usuario", schema = "public", catalog = "EncuestaDB")
public class UsuarioEntity implements Serializable {
    private String user;
    private String password;
    private Object oidUsuario;
    private CuestionarioRespuestaUsuarioEntity cuestionarioRespuestaUsuarioByOidUsuario;
    private CuestionarioEntity cuestionarioByOidUsuario;
    private DetalleUsuarioEntity detalleUsuarioByOidUsuario;
    private TipoUsuarioEntity tipoUsuarioByOidUsuario;

    @Basic
    @Column(name = "user")
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Id
    @Column(name = "oidUsuario")
    public Object getOidUsuario() {
        return oidUsuario;
    }

    public void setOidUsuario(Object oidUsuario) {
        this.oidUsuario = oidUsuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsuarioEntity that = (UsuarioEntity) o;
        return Objects.equals(user, that.user) &&
                Objects.equals(password, that.password) &&
                Objects.equals(oidUsuario, that.oidUsuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, password, oidUsuario);
    }

    @OneToOne(mappedBy = "usuarioByOidCuestionarioUsuario")
    public CuestionarioRespuestaUsuarioEntity getCuestionarioRespuestaUsuarioByOidUsuario() {
        return cuestionarioRespuestaUsuarioByOidUsuario;
    }

    public void setCuestionarioRespuestaUsuarioByOidUsuario(CuestionarioRespuestaUsuarioEntity cuestionarioRespuestaUsuarioByOidUsuario) {
        this.cuestionarioRespuestaUsuarioByOidUsuario = cuestionarioRespuestaUsuarioByOidUsuario;
    }

    @OneToOne(mappedBy = "usuarioByOidCuestionario")
    public CuestionarioEntity getCuestionarioByOidUsuario() {
        return cuestionarioByOidUsuario;
    }

    public void setCuestionarioByOidUsuario(CuestionarioEntity cuestionarioByOidUsuario) {
        this.cuestionarioByOidUsuario = cuestionarioByOidUsuario;
    }

    @OneToOne(mappedBy = "usuarioByOidDetalleUsuario")
    public DetalleUsuarioEntity getDetalleUsuarioByOidUsuario() {
        return detalleUsuarioByOidUsuario;
    }

    public void setDetalleUsuarioByOidUsuario(DetalleUsuarioEntity detalleUsuarioByOidUsuario) {
        this.detalleUsuarioByOidUsuario = detalleUsuarioByOidUsuario;
    }

    @OneToOne
    @JoinColumn(name = "oidUsuario", referencedColumnName = "oidTipoUsuario", nullable = false)
    public TipoUsuarioEntity getTipoUsuarioByOidUsuario() {
        return tipoUsuarioByOidUsuario;
    }

    public void setTipoUsuarioByOidUsuario(TipoUsuarioEntity tipoUsuarioByOidUsuario) {
        this.tipoUsuarioByOidUsuario = tipoUsuarioByOidUsuario;
    }
}
