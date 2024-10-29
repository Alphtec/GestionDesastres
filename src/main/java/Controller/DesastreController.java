
package Controller;

import Model.Desastre;
import Model.DesastreDAO;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JComboBox;

public class DesastreController {
    private DesastreDAO desastreDAO;

    public DesastreController() {
        this.desastreDAO = new DesastreDAO();
    }

    public List<Desastre> listarDesastres() {
        try {
            return desastreDAO.listarDesastres();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public int agregarDesastre(Desastre desastre) {
        
        return  desastreDAO.agregarIdDesastre(desastre);
        
    }

    public void eliminarDesastre(int id) {
        try {
            desastreDAO.eliminarDesastre(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
    public Desastre obtenerDesastrePorIdModificar(String id){
        return desastreDAO.obtenerDesastrePorIdModificar(id);
    }
    
    public boolean actualizarDesastre(String nombre, String fecha, String ubicacion, String id){
         return desastreDAO.actualizarDesastre(nombre, fecha, ubicacion, id);
     }
    
     public void llenarComboBoxDesastres(JComboBox<String> cboDesastres){
         desastreDAO.llenarComboBoxDesastres(cboDesastres);;
     } 
    
}
