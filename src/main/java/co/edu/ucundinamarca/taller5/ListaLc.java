package co.edu.ucundinamarca.taller5;

import javax.swing.*;

public class ListaLc {
    NodoLC ultimo;
    public ListaLc(){
        ultimo=null;
    }
    //metodo para saber cuando la lista esta vacia
    public boolean estaVacia(){
        return  ultimo==null;
    }
    //metodo para insertar nodo
    public  ListaLc insertar(int elemento){
        NodoLC nuevo = new NodoLC(elemento);
        if (ultimo!=null){
            nuevo.siguiente=ultimo.siguiente;
            ultimo.siguiente=nuevo;
        }
        ultimo=nuevo;
        return this;
    }
    public void  mostrarLista(){
        NodoLC auxiliar= ultimo.siguiente;
        String cadena="";
        do {
            cadena=cadena + "["+auxiliar.dato+"]->";
            auxiliar=auxiliar.siguiente;
        }while (auxiliar!=ultimo.siguiente);
        JOptionPane.showMessageDialog(null,cadena,
                "Mostrando la lista circular",JOptionPane.INFORMATION_MESSAGE);
    }
}
