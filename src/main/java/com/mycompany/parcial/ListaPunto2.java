/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcial;

import java.util.logging.Logger;

/**
 *
 * @author santy
 */
public class ListaPunto2 {

    static Logger log = Logger.getLogger(ListaPunto2.class.getName());
    public nodo primero;
    public nodo ultimo;

    public ListaPunto2() {
        primero = null;
        ultimo = null;

    }

    public void Agregar(int numero) {
        nodo nuevo = new nodo();

        nuevo.numero = numero;

        if (primero == null) {
            primero = nuevo;
            nuevo.siguiente = null;
            ultimo = primero;
        } else {
            ultimo.siguiente = nuevo;
            nuevo.siguiente = null;
            ultimo = nuevo;
        }

    }

    public void mostrar() {
        nodo actual = new nodo();
        nodo repetido = new nodo();
        repetido = primero;

        actual = primero;
        while (actual != null) {
            log.info(actual.numero + "->");
            if (repetido.numero == actual.numero) {
                repetido.contadorRepetido++;
            }
            actual = actual.siguiente;

        }
        log.info("se ha repetido el numero "+repetido.numero +":"+ repetido.contadorRepetido + " veces");

    }

}
