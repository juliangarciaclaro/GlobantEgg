/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num;
        
        System.out.println("ingrese un numero del 1 al 4 correspondiente a la motobomba indicada");
        num = leer.nextInt();
        
        switch (num) {
            case 1:
                System.out.println("la bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("la bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("la bomba es una bomba de hormigón");
                break;
            case 4:
                System.out.println("la bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("no existe un valor valido para ese tipo de bomba");
        }
        
    }
    
}
