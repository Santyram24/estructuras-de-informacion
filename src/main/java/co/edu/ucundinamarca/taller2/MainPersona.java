/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.taller2;

import org.apache.log4j.Logger;

/**
 *
 * @author santy
 */
public class MainPersona {

    static Logger log = Logger.getLogger(co.edu.ucundinamarca.taller2.MainPersona.class.getName());

    public static void main(String[] args) {

        Persona p1 = new Persona();
        p1.setNombre("santiago");
        p1.setEdad(18);
        p1.setAltura(180);
        p1.setId(311252325);

        Persona p3 = new Persona();
        p3.setNombre("santiago");
        p3.setEdad(18);
        p3.setAltura(180);
        p3.setId(311252325);

        Persona p2 = new Persona();
        p2.setNombre("Andres");
        p2.setEdad(15);
        p2.setAltura(160);
        p2.setId(317808432);

        if (p1.equals(p2)) {
            log.info("La persona es la misma: " + "(" + p1 + ")" + " y " + "(" + p2 + ")");
        } else {
            log.info("Es una persona distinta: " + "(" + p1 + ")" + " y " + "(" + p2 + ")");
        }
        if (p1.equals(p3)) {
            log.info("La persona es la misma: " + "(" + p1 + ")" + " y " + "(" + p3 + ")");
        } else {
            log.info("Es una persona distinta: " + "(" + p1 + ")" + " y " + "(" + p3 + ")");
        }
    }

}
