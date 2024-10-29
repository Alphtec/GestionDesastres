package Model;

public class Desastre {
    private int idDesastre;
    private String nombreD;
    private String fecha;
    private String ubicacion;

    public Desastre() {
    }

    public Desastre(int idDesastre, String nombreD, String fecha , String ubicacion) {
        this.idDesastre = idDesastre;
        this.nombreD = nombreD;
        this.fecha = fecha;
        this.ubicacion = ubicacion; 
    }

    public int getIdDesastre() {
        return idDesastre;
    }

    public void setIdDesastre(int idDesastre) {
        this.idDesastre = idDesastre;
    }

    public String getNombreD() {
        return nombreD;
    }

    public void setNombreD(String nombreD) {
        this.nombreD = nombreD;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
