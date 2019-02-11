package main.java.com.javaRestfull.encuesta.Fabricas;

import main.java.com.javaRestfull.encuesta.ClasesDAO.*;

public class FabricaDAO {

    private static FabricaDAO instance;
    private Dao dao;


    public FabricaDAO() {
    }

    public static FabricaDAO getInstance() {
        if (instance == null) {
            instance = new FabricaDAO();
        }
        return instance;
    }

    public Dao obtenerDAO(String nuevaClase) {

        if (nuevaClase == "ComisionImp") {
            dao = new ComisionDAO();
        }
        if (nuevaClase == "CuestionarioImp") {
            dao =  new CuestionarioDAO();
        }
        if (nuevaClase == "CuestionarioRespuestaUsuarioImp") {
            dao =  new CuestionarioRespuestaUsuarioDAO();
        }
        if (nuevaClase == "DetalleUsuarioImp") {
            dao =  new DetalleUsuarioDAO();
        }
        if (nuevaClase == "MateriaImp") {
            dao =  new MateriaDAO();
        }
        if (nuevaClase == "OpcionImp") {
            dao =  new OpcionDAO();
        }
        if (nuevaClase == "PreguntaImp") {
            dao =  new PreguntaDAO();
        }
        if (nuevaClase == "PreguntaOpcionImp") {
            dao =  new PreguntaOpcionDAO();
        }
        if (nuevaClase == "TagImp") {
            dao =  new TagDAO();
        }
        if (nuevaClase == "TipoOpcionImp") {
            dao =  new TipoOpcionDAO();
        }
        if (nuevaClase == "TipoUsuarioImp") {
            dao =  new TipoUsuarioDAO();
        }
        if (nuevaClase == "UsuarioComiaionMateriaImp") {
            dao =  new UsuarioComisionMateriaDAO();
        }
        if (nuevaClase == "UsuarioImp") {
            dao =  new UsuarioDAO();
        }
        return dao;
    }
}
