/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author santy
 */
public class ArbolBinario {
    NodoArbol raiz;

    public ArbolBinario() {
    raiz=null;
    }
    
    //metodo para insertar un nodo en el arbol
    public void agregarNodo(int dato){
     NodoArbol nuevo= new NodoArbol(dato);
     if(raiz==null){
         raiz=nuevo;
     }else{
         NodoArbol actual=raiz;
         NodoArbol nodoPadre;
         while (true) {             
             nodoPadre=actual;
             if(dato<actual.numero){
                 actual=actual.hijoIzquierdo;
                 if(actual==null){
                     nodoPadre.hijoIzquierdo=nuevo;
                     return;
                 }
             }else {
                 actual=actual.hijoDerecho;
                 if(actual==null){
                     nodoPadre.hijoDerecho=nuevo;
                     return;
                 }
             }
         }
     }
    }
    
}
