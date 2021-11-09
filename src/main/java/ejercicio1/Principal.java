/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import com.mycompany.pilasycolas.Reproduccion.ListaDeReproduccion;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author santy
 */
public class Principal {
    static Logger log = Logger.getLogger(ListaDeReproduccion.class.getName());
    public static void main(String[] args) {
        ColaBiblioteca cola= new ColaBiblioteca();
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
