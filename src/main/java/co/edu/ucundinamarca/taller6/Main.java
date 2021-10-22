package co.edu.ucundinamarca.taller6;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numeroingresar;
        int numerobuscar;
        int numeromodificar;

        lista ejemplo = new lista();
        int opcion;

        do {
            log.info("1.ingresar datos\n" +
                    "2.mostrar datos\n" +
                    "3.buscar datos\n" +
                    "4.modificar dato\n" +
                    "5.salir");
            log.info("Digite la opcion");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:

                    log.info("ingrese un dato");
                    numeroingresar = leer.nextInt();

                    ejemplo.ingresar(numeroingresar);
                    break;
                case 2:
                    log.info("------mostrando los datos");
                    ejemplo.mostrar();
                    break;
                case 3:
                    log.info("Ingrese el dato a buscar");
                    numerobuscar = leer.nextInt();
                    break;
                case 4:
                    log.info("Digite el elemento que desee reemplazar");
                    numeromodificar = leer.nextInt();
                    ejemplo.modificar(numeromodificar);
                    break;
                case 5:
                    log.info("---Saliendo");
                    log.info("salio");
                    break;
                default:
                    log.info("ERROR");
            }


        } while (opcion != 5);
    }
}
