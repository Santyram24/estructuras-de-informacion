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
public class MainAnimal {
    static Logger log = Logger.getLogger(co.edu.ucundinamarca.taller2.MainAnimal.class.getName());
    public static void main(String[] args) {
        Animal a1= new Animal();
        Animal a2= new Animal();
        Animal a3= new Animal();
        
        a1.setNombre("Sparky");
        a1.setEspecie("Perro");
        a1.setEdad(2);
        a1.setPatas(4);
        a1.setId(132432);
        
        a2.setNombre("Charlotte");
        a2.setEspecie("Aracnido");
        a2.setEdad(2);
        a2.setPatas(8);
        a2.setId(13234897);
        
        a3.setNombre("Sparky");
        a3.setEspecie("Perro");
        a3.setEdad(2);
        a3.setPatas(4);
        a3.setId(132432);
        
        if(a1.equals(a2)){
        log.info("El animal es el mismo: "+"("+a1+")"+ " y "+ "("+a2+")");
    }else{
        log.info("El animal es distinto: "+"("+a1+")"+ " y "+ "("+a2+")");
    }
    if(a1.equals(a3)){
        log.info("El animal es el mismo: "+"("+a1+")"+ " y "+ "("+a3+")");
    }else{
        log.info("El animal es distinto: "+"("+a1+")"+ " y "+ "("+a3+")");
    }
    }
}
