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
public class EjercicioAprendizaje10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        //definir variables
        int valorLimite;
        int numero;
        int suma;
        //inicializar suma
        suma = 0;
        //pedir valor limite
        System.out.println("dame un numero limite");
        valorLimite = leer.nextInt();
        
        //bucle para hacer la sumatoria
        
        do {
            System.out.println("dame un numero");
            numero = leer.nextInt();
            
            suma += numero;
            
        } while (suma <= valorLimite);
        
        //imprimir la sumatoria 
        System.out.println("la sumatoria de los numeros es igual a: " + suma);
        
    }
    
}
