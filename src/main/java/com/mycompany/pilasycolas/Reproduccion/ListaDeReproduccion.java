/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pilasycolas.Reproduccion;

import java.util.Scanner;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author santy
 */
public class ListaDeReproduccion {

    static Logger log = Logger.getLogger(ListaDeReproduccion.class.getName());

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        PilaLista lista = new PilaLista();
        String DigitarCancion;
        String DigitarArtista;
        int opcion;

        do {
            log.info("Cree su lista de reproduccion de su musica preferida "
                    + "para enviar a la nube");
            log.info("Digite opcion:\n1.Ingresar cancion\n2.mostrar la lista "
                    + "y enviar"
                    + "\n3.salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    DigitarCancion=JOptionPane.showInputDialog
        (null,"digite cancion");
                    DigitarArtista=JOptionPane.showInputDialog
        (null,"Digite artista");
                    
                    lista.insertar(DigitarCancion, DigitarArtista);
                    break;
                case 2:
                    if(lista.PilaVacia()==true){
                    log.info("la lista de reproduccion esta vacia, cree su lista");
                    }else{
                    for (int i = 0; i < lista.contador; i++) {
                        log.info(lista.quitarMostrar());
                        //log.info(lista.quitarMostrar());
                        //log.info(lista.quitarMostrar());
                    }
                    }
                    break;
                case 3:
                  
                    break;
                
                default:
                    log.info("ERROR,digite la opcion correcta");
                    break;
            }
        } while (opcion != 3);
        log.info("Salio");

    }
}
