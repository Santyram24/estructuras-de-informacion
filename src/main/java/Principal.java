
import java.util.Scanner;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

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
        //Toda la informacion esta en el README.txt

      static Logger log = Logger.getLogger(Principal.class.getName());
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int opcion,elemento;
        ArbolBinario arbol= new ArbolBinario();
        do{
            log.info("Digite la opcion\n1.digite el nodo en"
                    + " el arbol\n2.mostrar en preorden"
                    + "\n3.mostrar en postorden"
                    + "\n4.mostrar en inorden"
                    + "\n5.mostrar los niveles"
                    + "\n6.salir");
            opcion=leer.nextInt();
            switch(opcion){
                case 1:
                    log.info("Digite el numero a dejar en el arbol");
                    elemento=leer.nextInt();
                    arbol.agregarNodo(elemento);
                case 2:
                    if(!arbol.ArbolVacio()){
                        arbol.PreOrden(arbol.raiz);
                    }else{
                        log.info("El arbol esta vacio");
                    }
                    break;
                case 3:
                     if(!arbol.ArbolVacio()){
                        arbol.PostOrden(arbol.raiz);
                    }else{
                        log.info("El arbol esta vacio");
                    }
                    break;
                case 4:
                    if(!arbol.ArbolVacio()){
                        arbol.InOrden(arbol.raiz);
                    }else{
                        log.info("El arbol esta vacio");
                    }
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null,"su altura es:1"+ arbol.getAltura());
                    break;
                case 6:
                    break;
                    default:
                        log.info("ERROR");
                        break;
                           
            }
        }while(opcion!=6);
        log.info("Fin del programa");
        
    }
}
