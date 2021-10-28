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
public class PilaLista {
  private NodoPila cima;

    public PilaLista() {
    cima=null;
    }
  
    public boolean pilaVacia(){
        if(cima==null){
            return true;
        }else{
            return false;
        }
    }
    
    public void insertar(int elemento){
        NodoPila nuevo= new NodoPila(elemento);
        nuevo.siguiente=cima;
        cima=nuevo;
    }
    public int quitar(){
        if(pilaVacia()){
            return -1;
                    
        }
        int aux = cima.elemento;
        cima=cima.siguiente;
        return aux;
    }
    public void limpiarLista(){
        NodoPila actual;
        while(!pilaVacia()){
            actual=cima;
            cima=cima.siguiente;
            actual.siguiente=null;
        }
    }
  

   
    
}
