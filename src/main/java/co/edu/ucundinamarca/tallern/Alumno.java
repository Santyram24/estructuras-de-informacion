/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.tallern;

/**
 *
 * @author santy
 */
public class Alumno extends Persona {
    private String institucionDelAlumno;

    public Alumno(int edadPersona, String nombrePersona, String institucionDelAlumno) {
        super(edadPersona, nombrePersona);
        this.institucionDelAlumno = institucionDelAlumno;
    }

    public String getInstitucionDelAlumno() {
        return institucionDelAlumno;
    }

    public void setInstitucionDelAlumno(String institucionDelAlumno) {
        this.institucionDelAlumno = institucionDelAlumno;
    }

    public void mostrarAlumno() {
        System.out.println("El nombre del estudiante es: " + getNombrePersona() + "su edad es: " + getEdadPersona()
                + "pertenece a la institucion " + getInstitucionDelAlumno());
    }
}
