/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.ArrayList;
import modelo.TelEmpresa;

/**
 *
 * @author UCA
 */
public interface metodos <Generic> {
    public boolean create(Generic g);
//    public boolean delete(Object key);
//    public boolean update(Generic c);
//    public Generic read(Object key);
    public ArrayList<Generic> readAll();
    public ArrayList<TelEmpresa> innerJoin();
    public ArrayList<TelEmpresa> innerJoinporNombreTel(String nombreTel);
    
}
