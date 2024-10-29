package Model;
public class DonacionInfo {
    
    private Donante donante;
    private Desastre desastre;
    private Donacion donacion;

    public DonacionInfo() {
    }

    public DonacionInfo(Donante donante, Desastre desastre, Donacion donacion) {
        this.donante = donante;
        this.desastre = desastre;
        this.donacion = donacion;
    }

    public Donante getDonante() {
        return donante;
    }

    public void setDonante(Donante donante) {
        this.donante = donante;
    }

    public Desastre getDesastre() {
        return desastre;
    }

    public void setDesastre(Desastre desastre) {
        this.desastre = desastre;
    }

    public Donacion getDonacion() {
        return donacion;
    }

    public void setDonacion(Donacion donacion) {
        this.donacion = donacion;
    }
    
    
    
}
