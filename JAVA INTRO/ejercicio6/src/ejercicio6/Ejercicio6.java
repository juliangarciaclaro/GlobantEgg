/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("dame un numero");
        int num1 = leer.nextInt();
        System.out.println("dame otro numero");
        int num2 = leer.nextInt();
        
        if (num1 > 25 && num2 > 25){
        System.out.println("ambos numeros son mayores que 25");
    } else if (num1 > 25 || num2 > 25){
        System.out.println("alguno de los dos es mayor a 25");
    } else {
    System.out.println("ninguno de los dos es mayor que 25");
        
    }
    
}
