/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pilasycolas.Reproduccion;

/**
 *
 * @author santy
 */
public class NodoPila {
    String cancion;
    String artista;
    
    NodoPila siguiente;

    public NodoPila(String cancion,String artista) {
        this.cancion=cancion;
        this.artista=artista;
    }
    
    
}
