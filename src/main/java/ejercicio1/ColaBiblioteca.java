/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import co.edu.ucundinamarca.taller7.PilaHanoi;
import com.mycompany.pilasycolas.Reproduccion.ListaDeReproduccion;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author santy
 */
public class ColaBiblioteca {
    static Logger log = Logger.getLogger(ListaDeReproduccion.class.getName());

    Nodo primero;
    Nodo ultimo;
    private int numeroDeTurno=0;
    private int numeroDeAtendidos=0;

    public int getNumeroDeTurno() {
        return numeroDeTurno;
    }

    public int getNumeroDeAtendidos() {
        return numeroDeAtendidos;
    }
    
    public ColaBiblioteca(){
        primero=null;
        ultimo=null;
    }
    public void ingresarPorAtender(String identificacion,String nombre,String tituloLibro){
        Nodo nuevo= new Nodo();
        nuevo.setIdentificacion(identificacion);
        nuevo.setNombre(nombre);
        nuevo.setTituloLibro(tituloLibro);
        if(primero==null){
            primero=nuevo;
            primero.siguiente=primero;
            nuevo.anterior=ultimo;
            ultimo=nuevo;
        }else{
         
            ultimo.siguiente=nuevo;
            
            nuevo.siguiente=primero;
            nuevo.anterior=ultimo;
            ultimo=nuevo;
            primero.anterior=ultimo;
        }
        numeroDeTurno++;
    }
    public void mostrarPorAtender(){
        Nodo actual= new Nodo();
        actual=primero;
        do{
            log.info("Identificación:"+actual.getIdentificacion()+"\nnombre:"
              +actual.getNombre()+"\nlibro prestado:"+actual.getTituloLibro());
            actual=actual.siguiente;
        }while(actual!=primero);
    }
    
    public void atendido(){
        Nodo actual= new Nodo();
        Nodo anterior= new Nodo();
         
        actual=primero;
        anterior=ultimo;
        
        if(actual==primero){
            log.info(actual.getNombre()+" con identificación: "+actual.getIdentificacion()+" atendido");
           
            primero=primero.siguiente;
            ultimo.siguiente=primero;
            primero.anterior=ultimo;
          
        }
        numeroDeAtendidos++;
      
        anterior=actual;
        actual=actual.siguiente;
      
      
    }
    
}
