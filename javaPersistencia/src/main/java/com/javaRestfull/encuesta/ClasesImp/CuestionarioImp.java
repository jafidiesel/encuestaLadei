package main.java.com.javaRestfull.encuesta.ClasesImp;

import main.java.com.javaRestfull.encuesta.EntidadesInterfaces.CuestionarioInt;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CuestionarioImp implements CuestionarioInt {
    private String codCuestionario;
    private String nombreCuestionario;
    private Date fechaCreacionCuestionario;
    private Date fechaInicioCuestionario;
    private Date horaInicioCuestionario;
    private Date fechaCierreCuestionario; //Java no cuenta con clase Time. Se debe extraer la hora creando un objeto Date
    private Date horaCierreCuestionario;
    private List<PreguntaOpcionImp> preguntaOpcionImpList = new ArrayList<>();

    public List<PreguntaOpcionImp> getPreguntaOpcionImpList() {
        return preguntaOpcionImpList;
    }

    public void setPreguntaOpcionImpList(List<PreguntaOpcionImp> preguntaOpcionImpList) {
        this.preguntaOpcionImpList = preguntaOpcionImpList;
    }

    public String getCodCuestionario() {
        return codCuestionario;
    }

    public void setCodCuestionario(String codCuestionario) {
        this.codCuestionario = codCuestionario;
    }

    public String getNombreCuestionario() {
        return nombreCuestionario;
    }

    public void setNombreCuestionario(String nombreCuestionario) {
        this.nombreCuestionario = nombreCuestionario;
    }

    public Date getFechaCreacionCuestionario() {
        return fechaCreacionCuestionario;
    }

    public void setFechaCreacionCuestionario(Date fechaCreacionCuestionario) {
        this.fechaCreacionCuestionario = fechaCreacionCuestionario;
    }

    public Date getFechaInicioCuestionario() {
        return fechaInicioCuestionario;
    }

    public void setFechaInicioCuestionario(Date fechaInicioCuestionario) {
        this.fechaInicioCuestionario = fechaInicioCuestionario;
    }

    public Date getHoraInicioCuestionario() {
        return horaInicioCuestionario;
    }

    public void setHoraInicioCuestionario(Date horaInicioCuestionario) {
        this.horaInicioCuestionario = horaInicioCuestionario;
    }

    public Date getFechaCierreCuestionario() {
        return fechaCierreCuestionario;
    }

    public void setFechaCierreCuestionario(Date fechaCierreCuestionario) {
        this.fechaCierreCuestionario = fechaCierreCuestionario;
    }

    public Date getHoraCierreCuestionario() {
        return horaCierreCuestionario;
    }

    public void setHoraCierreCuestionario(Date horaCierreCuestionario) {
        this.horaCierreCuestionario = horaCierreCuestionario;
    }
}
