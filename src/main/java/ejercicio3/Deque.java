/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author santy
 */
public interface Deque {
    
    public void insertarPrimero(Object elemento);
    public void insertarUltimo(Object elemento);
    public void removerPrimero();
    public void removerUltimo();
    public int tamaño();
   
}
