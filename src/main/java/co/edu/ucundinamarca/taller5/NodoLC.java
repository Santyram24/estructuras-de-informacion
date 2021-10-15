package co.edu.ucundinamarca.taller5;

public class NodoLC {
    int dato;
    NodoLC  siguiente;
    public NodoLC(int d){
        dato=d;
        siguiente=this;
    }
}
