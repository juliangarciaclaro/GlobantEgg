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
public class EjercicioAprendizaje9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        //definir variables
        String frase, letra;
        
        //pedir la frase
        System.out.println("dame una frase");
        frase = leer.nextLine();
        
        //saber la primera letra por medio de un substring
        letra = frase.substring(0,1);
        
        //logica 
        
        if (letra.equals("a")) {
            System.out.println("CORRECTO");
            
        }else {
            System.out.println("INCORRECTO");
        }
    }
    
}
