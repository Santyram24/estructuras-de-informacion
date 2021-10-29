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
public class Soldados {
    static Logger log = Logger.getLogger(ListaPunto1.class.getName());
    public nodo primero;
    public nodo ultimo;

    public Soldados() {
        primero = null;
        ultimo = null;

    }

    public void Agregar(int numero,String nombre) {
        nodo nuevo = new nodo();
        nuevo.numero = numero;
        nuevo.nombre=nombre;

        if (primero == null) {
            primero = nuevo;
            nuevo.siguiente = null;
            ultimo = primero;
        } else {
            ultimo.siguiente = nuevo;
            nuevo.siguiente = primero;
            ultimo = nuevo;
        }
    }

    public void mostrarSalida(int n) {
        nodo actual = new nodo();
        
        actual = primero;
        while (actual != null) {
         if(actual.numero==n){
            log.info("salio:"+actual.nombre  );
             
         }
        actual = actual.siguiente;
        }
        
    }
    
    public static void main(String[] args) {
        Soldados salida= new Soldados();
        salida.Agregar(1, "Francisco");
        salida.Agregar(2, "jorge");
        salida.Agregar(3, "luis");
        salida.Agregar(4, "Sergio");
        salida.Agregar(5, "Ricardo");
        salida.Agregar(6, "salvador");
        salida.Agregar(7, "Diego");
        salida.Agregar(8, "Mario");
        salida.mostrarSalida(4);
    }
}
