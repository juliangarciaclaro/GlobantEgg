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
public class EjercicioAprendizaje7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        //definir variable
        String frase;
        
        //pedir frase
        System.out.println("dame una frase");
        frase = leer.nextLine();
        
        //logica de comparacion
        if (frase.equals("eureka")) {
            System.out.println("CORRECTO");
        }else {
            System.out.println("INCORRECTO");
        }
    }
    
}
