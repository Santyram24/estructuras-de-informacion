package Test;

import co.edu.ucundinamarca.taller4_1.ListaDoble;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestListaDoble {
    ListaDoble lista = new ListaDoble();

    @Test
    public void TestListaDob() {
        lista.agregar(12);
        lista.agregar(13);
        lista.agregar(14);
        int elementosEsperados = 3;
        int elementosAgregados = lista.iterador();

        assertEquals(elementosEsperados, elementosAgregados);
        //para el metodo contiene

        boolean resultadoEsperado = true;
        boolean resultadoObtenido = lista.contiene(13);
        assertEquals(resultadoEsperado, resultadoObtenido);
        //para el metodo eliminar

        int elementosQueQuedan = 2;
        lista.eliminar(13);
        int resultadoEliminado = lista.iterador();
        assertEquals(elementosQueQuedan, resultadoEliminado);


    }

}
