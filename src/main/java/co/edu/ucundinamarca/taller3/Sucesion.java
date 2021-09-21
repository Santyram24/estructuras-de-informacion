/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.taller3;

import org.apache.log4j.Logger;

/**
 *
 * @author santy
 */
public class Sucesion {
public static int contador=0;//contador para ver cuantas veces se ejecuta el metodo
static Logger log = Logger.getLogger(co.edu.ucundinamarca.taller3.MainSucesion.class.getName());//invocar el logger
    public static double sucesion(int n) {//metodo recursivo de sucesion(int n)
        contador++;//sube el contador +1
        switch (n) {//cambiar en caso de:
            case 0://si es n==0 entonces regresa 1
                return 1;
            case 1://si n==1 entonces regresa 2
                return 2;
            
          
            default://y si no se hace la operacion recursiva
                return 0.91 * sucesion(n - 1) + 0.1 * sucesion(n - 2);
        }
        
    }
    public static void mostrarContador(){//metodo para mostrar el contador
       log.info("la cantidad de veces que se ejecuta el metodo:"+contador);
    }

}
