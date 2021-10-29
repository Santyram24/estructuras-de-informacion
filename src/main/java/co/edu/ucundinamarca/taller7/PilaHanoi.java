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
public class PilaHanoi {
    private nodo cabeza= null;
    private int longitud=0;
    public class nodo{
        public int iNumero;
        public nodo siguiente=null;
        public nodo(int iNumero){
            this.iNumero=iNumero;
        }
    }
    public void PUSH(int iNumero){
        nodo nodo= new nodo(iNumero);
        nodo.siguiente=cabeza;
        cabeza=nodo;
        longitud++;
    }
    public String Top(){
        String dato="";
        if(cabeza==null){
            return null;
        }else{
            nodo puntero=cabeza;
            dato=""+puntero.iNumero;
            return dato;
        }
    }
    public String estaVacia(){
        if(cabeza==null){
            return "Esta vacio";
        }else{
            return "No esta vacio";
        }
    }
    public void POP(){
        if(cabeza!=null){
            nodo primer=cabeza;
            cabeza=cabeza.siguiente;
            primer=null;
            longitud--;
        }
    }
    public String Listar(){
        String dato="";
        nodo aux=cabeza;
        int n=0;
        while(aux!=null){
        dato+=aux.iNumero+" ";
        aux=aux.siguiente;
        n++;
    }
        return dato;
    }
    
    public void VaciarPila(){
        if(cabeza!=null){
            nodo primer =cabeza;
            cabeza=cabeza.siguiente=null;
            primer=null;
            longitud=0;
        }
    }
}
