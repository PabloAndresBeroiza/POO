/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pablo
 */
public class MamiferoTerrestre extends Animal implements Carnivoro, Vertebrado{
    
    @Override
    public void desplazarse(){
        System.out.println("Soy un mamifero terrestre y me desplazo caminando");
    }

    @Override
    public void masticar() {
        System.out.println("Soy un animal terreste y estoy masticando");
    }

    @Override
    public void cazar(String arma) {
        System.out.println("Soy un animar terrestre y cazo con: " + arma);
    }
    
    
}
