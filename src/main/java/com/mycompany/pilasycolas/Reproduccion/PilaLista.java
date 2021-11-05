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
public class PilaLista {
    private NodoPila cima;
    public int contador=0;

    public PilaLista() {
    cima=null;
    }
    
    public boolean PilaVacia(){
        if(cima==null){
            return true;
        }else{
            return false;
        }
    }
    public void insertar(String cancion,String artista){
        NodoPila nuevo=new NodoPila(cancion, artista);
        nuevo.siguiente=cima;
        cima=nuevo;
        contador++;
    }
    public String quitarMostrar(){
        if(PilaVacia()){
            return "la lista esta vacia";
        }
        
        String vCancion= cima.cancion;
        String vArtista=cima.artista;
        cima=cima.siguiente;
        return "Cancion:"+vCancion+"\nArtista:"+vArtista+"\n";
    }
    
    public void limpiarṔila(){
        NodoPila aux;
        while(!PilaVacia()){
            aux=cima;
            cima=cima.siguiente;
            aux.siguiente=null;
        }
    }
}
