package main.java.com.javaRestfull.encuesta.ClasesImp;

import main.java.com.javaRestfull.encuesta.EntidadesInterfaces.MateriaInt;

public class MateriaImp implements MateriaInt {
    private String codMateria;
    private String nombreMateria;

    public String getCodMateria() {
        return codMateria;
    }

    public void setCodMateria(String codMateria) {
        this.codMateria = codMateria;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }
}
