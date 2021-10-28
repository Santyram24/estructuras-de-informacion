/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.taller7;

/**
 *
 * @author santy
 */
public class ColaLista {
    private NodoCola frente;
    private NodoCola fin;
    
    public ColaLista(){
        frente=null;
        fin=null;
    }
    public boolean colaVacia(){
        if(frente==null){
            return true;
        }else{
            return false;
        }
    }
    public void insertar(int elemento){
        NodoCola nuevo= new NodoCola(elemento);
        if(colaVacia()){
            frente=nuevo;
        }else{
            fin.siguiente=nuevo;
        }
        fin=nuevo;
    }
    public int quitar(){
        int actual;
        if(!colaVacia()){
            actual=frente.elemento;
            frente=frente.siguiente;
        }else{
            return -1;
        }
        return actual;
    }
    public void vaciarCola(){
        while(frente!=null){
            frente=frente.siguiente;
        }
    }
}