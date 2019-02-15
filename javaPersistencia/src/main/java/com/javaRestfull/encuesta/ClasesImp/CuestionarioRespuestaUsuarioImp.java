package main.java.com.javaRestfull.encuesta.ClasesImp;

import main.java.com.javaRestfull.encuesta.EntidadesInterfaces.CuestionarioRespuestaUsuarioInt;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CuestionarioRespuestaUsuarioImp implements CuestionarioRespuestaUsuarioInt {
    private String codCuestionarioRespuestaUsuario;
    private Date fechaRealizacion;
    private Date horaRealizacion;
    private List<RespuestaImp> respuestaImpList = new ArrayList<>();
    private CuestionarioImp cuestionarioImp;
    private UsuarioImp usuarioImp;

    public CuestionarioImp getCuestionarioImp() {
        return cuestionarioImp;
    }

    public void setCuestionarioImp(CuestionarioImp cuestionarioImp) {
        this.cuestionarioImp = cuestionarioImp;
    }

    public UsuarioImp getUsuarioImp() {
        return usuarioImp;
    }

    public void setUsuarioImp(UsuarioImp usuarioImp) {
        this.usuarioImp = usuarioImp;
    }

    public List<RespuestaImp> getRespuestaImpList() {
        return respuestaImpList;
    }

    public void setRespuestaImpList(List<RespuestaImp> respuestaImpList) {
        this.respuestaImpList = respuestaImpList;
    }

    public String getCodCuestionarioRespuestaUsuario() {
        return codCuestionarioRespuestaUsuario;
    }

    public void setCodCuestionarioRespuestaUsuario(String codCuestionarioRespuestaUsuario) {
        this.codCuestionarioRespuestaUsuario = codCuestionarioRespuestaUsuario;
    }

    public Date getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(Date fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    public Date getHoraRealizacion() {
        return horaRealizacion;
    }

    public void setHoraRealizacion(Date horaRealizacion) {
        this.horaRealizacion = horaRealizacion;
    }
}
