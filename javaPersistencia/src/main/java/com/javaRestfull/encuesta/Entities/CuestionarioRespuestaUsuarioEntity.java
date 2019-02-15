package main.java.com.javaRestfull.encuesta.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "CuestionarioRespuestaUsuario", schema = "public", catalog = "EncuestaDB")
public class CuestionarioRespuestaUsuarioEntity implements Serializable {
    private Object oidCuestionarioUsuario;
    private String codCuestionarioUsuario;
    private Date fechaRealizacion;
    private Date horaRealizacion;
    private CuestionarioEntity cuestionarioByOidCuestionarioUsuario;
    private UsuarioEntity usuarioByOidCuestionarioUsuario;
    private RespuestaEntity respuestaByOidCuestionarioUsuario;

    @Id
    @Column(name = "oidCuestionarioUsuario")
    public Object getOidCuestionarioUsuario() {
        return oidCuestionarioUsuario;
    }

    public void setOidCuestionarioUsuario(Object oidCuestionarioUsuario) {
        this.oidCuestionarioUsuario = oidCuestionarioUsuario;
    }

    @Basic
    @Column(name = "codCuestionarioUsuario")
    public String getCodCuestionarioUsuario() {
        return codCuestionarioUsuario;
    }

    public void setCodCuestionarioUsuario(String codCuestionarioUsuario) {
        this.codCuestionarioUsuario = codCuestionarioUsuario;
    }

    @Basic
    @Column(name = "fechaRealizacion")
    public Date getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(Date fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    @Basic
    @Column(name = "horaRealizacion")
    public Date getHoraRealizacion() {
        return horaRealizacion;
    }

    public void setHoraRealizacion(Date horaRealizacion) {
        this.horaRealizacion = horaRealizacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CuestionarioRespuestaUsuarioEntity that = (CuestionarioRespuestaUsuarioEntity) o;
        return Objects.equals(oidCuestionarioUsuario, that.oidCuestionarioUsuario) &&
                Objects.equals(codCuestionarioUsuario, that.codCuestionarioUsuario) &&
                Objects.equals(fechaRealizacion, that.fechaRealizacion) &&
                Objects.equals(horaRealizacion, that.horaRealizacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oidCuestionarioUsuario, codCuestionarioUsuario, fechaRealizacion, horaRealizacion);
    }

    @OneToOne
    @JoinColumn(name = "oidCuestionarioUsuario", referencedColumnName = "oidCuestionario", nullable = false)
    public CuestionarioEntity getCuestionarioByOidCuestionarioUsuario() {
        return cuestionarioByOidCuestionarioUsuario;
    }

    public void setCuestionarioByOidCuestionarioUsuario(CuestionarioEntity cuestionarioByOidCuestionarioUsuario) {
        this.cuestionarioByOidCuestionarioUsuario = cuestionarioByOidCuestionarioUsuario;
    }

    @OneToOne
    @JoinColumn(name = "oidCuestionarioUsuario", referencedColumnName = "oidUsuario", nullable = false)
    public UsuarioEntity getUsuarioByOidCuestionarioUsuario() {
        return usuarioByOidCuestionarioUsuario;
    }

    public void setUsuarioByOidCuestionarioUsuario(UsuarioEntity usuarioByOidCuestionarioUsuario) {
        this.usuarioByOidCuestionarioUsuario = usuarioByOidCuestionarioUsuario;
    }

    @OneToOne(mappedBy = "cuestionarioRespuestaUsuarioByOidRespuesta")
    public RespuestaEntity getRespuestaByOidCuestionarioUsuario() {
        return respuestaByOidCuestionarioUsuario;
    }

    public void setRespuestaByOidCuestionarioUsuario(RespuestaEntity respuestaByOidCuestionarioUsuario) {
        this.respuestaByOidCuestionarioUsuario = respuestaByOidCuestionarioUsuario;
    }
}
