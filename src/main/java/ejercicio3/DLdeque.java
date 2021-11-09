/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import co.edu.ucundinamarca.taller7.PilaHanoi;
import com.mycompany.pilasycolas.Reproduccion.ListaDeReproduccion;
import java.util.logging.Logger;

/**
 *
 * @author santy
 */
public class DLdeque implements Deque{
    static Logger log = Logger.getLogger(ListaDeReproduccion.class.getName());

    public int contador;
   DNodo cabeza;
   DNodo cola;
   String organizar;

    public DLdeque() {
        cabeza=null;
        cola=null;
        contador=0;
   
    }
   

    @Override
    public void insertarPrimero(Object elemento) {
        if(cabeza==null){
            cabeza= new DNodo();
            cabeza.elemento=elemento;
            cola=cabeza;
            
        }else{
            DNodo nuevo= new DNodo();
            nuevo.elemento=elemento;
            nuevo.siguiente=cabeza;
            cabeza.anterior=nuevo;
            cabeza=nuevo;
        }
        contador++;
    }

    @Override
    public void insertarUltimo(Object elemento) {
         if(cola==null){
            cola= new DNodo();
            cola.elemento=elemento;
            cabeza=cola;
            
        }else{
            DNodo nuevo= new DNodo();
            nuevo.elemento=elemento;
            nuevo.anterior=cola;
            cola.siguiente=nuevo;
            cola=nuevo;
        }
        contador++;
    }
    

    @Override
    public void removerPrimero() {
        cabeza=cabeza.siguiente;
        cabeza.anterior=null;
    }

    @Override
    public void removerUltimo() {
        cola=cola.anterior;
        cola.siguiente=null;
        
    }

    @Override
    public int tamaño() {
        return contador;
    }

   public String toString(){
     String s="cabeza[";
     for(DNodo p= cabeza;p!=null;p=p.siguiente){
         s+=p.elemento+"-";
     }
       return s+"]cola";
   }
    
}
