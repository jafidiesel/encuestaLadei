package main.java.com.javaRestfull.encuesta.ClasesImp;

import java.util.ArrayList;
import java.util.List;

public class UsuarioImp {
    private String user;
    private String password;
    private String nombre;
    private String apellido;
    private TipoUsuarioImp tipoUsuarioImp;
    private List<DetalleUsuarioImp> detalleUsuarioImpList = new ArrayList<>();

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
