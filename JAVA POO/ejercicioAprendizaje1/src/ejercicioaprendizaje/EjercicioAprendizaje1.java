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
public class EjercicioAprendizaje1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        //definir variables
        int numero;
        int numero2;
        int suma;
        
        //pedir los numeros
        System.out.println("Dame dos numeros");
        numero = leer.nextInt();
        numero2 = leer.nextInt();
        
        //realizar la suma
        suma = numero + numero2;
        
        System.out.println("la suma de los numeros es :" + suma);
        
        
        
        
    }
    
}
