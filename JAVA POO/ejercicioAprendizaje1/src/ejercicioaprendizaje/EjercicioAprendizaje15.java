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
public class EjercicioAprendizaje15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        //definir variables
        int[] vector = new int[100];
        
        //logica para rellenar vector e imprimirlo de manera descendente
        //tener presente que i no puede ser 100 porque el conteo del vector empieza en 0
        
        for (int i = 99; i >= 0; i--) {
            vector[i]= i+1;
            System.out.println(vector[i]);        }
      
    }
    
}
