
package Model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

public class DonacionDAO {
     // Método para obtener conexión a SQL Server
    private Connection getConnection() throws SQLException {
        String url = "jdbc:sqlserver://DESKTOP-0SLIEEK:1433;databaseName=GestionDesastres";
        String user = "sa";
        String password = "1234";
        return DriverManager.getConnection(url, user, password);
    }

    // Operaciones CRUD (crear, leer, actualizar y eliminar)
    public List<Donacion> listarDonaciones() throws SQLException {
        List<Donacion> donaciones = new ArrayList<>();
        Connection con = getConnection();
        String sql = "SELECT id_donacion,tipo,cantidad,fecha FROM Donaciones";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            Donacion donacion = new Donacion();
            donacion.setIdDonacion(rs.getInt("id_donacion"));
            donacion.setTipo(rs.getString("tipo"));
            donacion.setCantidad(rs.getString("cantidad"));
            donacion.setFecha(rs.getDate("fecha"));
            donaciones.add(donacion);
        }

        rs.close();
        stmt.close();
        con.close();
        return donaciones;
    }
    
    public List<DonacionInfo> listarDonacionesGeneral() throws SQLException {
    List<DonacionInfo> donacionInfos = new ArrayList<>();
    Connection con = getConnection();
    String sql = "SELECT d.*, don.*, des.* " +
                 "FROM Donaciones d " +
                 "JOIN Donantes don ON d.id_donante = don.id_donante " +
                 "JOIN Desastres des ON d.id_desastre = des.id_desastre";
    Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery(sql);

    while (rs.next()) {
        Donacion donacion = new Donacion();
        donacion.setIdDonacion(rs.getInt("id_donacion"));
        donacion.setTipo(rs.getString("tipo"));
        donacion.setCantidad(rs.getString("cantidad"));
        donacion.setFecha(rs.getDate("fecha"));

        Donante donante = new Donante();
        donante.setIdDonante(rs.getInt("id_donante"));
        donante.setNombre(rs.getString("nombre"));
        donante.setTelefono(rs.getString("telefono"));
        donante.setEmail(rs.getString("email"));
        donante.setDireccion(rs.getString("direccion"));
        donante.setDni(rs.getString("dni"));

        Desastre desastre = new Desastre();
        desastre.setIdDesastre(rs.getInt("id_desastre"));
        desastre.setNombreD(rs.getString("nombreD"));
        desastre.setFecha(rs.getString("fecha")); // Consider changing to Date if necessary
        desastre.setUbicacion(rs.getString("ubicacion"));

        donacionInfos.add(new DonacionInfo(donante, desastre, donacion));
    }

    rs.close();
    stmt.close();
    con.close();
    return donacionInfos;
}
    

    public boolean agregarDonacion(int id_donante, int id_desastre, String tipo, String cantidad, Date fecha) {
    String sql = "INSERT INTO Donaciones (id_donante, id_desastre, tipo, cantidad, fecha) VALUES (?, ?, ?, ?, ?)";

    try (Connection con = getConnection();
         PreparedStatement ps = con.prepareStatement(sql)) {

        // Establecer los parámetros para la consulta
        ps.setInt(1, id_donante);
        ps.setInt(2, id_desastre);
        ps.setString(3, tipo);
        ps.setString(4, cantidad);
        ps.setDate(5, fecha);

        int filasAfectadas = ps.executeUpdate(); // Ejecutar la consulta

        return filasAfectadas > 0; // Retorna true si se insertó al menos una fila

    } catch (SQLException e) {
        e.printStackTrace(); // Manejo de errores
    }

    return false; // Retorna false si ocurre una excepción o no se inserta ninguna fila
}
    
    public void eliminarDonacion(int idDonacion) throws SQLException {
        Connection con = getConnection();
        String sql = "DELETE FROM donaciones WHERE id_donacion = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, idDonacion);
        ps.executeUpdate();
        ps.close();
        con.close();
    }
    
    public int obtenerIdDonantePorDni(String dni) {
        String sql = "SELECT id_donante FROM Donantes WHERE dni = ?";

        try (Connection conexion = getConnection();
             PreparedStatement pstmt = conexion.prepareStatement(sql)) {
            pstmt.setString(1, dni);
            ResultSet rs = pstmt.executeQuery(); // Ejecutar la consulta de selección

            if (rs.next()) {
                return rs.getInt("id_donante"); // Obtener el valor de la columna 'id_donante'
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Puedes mejorar este manejo de errores
        }

        return 0; // Retornar 0 si no se encontró el donante
    }
    
    public int obtenerIdDesastrePorNombreDesastre(String nombreD) {
        String sql = "SELECT id_desastre FROM Desastres WHERE nombreD = ? ";

        try (Connection conexion = getConnection();
             PreparedStatement pstmt = conexion.prepareStatement(sql)) {
            pstmt.setString(1, nombreD);
            ResultSet rs = pstmt.executeQuery(); // Ejecutar la consulta de selección

            if (rs.next()) {
                return rs.getInt("id_desastre"); // Obtener el valor de la columna 'id_donante'
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Puedes mejorar este manejo de errores
        }

        return 0; // Retornar 0 si no se encontró el donante
    }
    
    public Donacion obtenerDonacionPorIdModificar(String id) {
        Donacion donacion = null;
        String sql = "SELECT tipo,cantidad,fecha FROM Donaciones WHERE id_donacion = ? ";


        try (Connection conexion = getConnection(); 
             PreparedStatement stmt = conexion.prepareStatement(sql)) {

            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                donacion = new Donacion();
                donacion.setTipo(rs.getString("tipo"));
                donacion.setCantidad(rs.getString("cantidad"));
                donacion.setFecha(rs.getDate("fecha"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return donacion; 
    }
    
    public boolean actualizarDonacion(int id_desastre,String tipo, String cantidad, String fecha, String id) {
        String sql = "UPDATE Donaciones " +
                     "SET id_desastre = ?, tipo = ?, cantidad = ?, fecha = ? " + 
                     "WHERE id_donacion = ?"; 

        try (Connection conexion = getConnection(); PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setInt(1, id_desastre);
            stmt.setString(2, tipo);
            stmt.setString(3, cantidad);
            stmt.setString(4, fecha);
            stmt.setString(5, id);


            int filasAfectadas = stmt.executeUpdate();
            return filasAfectadas > 0; 
        } catch (SQLException e) {
            e.printStackTrace();
            return false; 
        }
    }
    
    
    
    public List<DonacionInfo> listarDonacionesFiltradas(String dni) throws SQLException {
    List<DonacionInfo> donacionInfos = new ArrayList<>();
    Connection con = getConnection();
    String sql = "SELECT d.*, don.*, des.* " +
                 "FROM Donaciones d " +
                 "JOIN Donantes don ON d.id_donante = don.id_donante " +
                 "JOIN Desastres des ON d.id_desastre = des.id_desastre "+
                 "WHERE don.dni = ?";
    PreparedStatement pstmt = con.prepareStatement(sql);
    pstmt.setString(1, dni);
    ResultSet rs = pstmt.executeQuery();

    while (rs.next()) {
        Donacion donacion = new Donacion();
        donacion.setIdDonacion(rs.getInt("id_donacion"));
        donacion.setTipo(rs.getString("tipo"));
        donacion.setCantidad(rs.getString("cantidad"));
        donacion.setFecha(rs.getDate("fecha"));

        Donante donante = new Donante();
        donante.setIdDonante(rs.getInt("id_donante"));
        donante.setNombre(rs.getString("nombre"));
        donante.setTelefono(rs.getString("telefono"));
        donante.setEmail(rs.getString("email"));
        donante.setDireccion(rs.getString("direccion"));
        donante.setDni(rs.getString("dni"));

        Desastre desastre = new Desastre();
        desastre.setIdDesastre(rs.getInt("id_desastre"));
        desastre.setNombreD(rs.getString("nombreD"));
        desastre.setFecha(rs.getString("fecha")); // Cambiar a Date si es necesario
        desastre.setUbicacion(rs.getString("ubicacion"));

        donacionInfos.add(new DonacionInfo(donante, desastre, donacion));
    }

    rs.close();
    pstmt.close();
    con.close();
    return donacionInfos;
}
    
    public int obtenerIdDesastrePorIdDonacion(int idDonacion) {
    String sql = "SELECT id_desastre FROM Donaciones WHERE id_donacion = ?";
    
    try (Connection conexion = getConnection();
         PreparedStatement pstmt = conexion.prepareStatement(sql)) {
         
        pstmt.setInt(1, idDonacion);
        ResultSet rs = pstmt.executeQuery();

        if (rs.next()) {
            return rs.getInt("id_desastre"); // Retorna el id_desastre si se encuentra
        }
    } catch (SQLException e) {
        e.printStackTrace(); // Manejo de errores
    }

    return 0; // Retorna 0 si no se encuentra el id_desastre para el id_donacion
}
    
    
    
    
    
}
