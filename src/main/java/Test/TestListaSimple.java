package Test;

import co.edu.ucundinamarca.taller4_1.ListaSimple;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestListaSimple {
    @Test
    public void TestListaSim() {

        ListaSimple lista = new ListaSimple();
        //prueba con si esta vacia
        boolean resulatdoesperado = true;
        boolean resultadoMetodo = lista.estaVacia();
        assertEquals(resulatdoesperado, resultadoMetodo);

        ListaSimple agrg = new ListaSimple();
        agrg.agregar(15);
        agrg.agregar(16);

        int numeroesperado = 2;
        int numelementos = agrg.iterador();
        assertEquals(numeroesperado, numelementos);
        //siguiente para comprobar si el primer elememto es 15, no esta en la
        //actividad pero es por si las moscas
        int numeroesperado2 = 15;
        int cabeza = (int) agrg.primerElemento();
        assertEquals(numeroesperado2, cabeza);

        //prueba para eliminar un elemento en especifico

        int numerodeelemenotos = 1;
        agrg.eliminar(15);
        int numeroeliminado = agrg.iterador();
        assertEquals(numerodeelemenotos, numeroeliminado);
        //otra prueba para vaciar
        int vacio = 0;
        agrg.vaciar();
        int listavacia = agrg.iterador();
        assertEquals(vacio, listavacia);


    }
}
