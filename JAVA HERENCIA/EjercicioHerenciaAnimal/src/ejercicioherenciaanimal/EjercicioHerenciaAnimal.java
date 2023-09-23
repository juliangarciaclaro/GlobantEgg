/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioherenciaanimal;

import ejercicioherenciaanimal.Entidades.Animal;
import ejercicioherenciaanimal.Entidades.Gato;
import ejercicioherenciaanimal.Entidades.Perro;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class EjercicioHerenciaAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        ArrayList<Animal> animales = new ArrayList();
        
        Animal perro = new Perro("Paco");
        Animal gato = new Gato("Michi");
        
        animales.add(gato);
        animales.add(perro);
        
        for (Animal animale : animales) {
            animale.hacerRuido();
            
        }
    }
    
}
