package co.edu.ucundinamarca.taller4_1;

import org.apache.log4j.Logger;

import java.util.ArrayList;

public class Dulces {

    static Logger log = Logger.getLogger(Main.class.getName());
    public static ArrayList<String> listaDulces = new ArrayList<String>();

    public static void añadirElementos() {//añadir elementos
        listaDulces.add("ChocoRamo");
        listaDulces.add("Gansito");
        listaDulces.add("ChocoCono");
        listaDulces.add("Muffin");
        listaDulces.add("Gala");
        listaDulces.add("Oreo");
        listaDulces.add("Saltinas");
        listaDulces.add("YogoYogo");
        listaDulces.add("Gusanitos");
        listaDulces.add("Frunas");
    }

    public static int imprimirIterando() {//metodo imprimirIterando

        log.info("imprimiendo con iterador");
        for (int i = 0; i < listaDulces.size(); i++) {
            log.info(listaDulces.get(i));
            log.info(i + 1);

        }
        return listaDulces.size();

    }

    public static boolean imprimirSinIterador() {//metodo imprimirSinIterador
        boolean encontrado = false;

        log.info("imprimiendo sin iterador");
        for (String lista : listaDulces) {
            log.info(lista);
        }
        if (listaDulces.contains("ChocoRamo")) {
            encontrado = true;
            log.info("Encontrado");
        }
        return encontrado;

    }

    public static void main(String[] args) {
        //invocar de manera de estatica los metodos

        añadirElementos();
        imprimirIterando();
        imprimirSinIterador();


    }
}
