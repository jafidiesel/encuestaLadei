package main.java.com.javaRestfull.encuesta.EntidadesInterfaces;

import main.java.com.javaRestfull.encuesta.ClasesImp.CuestionarioImp;
import main.java.com.javaRestfull.encuesta.ClasesImp.RespuestaImp;
import main.java.com.javaRestfull.encuesta.ClasesImp.UsuarioImp;

import java.util.Date;
import java.util.List;

public interface CuestionarioRespuestaUsuarioInt {

    public CuestionarioImp getCuestionarioImp();

    public void setCuestionarioImp(CuestionarioImp cuestionarioImp);

    public UsuarioImp getUsuarioImp();

    public void setUsuarioImp(UsuarioImp usuarioImp);

    public List<RespuestaImp> getRespuestaImpList();

    public void setRespuestaImpList(List<RespuestaImp> respuestaImpList);

    public String getCodCuestionarioRespuestaUsuario();

    public void setCodCuestionarioRespuestaUsuario(String codCuestionarioRespuestaUsuario);

    public Date getFechaRealizacion();

    public void setFechaRealizacion(Date fechaRealizacion);

    public Date getHoraRealizacion();

    public void setHoraRealizacion(Date horaRealizacion);
}
