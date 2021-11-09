/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import com.mycompany.pilasycolas.Reproduccion.ListaDeReproduccion;
import java.util.Scanner;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.log4j.LogMF;

/**
 *
 * @author santy
 */
public class Principal {
    static Logger log = Logger.getLogger(Principal.class.getName());
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        ColaBiblioteca cola= new ColaBiblioteca();
//        int numeroAtendidos;
//        int numeroPorTurno;
//        int opcion;
//        String nombre;
//         String identificacion;
//        String nombreDeLibro;
//       
//        do{
//              log.info("Menu\n1.registrar\n2.atender.\n3mostrar pendiente"
//                + " y atendidos.\n4.numero de atendidos y numero de pendientes");
//        log.info("Digite la opción");
//        
//        opcion=leer.nextInt();
//        switch(opcion){
//            case 1:
//                
//                identificacion=JOptionPane.showInputDialog("digite la identificación");
//                nombre=JOptionPane.showInputDialog("digite el nombre");
//                nombreDeLibro=JOptionPane.showInputDialog("digite el libro a entregar");
//                cola.ingresarPorAtender(identificacion, nombre, nombreDeLibro);
//              
//                break;
//            case 2:
//                log.info("Atendido el primero de la cola");
//                
//                break;
//            case 3: 
//                log.info("Estos son los que falta en atender");
//                 cola.mostrarPorAtender();
//                 log.info("atendidos");
//                 cola.atendido();
//                numeroAtendidos=cola.getNumeroDeAtendidos();
//                break;
//            case 4:
//                numeroPorTurno=cola.getNumeroDeTurno();
//                JOptionPane.showMessageDialog(null, "El numero de pendientes es: "+numeroPorTurno);
//                numeroAtendidos=cola.getNumeroDeAtendidos();
//                JOptionPane.showMessageDialog(null, "El numero de atendidos es: "+numeroAtendidos);
//                break;
//            case 5:
//                break;
//                default:
//                    log.info("EROR");
//                    break;
//        
//        }
//        }while(opcion!=5  );
//        log.info("Fin");
        cola.ingresarPorAtender("424214", "santiago", "la milla verde");
        cola.ingresarPorAtender("77789686", "Ximena", "cobro");
        cola.ingresarPorAtender("2441241", "diego", "la oscuridad");
        
       
       int numeroPorTurno=cola.getNumeroDeTurno();
       
       cola.mostrarPorAtender();
       
       cola.atendido();
       cola.atendido();
       int numeroAtendidos=cola.getNumeroDeAtendidos();
       JOptionPane.showMessageDialog(null, numeroAtendidos);
       JOptionPane.showMessageDialog(null, numeroPorTurno);
    }
            
}
