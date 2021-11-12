/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author santy
 */
public class NodoArbol {
    int numero;
    NodoArbol hijoDerecho;
    NodoArbol hijoIzquierdo;

    public NodoArbol(int numero) {
       this.numero=numero;
      this.hijoDerecho=null;
      this.hijoIzquierdo=null;
    }

    @Override
    public String toString() {
        return "NodoArbol{" + "numero=" + numero + '}';
    }
     
    
    
    
}
