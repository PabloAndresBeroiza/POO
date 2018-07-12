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
    private  int pesoMaximo;
    private  int capacidadMaxPersona;

    public Elevador(int pesoMaximo, int capacidadMaxPersona) {
        this.pesoMaximo = pesoMaximo;
        this.capacidadMaxPersona = capacidadMaxPersona;
    } 
    
    
    
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

    public int getPesoMaximo() {
        return pesoMaximo;
    }

    public void setPesoMaximo(int pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

    public int getCapacidadMaxPersona() {
        return capacidadMaxPersona;
    }

    public void setCapacidadMaxPersona(int capacidadMaxPersona) {
        this.capacidadMaxPersona = capacidadMaxPersona;
    }
    
    
}
