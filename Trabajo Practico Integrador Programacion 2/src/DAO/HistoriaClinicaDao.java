/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Models.HistoriaClinica;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Usuario
 */
public class HistoriaClinicaDao implements GenericDao<HistoriaClinica>{
        private Connection conexion;

    public HistoriaClinicaDao(Connection conexion) {
        this.conexion = conexion;
    }

    @Override
    public void crear(HistoriaClinica h) throws SQLException {
        String sql = "INSERT INTO HistoriaClinica (eliminado, nroHistoria, grupoSanguineo, antecedentes, medicacionActual, observaciones) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement ps = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setBoolean(1, h.isEliminado());
            ps.setString(2, h.getNroHistoria());
            ps.setString(3, h.getGrupoSanguineo());
            ps.setString(4, h.getAntecedentes());
            ps.setString(5, h.getMedicacionActual());
            ps.setString(6, h.getObservaciones());
            ps.executeUpdate();

            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) h.setId(rs.getLong(1));
            }
        }
    }

    @Override
    public HistoriaClinica leer(long id) throws SQLException {
        String sql = "SELECT * FROM HistoriaClinica WHERE id = ? AND eliminado = 0";
        try (PreparedStatement ps = conexion.prepareStatement(sql)) {
            ps.setLong(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) return mapear(rs);
            }
        }
        return null;
    }

    @Override
    public List<HistoriaClinica> leerTodos() throws SQLException {
        List<HistoriaClinica> lista = new ArrayList<>();
        String sql = "SELECT * FROM HistoriaClinica WHERE eliminado = 0";
        try (PreparedStatement ps = conexion.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) lista.add(mapear(rs));
        }
        return lista;
    }

    @Override
    public void actualizar(HistoriaClinica h) throws SQLException {
        String sql = "UPDATE HistoriaClinica SET nroHistoria=?, grupoSanguineo=?, antecedentes=?, medicacionActual=?, observaciones=?, eliminado=? WHERE id=?";
        try (PreparedStatement ps = conexion.prepareStatement(sql)) {
            ps.setString(1, h.getNroHistoria());
            ps.setString(2, h.getGrupoSanguineo());
            ps.setString(3, h.getAntecedentes());
            ps.setString(4, h.getMedicacionActual());
            ps.setString(5, h.getObservaciones());
            ps.setBoolean(6, h.isEliminado());
            ps.setLong(7, h.getId());
            ps.executeUpdate();
        }
    }

    @Override
    public void eliminar(long id) throws SQLException {
        String sql = "UPDATE HistoriaClinica SET eliminado=1 WHERE id=?";
        try (PreparedStatement ps = conexion.prepareStatement(sql)) {
            ps.setLong(1, id);
            ps.executeUpdate();
        }
    }

    private HistoriaClinica mapear(ResultSet rs) throws SQLException {
        HistoriaClinica h = new HistoriaClinica();
        h.setId(rs.getLong("id"));
        h.setEliminado(rs.getBoolean("eliminado"));
        h.setNroHistoria(rs.getString("nroHistoria"));
        h.setGrupoSanguineo(rs.getString("grupoSanguineo"));
        h.setAntecedentes(rs.getString("antecedentes"));
        h.setMedicacionActual(rs.getString("medicacionActual"));
        h.setObservaciones(rs.getString("observaciones"));
        return h;
    }

}
