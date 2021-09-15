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
public class Semana {

    static Logger log = Logger.getLogger(co.edu.ucundinamarca.taller2.MainDias.class.getName());
    public static ArrayList<Semana> listaSemana = new ArrayList<>();
    private String dias;

    public Semana(String dias) {
        this.dias = dias;
    }

    public void cargarDias(Semana diasSemana) {
        listaSemana.add(diasSemana);
    }

    public void cuantosDias() {
        listaSemana.size();
    }

    public Semana obtenerDia(int i) {
        return listaSemana.get(i);
    }

    public Semana mostrarDias(int i) {
        return listaSemana.get(i);
    }

    @Override
    public String toString() {
        return dias;
    }
}
