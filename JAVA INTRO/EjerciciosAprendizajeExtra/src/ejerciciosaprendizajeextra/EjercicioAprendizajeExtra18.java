/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosaprendizajeextra;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class EjercicioAprendizajeExtra18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        //definir variables
        int numero, sum;
        int[] vector;
        sum = 0;
        System.out.println("dame un tamaño de vector");
        numero = leer.nextInt();
        
        //inicializar vector
        vector = new int[numero];
        
        for (int i = 0; i<numero; i++) {
            System.out.println("dame un numero para la posicion: "+(i+1));
            vector[i] = leer.nextInt();
            sum += vector[i];
        }
        
        System.out.println("esta es la sumatoria de todos los numeros del vector: "+sum);
       
    }
    
}
