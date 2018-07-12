/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pablo
 */
public class ElevadorAuto extends Elevador{
    private int capacidadAutos;

    public ElevadorAuto(int capacidadAutos, int pesoMaximo, int capacidadMaxPersona) {
        super(pesoMaximo, capacidadMaxPersona);
        this.capacidadAutos = capacidadAutos;
    }

    
    
    public void cargarGasolina(){
        System.out.println("Cargando Gasolina....");
    }
 
    //Geters y Setters
    public int getCapacidadAutos() {
        return capacidadAutos;
    }

    public void setCapacidadAutos(int capacidadAutos) {
        this.capacidadAutos = capacidadAutos;
    }
    
    
}
