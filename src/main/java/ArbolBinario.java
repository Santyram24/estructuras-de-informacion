
import java.util.logging.Logger;
import javax.swing.JOptionPane;

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
    //Toda la informacion esta en el README.txt
     static Logger log = Logger.getLogger(Principal.class.getName());
    NodoArbol raiz;
   
    int altura=0;

    public int getAltura() {
        return altura;
    }
    

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
                     altura++;
                     return;
                 }
             }
         }
     }
    }
    //metodo para saber si el arbol esta vacio
        public boolean ArbolVacio(){
            return raiz==null;
        }
    //metodo para imprimir Inorden
        public void InOrden(NodoArbol raiz){
            if(raiz!=null){
                InOrden(raiz.hijoIzquierdo);
                //System.out.println(raiz.numero);
                JOptionPane.showMessageDialog(null, raiz.numero);
                InOrden(raiz.hijoDerecho);
                 
            }
        }
        //metodo para imprimir el arbol en preorden
        public void PreOrden(NodoArbol raiz){
            if(raiz!=null){
                JOptionPane.showMessageDialog(null, raiz.numero);
                PreOrden(raiz.hijoIzquierdo);
                PreOrden(raiz.hijoDerecho);
            }
        }
        //metodo para imprimir el arbol postorden
        public void PostOrden(NodoArbol raiz){
            if(raiz!=null){
                PostOrden(raiz.hijoIzquierdo);
                PostOrden(raiz.hijoDerecho);
                JOptionPane.showMessageDialog(null, raiz.numero);
            }
        }
        
        
        
}
