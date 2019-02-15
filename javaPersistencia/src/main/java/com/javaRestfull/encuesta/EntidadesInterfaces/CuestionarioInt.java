package main.java.com.javaRestfull.encuesta.EntidadesInterfaces;

import main.java.com.javaRestfull.encuesta.ClasesImp.PreguntaOpcionImp;

import java.util.Date;
import java.util.List;

public interface CuestionarioInt {

    public List<PreguntaOpcionImp> getPreguntaOpcionImpList();

    public void setPreguntaOpcionImpList(List<PreguntaOpcionImp> preguntaOpcionImpList);

    public String getCodCuestionario();
    public void setCodCuestionario(String codCuestionario);

    public String getNombreCuestionario();

    public void setNombreCuestionario(String nombreCuestionario);

    public Date getFechaCreacionCuestionario();

    public void setFechaCreacionCuestionario(Date fechaCreacionCuestionario);

    public Date getFechaInicioCuestionario();

    public void setFechaInicioCuestionario(Date fechaInicioCuestionario);

    public Date getHoraInicioCuestionario();

    public void setHoraInicioCuestionario(Date horaInicioCuestionario);

    public Date getFechaCierreCuestionario();

    public void setFechaCierreCuestionario(Date fechaCierreCuestionario);

    public Date getHoraCierreCuestionario();

    public void setHoraCierreCuestionario(Date horaCierreCuestionario);
}
