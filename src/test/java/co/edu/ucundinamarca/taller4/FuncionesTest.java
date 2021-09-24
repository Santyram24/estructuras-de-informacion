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
       Funciones funciones= new Funciones();
       int resultado=Funciones.factorial(5);
       
        assertEquals(120 , resultado);
        
        int resultadorecursivo=Funciones.factorialRec(5);
        
        assertEquals(120 , resultadorecursivo);
    }
}
