package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;

public class DesastreDAO {

    // Método para obtener conexión a SQL Server
    private Connection getConnection() throws SQLException {
        String url = "jdbc:sqlserver://DESKTOP-0SLIEEK:1433;databaseName=GestionDesastres";
        String user = "sa";
        String password = "1234";
        return DriverManager.getConnection(url, user, password);
    }

    // Listar todos los desastres
    public List<Desastre> listarDesastres() throws SQLException {
        List<Desastre> desastres = new ArrayList<>();
        Connection con = getConnection();
        String sql = "SELECT * FROM Desastres";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            Desastre desastre = new Desastre();
            desastre.setIdDesastre(rs.getInt("id_desastre"));
            desastre.setNombreD(rs.getString("nombreD"));
            desastre.setFecha(rs.getString("fecha")); // Considera cambiar a Date si es necesario
            desastre.setUbicacion(rs.getString("ubicacion"));
            desastres.add(desastre);
        }

        rs.close();
        stmt.close();
        con.close();
        return desastres;
    }
    
    public int agregarIdDesastre(Desastre desastre) {
        String sql = "INSERT INTO Desastres (nombreD, fecha, ubicacion) VALUES (?,?,?);";

        try (Connection conexion = getConnection(); 
            PreparedStatement pstmt = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            pstmt.setString(1, desastre.getNombreD());
            pstmt.setString(2, desastre.getFecha());
            pstmt.setString(3, desastre.getUbicacion());



            int filasAfectadas = pstmt.executeUpdate(); // Cuántas filas fueron afectadas, debe ser 1
            if (filasAfectadas > 0) {
                ResultSet rs = pstmt.getGeneratedKeys();
                if (rs.next()) {
                    return rs.getInt(1); 
                }
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Puedes mejorar este manejo de errores
        }

        return 0; 
    }
    // Agregar un nuevo desastre
    public void agregarDesastre(Desastre desastre) throws SQLException {
        Connection con = getConnection();
        String sql = "INSERT INTO Desastres (nombreD, fecha, ubicacion) VALUES (?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, desastre.getNombreD());
        ps.setString(2, desastre.getFecha()); // Considera cambiar a Date si es necesario
        ps.setString(3, desastre.getUbicacion());
        ps.executeUpdate();
        ps.close();
        con.close();
    }

    // Eliminar un desastre
    public void eliminarDesastre(int idDesastre) throws SQLException {
        Connection con = getConnection();
        String sql = "DELETE FROM Desastres WHERE id_desastre = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, idDesastre);
        ps.executeUpdate();
        ps.close();
        con.close();
    }

    public Desastre obtenerDesastrePorIdModificar(String id) {
        Desastre desastre = null;
        String sql = "SELECT nombreD,fecha,ubicacion FROM Desastres WHERE id_desastre = ? ";


        try (Connection conexion = getConnection(); 
             PreparedStatement stmt = conexion.prepareStatement(sql)) {

            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                desastre = new Desastre();
                desastre.setNombreD(rs.getString("nombreD"));
                desastre.setFecha(rs.getString("fecha"));
                desastre.setUbicacion(rs.getString("ubicacion"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return desastre; 
    }
    
    public boolean actualizarDesastre(String nombre, String fecha, String ubicacion, String id) {
        String sql = "UPDATE Desastres " +
                     "SET nombreD = ?, fecha = ?, ubicacion = ? " + 
                     "WHERE id_desastre = ?"; 

        try (Connection conexion = getConnection(); PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, nombre);
            stmt.setString(2, fecha);
            stmt.setString(3, ubicacion);
            stmt.setString(4, id);


            int filasAfectadas = stmt.executeUpdate();
            return filasAfectadas > 0; 
        } catch (SQLException e) {
            e.printStackTrace();
            return false; 
        }
    }
     
    public void llenarComboBoxDesastres(JComboBox<String> cboDesastres) {
        String sql = "SELECT nombreD FROM Desastres";
        
        try (Connection con = getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
             
            // Limpia el comboBox antes de llenarlo
            cboDesastres.removeAllItems();

            // Añade los nombres de los desastres al comboBox
            while (rs.next()) {
                cboDesastres.addItem(rs.getString("nombreD"));
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    } 
     
}
