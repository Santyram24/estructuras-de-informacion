/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.taller2;


import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

/**
 *
 * @author santy
 */
public class MainSeleccion {
    Scanner leer= new Scanner(System.in);
    
    static Logger log = Logger.getLogger(co.edu.ucundinamarca.taller2.MainSeleccion.class.getName());
    public static void main(String[] args) {
      
        SeleccionColombia j1=null;
        SeleccionColombia j2=new SeleccionColombia();
       String aux;
       String nombre;
       String buscarNombre;
       boolean retorno=false;
       for(int i=0;i<2;i++){
           log.info("Digite el nombre del jugador");
           nombre=JOptionPane.showInputDialog("Digite el nombre del jugador: ");
           j1= new SeleccionColombia(nombre);
           j1.AgregarJugadores(j1);
       }
       
       for(int i=0;i<2;i++){
           aux=j1.mostrarJugadores(i).toString();
           log.info("El nombre del jugador es: "+aux);
       }
        do{
           
        buscarNombre=JOptionPane.showInputDialog("Digite el nombre a buscar");
        retorno=j2.contieneJugadores(buscarNombre);
        }while (retorno);             
            
        
       
               }
    }

