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
public class ListaPunto1 {

    static Logger log = Logger.getLogger(ListaPunto1.class.getName());
    public nodo primero;
    public nodo ultimo;

    public ListaPunto1() {
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
        nodo grande = new nodo();
        actual = primero;
        while (actual != null) {
            if (actual.numero > grande.numeroMasGrande) {
                grande.numeroMasGrande = actual.numero;
            }
            log.info(actual.numero + "->");
            actual = actual.siguiente;

        }
        log.info("El numero mas grande es:" + grande.numeroMasGrande);
    }

}
