/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.taller1;

import org.apache.log4j.Logger;

/**
 *
 * @author santy
 */
public class Juego {//clase juego

    static Logger log = Logger.getLogger(co.edu.ucundinamarca.tallern.Main.class.getName());//instanciamos un objeto de tipo logger
    // public int numeroDeVidas; //creamos un atributo de numero de vidas (Previamente publico)
    private int numeroDeVidas;//creamos un atributo de numerode vidas (privado)
    private int numeroDeVidasReinicio;//creamos un atributo para reinciar el juego
    private int record = 0;//atrivuto privado para el record que se incializa en 0

    public Juego(int pjuego) {//creamo un constructor donde recibe un valor por medio de sus parametros
        numeroDeVidas = pjuego;
        numeroDeVidasReinicio=pjuego;

    }

    public void MuestraVidasRestantes() {//metodo para mostrar las vidas restantes
        log.info("El numero de vidas restantes es:");
        log.info(numeroDeVidas);
    }

    public void QuitaVida() {//metodo para quitar una vida y verificar si se acabaron
        numeroDeVidas -= 1;
        if (numeroDeVidas < 1) {
            log.info("Juego terminado");
        } else {
            log.debug("Tiene" + numeroDeVidas + "vidas");
            log.info("Puede continuar");
        }

    }
    public void ReiniciarPartida(){//metodo para reinciar la partida
        numeroDeVidas=numeroDeVidasReinicio;
    }
    
    public void ActualizarRecord(){//metodo para mirar si se ha igualado o superado el record
        if(numeroDeVidas>record){
            record=numeroDeVidas;
            log.info("Felicidades a alcanzado un nuevo record");
            log.info(record);
        } else if(numeroDeVidas==0){
        log.info("a alcanzado su record");
    }
    }

}
