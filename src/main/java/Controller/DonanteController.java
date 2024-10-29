package Controller;

import Model.Donante;
import Model.DonanteDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DonanteController {
    private DonanteDAO donanteDAO;

    public DonanteController() {
        this.donanteDAO = new DonanteDAO();
    }

    public List<Donante> listarDonantes() {
        try {
            List<Donante> donantes = donanteDAO.listarDonantes();
            return donantes != null ? donantes : new ArrayList<>(); // Devuelve una lista vacía si es null
        } catch (SQLException e) {
            e.printStackTrace(); // Considera manejarlo de otra manera
            return new ArrayList<>(); // Retorna una lista vacía en caso de error
        }
    }

    public int agregarDonante(Donante donante) {
        
          return donanteDAO.agregarIdDonante(donante);
        
    }

    public void eliminarDonante(int id) {
        try {
            donanteDAO.eliminarDonante(id);
        } catch (SQLException e) {
            e.printStackTrace(); // Considera manejarlo de otra manera
        }
    }

    public Donante obtenerDonantePorDNIModificar(String dni){
        return donanteDAO.obtenerDonantePorDNIModificar(dni);
    }
    
    public boolean actualizarDonante(String nombre, String telefono, String email, String direccion, String dni) {
        // Llama a otro método que realmente maneje la actualización
        return donanteDAO.actualizarDonante(nombre, telefono, email, direccion, dni);
    }
    
    
    
}
