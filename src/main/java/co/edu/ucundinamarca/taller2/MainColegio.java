/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.taller2;

import java.util.Scanner;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

/**
 *
 * @author santy
 */
public class MainColegio {

    static Logger log = Logger.getLogger(co.edu.ucundinamarca.taller2.MainColegio.class.getName());

    public static void main(String[] args) {
        Colegio Est1 = null;
        String aux;
        String nombre;
        for (int i = 0; i <= 1; i++) {
            log.info("Digite la nacionalidad del alumno");
            nombre = JOptionPane.showInputDialog("Digite la nacionalidad del alumno");
            Est1 = new Colegio(nombre);
            Est1.agregarAlumno(Est1);

        }
        Est1.cuantosAlumnos();

        for (int i = 0; i <= 1; i++) {
            aux = Est1.mostrarTodosAlumnos(i).toString();
            log.info("Alumn@ " + (i + 1) + " " + aux);
        }

    }
}
