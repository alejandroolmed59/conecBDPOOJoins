
import dao.dao;
import java.util.ArrayList;
import modelo.TelEmpresa;
import modelo.Telefono;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alejandro Olmedo <00097017@uca.edu.sv>
 */
public class main {
    public static void main(String[] args) {
        dao d= new dao();
        //d.create(new Telefono(4,"Chayote", 1, 50));
        
        
        ArrayList<TelEmpresa> listita= new ArrayList();
        listita = d.innerJoinporNombreTel("I%");
        for(TelEmpresa te : listita){
            System.out.println(te.toString());
        }
         
    }
}
