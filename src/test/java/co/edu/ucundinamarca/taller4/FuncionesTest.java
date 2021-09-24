/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.taller4;
import co.edu.ucundinamarca.taller3.Funciones;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import org.junit.Test;

/**
 *
 * @author santy
 */
public class FuncionesTest {
     @Test
    public void testFunciones() {
       Funciones funciones= new Funciones();//instancia del objeto
       int resultado=Funciones.factorial(5);//definimos una variable con el 
       //metodo factorial iterativo de la clase Funciones
       
        assertEquals(120 , resultado);//comparamos el resultado respectivamente
        
        int resultadorecursivo=Funciones.factorialRec(5);//definimos otra
        //variable con el metodo factorial recursivo de la clase Funciones
        
        assertEquals(120 , resultadorecursivo);//comparamos el respectivo 
        //resultado
    }
}
