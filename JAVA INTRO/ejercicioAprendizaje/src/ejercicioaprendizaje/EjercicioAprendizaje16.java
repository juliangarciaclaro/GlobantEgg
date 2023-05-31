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
public class EjercicioAprendizaje16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        //definir variables
        int numero;
        int numb;
        int contador;
        contador = 0;
        //pedir tamaño de vector y definir vector
        System.out.println("dame un tamaño para el vector");
        numero = leer.nextInt();
        int[] vector = new int[numero];

        //rellenar el vector
        for (int i = 0; i < numero; i++) {
            vector[i] = (int) (Math.random() * 10);
            System.out.println(vector[i]);
        }

        //pedirle numero a buscar al usuario
        System.out.println("dame un numero a buscar");
        numb = leer.nextInt();

        //buscar el numero
        for (int i = 0; i < numero; i++) {
            if (vector[i] == numb) {
                System.out.println("el numero se encuentra en la posicion " + i);
                contador += 1;
                if (contador > 1) {
                    System.out.println("el numero se encuentra repetido");
                }
            }
        }
        if (contador==0) {
            System.out.println("el numero no se encuentra dentro del vector");
        }
    }
}
