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
public class Persona {
    private int edadPersona;
    private String nombrePersona;

    public Persona(int edadPersona,String nombrePersona) {
        this.edadPersona = edadPersona;
        this.nombrePersona = nombrePersona;
    }

    public int getEdadPersona() {
        return edadPersona;
    }

    public void setEdadPersona(int edadPersona) {
        this.edadPersona = edadPersona;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }
    
    public void mostraPersona(){
        System.out.println("El nombre de la persona es: "+getNombrePersona() + "y su edad es: "+getEdadPersona());
    }

}
