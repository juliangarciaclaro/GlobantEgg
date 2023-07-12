/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioaprendizaje;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class EjercicioAprendizaje3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        //definir variables
        String frase;
        
        System.out.println("dame una frase");
        frase = leer.nextLine();
        
        System.out.println("la frase en mayusculas es: " + frase.toUpperCase());
        System.out.println("la frase en minusculas es: " + frase.toLowerCase());
    }
    
}
