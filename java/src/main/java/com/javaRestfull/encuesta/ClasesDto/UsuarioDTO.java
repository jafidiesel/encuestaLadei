package main.java.com.javaRestfull.encuesta.ClasesDto;

public class UsuarioDTO {
    private  String userDTO;
    private  String passwordDTO;
    private  String nombreDTO;
    private  String apellidoDTO;

    public String getUserDTO() {
        return userDTO;
    }

    public void setUserDTO(String userDTO) {
        this.userDTO = userDTO;
    }

    public String getPasswordDTO() {
        return passwordDTO;
    }

    public void setPasswordDTO(String passwordDTO) {
        this.passwordDTO = passwordDTO;
    }

    public String getNombreDTO() {
        return nombreDTO;
    }

    public void setNombreDTO(String nombreDTO) {
        this.nombreDTO = nombreDTO;
    }

    public String getApellidoDTO() {
        return apellidoDTO;
    }

    public void setApellidoDTO(String apellidoDTO) {
        this.apellidoDTO = apellidoDTO;
    }
}
