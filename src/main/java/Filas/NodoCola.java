/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Filas;

/**
 *
 * @author santy
 */
public class NodoCola {
    String nombre;
    double dinero;
    NodoCola siguiente;

    public NodoCola(String nombre,double dinero) {
        this.nombre=nombre;
        this.dinero=dinero;
        siguiente=null;
    }
    
}
