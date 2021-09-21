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
public class Mcd {

    static Logger log = Logger.getLogger(co.edu.ucundinamarca.taller3.Mcd.class.getName());//invocar el logger

    public static int mcd(int a, int b) {
        log.info("inicio de mcd(96, 36)");//inicio del metodo
        if (b == 0) {//caso base
            log.info("fin de mcd(96, 36)");//fin del metodo

            return a;
        }
        log.info("fin de mcd(96, 36)");//fin del metodo
        return mcd(b, a % b);//caso dado
    }

    public static void main(String[] args) {
        int a = 96, b = 36;//definir a y b
        log.info("mcd (" + a + "," + b + ")" + "=" + mcd(a, b));//invocar el metodo de mcd(a,b)
    }

}
