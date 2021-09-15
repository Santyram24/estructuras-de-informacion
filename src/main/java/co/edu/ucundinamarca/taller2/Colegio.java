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
public class Colegio {

    private String nacionalidad;
    public static ArrayList<Colegio> listacol = new ArrayList<>();
    static Logger log = Logger.getLogger(co.edu.ucundinamarca.taller2.MainColegio.class.getName());

    public Colegio(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void agregarAlumno(Colegio nacionalidad) {
        listacol.add(nacionalidad);
    }

    @Override
    public String toString() {
        return nacionalidad;
    }

    public Colegio mostrarTodosAlumnos(int posiciones) {
        return listacol.get(posiciones);
    }

    public void cuantosAlumnos() {
        log.info("Hay " + listacol.size() + " Alumnos");
    }

    public void borrarAlumnos(Colegio nacionalidad) {
        listacol.remove(nacionalidad);

    }
}
