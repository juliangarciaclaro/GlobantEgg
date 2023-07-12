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
public class EjercicioAprendizaje4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        //definir variables
        double faren;
        int celcius;
        
        System.out.println("dame los grados centígrados que deseas convertir a Fahrenheit");
        celcius = leer.nextInt();
        
        //conversion de grados 
        faren = 32+(( 9/5 )* celcius);
        
        System.out.println(celcius + " grados celcius equivalen a: " + faren + " grados Fahrenheit");
        
    }
    
}
