/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Filas;

import com.mycompany.pilasycolas.Reproduccion.ListaDeReproduccion;
import com.mycompany.pilasycolas.Reproduccion.PilaLista;
import java.util.Scanner;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author santy
 */
public class FilaBanco {
    static Logger log = Logger.getLogger(ListaDeReproduccion.class.getName());
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ColaLista cola = new ColaLista();
        String DigitarNombre;
        Double DigitarDineroIngresado;
        int opcion;

        do {
            log.info("Digite los clientes y dinero ingresado en el banco");
            log.info("Digite opcion:\n1.Ingresar cliente y dinero"
                    + "\n2.mostrar la lista y enviar al jefe"
                    + "\n3.salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    DigitarNombre=JOptionPane.showInputDialog
        (null,"digite el nombre del cliente");
                    DigitarDineroIngresado=Double.parseDouble
        (JOptionPane.showInputDialog(null, "Digite el dinero a ingresar"));
                    
                    cola.insertar(DigitarNombre, DigitarDineroIngresado);
                    break;
                case 2:
                    if(cola.ColaVacia()==true){
                    log.info("no hay clientes para enviar");
                    }else{
                    for (int i = 0; i < cola.contador; i++) {
                        log.info(cola.quitarMostrar());
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
