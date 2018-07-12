/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pablo
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Elevador elevadorChico = new Elevador(400, 5);
        elevadorChico.setPesoMaximo(300);
        Elevador elevadorGrande = new Elevador(800, 7);
        
        System.out.println("elevadorChico peso: " + elevadorChico.getPesoMaximo() + "Capacidad Maxima de personas: " + elevadorChico.getCapacidadMaxPersona());
        
        System.out.println("elevadorChico peso: " + elevadorGrande.getPesoMaximo() + "Capacidad Maxima de personas: " + elevadorGrande.getCapacidadMaxPersona());
    
        System.out.println("Soy elevadorChico");
        
        elevadorChico.abrirPuertas();
        elevadorChico.cerrarPuertas();
        int piso = elevadorChico.subirPiso(6);
        System.out.println("Subiendo al piso: " + piso);
        
        System.out.println("Soy ElevadorAutos");
        ElevadorAuto elevadorAuto = new ElevadorAuto(400, 5, 2);
        int pisoAuto = elevadorAuto.subirPiso(2);
        System.out.println("subiendo al piso: " + pisoAuto);
        elevadorAuto.cargarGasolina();
        elevadorAuto.abrirPuertas();
        */
        
        Animal animal = new Animal();        
        animal.desplazarse();
        
        Ave ave = new Ave();
        ave.desplazarse();
        
        Pez pez = new Pez();
        pez.desplazarse();
        
        MamiferoTerrestre mt = new MamiferoTerrestre();
        mt.desplazarse();
    }
    
}
