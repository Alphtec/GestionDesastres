
package Controller;

import Model.Donacion;
import Model.DonacionDAO;
import Model.DonacionInfo;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

public class DonacionController {
    private DonacionDAO donacionDAO;

    public DonacionController() {
        this.donacionDAO = new DonacionDAO();
    }

    public List<Donacion> listarDonaciones() {
        try {
            return donacionDAO.listarDonaciones();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

     public List<DonacionInfo> listarDonacionesGeneral() throws SQLException{
         return donacionDAO.listarDonacionesGeneral();
     }
    
    public void eliminarDonacion(int id) {
        try {
            donacionDAO.eliminarDonacion(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
    public boolean agregarDonacion(int id_donante, int id_desastre, String tipo, String cantidad, Date fecha){
        return donacionDAO.agregarDonacion(id_donante, id_desastre, tipo, cantidad, fecha);
    }
    
    
    public int obtenerIdDonantePorDni(String dni){
        return donacionDAO.obtenerIdDonantePorDni(dni);
    }
    
    public Donacion obtenerDonacionPorIdModificar(String id){
        return donacionDAO.obtenerDonacionPorIdModificar(id);
    }
    
    public boolean actualizarDonacion(int id_desastre,String tipo, String cantidad, String fecha, String id){
        return donacionDAO.actualizarDonacion(id_desastre,tipo, cantidad, fecha, id);
    }
    
    public List<DonacionInfo> listarDonacionesFiltradas(String dni) throws SQLException{
        return donacionDAO.listarDonacionesFiltradas(dni);
    }
    
    public int obtenerIdDesastrePorNombreDesastre(String nombreD){
        return donacionDAO.obtenerIdDesastrePorNombreDesastre(nombreD);
    }
 
    public int obtenerIdDesastrePorIdDonacion(int idDonacion){
        return donacionDAO.obtenerIdDesastrePorIdDonacion(idDonacion);
    }
    
}