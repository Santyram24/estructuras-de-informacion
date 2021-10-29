/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.taller7;

import javax.swing.JOptionPane;

/**
 *
 * @author santy
 */
public class Hanoi {
    public static PilaHanoi pPila1= new PilaHanoi();
    public static PilaHanoi pPila2= new PilaHanoi();
    public static PilaHanoi pPila3= new PilaHanoi();
    public static int topc;
    public static void main(String[] args) {
        int iCantidadDiscos;
        iCantidadDiscos=Integer.parseInt(JOptionPane.showInputDialog(null,"digite el numero de discos"));
        for (int i = 0; i <=iCantidadDiscos; i++) {
            pPila1.PUSH(i);
        }
        System.out.println("origen\t\t"+pPila1.Listar()+"\nauxiliar\t\t"
                +pPila2.Listar()+"\nDestino\t\t"+pPila3.Listar());
        pasosHanoi(Integer.parseInt(pPila1.Top()),1,2,3);
    }
    public static void pasosHanoi(int Numero,int iOrigen,int iAuxiliar,int iDestino){
        if(Numero==1){
            if(iOrigen==1){
                topc=Integer.parseInt(pPila1.Top());
                pPila1.POP();
            }
            if(iOrigen==2){
                topc=Integer.parseInt(pPila2.Top());
                pPila2.POP();
            }
            if(iOrigen==3){
                topc=Integer.parseInt(pPila3.Top());
                pPila3.POP();
            }
            if(iDestino==1){
                pPila1.PUSH(topc);
            }
            if(iDestino==2){
                pPila2.PUSH(topc);
            }
            if(iDestino==3){
                pPila3.PUSH(topc);
            }
            System.out.println("origen: "+pPila1.Listar()+"\nAuxiliar: "
                    +pPila2.Listar()+"\nDestino: "+pPila3.Listar());
            System.out.println("")
                    ;
            
        }else{
            pasosHanoi(Numero-1, iOrigen, iAuxiliar, iDestino);
            System.out.println("Mover discoo de "+iOrigen+" a "+iDestino);
            
            if(iOrigen==1){
                topc=Integer.parseInt(pPila1.Top());
                pPila1.POP();
            }
            if(iOrigen==2){
                topc=Integer.parseInt(pPila2.Top()); 
                pPila2.POP();
                
            }
            if(iOrigen==3){
                topc=Integer.parseInt(pPila3.Top());
                 pPila3.POP();
            }
             if(iDestino==1){
                pPila1.PUSH(topc);
            }
            if(iDestino==2){
                pPila2.PUSH(topc);
            }
            if(iDestino==3){
                pPila3.PUSH(topc);
            }
            System.out.println("origen: "+pPila1.Listar()+"\nAuxiliar: "
                    +pPila2.Listar()+"\nDestino: "+pPila3.Listar());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
            pasosHanoi(Numero-1, iOrigen, iAuxiliar, iDestino);
        }
    }

}
