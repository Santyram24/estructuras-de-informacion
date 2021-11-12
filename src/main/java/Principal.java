
import java.util.Scanner;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author santy
 */
public class Principal {
      static Logger log = Logger.getLogger(Principal.class.getName());
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int opcion,elemento;
        ArbolBinario arbol= new ArbolBinario();
        do{
            log.info("Digite la opcion 1.digite el nodo en"
                    + " el arbol\n2.mostrar en preorden"
                    + "\n2.mostrar en postorden"
                    + "\n3.mostrar en inorden"
                    + "\n4.mostrar por niveles"
                    + "\n5.salir");
            opcion=leer.nextInt();
            switch(opcion){
                case 1:
                    log.info("Digite el numero a dejar en el arbol");
                    elemento=leer.nextInt();
                    arbol.agregarNodo(elemento);
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                    default:
                        log.info("ERROR");
                        break;
                           
            }
        }while(opcion!=5);
        log.info("Fin del programa");
        
    }
}
