package Model;

import java.sql.Date;

public class Donacion {
    private int idDonacion;
    private int idDonante;
    private int idDesastre;
    private String tipo;
    private String cantidad;
    private Date fecha;

    public Donacion() {
    }

    public Donacion(int idDonacion, int idDonante, int idDesastre, String tipo, String cantidad, String fecha) {
        this.idDonacion = idDonacion;
        this.idDonante = idDonante;
        this.idDesastre = idDesastre;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.fecha = Date.valueOf(fecha); 
    }

    public int getIdDonacion() {
        return idDonacion;
    }

    public void setIdDonacion(int idDonacion) {
        this.idDonacion = idDonacion;
    }

    public int getIdDonante() {
        return idDonante;
    }

    public void setIdDonante(int idDonante) {
        this.idDonante = idDonante;
    }

    public int getIdDesastre() {
        return idDesastre;
    }

    public void setIdDesastre(int idDesastre) {
        this.idDesastre = idDesastre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
