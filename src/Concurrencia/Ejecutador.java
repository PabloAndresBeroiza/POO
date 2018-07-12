/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concurrencia;

/**
 *
 * @author pablo
 */
public class Ejecutador {
    
    public static void main(String[] args) {
        Hilo h1 = new Hilo("Hilo 1");
        Hilo h2 = new Hilo("Hilo 2");
        
        //Se crean los hilos
        Thread t1 =  new Thread(h1);
        Thread t2 =  new Thread(h2);
        
        //Se ejecutan los hilos
        t1.start();
        t2.start();
    }
}
