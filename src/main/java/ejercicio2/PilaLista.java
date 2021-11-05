/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author santy
 */
public class PilaLista {
    private nodo ultimovaloringresado;
    int tamaño=0;
    String lista="";
    //constructor

    public PilaLista() {
    ultimovaloringresado=null;
    tamaño=0;
    }
    //verificar si la pila esta vacia
    public boolean PilaVacia(){
        return ultimovaloringresado==null;
    }
    //metodo para insertar en la pila
    public void insertar_Push(Object elemento){
        nodo nuevo=new nodo(elemento);
        nuevo.siguiente=ultimovaloringresado;
        ultimovaloringresado=nuevo;
        tamaño++;
        
    }
    //metodo para eliminar elemento de la pila, Recuperar un objeto de la pila
    public Object eliminarNodo_Pop(){
        Object auxiliar=ultimovaloringresado.elemento;
        ultimovaloringresado=ultimovaloringresado.siguiente;
        tamaño--;
        return auxiliar;
    }
    //Obtener el objeto de la cima (top) de la pila, sin extraerlo.
    public Object mostrarUltimoElemento_Top(){
        return ultimovaloringresado.elemento;
    }
    //tamaño de la lista
    public int tamañoPila(){
        return tamaño;
    }
    //metodo para vaciar la pila
    public void vaciarPila(){
        while(!PilaVacia()){
            eliminarNodo_Pop();
    }
        
}
    //metodo para mostrar los valores
    public void MostrarValores(){
        nodo recorrido= ultimovaloringresado;
        while(recorrido!=null){
            lista +=recorrido.elemento +"\n";
            recorrido=recorrido.siguiente;
        }
        JOptionPane.showMessageDialog(null, lista);
        lista="";
    }
}
