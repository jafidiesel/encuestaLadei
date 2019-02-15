package main.java.com.javaRestfull.encuesta.Entities;

import main.java.com.javaRestfull.encuesta.ClasesImp.CuestionarioImp;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

//Agentes

@Entity
@Table(name = "cuestionario", schema = "public", catalog = "EncuestaDB")
public class CuestionarioEntity implements Serializable{
    private String codCuestionario;
    private String nombreCuestionario;
    private Date fechaCreacion;
    private Date fechaInicio;
    private Date horaInicio;
    private Date fechaCierre;
    private Date horaCierre;
    private Object oidCuestionario;
    private CuestionarioRespuestaUsuarioEntity cuestionarioRespuestaUsuarioByOidCuestionario;
    private UsuarioEntity usuarioByOidCuestionario;


    @Basic
    @Column(name = "codCuestionario")
    public String getCodCuestionario() {
        return codCuestionario;
    }

    public void setCodCuestionario(String codCuestionario) {
        this.codCuestionario = codCuestionario;
    }

    @Basic
    @Column(name = "nombreCuestionario")
    public String getNombreCuestionario() {
        return nombreCuestionario;
    }

    public void setNombreCuestionario(String nombreCuestionario) {
        this.nombreCuestionario = nombreCuestionario;
    }

    @Basic
    @Column(name = "fechaCreacion")
    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Basic
    @Column(name = "fechaInicio")
    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Basic
    @Column(name = "horaInicio")
    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    @Basic
    @Column(name = "fechaCierre")
    public Date getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(Date fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    @Basic
    @Column(name = "horaCierre")
    public Date getHoraCierre() {
        return horaCierre;
    }

    public void setHoraCierre(Date horaCierre) {
        this.horaCierre = horaCierre;
    }

    @Id
    @Column(name = "oidCuestionario")
    public Object getOidCuestionario() {
        return oidCuestionario;
    }

    public void setOidCuestionario(Object oidCuestionario) {
        this.oidCuestionario = oidCuestionario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CuestionarioEntity that = (CuestionarioEntity) o;
        return Objects.equals(codCuestionario, that.codCuestionario) &&
                Objects.equals(nombreCuestionario, that.nombreCuestionario) &&
                Objects.equals(fechaCreacion, that.fechaCreacion) &&
                Objects.equals(fechaInicio, that.fechaInicio) &&
                Objects.equals(horaInicio, that.horaInicio) &&
                Objects.equals(fechaCierre, that.fechaCierre) &&
                Objects.equals(horaCierre, that.horaCierre) &&
                Objects.equals(oidCuestionario, that.oidCuestionario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codCuestionario, nombreCuestionario, fechaCreacion, fechaInicio, horaInicio, fechaCierre, horaCierre, oidCuestionario);
    }

    @OneToOne(mappedBy = "cuestionarioByOidCuestionarioUsuario")
    public CuestionarioRespuestaUsuarioEntity getCuestionarioRespuestaUsuarioByOidCuestionario() {
        return cuestionarioRespuestaUsuarioByOidCuestionario;
    }

    public void setCuestionarioRespuestaUsuarioByOidCuestionario(CuestionarioRespuestaUsuarioEntity cuestionarioRespuestaUsuarioByOidCuestionario) {
        this.cuestionarioRespuestaUsuarioByOidCuestionario = cuestionarioRespuestaUsuarioByOidCuestionario;
    }

    @OneToOne
    @JoinColumn(name = "oidCuestionario", referencedColumnName = "oidUsuario", nullable = false)
    public UsuarioEntity getUsuarioByOidCuestionario() {
        return usuarioByOidCuestionario;
    }

    public void setUsuarioByOidCuestionario(UsuarioEntity usuarioByOidCuestionario) {
        this.usuarioByOidCuestionario = usuarioByOidCuestionario;
    }
}
