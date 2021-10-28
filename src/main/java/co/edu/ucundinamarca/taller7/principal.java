/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.taller7;

import java.util.logging.Logger;

/**
 *
 * @author santy
 */
public class principal {
    static Logger log = Logger.getLogger(principal.class.getName());
    public static void pila(){
        PilaLista pila= new PilaLista();
        pila.insertar(0);
        pila.insertar(1);
        pila.insertar(2);
        pila.insertar(3);
        print(""+pila.quitar());
        print(""+pila.quitar());
        print(""+pila.quitar());
        print(""+pila.quitar());
        
        
    }
    public static void cola(){
        ColaLista cola= new ColaLista();
        cola.insertar(0);
        cola.insertar(1);
        cola.insertar(2);
        cola.insertar(3);
        print(""+cola.quitar());
        print(""+cola.quitar());
        print(""+cola.quitar());
        print(""+cola.quitar());
               

    }
    public static void main(String[] args) {
        log.info("cola:");
        cola();
        log.info("pila");
        pila();
    }
    public static void print(String numero){
        log.info(numero);
    }
}
