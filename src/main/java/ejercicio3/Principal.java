/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import com.mycompany.pilasycolas.Reproduccion.ListaDeReproduccion;
import java.util.logging.Logger;

/**
 *
 * @author santy
 */
public class Principal {
    static Logger log = Logger.getLogger(ListaDeReproduccion.class.getName());
    public static void main(String[] args) {
        DLdeque bicola= new DLdeque();
        bicola.insertarPrimero(20);
        bicola.insertarPrimero(30);
        bicola.insertarUltimo(15);
        bicola.insertarUltimo(5);
        bicola.insertarUltimo(40);
        bicola.insertarPrimero(50);
        
        
        log.info(bicola.toString());
       
        bicola.removerPrimero();
        bicola.removerUltimo();
        bicola.removerUltimo();
        
        log.info(bicola.toString());
    }
   
}
