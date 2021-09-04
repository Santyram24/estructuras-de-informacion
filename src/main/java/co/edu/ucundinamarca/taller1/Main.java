/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.taller1;

/**
 *
 * @author santy
 */
public class Main {//clae main 1 de prueba
    public static void main(String[] args) {
        Juego nuevoJuego= new Juego(5);//instanciar primer objeto
        nuevoJuego.MuestraVidasRestantes();//mostrar vidas restantes
        //nuevoJuego.numeroDeVidas-=1; aqui ya no me permite utilizar numerodevidas debido a que ahora es privado
        Juego juegoDos = new Juego(5);//segunda instancia
        juegoDos.MuestraVidasRestantes();//mostrar vidas de la segunda instancia
        nuevoJuego.MuestraVidasRestantes();//mostrar vidas de la primera instancia
    }
}
