/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcial;

/**
 *
 * @author santy
 */
public class Principal2 {

    public static void main(String[] args) {
        ListaPunto2 lista2 = new ListaPunto2();
        //en este caso el numero repetido es cero
        lista2.Agregar(0);
        lista2.Agregar(8);
        lista2.Agregar(0);

        lista2.mostrar();
    }
}
