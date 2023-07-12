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
public class EjercicioAprendizaje8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        //definir variables
        String frase;
        
        //pedir la frase
        System.out.println("dame una frase");
        frase = leer.nextLine();
        
        //logica para evaluar si la frase tiene 8 digitos de largo
        if (frase.length()==8) {
            System.out.println("CORRECTO");
            
        }else {
            System.out.println("INCORRECTO");
        }
    }
    
}
