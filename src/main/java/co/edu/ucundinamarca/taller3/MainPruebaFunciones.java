/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.taller3;

import java.util.Scanner;
import org.apache.log4j.Logger;



/**
 *
 * @author santy
 */
public class MainPruebaFunciones {
    static Logger log = Logger.getLogger(co.edu.ucundinamarca.taller3.MainPruebaFunciones.class.getName());//invoco el logger
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);//invoco el el metodo Scanner
        int numero;//numero para obtener el factorial
        double numeroBase,numeroExponencial;//numeros para la base y el numero exponencial
        log.info("Digite el factorial que desee obtener");
        numero=leer.nextInt();//leer el numero por consola
        log.info("El factorial iterativo:"+Funciones.factorial(numero));//mostrar con el factorial  iterativo
        log.info("El factorial recursivo"+Funciones.factorialRec(numero));//mostrar con el factorial recursivo
       
        log.info("Digite la base");
        numeroBase=leer.nextDouble();//digito la base por consola
        log.info("Digite el exponente");
        numeroExponencial=leer.nextDouble();//digito el exponente ṕor consola
       log.info("la potencia da:" +Funciones.potencia(numeroBase, numeroExponencial));//invocar el metodo potencia y mostrarlo
    }
}
