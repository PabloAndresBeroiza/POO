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
        
        Elevador elevadorChico = new Elevador(400, 5);
        Elevador elevadorGrande = new Elevador(800, 7);
        
        System.out.println("elevadorChico peso: " + elevadorChico.pesoMaximo + "Capacidad Maxima de personas: " + elevadorChico.capacidadMaxPersona);
        
        System.out.println("elevadorChico peso: " + elevadorGrande.pesoMaximo + "Capacidad Maxima de personas: " + elevadorGrande.capacidadMaxPersona);
    
        System.out.println("Soy elevadorChico");
        elevadorChico.abrirPuertas();
        elevadorChico.cerrarPuertas();
        int piso = elevadorChico.subirPiso(6);
        System.out.println("Subiendo al piso: " + piso);
    }
    
}
