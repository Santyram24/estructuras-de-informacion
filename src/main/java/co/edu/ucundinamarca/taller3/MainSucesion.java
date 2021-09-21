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
public class MainSucesion {
     static Logger log = Logger.getLogger(co.edu.ucundinamarca.taller3.MainSucesion.class.getName());//invocar el logger
    public static void main(String[] args) {
        log.info(Sucesion.sucesion(10));//invocar le metodo de sucesion en la clase Sucesion
        Sucesion.mostrarContador();//invocar el metodo mostrarContador() de la clase Sucesion
    }
}
