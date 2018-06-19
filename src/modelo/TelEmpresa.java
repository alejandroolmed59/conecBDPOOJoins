/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Alejandro Olmedo <00097017@uca.edu.sv>
 */
public class TelEmpresa {
    private int idTelefono;
    private String nombreTelefono;
    private int idEmpresa;
    private int precio;
    private String nombreEmpresa;

    public TelEmpresa(int idTelefono, String nombreTelefono, String nombreEmpresa) {
        this.idTelefono = idTelefono;
        this.nombreTelefono = nombreTelefono;
        this.nombreEmpresa = nombreEmpresa;
    }

    public int getIdTelefono() {
        return idTelefono;
    }

    public void setIdTelefono(int idTelefono) {
        this.idTelefono = idTelefono;
    }

    public String getNombreTelefono() {
        return nombreTelefono;
    }

    public void setNombreTelefono(String nombreTelefono) {
        this.nombreTelefono = nombreTelefono;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    @Override
    public String toString() {
        return "TelEmpresa{" + "idTelefono=" + idTelefono + ", nombreTelefono=" + nombreTelefono + ", nombreEmpresa=" + nombreEmpresa + '}';
    }
    
}
