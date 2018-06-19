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
public class Telefono {
    private int idTelefono;
    private String nombre;
    private int idEmpresa;
    private int precio;

    public Telefono(int idTelefono, String nombre, int idEmpresa, int precio) {
        this.idTelefono = idTelefono;
        this.nombre = nombre;
        this.idEmpresa = idEmpresa;
        this.precio = precio;
    }

    public Telefono(String nombre, int idEmpresa, int precio) {
        this.nombre = nombre;
        this.idEmpresa = idEmpresa;
        this.precio = precio;
    }

    public int getIdTelefono() {
        return idTelefono;
    }

    public void setIdTelefono(int idTelefono) {
        this.idTelefono = idTelefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    @Override
    public String toString() {
        return "Telefono{" + "idTelefono=" + idTelefono + ", nombre=" + nombre + ", idEmpresa=" + idEmpresa + ", precio=" + precio + '}';
    }
    
}
