primera parte:

public class Juego {//clase juego

    static Logger log = Logger.getLogger(co.edu.ucundinamarca.tallern.Main.class.getName());//instanciamos un objeto de tipo logger
    // public int numeroDeVidas; //creamos un atributo de numero de vidas (Previamente publico)
 
public Juego(int pjuego) {//creamos un constructor donde recibe un valor por medio de sus parametros
        numeroDeVidas = pjuego;
}
public void MuestraVidasRestantes() {//metodo para mostrar las vidas restantes
        log.info("El numero de vidas restantes es:");
        log.info(numeroDeVidas);
    }
}
public class Main {//clase main 1 de prueba
    public static void main(String[] args) {
        Juego nuevoJuego= new Juego(5);//instanciar primer objeto
        nuevoJuego.MuestraVidasRestantes();//mostrar vidas restantes
        nuevoJuego.numeroDeVidas-=1;//y por medio del atributo que es publico
        Juego juegoDos = new Juego(5);//segunda instancia
        juegoDos.MuestraVidasRestantes();//mostrar vidas de la segunda instancia
        nuevoJuego.MuestraVidasRestantes();//mostrar vidas de la primera instancia
 

}
}

segunda parte:

public class Juego {//clase juego

    static Logger log = Logger.getLogger(co.edu.ucundinamarca.tallern.Main.class.getName());//instanciamos un objeto de tipo logger
    
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