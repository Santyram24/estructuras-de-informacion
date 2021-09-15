/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.taller2;

import java.util.ArrayList;
import org.apache.log4j.Logger;

/**
 *
 * @author santy
 */
public class SeleccionColombia {

    private String nombre;
    private boolean bandera = false;
    static Logger log = Logger.getLogger(co.edu.ucundinamarca.taller2.MainSeleccion.class.getName());
    public static ArrayList<SeleccionColombia> listaSelec = new ArrayList<>();

    public SeleccionColombia() {

    }

    public SeleccionColombia(String nombre) {
        this.nombre = nombre;
    }

    public void AgregarJugadores(SeleccionColombia s) {
        listaSelec.add(s);
    }

    public SeleccionColombia mostrarJugadores(int s) {

        return listaSelec.get(s);

    }

    public boolean contieneJugadores(String nombre) {
        bandera = false;
        int i = 0;
        while (bandera == false && i < listaSelec.size()) {
            if (listaSelec.get(i).toString().compareToIgnoreCase(nombre) == 0) {
                bandera = false;
            } else {
                i++;
            }
        }
        if (bandera) {
            log.info("El jugador" + listaSelec.get(i).toString() + " a sido encontrado");
            return false;
        } else {
            log.info("El jugador no se encuentra");
            return true;
        }

    }

    @Override
    public String toString() {
        return nombre;
    }

}
