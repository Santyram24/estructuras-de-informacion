/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Filas;

/**
 *
 * @author santy
 */
public class ColaLista {
    private NodoCola frente;
    private NodoCola fin;
    public int contador=0;

    public ColaLista() {
    frente=null;
    fin=null;
    }
    
    public boolean ColaVacia(){
        if(frente==null){
            return true;
            
        }else{
            return false;
            
        }
        
    }
    public void insertar(String nombre,double dinero){
        NodoCola actual= new NodoCola(nombre, dinero);
        if(ColaVacia()){
            frente=actual;
            
        }else{
           fin.siguiente=actual;
           
        }
        contador++;
        fin=actual;
        
    }
    public String quitarMostrar(){
        String nombreCliente;
        double dineroIngresado;
        if(!ColaVacia()){
            nombreCliente=frente.nombre;
            dineroIngresado=frente.dinero;
            frente=frente.siguiente;
        }else{
            return "esta vacia";
        }
        return "Ha entrado : "+nombreCliente+" ingresa: "+dineroIngresado+" pesos";
    }
    public void borrarCola(){
        while(frente!=null){
            frente=frente.siguiente;
        }
    }
}
