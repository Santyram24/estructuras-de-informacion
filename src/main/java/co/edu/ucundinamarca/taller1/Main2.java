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
public class Main2 {//clase main2

    public static void main(String[] args) {
        Juego nuevoJuego = new Juego(5);//creamos primera instancia
        nuevoJuego.QuitaVida();//invocamos el metodo quitavida para la primera instancia
        nuevoJuego.MuestraVidasRestantes();//mostramos las vidas de la primera instancia
        nuevoJuego.ReiniciarPartida();//reiniciamos de nuevo con 5 vidas
        nuevoJuego.MuestraVidasRestantes();//volvemos a mostrar las vidas restantes
        //nuevoJuego.numeroDeVidas-=1; aqui ya no me permite utilizar numerodevidas debido a que ahora es privado
        Juego juegoDos = new Juego(5);//creamos segunda instancia
        juegoDos.MuestraVidasRestantes();//mostramos vidas segunda instancia
        nuevoJuego.MuestraVidasRestantes();//mostramos vidas de la primera instancia

        nuevoJuego.ActualizarRecord();//pediimos a la primera instancia que actualize el record
        juegoDos.ActualizarRecord();//pediimos a la segunda instancia que actualize el record
    }
}
