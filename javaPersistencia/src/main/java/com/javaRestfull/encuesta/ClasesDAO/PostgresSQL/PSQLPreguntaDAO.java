package main.java.com.javaRestfull.encuesta.ClasesDAO.PostgresSQL;

import main.java.com.javaRestfull.encuesta.ClasesDAO.Criterio;
import main.java.com.javaRestfull.encuesta.ClasesDAO.PreguntaDAO;
import main.java.com.javaRestfull.encuesta.ClasesDto.PreguntaDTO;
import main.java.com.javaRestfull.encuesta.Entities.PreguntaEntity;

import java.util.List;
import java.util.UUID;

public class PSQLPreguntaDAO implements PreguntaDAO {

    @Override
    public Object get(String nombreClase, Criterio criterio) {
        return null;
    }

    @Override
    public List<PreguntaDTO> getAll() {
        return null;
    }

    @Override
    public void save(PreguntaDTO preguntaDTO) {
        String oid = getOID();
        Conexion conexion = new Conexion();
        conexion.guardar( materializar(preguntaDTO, oid));
    }

    public String getOID() {
        UUID uuid = UUID.randomUUID();
        String oid = String.valueOf(uuid);
        return oid;
    }

    private PreguntaEntity materializar(PreguntaDTO preguntaDTO, String oid) {
        PreguntaEntity preguntaEntity = new PreguntaEntity();
        preguntaEntity.setCodPregunta(preguntaDTO.getCodPreguntaDTO());
        preguntaEntity.setDescripcionPregunta(preguntaDTO.getDescripcionPreguntaDTO());
        preguntaEntity.setOidPregunta(oid);
        return preguntaEntity;
    }

    @Override
    public void update(PreguntaDTO preguntaDTO, String[] params) {

    }

    @Override
    public void delete(PreguntaDTO preguntaDTO) {

    }
}
