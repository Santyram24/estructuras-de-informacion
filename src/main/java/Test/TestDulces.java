package Test;

import static co.edu.ucundinamarca.taller4_1.Dulces.*;
import static org.junit.Assert.*;

import co.edu.ucundinamarca.taller4_1.Dulces;
import org.junit.Test;
import co.edu.ucundinamarca.taller4_1.Dulces.*;

import java.util.ArrayList;

public class TestDulces {

    @Test
    public void TestLista() {

        añadirElementos();

        //junit para imprimirIterando que compruebe el size de 10 del
        //ArrayList
        int tamañoesperado = 10;//tamaño esperado del array
        int tamañolista = imprimirIterando();//invocar metodo imprimirIterando
        assertEquals(tamañoesperado, tamañolista);

        //junit para imprimirSinIterador que compruebe que la lista
        //contenga el dulce “ChocoRamo”.
        boolean resultadolista = imprimirSinIterador();//aqui buscara en la lista
        //a chocoramo y si lo encuentra devolvera true y si no false

        boolean resultadoesperado = true;//esto es el resultado esperado

        assertEquals(resultadoesperado, resultadolista);


    }
}
