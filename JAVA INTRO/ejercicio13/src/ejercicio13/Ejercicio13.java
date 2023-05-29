/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        //creacion de vector
        String[] equipo = new String[5];
         String aux = " ";
        System.out.println("escribe los nombres de tus compañeros de equipo");
        for (int i = 0; i < equipo.length; i++) {
            equipo[i] = leer.nextLine();
            aux += " " + equipo[i];
        }
       
        System.out.println(aux);
        
    }
    
}
