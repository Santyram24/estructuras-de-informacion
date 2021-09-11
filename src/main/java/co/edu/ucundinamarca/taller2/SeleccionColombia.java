/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.taller2;

import java.util.ArrayList;
import org.apache.log4j.Logger;


/**
 *
 * @author santy
 */
public class SeleccionColombia {
    public String nombre;
     static Logger log = Logger.getLogger(co.edu.ucundinamarca.taller2.MainSeleccion.class.getName());
    public static ArrayList<SeleccionColombia>listaSelec;

    public SeleccionColombia(String n) {
        nombre=n;
    }

    
    
    
    public void AgregarJugadores(SeleccionColombia s){
        listaSelec.add(s);
    }
    public void mostrarjugadores(int s){
       log.info("jugador: "+s);
       listaSelec.get(s);
    
        
    }
   
    
}
