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
public class EjercicioAprendizajeExtra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        //definir variables
        int numero;
        
        //pedir numero 
        System.out.println("dame un numero");
        numero = leer.nextInt();
        
       switch  (numero) {
           
           case 1:
               System.out.println("I");
               break;
           case 2:
               System.out.println("II");
               break;
           case 3:
               System.out.println("III");
               break;
           case 4:
               System.out.println("IV");
               break;
           case 5:
               System.out.println("V");
               break;
           case 6:
               System.out.println("VI");
               break;
           case 7:
               System.out.println("VII");
               break;
           case 8:
               System.out.println("VIII");
               break;
           case 9:
               System.out.println("IX");
               break;
           case 10:
               System.out.println("X");
               break;
           default:
               System.out.println("ese numero no es valido");
               break;
    }
    }
    
}
