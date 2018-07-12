/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pablo
 */
public class Elevador {
    public int pesoMaximo;
    public int capacidadMaxPersona;
    
    
    public int subirPiso(int pisoActual){
        int nuevoPiso = pisoActual + 1;
        return nuevoPiso;
    }
    
    public int bajarPiso(int pisoActual){
        int nuevoPiso = pisoActual + 1;
        return nuevoPiso;
    }
    
    public void abrirPuertas(){
        System.out.println("Abriendo puertas...");
    }
    
    public void cerrarPuertas(){
        System.out.println("Cerrando puertas...");
    }
}
