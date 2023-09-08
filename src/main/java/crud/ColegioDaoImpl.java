/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

import com.softech.colegio.model.Colegio;
import conexion.Conexion;
import crudDao.ColegioDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Scorpion
 */
public class ColegioDaoImpl implements ColegioDao {

    private Connection conexion;

    public ColegioDaoImpl() {
        try {
            this.conexion = Conexion.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException("Error al conectar a la base de datos");

        }
    }

    @Override
    public void agregarColegio(Colegio colegio) {
        String consulta = "INSERT INTO colegio (nombre) VALUES (?)";

        try (PreparedStatement pstmt = conexion.prepareStatement(consulta)) {
            pstmt.setString(1, colegio.getNombre());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void actualizarColegio(Colegio colegio) {
        String consulta = "UPDATE colegio SET nombre = ? WHERE idColegio = ?";
        try (PreparedStatement pstmt = conexion.prepareStatement(consulta)) {
            pstmt.setString(1, colegio.getNombre());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void eliminarColegio(int idColegio) {
        String consulta = "DELETE FROM colegio WHERE idColegio = ?";
        try (PreparedStatement pstmt = conexion.prepareStatement(consulta)) {
            pstmt.setInt(1, idColegio);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Colegio obtenerColegioPorId(int idColegio) {
        String consulta = "SELECT * FROM colegio WHERE idColegio = ?";
        try (PreparedStatement pstmt = conexion.prepareStatement(consulta)) {
            pstmt.setInt(1, idColegio);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return new Colegio(rs.getInt("idColegio"), rs.getString("nombre"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Colegio> obtenerTodosLosColegios() {
        List<Colegio> colegios = new ArrayList<>();
        String consulta = "SELECT * FROM colegio ORDER BY idColegio";
        //String consulta = "SELECT * FROM colegio";
        try (PreparedStatement pstmt = conexion.prepareStatement(consulta)) {
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                int idColegio = rs.getInt("idColegio");
                String nombre = rs.getString("nombre");
                Colegio colegio = new Colegio(idColegio, nombre);
                colegios.add(colegio);

                // Solo para probar que funciona la consulta
                //System.out.println("ID: " + idColegio + ", Nombre: " + nombre);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return colegios;
    }
}
