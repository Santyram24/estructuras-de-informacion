/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.taller3;

/**
 *
 * @author santy
 */
public class Funciones {

    public static int factorial(int numero) {//factorial por iteracion en este se hace la multiplicacion de forma inversa
        int factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static int factorialRec(int numero) {//factorial por recursividad
        if (numero == 1) {//si el numero llega a ser uno devuelve uno
            return 1;
        } else {
           return numero * factorialRec(numero - 1);//si ese no es el caso se multiplica el numero por su estudo recursivo y en su parametro se resta una unidad
        }
    }
     public static double potencia (double base, double exponente){//potencia de un numero de forma recursiva
        if(exponente==0){//si el exponente es cero se regresa el valor de 1 debido a las propiedades de los exponentes
            return 1;
        } else if (exponente<0) {//si el exponente es menor que cero se hacer la recursion eso dividido entre la base 
            return potencia(base, exponente+1) / base;
        } else {
            return base * potencia(base, exponente-1);//si ese no es el caso se hace el proceso de recursion de forma normal
        }
     }
    
}
