/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexion.Conexion;
import interfaces.metodos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.TelEmpresa;
import modelo.Telefono;

/**
 *
 * @author Alejandro Olmedo <00097017@uca.edu.sv>
 */
public class dao implements metodos<Telefono> {

    private static final String SQL_INSERT = "INSERT INTO telefono(idTelefono, nombre, idEmpresa, precio) VALUES (?,?,?,?)";
    private static final String SQL_READALL = "SELECT * FROM telefono";
    private static final String SQL_INNERJOIN = "SELECT t.idTelefono, t.nombre, e.nombre FROM telefono t INNER JOIN empresa e ON t.idEmpresa = e.idEmpresa";
    private static final String SQL_INNERJOINNOMBRETEL = "SELECT t.idTelefono, t.nombre, e.nombre FROM telefono t INNER JOIN empresa e ON t.idEmpresa = e.idEmpresa WHERE t.nombre LIKE ?";
    private static final Conexion con = Conexion.conectar();

    @Override
    public boolean create(Telefono t) {
        PreparedStatement ps;
        try {
            ps = con.getCnx().prepareStatement(SQL_INSERT);
            ps.setInt(1, t.getIdTelefono());
            ps.setString(2, t.getNombre());
            ps.setInt(3, t.getIdEmpresa());
            ps.setInt(4, t.getPrecio());
            if (ps.executeUpdate() > 0) {
                return true;
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println("No servis");
        } finally {
            con.cerrarConexion();
        }
        return false;
    }

    public ArrayList<Telefono> readAll() {
        ArrayList<Telefono> all = new ArrayList<>();
        Statement s;
        ResultSet rs;
        try {
            s = con.getCnx().prepareStatement(SQL_READALL);
            rs = s.executeQuery(SQL_READALL);
            while (rs.next()) {
                all.add(new Telefono(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4)));
            }
            rs.close();
        } catch (Exception ex) {
            System.out.println("No servis");
        } finally {
            con.cerrarConexion();
        }
        return all;
    }
    @Override
    public ArrayList<TelEmpresa> innerJoin() {
        ArrayList<TelEmpresa> all = new ArrayList<>();
        Statement s;
        ResultSet rs;
        try {
            s = con.getCnx().prepareStatement(SQL_INNERJOIN);
            rs = s.executeQuery(SQL_INNERJOIN);
            while (rs.next()) {
                all.add(new TelEmpresa(rs.getInt("idTelefono"), rs.getString(2), rs.getString(3)));
            }
            rs.close();
        } catch (Exception ex) {
            System.out.println("No servis");
        } finally {
            con.cerrarConexion();
        }
        return all;
    }
    @Override
    public ArrayList<TelEmpresa> innerJoinporNombreTel(String nombreTel){
        ArrayList<TelEmpresa> list= new ArrayList();
        PreparedStatement ps;
        ResultSet rs;
        try{
            ps=con.getCnx().prepareStatement(SQL_INNERJOINNOMBRETEL);
            ps.setString(1, nombreTel);
            rs=ps.executeQuery();
            while(rs.next()){
                list.add(new TelEmpresa(rs.getInt(1), rs.getString(2), rs.getString(3)));
            }
        } catch (Exception ex) {
            System.out.println("No servis");
        } finally {
            con.cerrarConexion();
        }
        return list;
    }
}
