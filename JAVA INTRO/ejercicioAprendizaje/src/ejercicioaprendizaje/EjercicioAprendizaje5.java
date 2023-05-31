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
public class EjercicioAprendizaje5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        //definir variables
        int numero;
        double raiz;
        
        
       
                
        //pedir el numero
        System.out.println("dame un numero");
        numero = leer.nextInt();
        
        //guardar en variable raiz, la raiz cuadrada del entero
         raiz = Math.sqrt(numero);
         
        //dar el resultado impreso
        System.out.println("el doble, triple y raiz cuadrada de " + numero + " es: "
        + numero*2
        + numero*3
        + raiz);
        
        
    }
    
}
