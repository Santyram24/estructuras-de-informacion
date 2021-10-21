package co.edu.ucundinamarca.taller4_1;

import org.apache.log4j.Logger;

public class ListaSimple implements Listable {
    static Logger log = Logger.getLogger(Main.class.getName());
    private ListaSimple.Nodo cabeza = null;
    private int longitud = 0;
    private boolean vacio;

    @Override
    public void agregar(Object elemento) {
        ListaSimple.Nodo nodo = new ListaSimple.Nodo(elemento);
        if (cabeza == null) {
            cabeza = nodo;
        } else {

            Nodo puntero = cabeza;

            nodo.siguiente = puntero.siguiente;
            puntero.siguiente = nodo;

        }
        log.info("elemento ingresado");
        longitud++;

    }

    @Override
    public boolean contiene(Object n) {
        boolean contieneValor = false;
        Nodo puntero = cabeza;
        while (puntero != null) {
            if (puntero.elemento == n) {
                log.info("Nodo encontrado");
                log.info(puntero.elemento);
                contieneValor = true;
            }
            puntero = puntero.siguiente;
        }
        return contieneValor;
    }

    @Override
    public void eliminar(Object elemento) {


        ListaSimple.Nodo actual = new ListaSimple.Nodo();
        ListaSimple.Nodo anterior = new ListaSimple.Nodo();
        actual = cabeza;
        anterior = null;
        while (actual != null) {
            if (actual.elemento == elemento) {
                if (actual == cabeza) {
                    cabeza = cabeza.siguiente;
                } else {
                    anterior.siguiente = actual.siguiente;
                }
                longitud--;
                log.info("elemento eliminado " + actual.elemento);


            }
            anterior = actual;
            actual = actual.siguiente;

        }


    }

    @Override
    public boolean estaVacia() {
        ListaSimple.Nodo nodo = new ListaSimple.Nodo();
        {
            if (cabeza == null) {
                vacio = true;
                log.info("la lista esta vacia");

            } else {
                vacio = false;
                log.info("la lista tiene elementos");
            }
            return vacio;
        }
    }

    @Override
    public Object primerElemento() {
        log.info(cabeza.elemento);
        return cabeza.elemento;
    }

    @Override
    public void vaciar() {
        ListaSimple.Nodo nodo = new ListaSimple.Nodo();
        if (cabeza != null) {
            cabeza = null;
            nodo.siguiente = cabeza;
        }
        log.info("elementos eliminados");
        estaVacia();
        longitud--;
        log.info(longitud);


    }

    @Override
    public void sustituir(int n, Object elemento) {
        ListaSimple.Nodo nodo = new ListaSimple.Nodo(elemento);
        if (cabeza == null) {
            cabeza = nodo;
        } else {
            Nodo puntero = cabeza;
            int contador = 0;
            while (contador < n && puntero.siguiente != null) {
                puntero = puntero.siguiente;
                contador++;
            }
            nodo.siguiente = puntero.siguiente;
            puntero.siguiente = nodo;

        }



    }

    @Override
    public int iterador() {
        return longitud;
    }

    private class Nodo {
        public Object elemento;
        public ListaSimple.Nodo siguiente = null;

        public Nodo() {

        }

        public Nodo(Object elemento) {

            this.elemento = elemento;
        }
    }
}
