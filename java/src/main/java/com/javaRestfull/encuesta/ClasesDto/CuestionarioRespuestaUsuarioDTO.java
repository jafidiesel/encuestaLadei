package main.java.com.javaRestfull.encuesta.ClasesDto;

import java.util.Date;

public class CuestionarioRespuestaUsuarioDTO {
    private String codCuestionarioRespuestaUsuarioDTO;
    private Date fechaRealizacionDTO;
    private Date horaRealizacionDTO;

    public String getCodCuestionarioRespuestaUsuarioDTO() {
        return codCuestionarioRespuestaUsuarioDTO;
    }

    public void setCodCuestionarioRespuestaUsuarioDTO(String codCuestionarioRespuestaUsuarioDTO) {
        this.codCuestionarioRespuestaUsuarioDTO = codCuestionarioRespuestaUsuarioDTO;
    }

    public Date getFechaRealizacionDTO() {
        return fechaRealizacionDTO;
    }

    public void setFechaRealizacionDTO(Date fechaRealizacionDTO) {
        this.fechaRealizacionDTO = fechaRealizacionDTO;
    }

    public Date getHoraRealizacionDTO() {
        return horaRealizacionDTO;
    }

    public void setHoraRealizacionDTO(Date horaRealizacionDTO) {
        this.horaRealizacionDTO = horaRealizacionDTO;
    }
}
