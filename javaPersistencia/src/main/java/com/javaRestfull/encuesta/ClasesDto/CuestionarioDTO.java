package main.java.com.javaRestfull.encuesta.ClasesDto;

import java.util.Date;

public class CuestionarioDTO {
    private String codCuestionarioDTO;
    private String nombreCuestionarioDTO;
    private Date fechaCreacionCuestionarioDTO;
    private Date fechaInicioCuestionarioDTO;
    private Date horaInicioCuestionarioDTO;
    private Date fechaCierreCuestionarioDTO; //Java no cuenta con clase Time. Se debe extraer la hora creando un objeto Date
    private Date horaCierreCuestionarioDTO;

    public String getCodCuestionarioDTO() {
        return codCuestionarioDTO;
    }

    public void setCodCuestionarioDTO(String codCuestionarioDTO) {
        this.codCuestionarioDTO = codCuestionarioDTO;
    }

    public String getNombreCuestionarioDTO() {
        return nombreCuestionarioDTO;
    }

    public void setNombreCuestionarioDTO(String nombreCuestionarioDTO) {
        this.nombreCuestionarioDTO = nombreCuestionarioDTO;
    }

    public Date getFechaCreacionCuestionarioDTO() {
        return fechaCreacionCuestionarioDTO;
    }

    public void setFechaCreacionCuestionarioDTO(Date fechaCreacionCuestionarioDTO) {
        this.fechaCreacionCuestionarioDTO = fechaCreacionCuestionarioDTO;
    }

    public Date getFechaInicioCuestionarioDTO() {
        return fechaInicioCuestionarioDTO;
    }

    public void setFechaInicioCuestionarioDTO(Date fechaInicioCuestionarioDTO) {
        this.fechaInicioCuestionarioDTO = fechaInicioCuestionarioDTO;
    }

    public Date getHoraInicioCuestionarioDTO() {
        return horaInicioCuestionarioDTO;
    }

    public void setHoraInicioCuestionarioDTO(Date horaInicioCuestionarioDTO) {
        this.horaInicioCuestionarioDTO = horaInicioCuestionarioDTO;
    }

    public Date getFechaCierreCuestionarioDTO() {
        return fechaCierreCuestionarioDTO;
    }

    public void setFechaCierreCuestionarioDTO(Date fechaCierreCuestionarioDTO) {
        this.fechaCierreCuestionarioDTO = fechaCierreCuestionarioDTO;
    }

    public Date getHoraCierreCuestionarioDTO() {
        return horaCierreCuestionarioDTO;
    }

    public void setHoraCierreCuestionarioDTO(Date horaCierreCuestionarioDTO) {
        this.horaCierreCuestionarioDTO = horaCierreCuestionarioDTO;
    }
}
