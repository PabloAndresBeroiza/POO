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
public class Hilo implements Runnable{
    String nombre;
    int dato = 0;
    
    //Constructor
    public Hilo(String nombre) {
        this.nombre = nombre;
        
    }
    
    
    @Override
    public void run() {
        
        
        do {            
            System.out.println("Soy: " +nombre+" y soy un hilo y mi dato es: " +dato);
            dato++;
            
            if (dato==4) {
                try {
                    Thread.sleep(7000);
                } catch (Exception e) {
                    System.out.println("Error: " + e);
                }
            }
            
            if (dato==10) {
                try {
                    Thread.sleep(7000);
                } catch (Exception e) {
                    System.out.println("Error: " + e);
                }
            }
            
        } while (dato <= 20);
    }
    
}
