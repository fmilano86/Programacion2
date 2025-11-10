/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Models.Paciente;

/**
 *
 * @author Usuario
 */
public class PacienteDAO {
    private static final String URL = "jdbc:mysql://localhost:3306/tfibd";
    private static final String USER = "root";
    private static final String PASSWORD = "tu_contraseña";

    // Insertar paciente
    public void insertar(Paciente p) {
        String sql = "INSERT INTO Paciente (nombre, apellido, dni, direccion, fecha_nacimiento) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setString(1, p.getNombre());
            ps.setString(2, p.getApellido());
            ps.setInt(3, p.getDni());
            ps.setString(4, p.getDireccion());
            ps.setDate(5, p.getFechaNacimiento());

            ps.executeUpdate();

            // Obtener el ID generado
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                p.setIdPaciente(rs.getInt(1));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Listar todos los pacientes
    public List<Paciente> listar() {
        List<Paciente> lista = new ArrayList<>();
        String sql = "SELECT * FROM Paciente";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Paciente p = new Paciente(
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getInt("dni"),
                        rs.getString("direccion"),
                        rs.getDate("fecha_nacimiento")
                );
                p.setIdPaciente(rs.getInt("id_paciente"));
                lista.add(p);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }
}
