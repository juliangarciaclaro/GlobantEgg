/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num, sum, cont;
        sum = 0;
        cont = 0;
        do {
            System.out.println("dame un numero");
            num = leer.nextInt();

            if (num == 0) {
                System.out.println("se capturó el numero 0");
                break;
            } else if (num > 0) {
                sum = sum + num;
            }
            cont++;
        } while (cont < 5);
        
        System.out.println("la sumatoria de los numeros ingresados es "+sum);
    }

}
