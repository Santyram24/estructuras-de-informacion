
package co.edu.ucundinamarca.tallern;

import org.apache.log4j.Logger;

/**
 * Clase Principal
 * @author handresortiz
 */
public class Main {

    static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        log.debug("Hello World : this is a debug message");
        log.info("Hello World : this is an info message");
          //getters y setters
          //prueba de git :3
          //otra prueba
        Persona p1 = null;

        p1.setNombrePersona("jesus");
        p1.setEdadPersona(21);

        p1.mostraPersona();
        //instancia con herencia

        Alumno p2 = new Alumno(19, "santy", "universidad de cundinamarca");
        p2.mostraPersona();
        p2.mostrarAlumno();
        
       //instancia polimorfica
       
       Persona p3= new Alumno(18, "Brayan", "universidad de cundinamarca");
       p3.mostraPersona();

    }

}
