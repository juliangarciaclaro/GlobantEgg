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
public class EjercicioAprendizajeExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        //definir variable
        String letra;
        
        //dame una letra
        System.out.println("dame una letra");
        letra = leer.nextLine();
        letra.toLowerCase();
        
        if (letra.equals("a")||letra.equals("e")||letra.equals("i")||letra.equals("o")||letra.equals("u")) {
            System.out.println("es una vocal");
            
        }else {
            System.out.println("no es una vocal");
        }
        
        
    }
    
}
