
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DonanteDAO {
    // Método para obtener conexión a SQL Server
    private Connection getConnection() throws SQLException {
        String url = "jdbc:sqlserver://DESKTOP-0SLIEEK:1433;databaseName=GestionDesastres";
        String user = "sa";
        String password = "1234";
        return DriverManager.getConnection(url, user, password);
    }
    
    public int agregarIdDonante(Donante donante) {
        String sql = "INSERT INTO Donantes (nombre, telefono, email, direccion, dni) VALUES (?,?,?, ?, ?);";

        try (Connection conexion = getConnection(); 
            PreparedStatement pstmt = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            pstmt.setString(1, donante.getNombre());
            pstmt.setString(2, donante.getTelefono());
            pstmt.setString(3, donante.getEmail());
            pstmt.setString(4, donante.getDireccion());
            pstmt.setString(5, donante.getDni());


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
    
    public boolean donanteExiste(int idDonante) throws SQLException {
        Connection con = getConnection();
        String sql = "SELECT COUNT(*) FROM Donantes WHERE id_donante = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, idDonante);
        ResultSet rs = ps.executeQuery();
        
        boolean existe = false;
        if (rs.next()) {
            existe = rs.getInt(1) > 0; // Si el conteo es mayor a 0, el donante existe
        }
        
        rs.close();
        ps.close();
        con.close();
        return existe;
    }

    // Listar todos los donantes
    public List<Donante> listarDonantes() throws SQLException {
        List<Donante> donantes = new ArrayList<>();
        Connection con = getConnection();
        String sql = "SELECT * FROM Donantes";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            Donante donante = new Donante();
            donante.setIdDonante(rs.getInt("id_donante"));
            donante.setNombre(rs.getString("nombre"));
            donante.setTelefono(rs.getString("telefono"));
            donante.setEmail(rs.getString("email"));
            donante.setDireccion(rs.getString("direccion"));
            donante.setDni(rs.getString("dni"));
            donantes.add(donante);
        }

        rs.close();
        stmt.close();
        con.close();
        return donantes;
    }

    // Eliminar un donante
    public void eliminarDonante(int idDonante) throws SQLException {
        Connection con = getConnection();
        String sql = "DELETE FROM Donantes WHERE id_donante = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, idDonante);
        ps.executeUpdate();
        ps.close();
        con.close();
    }
    
    public Donante obtenerDonantePorDNIModificar(String dni) {
    Donante donante = null;
    String sql = "SELECT nombre,telefono,email,direccion FROM Donantes WHERE dni = ? ";
  
    
    try (Connection conexion = getConnection(); 
         PreparedStatement stmt = conexion.prepareStatement(sql)) {
        
        stmt.setString(1, dni);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            donante = new Donante();
            donante.setNombre(rs.getString("nombre"));
            donante.setTelefono(rs.getString("telefono"));
            donante.setEmail(rs.getString("email"));
            donante.setDireccion(rs.getString("direccion"));
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return donante; 
}

    public boolean actualizarDonante(String nombre, String telefono, String email, String direccion, String dni) {
    String sql = "UPDATE Donantes " +
                 "SET nombre = ?, telefono = ?, email = ?, direccion = ? " + // Añade un espacio aquí
                 "WHERE dni = ?"; 

    try (Connection conexion = getConnection(); PreparedStatement stmt = conexion.prepareStatement(sql)) {
        stmt.setString(1, nombre);
        stmt.setString(2, telefono);
        stmt.setString(3, email);
        stmt.setString(4, direccion);
        stmt.setString(5, dni);

        int filasAfectadas = stmt.executeUpdate();
        return filasAfectadas > 0; 
    } catch (SQLException e) {
        e.printStackTrace();
        return false; 
    }
}
    
}

