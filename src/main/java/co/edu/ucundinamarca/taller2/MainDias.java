/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.taller2;

import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

/**
 *
 * @author santy
 */
public class MainDias {

    static Logger log = Logger.getLogger(co.edu.ucundinamarca.taller2.MainDias.class.getName());

    public static void main(String[] args) {
        Semana sem = null;
        int SeleccionDias;
        int buscar;
        String auxiliar;
        for (int i = 0; i < 7; i++) {
            if (i == 0) {
                sem = new Semana("lunes");
            } else if (i == 1) {
                sem = new Semana("Martes");
            } else if (i == 2) {
                sem = new Semana("Miercoles");
            } else if (i == 3) {
                sem = new Semana("Jueves");

            } else if (i == 4) {
                sem = new Semana("Viernes");
            } else if (i == 5) {
                sem = new Semana("Sabado");
            } else if (i == 6) {
                sem = new Semana("Domingo");
            }
            sem.cargarDias(sem);
        }
        sem.cuantosDias();

        for (int i = 0; i < 7; i++) {
            auxiliar = sem.mostrarDias(i).toString();
            log.info(auxiliar);
        }

        log.info("Que dia desea obtener");
        buscar = Integer.parseInt(JOptionPane.showInputDialog("Que dia desea obtener"));
        log.info("El dia que obtuvo es: " + sem.obtenerDia(buscar - 1).toString());
    }
}
