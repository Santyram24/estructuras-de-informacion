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
            primero.siguiente=primero;
            nuevo.anterior=ultimo ;
            ultimo = nuevo;
        } else {
            ultimo.siguiente = nuevo;
            nuevo.siguiente=primero;
            nuevo.anterior=ultimo;
            ultimo = nuevo;
            primero.anterior=ultimo;
            
        }
    }

    public void mostrarSalida(int n) {
        nodo actual = new nodo();
        nodo anterior=new nodo();
        
        actual = primero;
        anterior=ultimo;
        
        do {   
            if(actual.numero==n){
                if(actual==primero){
                    log.info("salio"+actual.nombre);
                    primero=primero.siguiente;
                    ultimo.siguiente=primero;
                    primero.anterior=ultimo;
                }else if(actual==ultimo){
                    log.info("salio"+actual.nombre);

                    ultimo=anterior;
                    primero.anterior=ultimo;
                    ultimo.siguiente=primero;
                }else{
                  log.info("salio"+actual.nombre);

                   anterior.siguiente=actual.siguiente;
                   primero=actual.siguiente.anterior=anterior;
                           
                }
            }
            anterior=actual;
            actual=actual.siguiente;
            
        } while (actual!=primero);
        
       
        
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
        
        salida.mostrarSalida(8);
        salida.mostrarSalida(5);
        salida.mostrarSalida(2);
        salida.mostrarSalida(1);
        salida.mostrarSalida(3);
        salida.mostrarSalida(7);
        salida.mostrarSalida(6);
                            
    }
}
