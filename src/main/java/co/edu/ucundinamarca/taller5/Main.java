package co.edu.ucundinamarca.taller5;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {


        ListaLc listita = new ListaLc();
        int opcion = 0;
        int elemento;
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1.Agregar elemento\n"
                                + "2.mostrar elementos"));
                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "ingrese elemento"));
                        listita.insertar(elemento);
                        break;
                    case 2:
                        if (listita.estaVacia()) {
                            listita.mostrarLista();
                        } else {
                            JOptionPane.showMessageDialog(null, "Aun no hay nada");
                        }
                        break;

                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error");
            }
        } while (opcion != 4);
    }
}